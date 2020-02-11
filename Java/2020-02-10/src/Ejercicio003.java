import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio003 {
    
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<Empleado>();
        Random random = new Random();
        
        int cantidadEmpleados = random.nextInt(10) + 4;
        
        System.out.println("Empleados(" + cantidadEmpleados + ")");
        for(int i = 0; i < cantidadEmpleados; i++) {
            boolean comercial = random.nextBoolean();
            
            Empleado empleado = new Empleado(
                    new NombreCompleto().getNombre(),
                    random.nextInt(20) + 20,
                    random.nextInt(200000) + 100000,
                    comercial,
                    (comercial ? (random.nextInt(300000) + 50000) : 0),
                    (!comercial ? ("zona " + (random.nextInt(5) + 1)) : null));
            
            System.out.println("\t" + empleado);
            empleados.add(empleado);
        }
        
        System.out.println("\nSalario final acorde a condicionales:");
        for(Empleado empleado : empleados) {
            System.out.println("\t" + empleado.getNombre() + 
                    " > $" + empleado.calcularSalarioFinal());
        }
    }

}
