package com.example.modelo;

public enum TipoProducto {
    PERECEDERO("Perecedero"),
    REFRIGERADO("Refrigerado"),
    ENVASADO("Envasado");
    private final String tipoProducto;
    TipoProducto(String tipoProducto){
        this.tipoProducto = tipoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }
}

