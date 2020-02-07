import java.util.Scanner;

public class Ejercicio004 {

	static long fibonacci(long anterior, long ultimo, long limite) {
		if(limite > 2)
			return fibonacci(ultimo, anterior + ultimo, limite -= 1);

		return anterior + ultimo;
	}
	
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
		int limite;

		System.out.println("Ingrese un numero");
		do {
			limite = pedirNumero(scanner);

			if(limite < 1)
				System.err.println("Por favor, ingrese un numero mayor o igual que 1");
			else {
				System.out.println("\nf(" + limite + ") = " + fibonacci(0, 1, limite - 1));
			}
		} while(limite < 1);
		
		scanner.close();
	}

}
