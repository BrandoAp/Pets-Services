package DaoImplements;

import DAO.ClienteDAO;
import Models.Clientes;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dao_Implements_Clientes implements ClienteDAO{
    private static final Logger LOGGER = Logger.getLogger(Dao_Implements_Clientes.class.getName());
    private Connection connection;

    public Dao_Implements_Clientes(Connection connection){
        this.connection = connection;
    }

    public void close() throws SQLException{
        if (connection != null){
            connection.close();
        }
    }


    @Override
    public List<Clientes> getAllClients() {
        List <Clientes> allClients = new ArrayList<>();
        String query = "SELECT * FROM Clientes";
        try (PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery()){
            while (resultSet.next()){
                Clientes clientes = new Clientes(
                        resultSet.getString("Cedula_C"),
                        resultSet.getString("Nombre_C"),
                        resultSet.getString("Apellido_C"),
                        resultSet.getString("Direccion_C"),
                        resultSet.getString("Telefonos_C"),
                        resultSet.getString("Email"),
                        resultSet.getString("Codigo_Sucursal")
                );
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return allClients;
    }

    @Override
    public Object getClientById(String Cedula_C) {
        String query = "SELECT * FROM Clientes WHERE Cedula_C = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, Cedula_C);

            try (ResultSet resultSet = statement.executeQuery()){
                if (resultSet.next()){
                    return new Clientes(
                            resultSet.getString("Cedula_C"),
                            resultSet.getString("Nombre_C"),
                            resultSet.getString("Apellido_C"),
                            resultSet.getString("Direccion_C"),
                            resultSet.getString("Telefono_C"),
                            resultSet.getString("Email"),
                            resultSet.getString("Codigo_Sucursal")
                    );
                }
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean deleteClientById(String Cedula_C) {
        String query = "DELETE FROM Clientes WHERE Cedula_C = ?";
        if (connection == null){
            LOGGER.severe("La conexion a la base de datos no esta establecida");
            return false;
        }

        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1,Cedula_C);
            int affectedRows = statement.executeUpdate();
            if (affectedRows > 0){
                LOGGER.info("El cliente con cedula "+ Cedula_C + "Eliminado correctamente");
                return true;
            } else {
                LOGGER.warning("No existe el cliente con la cedula " + Cedula_C);
                return false;
            }
        } catch (SQLException e){
            LOGGER.log(Level.SEVERE, "Error el ejecutar la solicitud: {0}", e.getMessage());
            return false;
        }
    }
}
