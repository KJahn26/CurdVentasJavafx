package com.example.modelo;

import javafx.collections.ObservableList;

import javax.swing.*;

public class Venta {
    private String codigoP="";
    private String clienteV="";
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
        return clienteV;
    }

    public void obtenerClientev(String id, ObservableList<Cliente> c) {
        for(int i=0;i<c.size();i++){
            if(id.equals(c.get(i).getIdentificacion())){
                clienteV=c.get(i).getNombre();
                i=c.size();
            }
        }
        if(clienteV.equals("")){
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
