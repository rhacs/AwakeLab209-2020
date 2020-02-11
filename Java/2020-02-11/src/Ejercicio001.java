import java.util.Random;

public class Ejercicio001 {

    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        
        NombreCompleto nombreCompleto = new NombreCompleto();
        Cuenta cuenta = new Cuenta(nombreCompleto.getNombreCompleto());
        System.out.println("Detalle de la cuenta:\n  " + cuenta + "\n");
        
        int deposito = random.nextInt(100000) + 10000;
        cuenta.ingresar(deposito);
        System.out.println("depositar(" + deposito + "):\n  " + cuenta + "\n");
        
        int giro = random.nextInt(100000) + 10000;
        cuenta.retirar(giro);
        System.out.println("girar(" + giro + "):\n  " + cuenta);
    }
    
}
