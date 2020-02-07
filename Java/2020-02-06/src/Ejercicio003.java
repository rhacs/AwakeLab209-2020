import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra/frase para evaluarla");
		String texto = scanner.nextLine();
		
		Pattern pattern = Pattern.compile("(\\w)");
		Matcher matcher = pattern.matcher(texto);
		int letras = 0;
		
		while(matcher.find())
			letras++;
		
		pattern = Pattern.compile("(\\d)");
		matcher = pattern.matcher(texto);
		int digitos = 0;
		
		while(matcher.find())
			digitos++;
		
		pattern = Pattern.compile("(\\s)");
		matcher = pattern.matcher(texto);
		int espacios = 0;
		
		while(matcher.find())
			espacios++;
		
		System.out.println(
				"\n - Letras: " + letras
				+ "\n - Digitos: " + digitos
				+ "\n - Espacios: " + espacios);
		
		scanner.close();
	}

}
