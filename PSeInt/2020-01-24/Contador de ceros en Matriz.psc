Proceso MatricesUno
	Definir matriz, i, j, ceros Como Enteros;
	Dimension matriz[4,4];

	ceros <- 0;

	Para i <- 0 Hasta 3 Hacer
		Para j <- 0 Hasta 3 Hacer
			matriz[i,j] <- azar(10);
			Escribir matriz[i,j], " " Sin Saltar;

			Si(matriz[i,j] = 0) Entonces
				ceros <- ceros + 1;
			FinSi
		FinPara
		Escribir "";
	FinPara

	Escribir "La matriz contiene ", ceros, " ceros";
FinProceso
