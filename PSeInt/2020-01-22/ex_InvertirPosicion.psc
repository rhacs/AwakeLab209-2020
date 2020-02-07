Proceso InvertirPosicion
	Definir datos, inverso, cantidad, i Como Entero;

	cantidad <- 8;
	Dimension datos[cantidad], inverso[cantidad];

	Escribir "datos:";
	Para i <- 0 Hasta (cantidad - 1) Hacer
		datos[i] <- azar(11);
		inverso[(cantidad - 1) - i] <- datos[i];
		Escribir " ", datos[i] Sin Saltar;
	FinPara

	Escribir "";
	Escribir "";
	Escribir "inverso:";
	Para i <- 0 Hasta (cantidad - 1) Hacer
		Escribir " ", inverso[i] Sin Saltar;
	FinPara

	Escribir "";
	Escribir "";
FinProceso
