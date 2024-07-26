package Models;

public class Servicios {
    private String Codigo_Servicio;
    private String Servicio;
    private float Costo;

    public Servicios(String codigo_Servicio, String servicio, float costo) {
        Codigo_Servicio = codigo_Servicio;
        Servicio = servicio;
        Costo = costo;
    }

    public String getCodigo_Servicio() {
        return Codigo_Servicio;
    }

    public void setCodigo_Servicio(String codigo_Servicio) {
        Codigo_Servicio = codigo_Servicio;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String servicio) {
        Servicio = servicio;
    }

    public float getCosto() {
        return Costo;
    }

    public void setCosto(float costo) {
        Costo = costo;
    }
}
