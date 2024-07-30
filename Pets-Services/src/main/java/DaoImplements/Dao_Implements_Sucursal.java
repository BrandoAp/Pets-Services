package DaoImplements;

import DAO.SucursalDAO;
import Models.Sucursales;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dao_Implements_Sucursal implements SucursalDAO{
    private Connection connection;

    public Dao_Implements_Sucursal (Connection connection){
        this.connection = connection;
    }

    public void close() throws SQLException{
        if (connection != null){
            connection.close();
        }
    }

    @Override
    public boolean addSucursal(Sucursales sucursales) throws SQLException {
        String sql = "INSERT INTO Sucursales (Codigo_Sucursal, Nombre_Sucursal, Latitud, Longitud) VALUES (?, ?, ?, ?)";
        try(PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){
            statement.setString(1, sucursales.getCodigo_Sucursal());
            statement.setString(2, sucursales.getNombre_Sucursal());
            statement.setFloat(3, sucursales.getLatitud());
            statement.setFloat(4, sucursales.getLongitud());

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0){
                try (ResultSet generatedKey = statement.getGeneratedKeys()){
                    if (generatedKey.next()){
                        sucursales.setCodigo_Sucursal(String.valueOf(generatedKey.getInt(1)));
                        return true;
                    } else {
                        throw new SQLException("Creating sucursal failed, no ID obtained");
                    }

                }
            } else {
                return false;
            }
        }
    }

    @Override
    public List<Sucursales> getAllSucursales() {
        List <Sucursales> allSucursales = new ArrayList<>();
        String query = "SELECT * FROM Sucursales";
        try (PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()){
                Sucursales sucursales = new Sucursales(
                        resultSet.getString("Codigo_Sucursal"),
                        resultSet.getString("Nombre_Sucursal"),
                        resultSet.getFloat("Latitud"),
                        resultSet.getFloat("Longitud")
                );
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return allSucursales;
    }

    @Override
    public Object getSucursalbyName(String Nombre_Sucursal) throws SQLException{
        String query = "SELECT * FROM Sucursales WHERE Nombre_Sucursal = ?";
        try(PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(2, Nombre_Sucursal);

            try (ResultSet resultSet = statement.executeQuery()){
                if (resultSet.next()){
                   return new Sucursales(
                            resultSet.getString("Codigo_Sucusal"),
                            resultSet.getString("Nombre_Sucursal"),
                            resultSet.getFloat("Latitud"),
                            resultSet.getFloat("Longitud")
                    );
                }
            }
        } catch (SQLException e){
            System.out.println("No se encontro la sucursal con el nombre ingresado"+ e.getMessage());
        }
        return null;
    }
}
