package com.example.javafxcrudventas;

import com.example.modelo.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.*;
import javax.swing.table.JTableHeader;

public class Controller {
    Aplicacion aplicacion;
    ClienteNatural natural;
    ClienteJuridico juridico;
    Almacen almacen;
    ProductoRefrigerado refrigerado;
    ProductoPerecedero perecedero;
    ProductoEnvasado envasado;
    Venta ventas = new Venta();
    DetalleVenta detalleVenta = new DetalleVenta();

    ObservableList<Venta> listaVentas = FXCollections.observableArrayList();

    ObservableList<DetalleVenta> listadetalles = FXCollections.observableArrayList();

    ObservableList<Producto> listaProductos = FXCollections.observableArrayList();
    ObservableList<Cliente> listaClientesData = FXCollections.observableArrayList();
    private static ObservableList<ClienteNatural> listaClienteNatural ;


    @FXML
    private Button EliminarProducto;

    @FXML
    private MenuItem btn;

    @FXML
    private Button btnActualizarCliente;

    @FXML
    private Button btnActualizarProducto;

    @FXML
    private Button btnAgregarCliente;

    @FXML
    private Button btnAgregarProducto;

    @FXML
    private Button btnAgregarTransaccion;

    @FXML
    private Button btnEliminarCliente;

    @FXML
    private Button btnEliminarTrasaccion;

    @FXML
    private Button btnGestionaTransaccion;

    @FXML
    private MenuItem btnJuridica;

    @FXML
    private MenuItem btnNatural;

    @FXML
    private Button btnNuevaVenta;

    @FXML
    private Button btnNuevoCliente;

    @FXML
    private Button btnNuevoProducto;



    @FXML
    private SplitMenuButton btnTipoPersona;

    @FXML
    private SplitMenuButton btnTipoProducto;
    @FXML
    private SplitMenuButton clienteDatos;

    @FXML
    private TableColumn<Cliente, String> columDireccion;

    @FXML
    private TableColumn<Cliente, String> columEmail;

    @FXML
    private TableColumn<Cliente, String> columFechaNacimiento;

    @FXML
    private TableColumn<Cliente, String> columIdentificacion;

    @FXML
    private TableColumn<Cliente, String> columNit;

    @FXML
    private TableColumn<Cliente, String> columNombre;

    @FXML
    private TableColumn<Cliente, String> columTelefono;

    @FXML
    private TableColumn<Cliente, String> columTipoPersona;

    @FXML
    private TableColumn<Cliente, String> columnApellido;

    @FXML
    private TableView<Cliente> tableClientes;

    @FXML
    private TableView<ClienteNatural> tableClenteNatural;
    @FXML
    private TableView<ClienteJuridico> tableClienteJuridico;
    @FXML
    private TableView<ProductoPerecedero> tablePerecedero;
    @FXML
    private TableView<ProductoEnvasado> tableEnvasado;
    @FXML
    private TableView<ProductoRefrigerado> tableRefrigerado;
    @FXML
    private TableView<Venta> tableVenta;
    @FXML
    private TableView<DetalleVenta> tableDetalleVenta;

    @FXML
    private TableColumn columnNCliente;

    @FXML
    private TableColumn columnApellidNatural;

   @FXML
   private TableColumn columnIdentNatural;
   @FXML
   private TableColumn columnDireNatural;
   @FXML
   private TableColumn columnTeleNatural;

   @FXML
   private  TableColumn columnEmailNatural;
    @FXML
    private TableColumn columnFechaNatural;
    @FXML
    private TableColumn columNameJuridico;
    @FXML
    private TableColumn columnApellJuridico;
    @FXML
    private TableColumn columnIdentJuridico;
    @FXML
    private TableColumn columnDireccionJuridico;
    @FXML
    private TableColumn columnNitJuridico;
    @FXML
    private TableColumn columnTelefJuridico;
    @FXML
    private TableColumn columnCodigoPerece;
    @FXML
    private TableColumn columnNamePerece;
    @FXML
    private TableColumn columnDescripPerece;
    @FXML
    private TableColumn columnValorPerece;
    @FXML
    private TableColumn columnCantidaPerece;
    @FXML
    private TableColumn columnVencePerece;

    @FXML
    private TableColumn columnCodigoEnva;
    @FXML
    private TableColumn columnNameEnva;
    @FXML
    private TableColumn columnDescrpiEnva;
    @FXML
    private TableColumn columnValorEnva;
    @FXML
    private TableColumn columnCantidadEnva;
    @FXML
    private TableColumn columnFechaEnvasadoEnva;
    @FXML
    private TableColumn columnPesoEnvaseEnva;
    @FXML
    private TableColumn columnPaisEnva;

    @FXML
    private TableColumn columnCodigoRefri;
    @FXML
    private TableColumn columnNombreRefri;
    @FXML
    private TableColumn columnDescripRefri;
    @FXML
    private TableColumn columnValorUniRefri;
    @FXML
    private TableColumn columnCantidadRefri;
    @FXML
    private TableColumn columnCodigoAprRefri;
    @FXML
    private TableColumn columnTempeRefri;

    @FXML
    private TableColumn<Venta, String> columnClienteV;
    @FXML
    private TableColumn<Venta, String> columnCodigoProductoV;
    @FXML
    private TableColumn<Venta, Double> columnIVA;
    @FXML
    private TableColumn<Venta, Double> columnTotal;
    @FXML
    private TableColumn<Venta, String> columnFecha;

    @FXML
    private TableColumn<DetalleVenta, Integer> columnCantidad;
    @FXML
    private TableColumn<DetalleVenta, String> columnProductoV;
    @FXML
    private TableColumn<DetalleVenta, Double> columnSubtotal;


    @FXML
    private TextField txtPesoEnvase;
    @FXML
    private TextField txtPaisOrigen;
    @FXML
    private TextField txtFechaVencimientoi;
    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCantidadDeExistencia;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtDescripcion;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtFechaNacimiento;

    @FXML
    private TextField txtIdentificacion;

    @FXML
    private TextField txtNit;

    @FXML
    private TextField nombre;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtValorUnitario;
    @FXML
    private TextField txtNombreProducto;

    @FXML
    private TextField txtCodigoP;
    @FXML
    private TextField txtFecha;
    @FXML
    private TextField txtCantidadProductos;
    @FXML
    private TextField txtIdCliente;
    private int posicionPersonaEnTabla;


    @FXML
    void initialize() {
        this.columNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        this.columIdentificacion.setCellValueFactory(new PropertyValueFactory<>("identificacion"));
        this.columDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        this.columTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        this.columTipoPersona.setCellValueFactory(new PropertyValueFactory<>("tipoCliente"));
        //CLiente natural
        this.columnNCliente.setCellValueFactory(new PropertyValueFactory<ClienteNatural,String>("nombre"));
        this.columnApellidNatural.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        this.columnIdentNatural.setCellValueFactory(new PropertyValueFactory<>("identificacion"));
        this.columnDireNatural.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        this.columnTeleNatural.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        this.columnEmailNatural.setCellValueFactory(new PropertyValueFactory<>("email"));
        this.columnFechaNatural.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
        //CLiente juridico
        this.columNameJuridico.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.columnApellJuridico.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        this.columnIdentJuridico.setCellValueFactory(new PropertyValueFactory<>("identificacion"));
        this.columnDireccionJuridico.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        this.columnNitJuridico.setCellValueFactory(new PropertyValueFactory<>("nit"));
        this.columnTelefJuridico.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        //Producto perecedero
        this.columnCodigoPerece.setCellValueFactory(new PropertyValueFactory<ProductoPerecedero,String>("codigo"));
        this.columnNamePerece.setCellValueFactory(new PropertyValueFactory<ProductoPerecedero,String>("nombreProducto"));
        this.columnDescripPerece.setCellValueFactory(new PropertyValueFactory<>("descripcionProducto"));
        this.columnValorPerece.setCellValueFactory(new PropertyValueFactory<>("valorUnitario"));
        this.columnCantidaPerece.setCellValueFactory(new PropertyValueFactory<>("cantidadExistencia"));
        this.columnVencePerece.setCellValueFactory(new PropertyValueFactory<>("fechaVencimiento"));
        //ProdcutoEnvasado
        this.columnCodigoEnva.setCellValueFactory(new PropertyValueFactory<ProductoPerecedero,String>("codigo"));
        this.columnNameEnva.setCellValueFactory(new PropertyValueFactory<ProductoPerecedero,String>("nombreProducto"));
        this.columnDescrpiEnva.setCellValueFactory(new PropertyValueFactory<>("descripcionProducto"));
        this.columnValorEnva.setCellValueFactory(new PropertyValueFactory<>("valorUnitario"));
        this.columnCantidadEnva.setCellValueFactory(new PropertyValueFactory<>("cantidadExistencia"));
        this.columnPesoEnvaseEnva.setCellValueFactory(new PropertyValueFactory<>("pesoEnvase"));
        //Producto Refigerado
        this.columnCodigoRefri.setCellValueFactory(new PropertyValueFactory<ProductoPerecedero,String>("codigo"));
        this.columnNombreRefri.setCellValueFactory(new PropertyValueFactory<ProductoPerecedero,String>("nombreProducto"));
        this.columnDescripRefri.setCellValueFactory(new PropertyValueFactory<>("descripcionProducto"));
        this.columnValorUniRefri.setCellValueFactory(new PropertyValueFactory<>("valorUnitario"));
        this.columnCantidadRefri.setCellValueFactory(new PropertyValueFactory<>("cantidadExistencia"));

        //Transaccion
        this.columnClienteV.setCellValueFactory(new PropertyValueFactory<>("clienteV"));
        this.columnCodigoProductoV.setCellValueFactory(new PropertyValueFactory<>("codigoP"));
        this.columnIVA.setCellValueFactory(new PropertyValueFactory<>("iva"));
        this.columnTotal.setCellValueFactory(new PropertyValueFactory<>("totalCompra"));
        this.columnFecha.setCellValueFactory(new PropertyValueFactory<>("Fecha"));

        this.columnCantidad.setCellValueFactory(new PropertyValueFactory<>("cantidadProductos"));
        this.columnProductoV.setCellValueFactory(new PropertyValueFactory<>("productoVendido"));
        this.columnSubtotal.setCellValueFactory(new PropertyValueFactory<>("Subtotal"));



        listaClienteNatural = FXCollections.observableArrayList();
        envasado = new ProductoEnvasado();
        perecedero = new ProductoPerecedero();
        refrigerado = new ProductoRefrigerado();
        natural = new ClienteNatural();
        juridico = new ClienteJuridico();
        almacen = new Almacen();





    }

    @FXML
    void NaturalAction(ActionEvent event) {

        txtNit.setEditable(false);
        txtFechaNacimiento.setEditable(true);
        txtEmail.setEditable(true);
    }


    @FXML
    void actualizarClienteAction(ActionEvent event) {









    }

    @FXML
    void actualizarProductoAction(ActionEvent event) {

    }

    @FXML
    void agregarClienteAction(ActionEvent event) {
        if (txtNit.getText().equals("") )
        {
            natural.setTipo("natural");
            natural.setNombre(nombre.getText());
            natural.setApellido(txtApellido.getText());
            natural.setIdentificacion(txtIdentificacion.getText());
            natural.setDireccion(txtDireccion.getText());
            natural.setTelefono(txtTelefono.getText());
            natural.setEmail(txtEmail.getText());
            natural.setFechaNacimiento(txtFechaNacimiento.getText());
            listaClienteNatural=almacen.datosCLienteNatural(natural);
            tableClenteNatural.setItems(listaClienteNatural);
            JOptionPane.showMessageDialog(null,"Se agregaron los datos"+"\nNatural");


        }
        else
        {
            juridico.setTipo("jurico");
            juridico.setNombre(nombre.getText());
            juridico.setApellido(txtApellido.getText());
            juridico.setIdentificacion(txtIdentificacion.getText());
            juridico.setDireccion(txtDireccion.getText());
            juridico.setTelefono(txtTelefono.getText());
            juridico.setNit(txtNit.getText());
            tableClienteJuridico.setItems(almacen.datosCienteJuridico(juridico));
            JOptionPane.showMessageDialog(null,"Se agregaron los datos"+"\nJuridico");
        }

    }

    @FXML
    void agregarProductoAction(ActionEvent event) {


            if (txtPaisOrigen.getText().equals("") && txtPesoEnvase.getText().equals(""))
            {
                perecedero.setCodigo(txtCodigo.getText());
                perecedero.setNombreProducto(txtNombreProducto.getText());
                perecedero.setDescripcionProducto(txtDescripcion.getText());
                perecedero.setValorUnitario(Double.parseDouble(txtValorUnitario.getText()));
                perecedero.setCantidadExistencia(Integer.parseInt(txtCantidadDeExistencia.getText()));
                perecedero.setFechaVencimiento(txtFechaVencimientoi.getText());
                tablePerecedero.setItems(almacen.datosProductoPerecedero(perecedero));
                JOptionPane.showMessageDialog(null,"Prodcuto agregado");
            }
            else if (txtFechaVencimientoi.getText().equals(""))
            {
                envasado.setCodigo(txtCodigo.getText());
                envasado.setNombreProducto(txtNombreProducto.getText());
                envasado.setDescripcionProducto(txtDescripcion.getText());
                envasado.setValorUnitario(Double.parseDouble(txtValorUnitario.getText()));
                envasado.setCantidadExistencia(Integer.parseInt(txtCantidadDeExistencia.getText()));
                envasado.setPesoEnvase(Double.parseDouble(txtPesoEnvase.getText()));
                tableEnvasado.setItems(almacen.datosProductoEnvasado(envasado));
                JOptionPane.showMessageDialog(null,"Prodcuto agregado");


            }
            else
            {
                refrigerado.setCodigo(txtCodigo.getText());
                refrigerado.setNombreProducto(txtNombreProducto.getText());
                refrigerado.setDescripcionProducto(txtDescripcion.getText());
                refrigerado.setValorUnitario(Double.parseDouble(txtValorUnitario.getText()));
                refrigerado.setCantidadExistencia(Integer.parseInt(txtCantidadDeExistencia.getText()));
                tableRefrigerado.setItems(almacen.datosProductoRefirgerado(refrigerado));
                JOptionPane.showMessageDialog(null,"Prodcuto agregado");

            }





    }

    @FXML
    void agregarTransaccionAction(ActionEvent event) {
        ventas.setCodigoP(txtCodigoP.getText());
        ventas.setFecha(txtFecha.getText());
        ventas.obtenerClientev(txtIdCliente.getText(),listaClientesData);
        detalleVenta.setCantidadProductos(Integer.parseInt(txtCantidadProductos.getText()));
        detalleVenta.calcularSubtotal(ventas.getCodigoP(), listaProductos);
        ventas.calcularIvaAplicado(detalleVenta.getSubtotal());
        detalleVenta.setCantidadProductos(Integer.parseInt(txtCantidadProductos.getText()));
        ventas.calcularTotalCompra(detalleVenta.getSubtotal());
        detalleVenta.setProductoVendido(ventas.getCodigoP(), listaProductos);
        listaVentas.add(ventas);
        listadetalles.add(detalleVenta);

        JOptionPane.showMessageDialog(null,ventas.getClientev()+" "+ventas.getCodigoP()+" "+ventas.getIva()+" "+listaVentas.get(0).getClientev());

        this.tableVenta.setItems(listaVentas);
        this.tableDetalleVenta.setItems(listadetalles);
    }

    @FXML
    void eliminarClienteAction(ActionEvent event) {
        try
        {
            ClienteNatural clienteN = this.tableClenteNatural.getSelectionModel().getSelectedItem();
            ClienteJuridico clienteJ = this.tableClienteJuridico.getSelectionModel().getSelectedItem();
            Cliente cliente = this.tableClenteNatural.getSelectionModel().getSelectedItem();
            if (clienteN==null)
            {


            }
            else
            {
                this.listaClienteNatural.remove(clienteN);
                this.tableClenteNatural.refresh();

            }

        }catch (Exception e)
        {

        }



    }

    @FXML
    void eliminarProductoAction(ActionEvent event) {

    }

    @FXML
    void eliminarTransaccionAction(ActionEvent event) {

    }

    @FXML
    void gestionarTransaccionAction(ActionEvent event) {

    }

    @FXML
    void juridicoAction(ActionEvent event) {

        txtNit.setEditable(true);
        txtFechaNacimiento.setEditable(false);
        txtEmail.setEditable(false);
    }

    @FXML
    void nuevaVentaAction(ActionEvent event) {

    }

    @FXML
    void nuevoClienteAction(ActionEvent event) {
        try
        {
            ClienteNatural clienteN = this.tableClenteNatural.getSelectionModel().getSelectedItem();
            ClienteJuridico clienteJ = this.tableClienteJuridico.getSelectionModel().getSelectedItem();
            if (clienteN!= null && clienteN.getTipo().equals("natural"))
            {

                this.nombre.setText(clienteN.getNombre());
                this.txtApellido.setText(clienteN.getApellido());
                this.txtIdentificacion.setText(clienteN.getIdentificacion());
                this.txtDireccion.setText(clienteN.getDireccion());
                this.txtTelefono.setText(clienteN.getTelefono());
                this.txtEmail.setText(clienteN.getEmail());
                this.txtFechaNacimiento.setText(clienteN.getFechaNacimiento());
            }
            else if (clienteJ!= null && clienteJ.getTipo().equals("juridico"))
            {
                this.nombre.setText(clienteJ.getNombre());
                this.txtApellido.setText(clienteJ.getApellido());
                this.txtIdentificacion.setText(clienteJ.getIdentificacion());
                this.txtDireccion.setText(clienteJ.getDireccion());
                this.txtTelefono.setText(clienteJ.getTelefono());
                this.txtNit.setText(clienteJ.getNit());

            }
        }catch (Exception e)
        {

        }





    }

    @FXML
    void nuevoProductoAction(ActionEvent event) {
        txtCodigo.setText(" ");
        txtNombreProducto.setText(" ");
        txtPesoEnvase.setText(" ");
        txtPaisOrigen.setText(" ");
        txtFechaVencimientoi.setText(" ");
        txtCantidadDeExistencia.setText(" ");
        txtValorUnitario.setText(" ");
        txtDescripcion.setText(" ");

    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
        tableClientes.getItems().clear();
        tableClientes.setItems(getListaClientesData());
    }

    public ObservableList<Cliente> getListaClientesData() {
        listaClientesData.addAll(aplicacion.obtenerClientes());
        return listaClientesData;
    }
}
