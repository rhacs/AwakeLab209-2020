Funcion ans <- esNumeroPrimo(num)
	Definir i Como Entero;
	Definir ans Como Logico;

	ans <- Verdadero;

	Si (num > 1) Entonces
		Para i <- 2 Hasta (num / 2) Hacer
			Si (num % i = 0) Entonces
				ans <- Falso;
				// Y U NO BREAK ?????
			FinSi
		FinPara
	SiNo
		ans <- Falso;
	FinSi
FinFuncion

Proceso NumerosPrimos
	Definir cantidad, i Como Entero;

	Repetir 
		Escribir "Escriba el valor limite (2 - 5000)";
		Leer cantidad;
	Hasta Que (cantidad > 1 && cantidad < 5001);

	Escribir "";
	Escribir "Los numeros primos de 2 a ", cantidad, " son:";

	Para i <- 1 Hasta cantidad Hacer
		Si (esNumeroPrimo(i)) Entonces
			Escribir " ", i Sin Saltar;
		FinSi
	FinPara

	Escribir "";
	Escribir "";
FinProceso
