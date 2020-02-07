Proceso SumatoriaArreglos
	Definir vectorA, vectorB, vectorC, limite, i Como Entero;

	limite <- 10;

	Dimension vectorA[limite], vectorB[limite], vectorC[limite];

	Escribir "Sumatoria secuencial";
	Escribir " A     B     C";
	Para i <- 0 Hasta (limite - 1) Hacer
		vectorA[i] <- azar(10);
		vectorB[i] <- azar(10);
		vectorC[i] <- vectorA[i] + vectorB[i];

		Escribir "[", vectorA[i], "] + [", vectorB[i], "] = [", vectorC[i], "]";
	FinPara

//	Para i <- 0 Hasta (limite - 1) Hacer
//		vectorA[i] <- azar(10);
//		vectorB[i] <- azar(10);
//	FinPara

	Escribir "";
	Escribir "Sumatoria cruzada";
	Escribir " A     B     C";
	Para i <- 0 Hasta (limite - 1) Hacer
		vectorC[i] <- vectorA[i] + vectorB[(limite - 1 - i)];
		Escribir "[", vectorA[i], "] + [", vectorB[i], "] = [", vectorC[i], "]";
	FinPara

FinProceso
