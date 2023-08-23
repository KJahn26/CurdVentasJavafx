package com.example.modelo;

import com.example.modelo.Producto;
import javafx.collections.ObservableList;

import javax.swing.*;

public class DetalleVenta {

 private int cantidadProductos=0;

 private String productoVendido = "";

 private double subtotal=0.0;



 public int getCantidadProductos() {
  return cantidadProductos;
 }

 public void setCantidadProductos(int cantidadProductos) {
  this.cantidadProductos = cantidadProductos;
 }

 public double getSubtotal() {
  return subtotal;
 }

 public void calcularSubtotal(String product, ObservableList<Producto> p) {
  int i= encontrari(product,p);
  if(i==-1){
   JOptionPane.showMessageDialog(null,"Ingrese bien el codigo de producto");
  }
  else{
   subtotal=p.get(i).getValorUnitario()*cantidadProductos;
  }
 }

 public int encontrari(String product, ObservableList<Producto> p){
  int j=-1;
  for(int i=0;i<p.size();i++){
   if(p.get(i).getCodigo().equals(product)){
    j=i;
    i=p.size();
   }
  }
  return j;}

 public String getProductoVendido() {
  return productoVendido;
 }

 public void setProductoVendido(String product,ObservableList<Producto> p) {
  int i=encontrari(product,p);
  if(i==-1){
   JOptionPane.showMessageDialog(null,"Ingrese bien el codigo de producto");
  }
  else{

   productoVendido=  p.get(i).getNombreProducto();
  }
 }
}
