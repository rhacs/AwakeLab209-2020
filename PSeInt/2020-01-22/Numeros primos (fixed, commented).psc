// @author: Ricardo A. Hermosilla Carrillo
// @email: ra.hermosillac@gmail.com
// @date: Enero 22, 2020

// Descripci�n del Problema
// Desarrolle un algoritmo que muestre por pantalla los primeros "n" n�meros primos,
// siendo "n" ingresado por el usuario.
// [*] Un n�mero primo es aquel que s�lo se puede dividir por 1 (uno) y por s� mismo
//     de manera exacta (sin resto).
// [*] 1 (uno), por convenio, no es considerado como un n�mero primo

// Funci�n para verificar si el n�mero "num" es primo
// @param	num 	n�mero a verificar
// @return	ans		valor l�gico (verdadero o falso) (es o no es primo)
Funcion ans <- esNumeroPrimo(num)
	Definir i Como Entero;
	Definir ans Como Logico;
	ans <- Verdadero;
	
	Si (num > 1) Entonces
		// [*] Partimos en 2, ya que 1 no es considerado n�mero primo
		// [*] Llegamos hasta (raizCuadrada(numero) + 1) ya que es imposible que el n�mero
		//     pueda ser dividido de manera exacta por una cantidad mayor
		Para i <- 2 Hasta (rc(num) + 1) Hacer
			// Verificamos que al dividir el numero por "i", el resto sea
			// igual a cero, haciendo imposible que sea un n�mero primo
			Si (num % i = 0) Entonces
				ans <- Falso;
				// Como ya comprobamos que el n�mero no es un n�mero primo,
				// rompemos la ejecuci�n del ciclo para ahorrar tiempo y recursos.
				// Esto lo hacemos cambiando el valor del �ndice al valor m�ximo
				// posible, en este caso: num.
				i <- num;
			FinSi
		FinPara
	SiNo
		// Como el n�mero es 1 (uno) o menor, inmediatamente avisamos que no es
		// un n�mero primo.
		ans <- Falso;
	FinSi
FinFuncion

// "main loop"
Proceso NumerosPrimos
	Definir i, limite Como Entero;
	
	// Repetimos la acci�n hasta que el usuario ingrese un n�mero v�lido
	// entre 1 y 5000. 5000 debido a la limitaci�n de PSeInt, se pone lento,
	// muuuuuuuuy lento.
	Repetir
		Escribir "Ingrese un n�mero entre 1 y 5000 (inclusivo)";
		Leer limite;
	Hasta Que limite > 0 && limite < 5001;
	
	Si (limite = 1) Entonces
		// Si el usuario ingresa 1 (uno) le avisamos que 1 (uno) no es un n�mero primo
		Escribir "El n�mero 1 (uno) por convenci�n no es considerado n�mero primo.";
	SiNo
		// De lo contrario, procedemos a calcular los n�meros primos
		Escribir ""; // <- puramente est�tico
		Escribir "Los n�meros primos que se encuentran entre el rango 1 y ", limite, " son:";
		
		// Como el incremento del �ndice es 1 (uno) en este caso se omite el "Con Paso 1"
		// Aunque se considera mala pr�ctica.
		// Para i <- 1 Hasta limite Con Paso 1 Hacer
		Para i <- 1 Hasta limite Hacer
			// Comprobamos que el valor de "i" sea primo llamando a la funci�n
			// creada anteriormente
			Si (esNumeroPrimo(i)) Entonces
				// Como es un n�mero primo, se lo mostramos al usuario
				// "Sin Saltar" nos permite escribir en la l�nea anterior sin provocar
				// un salto de l�nea, valga la redundancia.
				Escribir " ", i Sin Saltar;
			FinSi
		FinPara
		
		Escribir ""; // <- puramente est�tico
		Escribir ""; // <- puramente est�tico
	FinSi
FinProceso
