import java.util.Scanner;

public class Ejercicio002 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cadena = "";
		int numero;
		
		System.out.println("Ingrese un numero entre 0 y 25 (-1 para terminar)");
		do {
			while(!scanner.hasNextInt()) {
				System.err.println(" [!] Por favor, ingrese un numero valido");
				scanner.next();
			}
			
			numero = scanner.nextInt();
			
			if(numero < -1 || numero > 25)
				System.err.println(" [!] Por favor, ingrese un numero entre 0 y 25 (-1 para terminar)");
			else if(numero == -1)
				System.out.println("Resultado: ");
			else
				cadena += (char) (numero + 65);
			
		} while(numero != -1);
		
		System.out.println(cadena);
		
		scanner.close();
	}

}
