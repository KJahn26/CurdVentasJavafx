package com.example.modelo;
public class ClienteNatural extends Cliente {
    private String email;
    private String fechaNacimiento;

    public ClienteNatural(String nombre, String apellido, String identificacion,
                          String direccion, String telefono, TipoCliente tipoCliente, String email, String fechaNacimiento) {
        super(nombre, apellido, identificacion, direccion, telefono, tipoCliente);
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }
    public ClienteNatural() {
        this.email = "";
        this.fechaNacimiento = "";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmail: " + email + "\nFecha de nacimineto: " + fechaNacimiento;
    }


}
