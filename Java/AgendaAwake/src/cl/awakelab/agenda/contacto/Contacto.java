package cl.awakelab.agenda.contacto;

public abstract class Contacto implements Comparable<Contacto> {

    // Attributes ------------------------------------------------------------------------------
    
    private final String nombre;
    private final String numero;
    
    // Constructors ----------------------------------------------------------------------------
    
    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
    
    // Getters ---------------------------------------------------------------------------------
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getNumero() {
        return this.numero;
    }
    
    public abstract String getTipo();
    
    // Inheritances ----------------------------------------------------------------------------
    
    @Override
    public int compareTo(Contacto contacto) {
        return this.nombre.compareTo(contacto.getNombre());
    }
    
    @Override
    public String toString() {
        return "Contacto(nombre: '" + this.nombre + 
                "', numero: " + this.numero + 
                "', tipo: " + this.getTipo() + ")";
    }

}
 