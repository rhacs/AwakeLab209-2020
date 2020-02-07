Proceso ex_AporteEstudiantes
	// Definir aporte, datos, total, i Como Entero;
	Definir datos, total, i, victimas Como Entero;
	Dimension datos[8];
	
	total <- 0;
	
	Escribir "Ingrese el numero de victimas";
	Leer victimas;
	
	Para i <- 0 Hasta (victimas - 1) Hacer
		Escribir "Ingrese el monto aportado por estudiante #", i + 1;
		// Leer aporte;
		Leer datos[i];
		
		// datos[i] <- aporte;
		total <- total + datos[i];
	FinPara
	
//	Para i <- 0 Hasta 7 Hacer
//		total <- total + datos[i];
//	FinPara
	
	Escribir "El monto aportado por los ", victimas, " estudiantes es de $", total;
	
FinProceso
