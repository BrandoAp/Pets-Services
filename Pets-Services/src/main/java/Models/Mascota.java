package Models;

import java.util.Date;

public class Mascota {
    private String Cod_registro, Nombre_M;
    private float peso;
    private String Tamano;
    private Date Fecha_nacimiento;
    private char Genero;
    private Date Fecha_Celo;
    private String Cod_Animal, Cod_Raza, Cedula_C;

    public Mascota(String cod_registro, String nombre_M, float peso, String tamano, Date fecha_nacimiento, char genero, Date fecha_Celo, String cod_Animal, String cod_Raza, String cedula_C) {
        Cod_registro = cod_registro;
        Nombre_M = nombre_M;
        this.peso = peso;
        Tamano = tamano;
        Fecha_nacimiento = fecha_nacimiento;
        Genero = genero;
        Fecha_Celo = fecha_Celo;
        Cod_Animal = cod_Animal;
        Cod_Raza = cod_Raza;
        Cedula_C = cedula_C;
    }

    public String getCod_registro() {
        return Cod_registro;
    }

    public void setCod_registro(String cod_registro) {
        Cod_registro = cod_registro;
    }

    public String getNombre_M() {
        return Nombre_M;
    }

    public void setNombre_M(String nombre_M) {
        Nombre_M = nombre_M;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTamano() {
        return Tamano;
    }

    public void setTamano(String tamano) {
        Tamano = tamano;
    }

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        Fecha_nacimiento = fecha_nacimiento;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char genero) {
        Genero = genero;
    }

    public Date getFecha_Celo() {
        return Fecha_Celo;
    }

    public void setFecha_Celo(Date fecha_Celo) {
        Fecha_Celo = fecha_Celo;
    }

    public String getCod_Animal() {
        return Cod_Animal;
    }

    public void setCod_Animal(String cod_Animal) {
        Cod_Animal = cod_Animal;
    }

    public String getCod_Raza() {
        return Cod_Raza;
    }

    public void setCod_Raza(String cod_Raza) {
        Cod_Raza = cod_Raza;
    }

    public String getCedula_C() {
        return Cedula_C;
    }

    public void setCedula_C(String cedula_C) {
        Cedula_C = cedula_C;
    }
}
