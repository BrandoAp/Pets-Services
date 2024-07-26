package Models;

public class Personal {
    private String Cedula_P, Nombre_P, Apellido_P;
    private String Direccion_P;
    private String Telefono_P;
    private float salario;
    private String cargo;
    private String Codigo_Sucursal;

    public Personal(String cedula_P, String nombre_P, String apellido_P, String direccion_P, String telefono_P, float salario, String cargo, String codigo_Sucursal) {
        Cedula_P = cedula_P;
        Nombre_P = nombre_P;
        Apellido_P = apellido_P;
        Direccion_P = direccion_P;
        Telefono_P = telefono_P;
        this.salario = salario;
        this.cargo = cargo;
        Codigo_Sucursal = codigo_Sucursal;
    }

    public String getCedula_P() {
        return Cedula_P;
    }

    public void setCedula_P(String cedula_P) {
        Cedula_P = cedula_P;
    }

    public String getNombre_P() {
        return Nombre_P;
    }

    public void setNombre_P(String nombre_P) {
        Nombre_P = nombre_P;
    }

    public String getApellido_P() {
        return Apellido_P;
    }

    public void setApellido_P(String apellido_P) {
        Apellido_P = apellido_P;
    }

    public String getDireccion_P() {
        return Direccion_P;
    }

    public void setDireccion_P(String direccion_P) {
        Direccion_P = direccion_P;
    }

    public String getTelefono_P() {
        return Telefono_P;
    }

    public void setTelefono_P(String telefono_P) {
        Telefono_P = telefono_P;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCodigo_Sucursal() {
        return Codigo_Sucursal;
    }

    public void setCodigo_Sucursal(String codigo_Sucursal) {
        Codigo_Sucursal = codigo_Sucursal;
    }
}
