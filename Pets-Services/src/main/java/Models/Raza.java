package Models;

public class Raza {
    private int Cod_Raza;
    private String Raza;
    private String Cod_Animal;

    public Raza(int cod_Raza, String raza, String cod_Animal) {
        Cod_Raza = cod_Raza;
        Raza = raza;
        Cod_Animal = cod_Animal;
    }

    public int getCod_Raza() {
        return Cod_Raza;
    }

    public void setCod_Raza(int cod_Raza) {
        Cod_Raza = cod_Raza;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public String getCod_Animal() {
        return Cod_Animal;
    }

    public void setCod_Animal(String cod_Animal) {
        Cod_Animal = cod_Animal;
    }
}
