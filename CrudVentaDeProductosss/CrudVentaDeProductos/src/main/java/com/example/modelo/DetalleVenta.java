package com.example.modelo;

import com.example.modelo.Producto;
import javafx.collections.ObservableList;

import javax.swing.*;

public class DetalleVenta {

 private int cantidadProductos = 0;

 private String productoVendido = "";

 private double subtotal = 0.0;


 public int getCantidadProductos() {
  return cantidadProductos;
 }

 public void setCantidadProductos(int cantidadProductos) {
  this.cantidadProductos = cantidadProductos;
 }

 public double getSubtotal() {
  return subtotal;
 }

 public void calcularSubtotal(String product) {
  String t = "per";
  int i = encontraripe(product, Almacen.productoPerecederoBd);
  if (i == -1) {
   i = encontrarienv(product, Almacen.productoEnvasadoBd);
   t = "env";
  }
  if (i == -1) {
   i = encontrariref(product, Almacen.productoRefrigeradoBd);
   t = "refri";
  }
  if (i == -1) {
   t = "";
   JOptionPane.showMessageDialog(null, "ingrese bien el codigo");
  }
  if (i!=-1) {
    if (t.equals("per")) {
     subtotal = Almacen.productoPerecederoBd.get(i).getValorUnitario() * cantidadProductos;
    }
    if (t.equals("env")) {
     subtotal = Almacen.productoEnvasadoBd.get(i).getValorUnitario() * cantidadProductos;
    }
    if (t.equals("refri")) {
     subtotal = Almacen.productoRefrigeradoBd.get(i).getValorUnitario() * cantidadProductos;
    }
   }
  }

 public int encontraripe(String product, ObservableList<ProductoPerecedero> p) {
  int j = -1;
  for (int i = 0; i < p.size(); i++) {
   if (p.get(i).getCodigo().equals(product)) {
    j = i;
    i = p.size();
   }
  }
  return j;
 }

 public int encontrarienv(String product, ObservableList<ProductoEnvasado> p) {
  int j = -1;
  for (int i = 0; i < p.size(); i++) {
   if (p.get(i).getCodigo().equals(product)) {
    j = i;
    i = p.size();
   }
  }
  return j;
 }

 public int encontrariref(String product, ObservableList<ProductoRefrigerado> p) {
  int j = -1;
  for (int i = 0; i < p.size(); i++) {
   if (p.get(i).getCodigo().equals(product)) {
    j = i;
    i = p.size();
   }
  }
  return j;
 }


 public String getProductoVendido() {
  return productoVendido;
 }

 public void setProductoVendido(String product) {
  String t = "per";
  int i = encontraripe(product, Almacen.productoPerecederoBd);
  if (i == -1) {
   i = encontrarienv(product, Almacen.productoEnvasadoBd);
   t = "env";
  }
  if (i == -1) {
   i = encontrariref(product, Almacen.productoRefrigeradoBd);
   t = "refri";
  }
  if (i == -1) {
   JOptionPane.showMessageDialog(null, "ingrese bien el codigo");
   t = "";
  }
  if (i != -1) {
   if (t.equals("per")) {
    productoVendido = Almacen.productoPerecederoBd.get(i).getNombreProducto();
   }
   if (t.equals("env")) {
    productoVendido = Almacen.productoEnvasadoBd.get(i).getNombreProducto();
   }
   if (t.equals("refri")) {
    productoVendido = Almacen.productoRefrigeradoBd.get(i).getNombreProducto();
   }
  }
 }
}
