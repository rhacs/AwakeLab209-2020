import java.util.Scanner;

class Alumno {
	String nombre;
	double calificacion;
	String evaluacion;

	Alumno(String nombre, double calificacion) {
		this.nombre = nombre;
		this.calificacion = calificacion;
		
		if(calificacion < 5)
			this.evaluacion = "Suspenso";
		else if(calificacion < 7)
			this.evaluacion = "Bien";
		else if(calificacion < 9)
			this.evaluacion = "Notable";
		else
			this.evaluacion = "Sobresaliente";
	}
}

public class Ejercicio008 {

	private static double pedirNumero(Scanner scanner) {
		double numero;
		
		while(!scanner.hasNextDouble()) {
			System.err.println("Por favor, ingrese un numero valido.");
			scanner.next();
		}
		
		numero = scanner.nextDouble();
		return numero;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for(int i = 0; i < 10; ++i) {
			System.out.println("Ingrese el nombre del alumno #" + (i + 1));
		}
		
		scanner.close();
	}

}
