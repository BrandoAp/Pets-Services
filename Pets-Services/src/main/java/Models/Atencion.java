package Models;


import java.util.Date;

public class Atencion {
    private String Codigo_Servicio, Cedula_P;
    private String Cod_Registro;
    private Date Fecha_Atencion;
    private String Diagnostico, Tratamiento;

    public Atencion(String codigo_Servicio, String cedula_P, String cod_Registro, Date fecha_Atencion, String diagnostico, String tratamiento) {
        Codigo_Servicio = codigo_Servicio;
        Cedula_P = cedula_P;
        Cod_Registro = cod_Registro;
        Fecha_Atencion = fecha_Atencion;
        Diagnostico = diagnostico;
        Tratamiento = tratamiento;
    }

    public String getCodigo_Servicio() {
        return Codigo_Servicio;
    }

    public void setCodigo_Servicio(String codigo_Servicio) {
        Codigo_Servicio = codigo_Servicio;
    }

    public String getCedula_P() {
        return Cedula_P;
    }

    public void setCedula_P(String cedula_P) {
        Cedula_P = cedula_P;
    }

    public String getCod_Registro() {
        return Cod_Registro;
    }

    public void setCod_Registro(String cod_Registro) {
        Cod_Registro = cod_Registro;
    }

    public Date getFecha_Atencion() {
        return Fecha_Atencion;
    }

    public void setFecha_Atencion(Date fecha_Atencion) {
        Fecha_Atencion = fecha_Atencion;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        Diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        Tratamiento = tratamiento;
    }
}
