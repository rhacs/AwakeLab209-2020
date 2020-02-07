
import java.util.Random;
import java.util.Scanner;

/**
 * <h1>Funciones</h1>
 * <p>Esta clase es una recopilaci�n de funciones que fueron generadas a medida que iba avanzando el curso de
 * programaci�n Java Full Stack Developer.</p>
 * 
 * 
 * @author	Ricardo A. Hermosilla Carrillo
 * @version	0.1.3:2020-02
 * @since	2020-01-30
 */
public class Funciones {

	// Numeros -------------------------------------------------------------------------------
	
	/**
	 * Este m�todo cuenta, de manera recursiva, la cantidad de d�gitos que contiene un n�mero entero,
	 * ya sea positivo o negativo.
	 * 
	 * @param numero N�mero a evaluar
	 * @return int Cantidad de d�gitos contenidos en el n�mero
	 */
	public static int contarDigitos(int numero) {
		numero = Math.abs(numero);
		
		if(numero < 10)
			return 1;
		
		return 1 + contarDigitos(numero / 10);
	}
	
	/**
	 * Invierte un n�mero entero positivo, de manera recursiva.
	 * 
	 * @param numero N�mero a invertir
	 * @return int N�mero invertido
	 */
	public static int invertirNumero(int numero) {
		if (numero < 10)
			return numero;
		
		return (int) ((numero % 10) * Math.pow(10, Integer.toString(numero).length() - 1) + invertirNumero(numero / 10));
	}
	
	/**
	 * Pide un n�mero entero al usuario a trav�s de la l�nea de ejecuci�n de comandos, previniendo
	 * que no sea un n�mero entero (para valores entre -2^(31) y 2^(31)-1)
	 * 
	 * @param scanner Instancia de un scanner
	 * @return int N�mero entero validado
	 */
	public static int pedirNumeroEntero(Scanner scanner) {
		while(!scanner.hasNextInt()) {
			System.err.println(" [!] Por favor, ingrese un n�mero v�lido.");
			scanner.next();
		}

		return scanner.nextInt();
	}
	
	/**
	 * Pide un n�mero entero al usuario a trav�s de la l�nea de ejecuci�n de comandos, previniendo
	 * que no sea un n�mero entero (para valores entre limiteInferior y 2^(31)-1)
	 *  
	 * @param scanner Instancia de un scanner
	 * @param limiteInferior N�mero entero
	 * @return int N�mero entero mayor o igual que limiteInferior
	 */
	public static int pedirNumeroEntero(Scanner scanner, int limiteInferior) {
		int numeroEntero;
		
		do {
			while(!scanner.hasNextInt()) {
				System.err.println(" [!] Por favor, ingrese un n�mero v�lido.");
				scanner.next();
			}
			
			numeroEntero = scanner.nextInt();
			
			if(numeroEntero < limiteInferior)
				System.err.println(" [!] Por favor, ingrese un n�mero v�lido mayor o igual a " + limiteInferior);
			
		} while(numeroEntero < limiteInferior);
		
		return numeroEntero;
	}
	
	/**
	 * Pide un n�mero entero al usuario a trav�s de la l�nea de ejecuci�n de comandos, previniendo
	 * que no sea un n�mero entero (para valores entre limiteInferior y limiteSuperior)
	 *  
	 * @param scanner Instancia de un scanner
	 * @param limiteInferior N�mero entero
	 * @param limiteSuperior N�mero entero
	 * @return int N�mero entero mayor o igual que limiteInferior
	 */
	public static int pedirNumeroEntero(Scanner scanner, int limiteInferior, int limiteSuperior) {
		int numeroEntero;
		
		do {
			while(!scanner.hasNextInt()) {
				System.err.println(" [!] Por favor, ingrese un n�mero v�lido.");
				scanner.next();
			}
			
			numeroEntero = scanner.nextInt();
			
			if(numeroEntero < limiteInferior || numeroEntero > limiteSuperior)
				System.err.println(" [!] Por favor, ingrese un n�mero v�lido entre " + limiteInferior + " y " + limiteSuperior);
			
		} while(numeroEntero < limiteInferior || numeroEntero > limiteSuperior);
		
		return numeroEntero;
	}
	
	/**
	 * Pide un n�mero decimal al usuario a trav�s de la l�nea de ejecuci�n de comandos, previniendo
	 * que no sea un n�mero decimal
	 * 
	 * @param scanner Instancia de un scanner
	 * @return double N�mero decimal validado
	 */
	public static double pedirNumeroDecimal(Scanner scanner) {
		while(!scanner.hasNextDouble()) {
			System.err.println(" [!] Por favor, ingrese un n�mero v�lido.");
			scanner.next();
		}
		
		return scanner.nextDouble();
	}
	
	/**
	 * Pide un n�mero decimal al usuario a trav�s de la l�nea de ejecuci�n de comandos, previniendo
	 * que no sea un n�mero decimal (para valores mayores o iguales a limiteInferior)
	 * 
	 * @param scanner Instancia de un scanner
	 * @param limiteInferior N�mero entero
	 * @return double N�mero decimal validado
	 */
	public static double pedirNumeroDecimal(Scanner scanner, int limiteInferior) {
		double numeroDecimal;
		
		do {
			while(!scanner.hasNextBoolean()) {
				System.err.println(" [!] Por favor, ingrese un n�mero v�lido.");
				scanner.next();
			}
			
			numeroDecimal = scanner.nextDouble();
			
			if(numeroDecimal < (limiteInferior))
				System.err.println(" [!] Por favor, ingrese un n�mero v�lido mayor o igual a " + limiteInferior);
		} while(numeroDecimal < (limiteInferior));
		
		return numeroDecimal;
	}
	
	/**
	 * Pide un n�mero decimal al usuario a trav�s de la l�nea de ejecuci�n de comandos, previniendo
	 * que no sea un n�mero decimal (para valores entre limiteInferior y limiteSuperior)
	 * 
	 * @param scanner Instancia de un scanner
	 * @param limiteInferior N�mero entero
	 * @param limiteSuperior N�mero entero
	 * @return double N�mero decimal validado
	 */
	public static double pedirNumeroDecimal(Scanner scanner, int limiteInferior, int limiteSuperior) {
		double numeroDecimal;
		
		do {
			while(!scanner.hasNextDouble()) {
				System.err.println(" [!] Por favor, ingrese un n�mero v�lido");
				scanner.next();
			}
			
			numeroDecimal = scanner.nextDouble();
			
			if(numeroDecimal < limiteInferior || numeroDecimal > limiteSuperior)
				System.out.println(" [!] Por favor, ingrese un n�mero v�lido entre " + limiteInferior + " y " + limiteSuperior);
			
		} while(numeroDecimal < limiteInferior || numeroDecimal > limiteSuperior);
		
		return numeroDecimal;
	}
	
	// Strings -------------------------------------------------------------------------------
	
	/**
	 * Invierte el valor de un String
	 * 
	 * @param cadena String a invertir
	 * @return String inverso (similar a StringBuilder.reverse())
	 */
	public static String invertirCadena(String cadena) {
		String invertida = "";
		
		for(int i = (cadena.length() - 1); i >= 0; i--)
			invertida += cadena.charAt(i);
		
		return invertida;
	}
	
	public static String pedirCadena(Scanner scanner) {
		while(!scanner.hasNext()) {
			System.out.println(" [!] Por favor, ingrese un valor v�lido.");
			scanner.next();
		}
		
		scanner.nextLine();
		return scanner.nextLine();
	}
	
	// Otros ---------------------------------------------------------------------------------
	
	public static String agregarRelleno(int numero, int padding) {
		int digitos = contarDigitos(numero);
		String relleno = "";
		
		if(digitos == padding)
			relleno += numero;
		else {
			for(int i = 0; i < (padding - digitos); i++)
				relleno += " ";
			
			relleno += numero;
		}
		
		return relleno;
	}
	
	public static int mayorCantidadDigitos(int[] arreglo) {
		int digitos = -1;
		
		for(int elemento : arreglo) {
			int longitud = Integer.toString(elemento).length();
			
			if(digitos < longitud)
				digitos = longitud;
		}
		
		return digitos;
	}
	
	public static int mayorCantidadDigitos(int[][] matriz) {
		int digitos = -1;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				int numero = matriz[i][j];
				int longitud = Integer.toString(Math.abs(numero)).length();
				
				if(longitud > digitos)
					digitos = longitud;
			}
		}
		
		return digitos;
	}
	
	// Arreglos ------------------------------------------------------------------------------
	
	public static int[] generarArreglo(int tamano, int valorMinimo, int valorMaximo) {
		Random random = new Random();
		int[] arreglo = new int[tamano];

		for(int i = 0; i < arreglo.length; i++)
			arreglo[i] = random.nextInt(valorMaximo + 1) + valorMinimo;

		return arreglo;
	}
	
	public static String imprimirArreglo(int[] arreglo) {
		String imprimir = "arreglo[" + arreglo.length + "]:\n";
		
		imprimir += "[";
		
		for(int i = 0; i < arreglo.length; i++)
			imprimir += (i < (arreglo.length - 1) ? arreglo[i] + ", " : arreglo[i]);
		
		imprimir += "]";
		
		return imprimir;
	}
	
	public static String imprimirArreglo(int[] arreglo, int porLinea) {
		String imprimir = "arreglo[" + arreglo.length + "]:\n";
		int digitos = mayorCantidadDigitos(arreglo);
		
		imprimir += "[";
		
		for(int i = 0; i < arreglo.length; i++) {
			String numero = agregarRelleno(arreglo[i], digitos);
			imprimir += (i < (arreglo.length - 1)) ? numero + ", " : numero;
			
			if((i + 1) % porLinea == 0 && i < arreglo.length - 1)
				imprimir += "\n ";
		}
		
		imprimir += "]";
		
		return imprimir;
	}
	
	/**
	 * Devuelve el arreglo ordenado de manera ascendente (menor a mayor) utilizando
	 * el m�todo Burbuja mejorado.
	 * 
	 * @param arreglo Arreglo con los elementos a ordenar
	 * @return int[] Arreglo con los elementos ordenados
	 */
	public static int[] ordenarArreglo(int[] arreglo) {
		int aux;
		boolean cambio;
		
		for(int i = 0; i < arreglo.length; i++) {
			cambio = false;
			
			for (int j = 0; j < arreglo.length - i; j++) {
				if(arreglo[j] > arreglo[j + 1]) {
					aux = arreglo[j + 1];
					arreglo[j + 1] = arreglo[j];
					arreglo[j] = aux;
					
					cambio = true;
				}
			}
			
			if(!cambio)
				break;
		}
		
		return arreglo;
	}
	
	/**
	 * Devuelve el arreglo ordenado de manera ascendente (menor a mayor) si ordenInvertido = false y descendente
	 * (mayor a menor) si ordenInvertido = true.
	 * 
	 * @param arreglo Arreglo con los valores a ordenar
	 * @param ordenInvertido true = mayor a menor
	 * @return int[] Arreglo con los valores ordenados
	 */
	public static int[] ordenarArreglo(int[] arreglo, boolean ordenInvertido) {
		if(ordenInvertido) {
			int aux;
			boolean cambio;

			for(int i = 0; i < arreglo.length; i++) {
				cambio = false;
				
				for(int j = 0; j < arreglo.length - i; j++) {
					if(arreglo[j] < arreglo[j + 1]) {
						aux = arreglo[j + 1];
						arreglo[j + 1] = arreglo[j];
						arreglo[j] = aux;
						
						cambio = true;
					}
				}
				
				if(!cambio)
					break;
			}
			
			return arreglo;
		}

		return ordenarArreglo(arreglo);
	}
	
	/**
	 * Suma los valores contenidos en un arreglo.
	 * 
	 * @param arreglo Arreglo con los valores
	 * @return int Suma de los valores
	 */
	public static int sumarArreglo(int[] arreglo) {
		int total = 0;
		
		for(int elemento : arreglo)
			total += elemento;
		
		return total;
	}
	
	// Matrices ------------------------------------------------------------------------------
	
	/**
	 * Devuelve una matriz cuadrada de tama�o "tamano" con valores aleatorios entre valorMinimo y valorMaximo
	 * 
	 * @param tamano Cantidad de valores a almacenar
	 * @param valorMinimo Valor m�nimo que deben cumplir los elementos del arreglo
	 * @param valorMaximo Valor m�ximo que deben cumplir los elementos del arreglo
	 * @return int[][] Una matriz cuadrada con valores aleatorios
	 */
	public static int[][] generarMatriz(int tamano, int valorMinimo, int valorMaximo) {
		Random random = new Random();
		int[][] matriz = new int[tamano][tamano];
		
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[i].length; j++)
				matriz[i][j] = random.nextInt(valorMaximo + 1) + valorMinimo;
		
		return matriz;
	}
	
	/**
	 * Genera una matriz de tama�o "filas" x "columnas" con valores aleatorios entre valorMinimo y valorMaximo
	 * 
	 * @param filas N�mero de filas para la matriz
	 * @param columnas N�mero de columnas para la matriz
	 * @param valorMinimo Valor m�nimo que debe cumplir un elemento de la matriz
	 * @param valorMaximo Valor m�ximo que debe cumplir un elemento de la matriz
	 * @return int[][] Una matriz de tama�o filasxcolumnas con valores entre valorMinimo y valorMaximo
	 */
	public static int[][] generarMatriz(int filas, int columnas, int valorMinimo, int valorMaximo) {
		int[][] matriz = new int[filas][columnas];
		Random random = new Random();
		
		for(int i = 0; i < filas; i++)
			for(int j = 0; j < columnas; j++)
				matriz[i][j] = random.nextInt(valorMaximo + 1) + valorMinimo;

		return matriz;
	}
	
	/**
	 * Genera un String que contiene los elementos de una matriz ordenados visualmente para una mejor comprensi�n
	 * 
	 * @param matriz Matriz con elementos no vac�os
	 * @return String
	 */
	public static String imprimirMatriz(int[][] matriz) {
		String resultado = "matriz[" + matriz.length + "][" + matriz[0].length + "]:\n";
		int padding = mayorCantidadDigitos(matriz);
		String numero;
		
		resultado += "[";
		
		for(int i = 0; i < matriz.length; i++) {
			resultado += (i > 0 ? " [" : "[");
			
			for(int j = 0; j < matriz[i].length; j++) {
				numero = agregarRelleno(matriz[i][j], padding);
				resultado += ((j < matriz[i].length - 1) ? numero + ", " : numero);
			}

			resultado += ((i < matriz.length - 1) ? "], \n" : "]");
		}
		
		resultado += "]";
		
		return resultado;
	}

}
