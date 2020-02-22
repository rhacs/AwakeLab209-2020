package cl.rhacs.agenda.controllers;

import java.io.IOException;
import java.util.Optional;

import cl.rhacs.agenda.Funciones;
import cl.rhacs.agenda.models.Contacto;
import cl.rhacs.agenda.models.ContactoFalso;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {

    // Constants -------------------------------------------------------------------------------
    
    private final String RESOURCE_DIALOG = "/cl/rhacs/agenda/views/dialog.fxml";
    private final int CANTIDAD_LIMITE_POR_DEFECTO = 15;
    
    // Attributes ------------------------------------------------------------------------------
    
    @FXML private Button botonAgregar;
    @FXML private Button botonEliminar;
    @FXML private Button botonFalsos;
    @FXML private TextField campoFiltrar;
    @FXML private Label labelCapacidad;
    
    @FXML private TableView<Contacto> tabla;
    @FXML private TableColumn<Contacto, String> tablaNombre;
    @FXML private TableColumn<Contacto, String> tablaTelefono;
    @FXML private TableColumn<Contacto, String> tablaTipo;
    
    private ObservableList<Contacto> contactos;
    private int cantidadContactos;
    
    // Methods ---------------------------------------------------------------------------------
    
    @FXML
    public void initialize() {
        this.contactos = FXCollections.observableArrayList();
        this.contactos.addListener((ListChangeListener<Contacto>) (change -> {
            if(this.contactos.size() > 0)
                this.botonEliminar.setDisable(false);
            else
                this.botonEliminar.setDisable(true);
            
            if(this.isAgendaLlena()) {
                this.botonAgregar.setDisable(true);
                this.botonFalsos.setDisable(true);
            } else {
                this.botonAgregar.setDisable(false);
                this.botonFalsos.setDisable(false);
            }
            
            actualizarCantidad();
        }));
        
        this.tablaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.tablaTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        this.tablaTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        
        FilteredList<Contacto> datosFiltrados = new FilteredList<>(this.contactos, contacto -> true);
        campoFiltrar.textProperty().addListener((observable, oldValue, newValue) -> {
            datosFiltrados.setPredicate(contacto -> {
                if(newValue == null || newValue.trim().isEmpty())
                    return true;
                
                if(contacto.getNombre().toLowerCase().contains(newValue.toLowerCase()))
                    return true;
                
                return false;
            });
        });
        
        SortedList<Contacto> datosOrdenados = new SortedList<>(datosFiltrados);
        datosOrdenados.comparatorProperty().bind(this.tabla.comparatorProperty());
        this.tabla.setItems(datosOrdenados);
        
        // Disable "Eliminar" button by default
        this.botonEliminar.setDisable(true);
        
        pedirCantidadLimite();
        actualizarCantidad();
    }
    
    public void handleAgregar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource(this.RESOURCE_DIALOG));
        loader.setController(new DialogController(this.contactos));
        
        Parent parent = (Parent) loader.load();
        
        Stage stage = new Stage();
        stage.setTitle("Agregar Contacto");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(parent));
        
        stage.showAndWait();
    }
    
    public void handleEliminar() {
        Contacto contacto = this.tabla.getSelectionModel().getSelectedItem();
        
        if(contacto == null) {
            Funciones.showErrorDialog("Por favor, selecciona un Contacto de la lista.");
        } else {
            String mensaje = "Está seguro de querer eliminar al contacto \"" + 
                    contacto.getNombre() + "\"?";
            Optional<ButtonType> resultado = Funciones.showConfirmationDialog(mensaje);
            
            if(resultado.get() == ButtonType.OK)
                this.contactos.remove(contacto);
        }
    }
    
    public void handleFalsos() {
        int limite = getEspaciosDisponibles();
        
        for(int i = 0; i < limite; i++) {
            ContactoFalso cf = new ContactoFalso();
            int randTipo = (int) (Math.random() * 4);
            String tipo;
            
            if(randTipo == 0)
                tipo = "Amistad";
            else if(randTipo == 1)
                tipo = "Familiar";
            else if(randTipo == 2)
                tipo = "Otro";
            else
                tipo = "Trabajo";
            
            if(doesContactExist(cf.getNombre()))
                i--;
            else
                this.contactos.add(new Contacto(cf.getNombre(), cf.getTelefono(), tipo));
        }
    }

    private boolean isAgendaLlena() {
        return (this.cantidadContactos - this.contactos.size() == 0);
    }
    
    private int getEspaciosDisponibles() {
        return this.cantidadContactos - this.contactos.size();
    }
    
    private void actualizarCantidad() {
        this.labelCapacidad.setText(this.contactos.size() + "/" + this.cantidadContactos);
    }
    
    private boolean doesContactExist(String nombre) {
        for(Contacto c : this.contactos)
            if(c.getNombre().toLowerCase().equals(nombre.toLowerCase()))
                return true;
        
        return false;
    }
    
    private void pedirCantidadLimite() {
        TextInputDialog inputDialog = new TextInputDialog("15");
        
        inputDialog.setTitle("Capacidad de la Agenda");
        inputDialog.setHeaderText(null);
        inputDialog.setContentText("Ingrese la cantidad límite de datos a almacenar en la agenda: ");
        
        Button aceptar = (Button) inputDialog.getDialogPane().lookupButton(ButtonType.OK);
        TextField numero = inputDialog.getEditor();
        numero.textProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue == null || newValue.isEmpty() || !newValue.matches("\\d*"))
                aceptar.setDisable(true);
            else 
                aceptar.setDisable(false);
        });
        
        Optional<String> resultado = inputDialog.showAndWait();
        this.cantidadContactos = resultado.isPresent() ? 
                Integer.parseInt(resultado.get()) : 
                this.CANTIDAD_LIMITE_POR_DEFECTO;
    }
    
}
