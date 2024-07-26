package Models;

public class Sucursales {
    private String Codigo_Sucursal;
    private String Nombre_Sucursal;
    private float Latitud;
    private float Longitud;

    public Sucursales(String codigo_Sucursal, String nombre_Sucursal, float latitud, float longitud) {
        Codigo_Sucursal = codigo_Sucursal;
        Nombre_Sucursal = nombre_Sucursal;
        Latitud = latitud;
        Longitud = longitud;
    }

    public String getCodigo_Sucursal() {
        return Codigo_Sucursal;
    }

    public void setCodigo_Sucursal(String codigo_Sucursal) {
        Codigo_Sucursal = codigo_Sucursal;
    }

    public String getNombre_Sucursal() {
        return Nombre_Sucursal;
    }

    public void setNombre_Sucursal(String nombre_Sucursal) {
        Nombre_Sucursal = nombre_Sucursal;
    }

    public float getLatitud() {
        return Latitud;
    }

    public void setLatitud(float latitud) {
        Latitud = latitud;
    }

    public float getLongitud() {
        return Longitud;
    }

    public void setLongitud(float longitud) {
        Longitud = longitud;
    }
}
