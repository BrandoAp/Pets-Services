package DAO;

import Models.Sucursales;

import java.sql.SQLException;
import java.util.List;

public interface SucursalDAO {
    boolean addSucursal(Sucursales sucursales) throws SQLException;
    List<Sucursales> getAllSucursales();
    void getSucursalbyName();
}
