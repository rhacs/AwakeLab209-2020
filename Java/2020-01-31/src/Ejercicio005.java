import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio005 {

	private static int pedirNumero(Scanner scanner) {
		int numero;
		
		while(!scanner.hasNextInt()) {
			System.err.println("Por favor, ingrese un numero valido.");
			scanner.next();
		}
		
		numero = scanner.nextInt();
		return numero;
	}
	
	private static int[] generarArreglo(int tamano, int valorMaximo, int valorMinimo) {
		Random random = new Random();
		int[] arreglo = new int[tamano];

		for(int i = 0; i < tamano; ++i)
			arreglo[i] = random.nextInt(valorMaximo + 1) + valorMinimo;

		return arreglo;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tamano;
		
		System.out.println("Ingrese el tamano del arreglo");
		do {
			tamano = pedirNumero(scanner);
			
			if(tamano < 1)
				System.err.println("Por favor, ingrese un numero entero natural mayor o igual a 1");
		} while (tamano < 1);
		
		int[] arreglo = generarArreglo(tamano, 9, 0);
		System.out.println("arreglo[" + tamano + "]:\n" + Arrays.toString(arreglo));
		
		int total = 0;
		for(int elemento : arreglo)
			total += elemento;
		
		System.out.println("\nsumarValores(arreglo):\n" + total);
		
		scanner.close();
	}

}
