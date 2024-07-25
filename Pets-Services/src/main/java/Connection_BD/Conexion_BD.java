package Connection_BD;

import java.sql.*;

class Conexion{
    private static final String username = "root";
    private static final String password = "1234";
    private static final String url = "jdbc:mysql://localhost:3306/PetsServices";
    private static Connection connection = null;

    public static Object getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            if (connection != null){
                System.out.println("Conexion Establecida correctamente");
            }
        } catch (SQLException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        } finally {
            if (connection!= null){
                try {
                    connection.close();
                    System.out.println("Conexion Cerrada correctamente");
                } catch (SQLException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        return connection;
    }
}

public class Conexion_BD {
    public static void main (String [] args){
        Conexion.getConnection();
    }
}