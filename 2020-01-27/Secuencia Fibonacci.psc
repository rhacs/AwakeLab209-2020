Funcion secuencia <- fibonacci(limite)
	Definir secuencia, temp Como Caracter;
	Definir anterior, ultimo, auxiliar, i Como Entero;
	
	i <- 1;
	anterior <- 0;
	ultimo <- 1;
	secuencia <- " 1";
	
	Mientras (i < limite) Hacer
		auxiliar <- ultimo;
		ultimo <- auxiliar + anterior;
		anterior <- auxiliar;
		
		temp <- Concatenar(" ", ConvertirATexto(ultimo));
		secuencia <- Concatenar(secuencia, temp);
		
		i <- i + 1;
	FinMientras;
FinFuncion

Proceso SecuenciaFibonacci
	Definir i, num, anterior, ultimo, auxiliar Como Entero;
	
	Repetir
		Limpiar Pantalla;
		
		Escribir "Ingrese el valor de n (1-45)";
		Leer num;
	Hasta Que num > 0 && num < 46;
	
	Escribir "Los ", num, " primeros numeros de la Secuencia Fibonacci son: ";
	Escribir fibonacci(num);
	
	Escribir "";
FinProceso
