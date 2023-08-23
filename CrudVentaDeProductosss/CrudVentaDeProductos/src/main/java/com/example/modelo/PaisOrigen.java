package com.example.modelo;

public enum PaisOrigen {
    COLOMBIA("Colombia"),
    ARGENTINA("Argentina"),
    CHILE("Chile"),
    ECUADOR("Ecuador"),
    PERU("Peru");
    private final String paisOrigen;
    PaisOrigen(String paisOrigen){
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }
}
