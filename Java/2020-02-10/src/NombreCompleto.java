import java.util.Random;

public class NombreCompleto {
    
    private final String[] NOMBRES = {"Isabella", "Agustina", "Sofía", "Emilia", "Josefa",
            "Isidora", "Emma", "Florencia", "Trinidad", "Maite", "Mateo", "Agustín", "Santiago",
            "Tomás", "Lucas", "Benjamín", "Gaspar", "Matías", "Alonso", "Vicente"};
    
    private final String[] APELLIDOS = {"González", "Muñoz", "Rojas", "Díaz", "Pérez", "Soto",
            "Contreras", "Silva", "Martínez", "Sepúlveda", "Morales", "Rodríguez", "López",
            "Fuentes", "Hernández", "Torres", "Araya", "Flores", "Espinoza", "Valenzuela"};
    
    private String nombre;
    
    NombreCompleto() {
        Random random = new Random();
        
        this.nombre = NOMBRES[random.nextInt(NOMBRES.length)] + " " +
                APELLIDOS[random.nextInt(APELLIDOS.length)];
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
}
