import java.util.Random;
import java.util.Scanner;

/*
 * Descripcion del Problema
 * Desarrolle un programa que permita ordenar un arreglo de menor a mayor.
 * [*] El arreglo debe contener valores generados aleatoriamente.
 * [*] El tamano del arreglo debe ser ingresado por el usuario.
 */

public class Arreglos001 {

	public static int pedirNumero(String mensaje) {
		Scanner scanner = new Scanner(System.in);
		
		while(!scanner.hasNextInt()) {
			System.out.println(mensaje);
			scanner.next();
		}

		int numero = scanner.nextInt();
		return numero;
	}
	
	public static int[] generarArreglo(int tamano, int valorMaximo) {
		Random random = new Random();
		int[] arreglo = new int[tamano];
		
		for(int i = 0; i < tamano; i++) {
			arreglo[i] = random.nextInt(valorMaximo + 1);
		}

		return arreglo;
	}
	
	public static int[] ordenarArreglo(int[] arreglo) {
		int auxiliar;
		boolean cambio;
		
		if(arreglo.length > 1) {
			for(int i = 0; i < arreglo.length; i++) {
				cambio = false;

				for(int j = 0; j < (arreglo.length - 1) - i; j++) {
					if(arreglo[j] > arreglo[j + 1]) {
						auxiliar = arreglo[j + 1];
						arreglo[j + 1] = arreglo[j];
						arreglo[j] = auxiliar;
						
						cambio = true;
					}
				}

				if(!cambio)
					break;
			}
		}

		return arreglo;
	}

	public static void imprimirArreglo(int[] arreglo) {
		System.out.print("[");

		for(int i = 0; i < arreglo.length; i++) {
			if(i == 0)
				System.out.print(arreglo[i]);
			else
				System.out.print(", " + arreglo[i]);
		}

		System.out.print("]\n\n");
	}
	
	public static void main(String[] args) {
		int tamano;
		
		do {
			tamano = pedirNumero("Ingrese un numero valido (mayor a cero): ");
		} while(tamano < 1);

		int[] arreglo = generarArreglo(tamano, 20);
		
		System.out.println("arreglo[" + tamano + "]:");
		imprimirArreglo(arreglo);

		System.out.println("sort(arreglo):");
		arreglo = ordenarArreglo(arreglo);
		imprimirArreglo(arreglo);
	}

}
