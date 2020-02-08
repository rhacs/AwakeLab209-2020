import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Ahora, crea una clase ejecutable:
 * - Crea un array de Passwords con el tama�o que t� le indiques por teclado.
 * - Crea un bucle que cree un objeto para cada posici�n del array.
 * - Indica tambi�n por teclado la longitud de los Passwords (antes de bucle).
 * - Crea otro array de booleanos donde se almacene si el password del array de Password es o no
 *   fuerte (usa el bucle anterior).
 * - Al final, muestra la contrase�a y si es o no fuerte (usa el bucle anterior).
 * 
 * Usa este simple formato:
 * 		contrase�a1 valor_booleano1
 *      contrase�a2 valor_bololeano2
 *      ...
 */

public class Ejercicio001 {

    static int pedirNumeroEntero(Scanner scanner, int limiteInferior) {
        int numero;
        
        do {
            while(!scanner.hasNextInt()) {
                System.err.println("[!] Por favor, ingresa un n�mero v�lido");
                scanner.next();
            }
            
            numero = scanner.nextInt();
            
            if(numero < limiteInferior) {
                System.err.println("[!] Por favor, ingresa un n�mero mayor o igual que "
                        + limiteInferior + ".");
            }
        } while(numero < limiteInferior);
        
        return numero;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Password> passwords = new ArrayList<Password>();
        
        System.out.println("Ingrese la cantidad de contrase�as a generar");
        int cantidadContrasenas = pedirNumeroEntero(scanner, 1);
        
        for(int i = 0; i < cantidadContrasenas; i++) {
            System.out.println("Ingresa la longitud de la contrase�a #" + (i + 1));
            int longitud = pedirNumeroEntero(scanner, 1);
            
            Password password = new Password(longitud);
            passwords.add(password);
        }
        
        System.out.println("\nContrase�a\tesFuerte()");
        for(Password password : passwords) {
            System.out.println(" " + password.getPassword() + "\t" + password.esFuerte());
        }
        
        scanner.close();
    }

}
