package com.example.modelo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

import java.util.ArrayList;

public class Almacen {
    private String nombre;
    public static ObservableList<ProductoRefrigerado> productoRefrigeradoBd;
public static ObservableList<ProductoEnvasado> productoEnvasadoBd;
    public static ObservableList<ProductoPerecedero> productoPerecederoBd;
    public static ObservableList<ClienteNatural> clienteNaturalBd;
    public static ObservableList<ClienteJuridico> clienteJuridiocBd;


    ArrayList<Cliente> listaClientes;

    public Almacen(String nombre) {
        this.nombre = nombre;
        listaClientes = new ArrayList<>();
        productoRefrigeradoBd = FXCollections.observableArrayList();
        productoEnvasadoBd = FXCollections.observableArrayList();
        productoPerecederoBd= FXCollections.observableArrayList();
        clienteNaturalBd= FXCollections.observableArrayList();
        clienteJuridiocBd = FXCollections.observableArrayList();

        inicializarDatos();
    }
    public Almacen ()
    {}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientesNaturales(ArrayList<ClienteNatural> listaClientesNaturales) {
        this.listaClientes = listaClientes;
    }
    public ObservableList<ClienteNatural> datosCLienteNatural(ClienteNatural cliente)
    {
        try
        {
                if (!this.clienteNaturalBd.contains(cliente))
                {
                    clienteNaturalBd.add(cliente);

                }
                else
                {

                    Alert alert = new Alert (Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setContentText("Datos no enocntrados");
                    alert.showAndWait();
                }
        }catch (Exception ex)
        {
            Alert alert = new Alert (Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        }

        return clienteNaturalBd;
    }

    public ObservableList<ClienteJuridico> datosCienteJuridico (ClienteJuridico cliente)
    {
        try
        {

                clienteJuridiocBd.add(cliente);


        }catch (Exception ex)
        {
            Alert alert = new Alert (Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("FORMATO INCORRECTO");
            alert.showAndWait();
        }

        return clienteJuridiocBd;
    }

    public ObservableList<ProductoPerecedero> datosProductoPerecedero (ProductoPerecedero producto)
    {
        try
        {
            productoPerecederoBd.add(producto);
        }catch (Exception ex)
        {
            Alert alert = new Alert (Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("FORMATO INCORRECTO");
            alert.showAndWait();
        }

        return productoPerecederoBd;
    }
    public ObservableList<ProductoEnvasado> datosProductoEnvasado (ProductoEnvasado producto)
    {
        try
        {
            productoEnvasadoBd.add(producto);
        }catch (Exception ex)
        {
            Alert alert = new Alert (Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("FORMATO INCORRECTO");
            alert.showAndWait();
        }
        return productoEnvasadoBd;
    }

    public ObservableList<ProductoRefrigerado> datosProductoRefirgerado (ProductoRefrigerado producto)
    {
        try
        {
            productoRefrigeradoBd.add(producto);
        }catch (Exception ex)
        {
            Alert alert = new Alert (Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("FORMATO INCORRECTO");
            alert.showAndWait();
        }

        return productoRefrigeradoBd;
    }



    private  void inicializarDatos(){
        Cliente cliente = new Cliente();

        cliente.setNombre("Jhonatan");
        cliente.setApellido("Zamora");
        cliente.setIdentificacion("1089");
        cliente.setDireccion("Ocaso");
        cliente.setTelefono("310739");
        cliente.setTipoCliente(TipoCliente.NATURAL);

        getListaClientes().add(cliente);

    }
}
