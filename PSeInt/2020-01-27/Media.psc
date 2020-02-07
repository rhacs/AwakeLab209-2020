Funcion ans <- media(arreglo, tamano)
	Definir ans Como Real;
	Definir i Como Entero;
	
	ans <- 0;
	
	Para i <- 0 Hasta (tamano - 1) Hacer
		ans <- ans + arreglo[i];
	FinPara
	
	ans <- ans / tamano;
FinFuncion

Proceso MediaArreglo
	Definir arreglo Como Real;
	Definir tamano, i Como Entero;
	
	tamano <- 10;
	Dimension arreglo[tamano];
	
	Escribir "Del siguiente arreglo:";
	Para i <- 0 Hasta (tamano - 1) Hacer
		arreglo[i] <- azar(7) + 1;
		
		Escribir Sin Saltar " ", arreglo[i];
	FinPara
	
	Escribir "";
	Escribir "La media (valor promedio) es: ", media(arreglo, tamano);
FinProceso
