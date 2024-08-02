package DaoImplements;

import DAO.MascotasDAO;
import Models.Mascota;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dao_Implements_Mascotas implements MascotasDAO{
    private static final Logger LOGGER = Logger.getLogger(Dao_Implements_Mascotas.class.getName());
    private final Connection connection;

    public Dao_Implements_Mascotas(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean addPets(Mascota mascota) {
        //Agregar la logica del metodo
        return false;
    }

    @Override
    public List<Mascota> getAllPets() {
        List <Mascota> allPets = new ArrayList<>();
        String query = "SELECT Cod_Registro, Nombre_M, peso, Tamano FROM Mascotas";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()){
                Mascota mascota = new Mascota(
                    resultSet.getString("Cod_registro"),
                    resultSet.getString("Nombre_M"),
                    resultSet.getFloat("peso"),
                    resultSet.getString("Tamano")
                );
            }
        } catch (SQLException e){
            LOGGER.warning("Error " + e.getMessage());
        }
        return allPets;
    }

    @Override
    public Mascota getPetsByName(String Nombre_M) {
        String query = "SELECT Cod_Registro, Nombre_M, peso, Tamano FROM Mascotas WHERE Nombre_M = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(2, Nombre_M);

            try (ResultSet resultSet = statement.executeQuery()){
                if (resultSet.next()){
                    return new Mascota(
                       resultSet.getString("Cod_Registro"),
                       resultSet.getString("Nombre_M"),
                       resultSet.getFloat("peso"),
                       resultSet.getString("Tamano")
                    );
                }
            } catch (SQLException e){
                LOGGER.warning(e.getMessage());
            }
        } catch (SQLException e){
            LOGGER.log(Level.SEVERE, "Error " + e.getMessage());
        }
        return null;
    }
}
