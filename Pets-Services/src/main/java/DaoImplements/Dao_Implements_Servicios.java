package DaoImplements;

import DAO.ServicioDAO;
import Models.Servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dao_Implements_Servicios implements ServicioDAO{
    private static final Logger LOGGER = Logger.getLogger(Dao_Implements_Servicios.class.getName());
    private final Connection connection;

    public Dao_Implements_Servicios (Connection connection){
        this.connection = connection;
    }

    @Override
    public List<Servicios> getAllServices() {
        List <Servicios> allServicios = new ArrayList<>();
        String query = "SELECT * FROM Servicios";

        try (PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery()){
            while (resultSet.next()){
                Servicios servicios = new Servicios(
                        resultSet.getString("Codigo_Servicio"),
                        resultSet.getString("Servicio"),
                        resultSet.getFloat("Costo")
                );
            }
        } catch (SQLException e){
            LOGGER.warning(e.getMessage());
        }
        return allServicios;
    }

    @Override
    public Object getServicesById(String Codigo_Servicio) {
        String query = "SELECT * FROM Servicios WHERE Codigo_Servicio = ?";
        if (connection == null){
            LOGGER.severe("La conexión a la base de datos no esta establecida");
            return false;
        }

        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, Codigo_Servicio);
            try (ResultSet resultSet = statement.executeQuery()){
                if (resultSet.next()){
                    return new Servicios(
                            resultSet.getString("Codigo_Servicio"),
                            resultSet.getString("Servicio"),
                            resultSet.getFloat("Costo")

                    );
                }
            } catch (SQLException e){
                LOGGER.warning("Error el intentar obtenet el cliente " + e.getMessage());
            }

        }catch (SQLException e){
            LOGGER.log(Level.SEVERE,"Error el ejecutar la solicitud {0}", e.getMessage());
            return false;
        }
        return null;
    }
}
