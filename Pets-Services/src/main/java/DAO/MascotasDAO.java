package DAO;

import Models.Mascota;

import java.util.List;

public interface MascotasDAO {
    boolean addPets (Mascota mascota);
    List <Mascota> getAllPets();
    Mascota getPetsByName(String Nombre_M);

    //Falta declarar Metodos aqui
}
