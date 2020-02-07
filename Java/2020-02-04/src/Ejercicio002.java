import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio002 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continuar = "";
		
		List<String> nombres = new ArrayList<String>();
		String nombre;
		
		do {
			System.out.println("Ingrese el nombre del Alumno");
			nombre = scanner.nextLine();
			
			if(!nombre.isEmpty())
				nombres.add(nombre);
			
			System.out.println("Quiere continuar? (si/no)");
			continuar = scanner.nextLine();
		} while (!continuar.equals("no"));
		
		System.out.println("\nnombres[" + nombres.size() + "]:\n" + nombres);
		
		Collections.sort(nombres);
		System.out.println("\nsort(nombres):\n" + nombres);
		
		scanner.close();
	}

}
