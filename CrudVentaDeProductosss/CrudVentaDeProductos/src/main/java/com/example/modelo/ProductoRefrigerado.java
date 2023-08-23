package com.example.modelo;

public class ProductoRefrigerado extends Producto{
    private String codigoAprobacion;
    private String temperaturaRefrigerado;

    public ProductoRefrigerado(String codigo, String nombreProducto, String descripcionProducto,
                               double valorUnitario, int cantidadExistencia, TipoProducto tipoProducto,
                               String codigoAprobacion, String temperaturaRefrigerado) {
        super(codigo, nombreProducto, descripcionProducto, valorUnitario, cantidadExistencia, tipoProducto);
        this.codigoAprobacion = codigoAprobacion;
        this.temperaturaRefrigerado = temperaturaRefrigerado;
    }

    public ProductoRefrigerado() {
        codigoAprobacion = "";
        temperaturaRefrigerado = "" ;
    }

    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public String getTemperaturaRefrigerado() {
        return temperaturaRefrigerado;
    }

    public void setTemperaturaRefrigerado(String temperaturaRefrigerado) {
        this.temperaturaRefrigerado = temperaturaRefrigerado;
    }
    public String toString() {
        return super.toString() + "\nCodigo de aprobacion: " + codigoAprobacion +
                "\nTemperatura refrigerado: " + temperaturaRefrigerado;
    }
}
