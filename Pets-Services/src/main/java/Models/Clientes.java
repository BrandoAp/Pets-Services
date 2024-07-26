package Models;

public class Clientes {
    private String Cedula_C, Nombre_C, Apellido_C;
    private String Direccion_C;
    private String Telefonos_C;
    private String Email;
    private String Codigo_Sucursal;

    public Clientes(String cedula_C, String nombre_C, String apellido_C, String direccion_C, String telefonos_C, String email, String codigo_Sucursal) {
        Cedula_C = cedula_C;
        Nombre_C = nombre_C;
        Apellido_C = apellido_C;
        Direccion_C = direccion_C;
        Telefonos_C = telefonos_C;
        Email = email;
        Codigo_Sucursal = codigo_Sucursal;
    }

    public String getCedula_C() {
        return Cedula_C;
    }

    public void setCedula_C(String cedula_C) {
        Cedula_C = cedula_C;
    }

    public String getNombre_C() {
        return Nombre_C;
    }

    public void setNombre_C(String nombre_C) {
        Nombre_C = nombre_C;
    }

    public String getApellido_C() {
        return Apellido_C;
    }

    public void setApellido_C(String apellido_C) {
        Apellido_C = apellido_C;
    }

    public String getDireccion_C() {
        return Direccion_C;
    }

    public void setDireccion_C(String direccion_C) {
        Direccion_C = direccion_C;
    }

    public String getTelefonos_C() {
        return Telefonos_C;
    }

    public void setTelefonos_C(String telefonos_C) {
        Telefonos_C = telefonos_C;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCodigo_Sucursal() {
        return Codigo_Sucursal;
    }

    public void setCodigo_Sucursal(String codigo_Sucursal) {
        Codigo_Sucursal = codigo_Sucursal;
    }
}