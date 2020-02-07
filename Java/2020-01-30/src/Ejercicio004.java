import java.util.Scanner;

public class Ejercicio004 {

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
		int cantidad;
		
		System.out.println("Ingrese el numero de ventas.");
		do {
			cantidad = pedirNumero(scanner);
			
			if(cantidad < 1)
				System.err.println("Por favor, ingrese un valor positivo mayor o igual a 1.");
		} while(cantidad < 1);
		
		int total = 0;
		int numero;
		
		for(int i = 0; i < cantidad; ++i) {
			System.out.println("Ingrese el valor de la venta #" + (i+1));
			
			do {
				numero = pedirNumero(scanner);
				
				if(numero < 0)
					System.err.println("Por favor, ingrese un mayor que cero.");
			} while (numero < 0);
			
			total += numero;
		}
		
		System.out.println("Total de ventas: " + total);
	}

}
