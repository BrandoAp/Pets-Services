package DAO;

import Models.Atencion;
import java.util.List;

public interface AtencionDAO {
    List <Atencion> getAllAtencion();
    void getAtencionByCode();
}
