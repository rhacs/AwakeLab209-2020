import java.util.Random;

public class NombreCompleto {

    private final String[] NOMBRES = {"Isabella", "Agustina", "Sofía", "Emilia", "Josefa",
            "Isidora", "Emma", "Florencia", "Trinidad", "Maite", "Julieta", "María", "Amanda",
            "Antonella", "Martina", "Valentina", "Leonor", "Catalina", "Renata", "Emily", "Mateo",
            "Agustín", "Santaigo", "Tomás", "Lucas", "Benjamín", "Gaspar", "Matías", "Alonso",
            "Vicente", "Joaquín", "Martín", "Maximiliano", "José", "Luciano", "Julián", "Dante",
            "Máximo", "Juan", "Gabriel"};
    
    private final String[] APELLIDOS = {"González", "Muñoz", "Rojas", "Díaz", "Pérez", "Soto",
            "Contreras", "Silva", "Martínez", "Sepúlveda", "Morales", "Rodríguez", "López",
            "Fuentes", "Hernández", "Torres", "Araya", "Flores", "Espinosa", "Valenzuela",
            "Castillo", "Ramírez", "Reyes", "Gutiérrez", "Castro", "Vargas", "Álvarez", "Vásquez",
            "Tapia", "Fernández", "Sánchez", "Carrasco", "Gómez", "Cortés", "Herrera", "Núñez",
            "Jara", "Vergara", "Rivera", "Figueroa"};

    private String nombre;
    private String apellido;
    
    NombreCompleto() {
        Random random = new Random(System.currentTimeMillis());
        
        this.nombre = NOMBRES[random.nextInt(NOMBRES.length)];
        this.apellido = APELLIDOS[random.nextInt(APELLIDOS.length)];
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
    
    public String toString() {
        return "NombreCompleto(nombre: '" + this.nombre + "', apellido: '" + this.apellido + "')";
    }
    
}
