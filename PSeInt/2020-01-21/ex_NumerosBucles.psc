Proceso ex_NumerosBucles

	Definir i Como Entero;

	Escribir "Para";
	Para i <- 1 Hasta 100 Hacer
		Escribir Sin Saltar " ", i;
	FinPara

	Escribir "";
	Escribir "Repetir";
	i <- 0;
	Repetir
		i <- i + 1;
		Escribir Sin Saltar " ", i;
	Hasta Que i = 100
	Escribir "";

FinProceso
