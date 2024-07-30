package DAO;

import Models.Clientes;
import java.util.List;

public interface ClienteDAO {
    List<Clientes> getAllClients();
    Object getClientById(String Cedula_C);
    boolean deleteClientById(String Cedula_C);
}
