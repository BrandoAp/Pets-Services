package DaoImplements;

import DAO.Tipo_AnimalDAO;
import Models.Tipo_Animal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dao_Implements_TipoAnimal implements Tipo_AnimalDAO{
    private static final Logger LOGGER = Logger.getLogger(Dao_Implements_TipoAnimal.class.getName());
    private final Connection connection;

    public Dao_Implements_TipoAnimal(Connection connection){
        this.connection = connection;
    }

    @Override
    public boolean addAnimal(Tipo_Animal tipoAnimal) {
        return false;
    }

    @Override
    public List<Tipo_Animal> getAllTypeAnimal() {
        List <Tipo_Animal> allTipoAnimal = new ArrayList<>();
        String query = "SELECT * FROM Tipo_Animal";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()){
            while (resultSet.next()){
                Tipo_Animal tipoAnimal = new Tipo_Animal(
                        resultSet.getString("Cod_Animal"),
                        resultSet.getString("Animal")
                );
            }
        } catch (SQLException e){
            LOGGER.warning("Error " + e.getMessage());
        }
        return allTipoAnimal;
    }

    @Override
    public Tipo_Animal getAnimalbyId(String Cod_Animal) {
        String query = "SELECT * FROM Tipo_Animal WHERE Cod_Animal = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, Cod_Animal);

            try (ResultSet resultSet = statement.executeQuery()){
                if (resultSet.next()){
                    return new Tipo_Animal(
                            resultSet.getString("Cod_Animal"),
                            resultSet.getString("Animal")
                    );
                }
            } catch (SQLException e){
                LOGGER.warning("Error " + e.getMessage());
            }
        } catch (SQLException e){
            LOGGER.log(Level.SEVERE, "Error el ejecutar la solitud " + e.getMessage());
        }
        return null;
    }
}
