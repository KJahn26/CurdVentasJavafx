package com.example.modelo;

public class Cliente {

    private String nombre;
    private String apellido;
    private String identificacion;
    private String direccion;
    private String telefono;
    private String tipo="";

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private  TipoCliente tipoCliente;

    public Cliente(String nombre, String apellido, String identificacion,
                   String direccion, String telefono, TipoCliente tipoCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoCliente = tipoCliente;
    }

    public Cliente() {
        nombre = "";
        apellido = "";
        identificacion = "";
        direccion = "";
        telefono = "";
        tipoCliente = tipoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public  TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public  void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre  +
                "\nApellido: " + apellido +
                "\nIdentificacion: " + identificacion +
                "\nDireccion: " + direccion +
                "\nTelefono: " + telefono +
                "\nTipo de cliente: " + tipoCliente.getTipoCliente();
    }

    public boolean validarIdentificacion() {
        boolean centinela = false;
        return centinela;
    }
}
