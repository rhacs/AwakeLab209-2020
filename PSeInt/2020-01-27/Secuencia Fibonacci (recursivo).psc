Funcion ans <- secuencia(anterior, ultimo, limite)
	Definir ans, auxiliar Como Entero;
	
	Si (limite > 0) Entonces
		ans <- secuencia(ultimo, anterior + ultimo, limite - 1);
	SiNo
		ans <- anterior + ultimo;
	FinSi
FinFuncion

Proceso SecuenciaFibonacci
	Definir i, limite Como Entero;
	
	Repetir
		Limpiar Pantalla;
		
		Escribir "Ingrese un numero entre 1 y 45";
		Leer limite;
	Hasta Que (limite > 0 && limite < 45);
	
	Escribir "Los primeros ", limite, " numeros de la secuencia Fibonacci son: ";
	Escribir " 1" Sin Saltar;
	Para i <- 0 Hasta (limite - 2) Hacer
		Escribir Sin Saltar " ", secuencia(0, 1, i);
	FinPara
	
	Escribir "";
FinProceso
