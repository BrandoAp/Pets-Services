package DAO;

import Models.Tipo_Animal;
import java.util.List;

public interface Tipo_AnimalDAO {
    boolean addAnimal(Tipo_Animal tipoAnimal);
    List <Tipo_Animal> getAllTypeAnimal();
    Tipo_Animal getAnimalbyId (String Cod_Animal);
}
