import java.util.Random;
import java.util.Scanner;

public class Ejercicio006 {

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

	private static void imprimirArreglo(int[] arreglo) {
		System.out.print("[");
		
		System.out.print("]");
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

		int[] arreglo = generarArreglo(tamano, 300, 1);
		System.out.println("arreglo[" + tamano + "]:");
		imprimirArreglo(arreglo);

		int fin;
		System.out.println("Ingrese un digito desde 0 a 9");
		do {
			fin = pedirNumero(scanner);
			
			if(fin < 0 || fin > 9)
				System.err.println("Por favor, ingrese un numero desde 0 a 9");
		} while (fin < 0 || fin > 9);

		System.out.println("Numeros terminados en " + fin);
		int contador = 1;
		for(int numero : arreglo)
			if(Integer.toString(numero).endsWith(Integer.toString(fin))) {
				System.out.print(" " + numero);
				++contador;
				
				if(contador % 10 == 0)
					System.out.println();
			}
		
		if(contador == 1)
			System.out.println("No se encontraron numeros que respondan a su criterio.");
		
		scanner.close();
	}

}
