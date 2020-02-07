Funcion ans <- convertirA(moneda, cantidad)
	Definir ans, factor Como Real;
	
	Si (moneda = "libra") Entonces
		factor <- 1.22;
	SiNo
		Si (moneda = "dolar") Entonces
			factor <- 0.75;
		SiNo
			Si (moneda = "yen") Entonces
				factor <- 0.009;
			FinSi
		FinSi
	FinSi
	
	ans <- cantidad * factor;
FinFuncion

Proceso ConversionMoneda
	Definir moneda Como Caracter;
	Definir cantidad Como Real;
	
	Repetir
		Limpiar Pantalla;

		Escribir "Ingrese el tipo de moneda (libra, dolar, yen)";
		Leer moneda;
	Hasta Que moneda = "libra" || moneda = "dolar" || moneda = "yen";
	
	Escribir "Ingrese la cantidad";
	Leer cantidad;
	
	Escribir "";
	Escribir "Equivalencia: ", convertirA(moneda, cantidad), " euros.";
FinProceso
