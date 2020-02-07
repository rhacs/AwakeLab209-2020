import java.util.Scanner;

public class Ejercicio001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el tamano del arreglo");
		int tamano = Funciones.pedirNumeroEntero(scanner, 1);
		int[] arreglo = Funciones.generarArreglo(tamano, 1, 300);
		
		System.out.println("\n" + Funciones.imprimirArreglo(arreglo, 10) + "\n\nIngrese la terminacion del numero (0-9)");
		int terminacion = Funciones.pedirNumeroEntero(scanner, 0, 9);
		
		System.out.println("\nNumeros terminados en " + terminacion + ":");
		boolean alMenosUno = false;
		
		for (int elemento : arreglo)
			if(Integer.toString(elemento).endsWith(Integer.toString(terminacion))) {
				System.out.println(" [+] " + elemento);
				alMenosUno = true;
			}
		
		if(!alMenosUno)
			System.err.println(" [!] No hay numeros que cumplan con su requisito");
		
		scanner.close();
	}

}
