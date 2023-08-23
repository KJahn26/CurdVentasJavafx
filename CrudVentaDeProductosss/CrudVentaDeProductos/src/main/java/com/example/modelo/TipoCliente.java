package com.example.modelo;

public enum TipoCliente {
    NATURAL("Natural"),JURIDICO("Juridico");

    private final String tipoCliente;

    TipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }
}
