package Models;

public class Tipo_Animal {
    private String Cod_Animal, Animal;

    public Tipo_Animal(String cod_Animal, String animal) {
        Cod_Animal = cod_Animal;
        Animal = animal;
    }

    public String getCod_Animal() {
        return Cod_Animal;
    }

    public void setCod_Animal(String cod_Animal) {
        Cod_Animal = cod_Animal;
    }

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String animal) {
        Animal = animal;
    }
}
