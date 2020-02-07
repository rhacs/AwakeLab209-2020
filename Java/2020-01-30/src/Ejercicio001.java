import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio001 {

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
		int[] numeros = new int[3];
		
		numeros[0] = pedirNumero(scanner, "Ingrese el primer numero");
		numeros[1] = pedirNumero(scanner, "Ingrese el segundo numero");
		numeros[2] = pedirNumero(scanner, "Ingrese el tercer numero");
		Arrays.sort(numeros);
		
		System.out.println("Numero mayor: " + numeros[2]);
		
		//int numero1 = pedirNumero(scanner, "Ingrese el primer numero");
		//int numero2 = pedirNumero(scanner, "Ingrese el segundo numero");
		//int numero3 = pedirNumero(scanner, "Ingrese el tercer numero");
		
		/*
		if(numero1 > numero2) {
			if (numero1 > numero3)
				System.out.println(numero1 + " es mayor que " + numero2 + " y " + numero3);
			else
				System.out.println(numero3 + " es mayor que " + numero1 + " y " + numero2);
		} else {
			if(numero2 > numero3)
				System.out.println(numero2 + " es mayor que " + numero1 + " y " + numero3);
			else
				System.out.println(numero3 + " es mayor que " + numero1 + " y " + numero2);
		}
		*/

		scanner.close();
	}

}
