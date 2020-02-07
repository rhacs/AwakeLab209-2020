Proceso ex_MientrasHacer
	Definir estudiantes Como Entero;
	Definir sumatoriaEdades Como Entero;
	Definir edad Como Entero;
	Definir continuar Como Caracter;

	estudiantes <- 0;
	sumatoriaEdades <- 0;
	continuar <- "s";

	Mientras continuar = "s" Hacer
		Escribir "Ingrese la edad del estudiante #", estudiantes + 1;
		Leer edad;

		sumatoriaEdades <- sumatoriaEdades + edad;
		estudiantes <- estudiantes + 1;

		Escribir "Desea continuar? (s/n)";
		Leer continuar;
	FinMientras

	Escribir "La edad promedio de los ", estudiantes, " estudiantes es: ", sumatoriaEdades/estudiantes;
FinProceso
