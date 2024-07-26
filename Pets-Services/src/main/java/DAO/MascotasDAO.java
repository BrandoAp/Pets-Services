package DAO;

import Models.Mascota;
import java.util.List;

public interface MascotasDAO {
    List <Mascota> getAllPets();
    void getPetsByName();
}
