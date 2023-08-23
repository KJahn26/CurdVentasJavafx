package com.example.modelo;

public class ProductoPerecedero extends Producto {
    private String fechaVencimiento;

    public ProductoPerecedero(String codigo, String nombreProducto, String descripcionProducto, double valorUnitario, int cantidadExistencia, TipoProducto tipoProducto, String fechaVencimiento) {
        super(codigo, nombreProducto, descripcionProducto, valorUnitario, cantidadExistencia, tipoProducto);
        this.fechaVencimiento = fechaVencimiento;
    }

    public ProductoPerecedero() {
        fechaVencimiento = "";
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String toString() {
        return super.toString() + "\nFecha vencimiento: " + fechaVencimiento;
    }
}
