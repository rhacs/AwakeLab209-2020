Proceso ex_ParaHasta

	Definir estudiantes Como Entero;
	Definir sumatoria Como Entero;
	Definir edad Como Entero;
	Definir i Como Entero;

	sumatoria <- 0;

	Escribir "Ingrese el numero de estudiantes:";
	Leer estudiantes;
	
	// Repetir
	//     Escribir "Ingrese el numero de estudiantes:";
	//	   Leer estudiantes;
	// Hasta Que (estudiantes > 0)
	
	// Para i <- 1 Hasta estudiantes Con Paso 1 Hacer
	Para i <- 1 Hasta estudiantes Hacer
		Escribir "Ingrese la edad del estudiante #", i;
		Leer edad;

		sumatoria <- sumatoria + edad;
	FinPara
	
	Escribir "La edad promedio de los ", estudiantes, " estudiantes es: ", sumatoria/estudiantes;

FinProceso
