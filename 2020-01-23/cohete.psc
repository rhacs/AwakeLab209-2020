Funcion mostrarCohete()
	
FinFuncion
Proceso Lanzamiento
	Definir i Como Entero;
	Definir cohete Como Caracter;
	Dimension cohete[10];
	
	cohete[0] <- "   /|\";
	cohete[1] <- "   |B|";
	cohete[2] <- "   |O|";
	cohete[3] <- "   |M|";
	cohete[4] <- "   |B|";
	cohete[5] <- "  (   )";
	cohete[6] <- " (     )";
	cohete[7] <- "  *   *";
	cohete[8] <- " *** ***";
	cohete[9] <- "*********";

	Para i <- 0 Hasta 6 Hacer
		Escribir cohete[i];
	FinPara

	Escribir "Presione una tecla para iniciar el lanzamiento.";
	Esperar Tecla;

FinProceso
