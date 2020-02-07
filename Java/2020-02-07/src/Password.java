import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	String password;
	int longitud;
	
	Password() {
		longitud = 8;
	}
	
	Password(int longitud) {
		this.longitud = longitud;
	}
	
	boolean esFuerte() {
		if(longitud < 8)
			return false;
		
		Pattern pattern = Pattern.compile("([A-Z])");
		Matcher matcher = pattern.matcher(this.password);
		
		int mayusculas = 0;
		while(matcher.find())
			mayusculas++;
		
		pattern = Pattern.compile("([a-z])");
		matcher = pattern.matcher(this.password);
		
		int minusculas = 0;
		while(matcher.find())
			minusculas++;
		
		pattern = Pattern.compile("([0-9])");
		matcher = pattern.matcher(this.password);
		
		int numeros = 0;
		while(matcher.find())
			numeros++;
		
		return (mayusculas > 1 && minusculas > 0 && numeros > 4);
	}
	
	void generarPassword() {
		Random random = new Random();
		
		if(longitud >= 8) {
			do {
				List<Character> password = new ArrayList<Character>();
				this.password = "";
				
				for(int i = 0; i < longitud; i++) {
					int opcion = random.nextInt(3) + 1;
					
					switch(opcion) {
						case 1:
							// Numero
							char numero = (char) (random.nextInt(10) + 48);
							password.add(numero);
							break;
						case 2:
							// Minuscula
							char minuscula = (char) (random.nextInt(26) + 97);
							password.add(minuscula);
							break;
						case 3:
							// Mayuscula
							char mayuscula = (char) (random.nextInt(26) + 65);
							password.add(mayuscula);
							break;
					}
				}
				
				Collections.shuffle(password);
				for(char c : password)
					this.password += c;
			} while (!esFuerte());
		} else
			System.err.println("Longitud de contrasena debe ser mayor o igual a 8");
	}
	
	String getPassword() {
		return this.password;
	}
	
	int getLongitud() {
		return this.longitud;
	}

	void setLongitud(int longitud) {
		this.longitud = longitud;
	}
}
