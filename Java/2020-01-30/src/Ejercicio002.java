

import java.util.Scanner;

public class Ejercicio002 {

	static int pedirNumero(Scanner scanner, String mensaje) {
		int numero;

		System.out.println(mensaje + ": ");
		while(!scanner.hasNextInt()) {
			System.err.println("Por favor, ingrese un numero valido.");
			scanner.next();
		}

		numero = scanner.nextInt();
		return numero;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = pedirNumero(scanner, "Ingrese un numero");
		
		System.out.println((numero % 2 == 0) ? "Par" : "Impar");
		
		scanner.close();
	}

}
