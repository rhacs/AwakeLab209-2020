// @author: Ricardo A. Hermosilla Carrillo
// @email: ra.hermosillac@gmail.com
// @date: Enero 22, 2020

// Descripción del Problema
// Desarrolle un algoritmo que muestre por pantalla los primeros "n" números primos,
// siendo "n" ingresado por el usuario.
// [*] Un número primo es aquel que sólo se puede dividir por 1 (uno) y por sí mismo
//     de manera exacta (sin resto).
// [*] 1 (uno), por convenio, no es considerado como un número primo

// Función para verificar si el número "num" es primo
// @param	num 	número a verificar
// @return	ans		valor lógico (verdadero o falso) (es o no es primo)
Funcion ans <- esNumeroPrimo(num)
	Definir i Como Entero;
	Definir ans Como Logico;
	ans <- Verdadero;
	
	Si (num > 1) Entonces
		// [*] Partimos en 2, ya que 1 no es considerado número primo
		// [*] Llegamos hasta (raizCuadrada(numero) + 1) ya que es imposible que el número
		//     pueda ser dividido de manera exacta por una cantidad mayor
		Para i <- 2 Hasta (rc(num) + 1) Hacer
			// Verificamos que al dividir el numero por "i", el resto sea
			// igual a cero, haciendo imposible que sea un número primo
			Si (num % i = 0) Entonces
				ans <- Falso;
				// Como ya comprobamos que el número no es un número primo,
				// rompemos la ejecución del ciclo para ahorrar tiempo y recursos.
				// Esto lo hacemos cambiando el valor del índice al valor máximo
				// posible, en este caso: num.
				i <- num;
			FinSi
		FinPara
	SiNo
		// Como el número es 1 (uno) o menor, inmediatamente avisamos que no es
		// un número primo.
		ans <- Falso;
	FinSi
FinFuncion

// "main loop"
Proceso NumerosPrimos
	Definir i, limite Como Entero;
	
	// Repetimos la acción hasta que el usuario ingrese un número válido
	// entre 1 y 5000. 5000 debido a la limitación de PSeInt, se pone lento,
	// muuuuuuuuy lento.
	Repetir
		Escribir "Ingrese un número entre 1 y 5000 (inclusivo)";
		Leer limite;
	Hasta Que limite > 0 && limite < 5001;
	
	Si (limite = 1) Entonces
		// Si el usuario ingresa 1 (uno) le avisamos que 1 (uno) no es un número primo
		Escribir "El número 1 (uno) por convención no es considerado número primo.";
	SiNo
		// De lo contrario, procedemos a calcular los números primos
		Escribir ""; // <- puramente estético
		Escribir "Los números primos que se encuentran entre el rango 1 y ", limite, " son:";
		
		// Como el incremento del índice es 1 (uno) en este caso se omite el "Con Paso 1"
		// Aunque se considera mala práctica.
		// Para i <- 1 Hasta limite Con Paso 1 Hacer
		Para i <- 1 Hasta limite Hacer
			// Comprobamos que el valor de "i" sea primo llamando a la función
			// creada anteriormente
			Si (esNumeroPrimo(i)) Entonces
				// Como es un número primo, se lo mostramos al usuario
				// "Sin Saltar" nos permite escribir en la línea anterior sin provocar
				// un salto de línea, valga la redundancia.
				Escribir " ", i Sin Saltar;
			FinSi
		FinPara
		
		Escribir ""; // <- puramente estético
		Escribir ""; // <- puramente estético
	FinSi
FinProceso
