import java.util.Scanner;

public class Ejercicio001 {

	static int contarVocales(String palabra) {
		int vocales = 0;

		palabra = palabra.toLowerCase();
		if(palabra.length() > 0)
			for(char c : palabra.toCharArray())
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
					vocales++;
		
		return vocales;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\n");
		
		System.out.println("Ingrese una palabra/frase para contar sus vocales.");
		String cadena = scanner.next();
		
		System.out.println("Cantidad de vocales: " + contarVocales(cadena));
		scanner.close();
	}

}
