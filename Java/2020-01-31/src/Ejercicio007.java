import java.util.Scanner;

public class Ejercicio007 {

	private static int pedirNumero(Scanner scanner) {
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
		int numero = pedirNumero(scanner);
		
		StringBuilder aux = new StringBuilder(Integer.toString(numero));
		
		if(aux.toString().equals(aux.reverse().toString()))
			System.out.println(numero + " es Capicua, ya que " + numero + " = " + aux);
		else
			System.out.println(numero + " no es Capicua, ya que " + numero + " != " + aux);
		
		scanner.close();
	}

}
