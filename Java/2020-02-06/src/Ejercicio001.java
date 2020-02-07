import java.util.Scanner;

public class Ejercicio001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un texto para invertirlo");
		
		String texto = scanner.nextLine();
		String inverso = "";
		
		for(int i = (texto.length() - 1); i > -1; i--) {
			inverso += texto.charAt(i);
		}
		
		System.out.println(inverso);
		scanner.close();
	}

}
