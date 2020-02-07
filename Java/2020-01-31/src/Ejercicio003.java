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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		int limite = pedirNumero(scanner);
		
		int anterior = 0;
		int ultimo = 1;
		int auxiliar;
		
		System.out.println("x en la Secuencia Fibonacci hasta que f(x) = " + limite);
		while(ultimo < limite) {
			System.out.println(" " + ultimo);
			
			auxiliar = ultimo;
			ultimo = auxiliar + anterior;
			anterior = auxiliar;
		}
		
		scanner.close();
	}

}
