package cl.rhacs.agenda.controllers;

import cl.rhacs.agenda.Funciones;
import cl.rhacs.agenda.models.Contacto;

import javafx.collections.ObservableList;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import javafx.stage.Stage;

public class DialogController {

    // Attributes ------------------------------------------------------------------------------
    
    @FXML private TextField campoNombre;
    @FXML private TextField campoTelefono;
    @FXML private ComboBox<String> campoTipo;
    
    @FXML private Button botonAceptar;
    @FXML private Button botonCancelar;
    
    private ObservableList<Contacto> contactos;
    
    // Constructors ----------------------------------------------------------------------------
    
    public DialogController(ObservableList<Contacto> contactos) {
        this.contactos = contactos;
    }
    
    // Methods ---------------------------------------------------------------------------------
    
    @FXML
    public void initialize() {
        this.campoTipo.getItems().clear();
        this.campoTipo.getItems().addAll("Amistad", "Familiar", "Otros", "Trabajo");
        this.campoTipo.getSelectionModel().select(0);
    }
    
    @FXML
    void handleAceptar(ActionEvent event) {
        String nombre = this.campoNombre.getText();
        String telefono = this.campoTelefono.getText();
        String tipo = this.campoTipo.getSelectionModel().getSelectedItem();
        
        if(nombre == null || nombre.trim().isEmpty()) {
            Funciones.showErrorDialog("Debe ingresar el nombre de la persona.");
            this.campoNombre.requestFocus();
        } else if(telefono == null || telefono.trim().isEmpty()) {
            Funciones.showErrorDialog("Debe ingresar el número de la persona.");
            this.campoTelefono.requestFocus();
        } else {
            Contacto contacto = new Contacto(nombre, telefono, tipo);
            
            if(agregarContacto(contacto))
                handleCancelar(event);
            else {
                Funciones.showErrorDialog("El contacto \"" + nombre + "\" ya existe en los " + 
                        "registros.");
                this.campoNombre.requestFocus();
            }
        }
    }
    
    public void handleCancelar(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
    
    public boolean agregarContacto(Contacto contacto) {
        // Check if exists
        for(Contacto c : this.contactos)
            if(c.getNombre().toLowerCase().equals(contacto.getNombre().toLowerCase()))
                return false;
        
        // Add if not
        this.contactos.add(contacto);
        return true;
    }
    
}
