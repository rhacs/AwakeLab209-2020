Funcion ans <- estadoPostulacion(arreglo, tamano)
	Definir ans Como Caracter;
	Definir i, mayoresNueve, mayoresSiete Como Entero;
	
	mayoresNueve <- 0;
	mayoresSiete <- 0;
	
	Para i <- 0 Hasta (tamano - 1) Hacer
		Si (arreglo[i] >= 9) Entonces
			mayoresNueve <- mayoresNueve + 1;
		SiNo
			Si (arreglo[i] >= 7) Entonces
				mayoresSiete <- mayoresSiete + 1;
			FinSi
		FinSi
	FinPara
	
	Si (mayoresNueve > 1) Entonces
		ans <- "Contradado";
	SiNo
		Si (mayoresSiete > 5) Entonces
			ans <- "Archivado";
		SiNo
			ans <- "Rechazado";
		FinSi
	FinSi
	
FinFuncion

Proceso EstadoContratacion
	Definir puntuaciones, i, total Como Entero;
	Dimension puntuaciones[5];
	
	total <- 0;
	
	Escribir "Puntuaciones obtenidas en las evaluaciones: ";
	Para i <- 0 Hasta 4 Hacer
		puntuaciones[i] <- azar(11);
		total <- total + puntuaciones[i];
		Escribir "Evaluacion #", i + 1, " => ", puntuaciones[i];
	FinPara
	
	Escribir "Habiendo obtenido ", total, " puntos, el estado de su postulacion es: ", estadoPostulacion(puntuaciones, 5);
FinProceso
