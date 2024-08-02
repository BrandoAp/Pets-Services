package Connection_BD;

import java.sql.*;

class Conexion{
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
    private static final String URL = "jdbc:mysql://localhost:3306/PetsServices";
    private static Connection connection = null;

    public static void getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
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
    }
}

public class Conexion_BD {
    public static void main (String [] args){
        Conexion.getConnection();
    }
}
