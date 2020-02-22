package cl.rhacs.agenda.models;

public class ContactoFalso implements Comparable<ContactoFalso> {

    // Constants -------------------------------------------------------------------------------
    
    private final String[] NOMBRES = {"Isabella", "Sofia", "Agustina", "Emilia", "Josefa",
            "Isidora", "Emma", "Trinidad", "Florencia", "Julieta", "Maite", "Maria", "Amanda",
            "Antonella", "Martina", "Valentina", "Catalina", "Leonor", "Renata", "Mia", "Mateo",
            "Agustin", "Santiago", "Tomas", "Benjamin", "Lucas", "Gaspar", "Alonso", "Vicente",
            "Maximiliano", "Joaquin", "Matias", "Martin", "Jose", "Luciano", "Facundo", "Julian",
            "Gabriel", "Maximo", "Juan"};
    
    private final String[] APELLIDOS = {"Gonzalez", "Munoz", "Rojas", "Diaz", "Perez", "Soto",
            "Contreras", "Silva", "Martinez", "Sepulveda", "Morales", "Rodriguez", "Lopez",
            "Fuentes", "Hernandez", "Torres", "Araya", "Flores", "Espinoza", "Valenzuela",
            "Castillo", "Ramirez", "Reyes", "Gutierrez", "Castro", "Vargas", "Alvarez", "Vasquez",
            "Tapia", "Fernandez", "Sanchez", "Carrasco", "Gomez", "Cortes", "Herrera", "Nunez",
            "Jara", "Vergara", "Rivera", "Figueroa"};
    
    // Attributes ------------------------------------------------------------------------------
    
    private String nombre;
    private String telefono;
    
    // Constructors ----------------------------------------------------------------------------
    
    public ContactoFalso() {
        this.nombre = NOMBRES[(int) (Math.random() * NOMBRES.length)] + " " +
                APELLIDOS[(int) (Math.random() * APELLIDOS.length)];
        this.telefono = "9" + (int) (Math.random() * 90000000 + 10000000);
    }
    
    // Getters ---------------------------------------------------------------------------------
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getTelefono() {
        return this.telefono;
    }
    
    // Inheritances ----------------------------------------------------------------------------
    
    @Override
    public int compareTo(ContactoFalso otroContacto) {
        return this.nombre.compareTo(otroContacto.getNombre());
    }
    
    @Override
    public String toString() {
        return "Contacto(nombre: '" + this.getNombre() + 
                "', telefono: " + this.getTelefono() + ")";
    }
    
}
