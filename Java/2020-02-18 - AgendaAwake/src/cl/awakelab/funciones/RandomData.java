package cl.awakelab.funciones;

public class RandomData {

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
    private String apellido;
    private String telefono;
    
    // Constructors ----------------------------------------------------------------------------
    
    public RandomData() {
        this.generarNombre();
        this.generarApellido();
        this.generarTelefono();
    }
    
    // Methods ---------------------------------------------------------------------------------
    
    private void generarNombre() {
        this.nombre = NOMBRES[(int) (Math.random() * NOMBRES.length)];
    }
    
    private void generarApellido() {
        this.apellido = APELLIDOS[(int) (Math.random() * APELLIDOS.length)];
    }
    
    private void generarTelefono() {
        this.telefono = "9" + ((int) (Math.random() * 90000000) + 10000000);
    }
    
    // Getters ---------------------------------------------------------------------------------
    
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
    
    public String getTelefono() {
        return this.telefono;
    }
    
}
