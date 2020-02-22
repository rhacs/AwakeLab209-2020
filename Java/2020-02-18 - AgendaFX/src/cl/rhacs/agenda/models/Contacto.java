package cl.rhacs.agenda.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Contacto {

    // Attributes ------------------------------------------------------------------------------
    
    private StringProperty nombre;
    private StringProperty tipo;
    private StringProperty telefono;
    
    // Constructors ----------------------------------------------------------------------------
    
    public Contacto(String nombre, String telefono, String tipo) {
        this.nombre = new SimpleStringProperty(nombre);
        this.telefono = new SimpleStringProperty(telefono);
        this.tipo = new SimpleStringProperty(tipo);
    }
    
    // Getters ---------------------------------------------------------------------------------
    
    public String getNombre() {
        return this.nombre.get();
    }
    
    public String getTelefono() {
        return this.telefono.get();
    }
    
    public String getTipo() {
        return this.tipo.get();
    }
    
    // Setters ---------------------------------------------------------------------------------
    
    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }
    
    public void setTelefono(String telefono) {
        this.telefono.set(telefono);
    }
    
    public void setTipo(String tipo) {
        this.tipo.set(tipo);
    }
    
    // Inheritances ----------------------------------------------------------------------------
    
    @Override
    public String toString() {
        return "Contacto(nombre: '" + this.getNombre() + 
                "', telefono: " + this.getTelefono() + 
                ", tipo: '" + this.getTipo() + "')";
    }
    
}
