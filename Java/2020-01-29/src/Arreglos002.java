import java.util.Arrays;
import java.util.Random;

public class Arreglos002 {
	
	static int sumarValores(int[] arreglo) {
		int total = 0;

		for(int elemento : arreglo)
			total += elemento;

		return total;
	}
	
	public static int[] generarArreglo(int tamano, int valorMaximo) {
		Random random = new Random();
		int[] arreglo = new int[tamano];
		
		for(int i = 0; i < tamano; i++) {
			arreglo[i] = random.nextInt(valorMaximo + 1);
		}

		return arreglo;
	}

	public static void main(String[] args) {
		int tamano = 10;
		int valorMaximo = 20;
		int[] arreglo = generarArreglo(tamano, valorMaximo);

		System.out.println("arreglo[" + tamano + "]:\n" + Arrays.toString(arreglo));
		System.out.println("\nsumarValores(arreglo):\n" + sumarValores(arreglo));
	}
	
}
