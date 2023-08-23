package com.example.modelo;

public class ProductoEnvasado extends Producto {
    private String fechaEnvasado;
    private double pesoEnvase;
    private static PaisOrigen paisOrigen;

    public ProductoEnvasado(String codigo, String nombreProducto, String descripcionProducto,
                            double valorUnitario, int cantidadExistencia, TipoProducto tipoProducto,
                            String fechaEnvasado, double pesoEnvase, PaisOrigen paisOrigen) {
        super(codigo, nombreProducto, descripcionProducto, valorUnitario, cantidadExistencia, tipoProducto);
        this.fechaEnvasado = fechaEnvasado;
        this.pesoEnvase = pesoEnvase;
        this.paisOrigen = paisOrigen;
    }

    public ProductoEnvasado() {
        fechaEnvasado = "";
        pesoEnvase = 0;
        paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getPesoEnvase() {
        return pesoEnvase;
    }

    public void setPesoEnvase(double pesoEnvase) {
        this.pesoEnvase = pesoEnvase;
    }

    public static PaisOrigen getPaisOrigen() {
        return paisOrigen;
    }

    public static void setPaisOrigen(PaisOrigen paisOrigen) {
        ProductoEnvasado.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nFecha envasado: " + fechaEnvasado
                + "\nPeso envase: " + pesoEnvase + "\nPaís de origen: " + paisOrigen.getPaisOrigen();
    }

    public boolean validarPais(String pais) {
        boolean centinela = false;
        if (pais.equals("colombia") || pais.equals("argentina")) {
            centinela = true;
        }
        return centinela;
    }

}
