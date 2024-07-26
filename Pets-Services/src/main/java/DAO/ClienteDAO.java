package DAO;

import Models.Clientes;
import java.util.List;

public interface ClienteDAO {
    List<Clientes> getAllClients();
    void getClientById();
    void deleteClientById();
}
