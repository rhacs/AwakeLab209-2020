import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Ahora, crea una clase ejecutable:
 * - Crea un array de Passwords con el tamaño que tú le indiques por teclado.
 * - Crea un bucle que cree un objeto para cada posición del array.
 * - Indica también por teclado la longitud de los Passwords (antes de bucle).
 * - Crea otro array de booleanos donde se almacene si el password del array de Password es o no
 *   fuerte (usa el bucle anterior).
 * - Al final, muestra la contraseña y si es o no fuerte (usa el bucle anterior).
 * 
 * Usa este simple formato:
 * 		contraseña1 valor_booleano1
 *      contraseña2 valor_bololeano2
 *      ...
 */

public class Ejercicio001 {

    static int pedirNumeroEntero(Scanner scanner, int limiteInferior) {
        int numero;
        
        do {
            while(!scanner.hasNextInt()) {
                System.err.println("[!] Por favor, ingresa un número válido");
                scanner.next();
            }
            
            numero = scanner.nextInt();
            
            if(numero < limiteInferior) {
                System.err.println("[!] Por favor, ingresa un número mayor o igual que "
                        + limiteInferior + ".");
            }
        } while(numero < limiteInferior);
        
        return numero;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Password> passwords = new ArrayList<Password>();
        
        System.out.println("Ingrese la cantidad de contraseñas a generar");
        int cantidadContrasenas = pedirNumeroEntero(scanner, 1);
        
        for(int i = 0; i < cantidadContrasenas; i++) {
            System.out.println("Ingresa la longitud de la contraseña #" + (i + 1));
            int longitud = pedirNumeroEntero(scanner, 1);
            
            Password password = new Password(longitud);
            passwords.add(password);
        }
        
        System.out.println("\nContraseña\tesFuerte()");
        for(Password password : passwords) {
            System.out.println(" " + password.getPassword() + "\t" + password.esFuerte());
        }
        
        scanner.close();
    }

}
