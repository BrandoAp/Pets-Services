package DaoImplements;

import Models.Personal;
import DAO.PersonalDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dao_Implements_Personal implements PersonalDAO {
    private static final Logger LOGGER = Logger.getLogger(Dao_Implements_Personal.class.getName());
    private final Connection connection;

    public Dao_Implements_Personal (Connection connection){
        this.connection = connection;
    }

    @Override
    public List<Personal> getAllPersonal() {
        List <Personal> allPersonal = new ArrayList<>();
        String query = "SELECT * FROM Personal";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()){
                while (resultSet.next()){
                Personal personal = new Personal(
                        resultSet.getString("Cedula_P"),
                        resultSet.getString("Nombre_P"),
                        resultSet.getString("Apellido_P"),
                        resultSet.getString("Direccion_P"),
                        resultSet.getString("Telefono_P"),
                        resultSet.getFloat("salario"),
                        resultSet.getString("cargo"),
                        resultSet.getString("Codigo_Sucursal")
                );
            }
        } catch (SQLException e){
            LOGGER.log(Level.SEVERE, "Error al buscar a todo el personal");
        }
        return allPersonal;
    }
}
