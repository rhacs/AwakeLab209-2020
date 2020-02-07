Proceso OrdenarPromedios
	Definir nombres, temp3, temp4 Como Caracter;
	Definir promedios, temp1, temp2 Como Real;
	Definir cantidad, i, j Como Entero;

	Repetir
		Escribir "Ingrese el numero de alumnos.";
		Leer cantidad;
	Hasta Que cantidad > 0;

	Dimension nombres[cantidad], promedios[cantidad];

	Para i <- 0 Hasta (cantidad - 1) Hacer
		Escribir "Ingrese el nombre del estudiante #", i + 1;
		Leer nombres[i];

		Escribir "Ingrese el promedio del estudiante #", i + 1;
		Leer promedios[i];
	FinPara

	Limpiar Pantalla;

	Para i <- 0 Hasta (cantidad - 1) Hacer
		Escribir nombres[i], " ", promedios[i];
	FinPara

	Escribir "=======================================================";

	Para i <- 1 Hasta (cantidad - 1) Hacer
		Para j <- 0 Hasta (cantidad - i - 1) Hacer
			temp1 <- promedios[j];
			temp2 <- promedios[j + 1];

			Si (temp1 < temp2) Entonces
				temp3 <- nombres[j];
				temp4 <- nombres[j + 1];

				promedios[j] <- temp2;
				nombres[j] <- temp4;
				promedios[j + 1] <- temp1;
				nombres[j + 1] <- temp3;
			FinSi
		FinPara
	FinPara

	Para i <- 0 Hasta (cantidad - 1) Hacer
		Escribir nombres[i], " ", promedios[i];
	FinPara
FinProceso
