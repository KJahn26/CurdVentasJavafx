package com.example.modelo;

import javax.swing.*;

public class Venta {
    private String codigoP="";
    private String clienteVenta ="";
    private  double totalCompra=0;
    private double iva=0;
    private String detallesDeLaCompra="";
    private String fecha="";
    public Venta (){}
    public void calcularIvaAplicado (double subt){

        this.iva=subt*0.19;
    }
    public void calcularTotalCompra (double subt) {

        this.totalCompra=subt+iva;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getDetallesDeLaCompra() {
        return detallesDeLaCompra;
    }

    public void setDetallesDeLaCompra(String detallesDeLaCompra) {
        this.detallesDeLaCompra = detallesDeLaCompra;
    }

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public String getClientev() {
        return clienteVenta;
    }

    public void obtenerClientev(String id) {
        boolean cent=true;
        for(int i=0;i<Almacen.clienteNaturalBd.size();i++){
            if(id.equals(Almacen.clienteNaturalBd.get(i).getIdentificacion())){
                clienteVenta =Almacen.clienteNaturalBd.get(i).getNombre();
                i=Almacen.clienteNaturalBd.size();
                cent=false;
            }
        }
        if(cent){
            for(int i=0;i<Almacen.clienteJuridiocBd.size();i++){
                if(id.equals(Almacen.clienteJuridiocBd.get(i).getIdentificacion())){
                    clienteVenta =Almacen.clienteJuridiocBd.get(i).getNombre();
                    i=Almacen.clienteJuridiocBd.size();
                }
            }
        }
        if(clienteVenta.equals("")){
            JOptionPane.showMessageDialog(null,"ingrese bien la identificacion");
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
