import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cadena = "";
		
		ArrayList<Character> alfabeto = new ArrayList<Character>();
		for(int i = 0; i < 26; i++)
			alfabeto.add((char) (i + 65));
		
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
			else {
				if(alfabeto.contains((char) (numero + 65)))
					cadena += (char) (numero + 65);
			}
		} while (numero != -1);
		
		System.out.println(cadena);
		scanner.close();
	}

}
