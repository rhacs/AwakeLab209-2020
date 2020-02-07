Proceso MatricesDos
	Definir datos, i, j, cantidad, total Como Entero;

	Escribir "Ingrese la cantidad de choferes en la empresa";
	Leer cantidad;

	Dimension datos[cantidad,7];
	Dimension total[cantidad];

	Para i <- 0 Hasta (cantidad - 1) Hacer
		total[i] <- 0;
	FinPara

	Para i <- 0 Hasta (cantidad - 1) Hacer
		datos[i, 0] <- i + 1;
		Escribir "Chofer", i + 1 Sin Saltar;

		Para j <- 1 Hasta 6 Hacer
			datos[i, j] <- azar(201);
			total[i] <- total[i] + datos[i, j];
			Escribir Sin Saltar " ", datos[i, j];
		FinPara

		Escribir "";
	FinPara
	
	Escribir "";
	Escribir "Total de kilometros recorridos";
	Para i <- 0 Hasta (cantidad - 1) Hacer
		Escribir " [*] Chofer #", i + 1, " = ", total[i];
	FinPara
FinProceso
