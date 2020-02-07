import java.util.Scanner;

public class Ejercicio002 {

	static int pedirNumeroEntero(Scanner scanner, int limiteInferior, int limiteSuperior) {
		int numero;
		
		do {
			while(!scanner.hasNextInt()) {
				System.out.println("[!] Por favor, ingrese un numero valido.");
				scanner.next();
			}
			
			numero = scanner.nextInt();
			
			if(numero < limiteInferior || numero > limiteSuperior) {
				System.out.println("[!] Por favor, ingrese un numero entre " + limiteInferior
						+ " y " + limiteSuperior);
			}
		} while (numero < limiteInferior || numero > limiteSuperior);
		
		return numero;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el texto a evaluar");
		String texto = scanner.nextLine();
		
		while(texto.isEmpty()) {
			System.out.println("[!] Por favor, ingrese un texto");
			texto = scanner.nextLine();
		}
		
		System.out.println("Ingrese la posicion del caracter que quiere recuperar");
		int posicion = pedirNumeroEntero(scanner, 0, texto.length() - 1);
		
		System.out.println("Caracter en la posicion " + posicion + ": "
				+ '"' + texto.charAt(posicion) + '"');
		System.out.println("Cadena desde la posicion " + posicion + ": "
				+ '"' + texto.substring(posicion) + '"');
		
		System.out.println("Ingrese el desde");
		int limiteInferior = pedirNumeroEntero(scanner, 0, texto.length() - 1);
		System.out.println("Ingrese el hasta");
		int limiteSuperior = pedirNumeroEntero(scanner, limiteInferior, texto.length() - 1);
		
		System.out.println("Extracto: \"" + texto.substring(limiteInferior, limiteSuperior) + '"');
		
		scanner.close();
	}

}
