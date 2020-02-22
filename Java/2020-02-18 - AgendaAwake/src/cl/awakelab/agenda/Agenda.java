package cl.awakelab.agenda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cl.awakelab.agenda.contacto.Contacto;

public class Agenda {
    
    // Constants -------------------------------------------------------------------------------
    
    public final static int CAPACIDAD_POR_DEFECTO = 15;
    
    // Attributes ------------------------------------------------------------------------------
    
    private List<Contacto> agenda;
    private int capacidad;
    
    // Constructors ----------------------------------------------------------------------------
    
    public Agenda(int capacidad) {
        this.agenda = new ArrayList<>();
        this.capacidad = capacidad;
    }
    
    // Methods ---------------------------------------------------------------------------------
    
    public boolean existeContacto(String nombre) {
        for(Contacto contacto : this.agenda) {
            if(contacto.getNombre().toLowerCase().equals(nombre.toLowerCase()))
                return true;
        }
        
        return false;
    }
    
    public List<Contacto> buscarContacto(String nombre) {
        List<Contacto> aux = new ArrayList<>();
        
        for(Contacto contacto : this.agenda) {
            if(contacto.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                aux.add(contacto);
        }
        
        return aux;
    }
    
    public boolean agregarContacto(Contacto contacto) {
        if(existeContacto(contacto.getNombre()))
            return false;
        
        this.agenda.add(contacto);
        Collections.sort(agenda);
        
        return true;
    }
    
    public boolean eliminarContacto(String nombre) {
        if(existeContacto(nombre)) {
            List<Contacto> c = buscarContacto(nombre);
            
            this.agenda.remove(c.get(0));
            return true;
        }
        
        return false;
    }
    
    public boolean isLlena() {
        return (this.capacidad - this.agenda.size()) == 0;
    }
    
    public int espacioLibre() {
        return this.capacidad - this.agenda.size();
    }
    
    public boolean isVacia() {
        return this.agenda.isEmpty();
    }
    
    // Inheritances ----------------------------------------------------------------------------
    
    @Override
    public String toString() {
        String temp = String.format("%5s %-30s %-10s %-10s", 
                "id", 
                "Nombre", 
                "Tipo", 
                "Telefono");
        
        for(int i = 0; i < this.agenda.size(); i++) {
            Contacto contacto = this.agenda.get(i);
            
            temp += "\n" + String.format("%5d %-30s %-10s %-10s", 
                    (i + 1),
                    contacto.getNombre(),
                    contacto.getTipo(),
                    contacto.getNumero());
        }
        
        return temp;
    }

}
