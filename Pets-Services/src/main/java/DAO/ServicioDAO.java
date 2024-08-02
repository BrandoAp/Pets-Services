package DAO;

import Models.Servicios;
import java.util.List;

public interface ServicioDAO {
    List<Servicios> getAllServices();
    Object getServicesById(String Codigo_Servicio);
}
