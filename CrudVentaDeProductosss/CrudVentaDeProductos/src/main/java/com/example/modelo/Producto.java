package com.example.modelo;

public class Producto {
    private String codigo;
    private String nombreProducto;
    private String descripcionProducto;
    private double valorUnitario;
    private int cantidadExistencia;
    private static TipoProducto tipoProducto;

    public Producto(String codigo, String nombreProducto, String descripcionProducto,
                    double valorUnitario, int cantidadExistencia, TipoProducto tipoProducto) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.valorUnitario = valorUnitario;
        this.cantidadExistencia = cantidadExistencia;
        this.tipoProducto = tipoProducto;
    }
    public Producto() {
        codigo = "";
        nombreProducto = "";
        descripcionProducto = "";
        valorUnitario = 0.0;
        cantidadExistencia = 0;
        tipoProducto = tipoProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }

    public static TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public static void setTipoProducto(TipoProducto tipoProducto) {
        Producto.tipoProducto = tipoProducto;
    }

    @Override
    public String toString() {
        return  "Codigo : " + codigo  +
                "\nNombre Producto: " + nombreProducto +
                "\nDescripción del producto: " + descripcionProducto +
                "\nValor unitario: " + valorUnitario +
                "\nCantidad de existencia: " + cantidadExistencia +
                "\nTipo de Producto: " + tipoProducto.getTipoProducto();
    }
}
