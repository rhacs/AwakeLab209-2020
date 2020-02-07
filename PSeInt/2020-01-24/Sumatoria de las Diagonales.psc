Proceso MatricesTres
	Definir matriz, i, j, elementos, sumatoria, auxiliar, secundaria, diagInferior, diagSuperior Como Entero;

	Escribir "Ingrese un valor";
	Leer elementos;

	sumatoria <- 0;
	secundaria <- 0;
	diagInferior <- 0;
	diagSuperior <- 0;
	Dimension matriz[elementos, elementos];

	Para i <- 0 Hasta (elementos - 1) Hacer
		Para j <- 0 Hasta (elementos - 1) Hacer
			auxiliar <- azar(10);

			matriz[i, j] <- auxiliar;
			// Diagonal Principal
			Si (i = j) Entonces
				sumatoria <- sumatoria + auxiliar;
			FinSi

			// Diagonal Secundaria
			Si ((i + j) = (elementos - 1)) Entonces
				secundaria <- secundaria + auxiliar;
			FinSi

			// Diagonal Principal e Inferiores
			Si (j <= i) Entonces
				diagInferior <- diagInferior + auxiliar;
			FinSi

			// Diagonal Principal y superiores
			Si (j >= i) Entonces
				diagSuperior <- diagSuperior + auxiliar;
			FinSi

			Escribir Sin Saltar "[", auxiliar, "]";
		FinPara

		Escribir "";
	FinPara

	Escribir "Sumatoria de la diagonal principal: ", sumatoria;
	Escribir "Sumatoria de la diagonal secundaria: ", secundaria;
	Escribir "Sumatoria de la diagonal principal e inferiores: ", diagInferior;
	Escribir "Sumatoria de la diagonal principal y superiores: ", diagSuperior;
FinProceso
