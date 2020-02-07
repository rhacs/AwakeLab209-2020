Funcion ans <- factorial(numero)
	Definir ans Como Entero;
	
	Si (numero = 0) Entonces
		ans <- 1;
	SiNo
		ans <- numero * factorial(numero - 1);
	FinSi
FinFuncion

Proceso FactorialNumero
	Definir numero Como Entero;
	
	Escribir "Ingrese un numero para calcular su factorial";
	Leer numero;
	
	Escribir "El factorial de numero es: ", factorial(numero);
FinProceso
