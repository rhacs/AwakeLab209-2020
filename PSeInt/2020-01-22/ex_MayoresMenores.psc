Proceso ex_MayoresMenores
	Definir datos, menores, mayores, cantidad, i Como Entero;
	
	menores <- 0;
	mayores <- 0;
	
	Repetir
		Escribir "Ingrese la cantidad de datos a analizar (1-100)";
		Leer cantidad;
	Hasta Que (cantidad > 0 && cantidad < 101);
	
	Dimension datos[cantidad];
	Para i <- 0 Hasta (cantidad - 1) Hacer
		datos[i] <- azar(500) - azar(200);
		Escribir " ", datos[i] Sin Saltar;
		// Escribir "Ingrese el numero #", i + 1;
		// Leer datos[i];
		
		Si (datos[i] > 0) Entonces
			mayores <- mayores + 1;
		SiNo
			menores <- menores + 1;
		FinSi
	FinPara
	
	Escribir "";
	Escribir "";
	Escribir "De los ", cantidad, " datos ingresados: ";
	Escribir " [*] ", menores, " son menores o iguales a cero.";
	Escribir " [*] ", mayores, " son mayores a cero";
FinProceso
