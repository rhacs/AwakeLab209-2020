import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\n");
		Pattern pattern = Pattern.compile("^[\\s]*(\\d+(.\\d+)?)[\\s]*(\\S)[\\s]*(\\d+(.\\d+)?)[\\s]*$");

		System.out.println("Operadores válidos:");
		System.out.println(" +\tpara sumas\n -\tpara restas\n *\tpara multiplicaciones");
		System.out.println(" /\tpara divisiones\n ^\tpara potencias\n %\tpara obtener el resto de una división");
		System.out.println("\nObservaciones:\n .\tseparador de decimales");
		System.out.println("\nPor Ejemplo:\n 2+2\n 4^3\n");
		
		String operacion = scanner.next();
		Matcher matcher = pattern.matcher(operacion);
		
		if(matcher.matches() && !operacion.contains(",")) {
			double numero1 = Double.parseDouble(matcher.group(1));
			double numero2 = Double.parseDouble(matcher.group(4));
			String operador = matcher.group(3);
			
			switch (operador) {
				case "+":
					System.out.println(numero1 + numero2);
					break;
				case "-":
					System.out.println(numero1 - numero2);
					break;
				case "*":
					System.out.println(numero1 * numero2);
					break;
				case "/":
					if(numero2 == 0)
						System.err.println("División por cero.");
					else
						System.out.println(numero1 / numero2);
					break;
				case "^":
					System.out.println(Math.pow(numero1, numero2));
					break;
				case "%":
					if(numero2 == 0)
						System.err.println("División por cero.");
					else
						System.out.println(numero1 % numero2);
					break;
				default:
					System.err.println("Operador \"" + operador + "\" no reconocido.");
					break;
			}
		} else if (operacion.equals("salir"))
			System.out.println("Adios!");
		else
			System.err.println("Operación no reconocida.");
		
		scanner.close();
	}

}
