package com.example.modelo;

public class ClienteJuridico extends Cliente {
   private String nit;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ClienteJuridico(String nombre, String apellido, String identificacion, String direccion, String telefono, TipoCliente tipoCliente, String nit) {
        super(nombre, apellido, identificacion, direccion, telefono, tipoCliente);
        this.nit = nit;
    }

    public ClienteJuridico() {
      nit = " " ;
    }
    public String toString() {
        return  super.toString() + "\nNit: " + nit;
    }

    public boolean validarNit ()
    {
        boolean centinela=false;
        return centinela;
    }
}
