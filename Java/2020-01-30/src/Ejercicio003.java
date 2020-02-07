import java.util.Scanner;

public class Ejercicio003 {

	static int pedirNumero(Scanner scanner) {
		int numero;
		
		while(!scanner.hasNextInt()) {
			System.err.println("Por favor, ingrese un numero valido.");
			scanner.next();
		}
		
		numero = scanner.nextInt();
		return numero;
	}
	
	static int contarDigitos(int numero) {
		if(numero < 10 && numero > -10)
			return 1;
		
		return 1 + contarDigitos(numero / 10);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingese un numero para saber cuantos digitos tiene.");
		int numero = pedirNumero(scanner);
		
		System.out.println("Cantidad de digitos: " + contarDigitos(numero));
		scanner.close();
	}

}
