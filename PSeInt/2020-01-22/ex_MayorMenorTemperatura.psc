Proceso ex_MayorMenorTemperatura
	Definir datos, i, menor, mayor Como Entero;
	Definir dia, mayorDia, menorDia Como Caracter;
	Dimension datos[7];

	mayor <- 0;
	menor <- 10000;

	Para i <- 0 Hasta 6 Hacer
		Segun i Hacer
			0:
				dia <- "Lunes";
			1:
				dia <- "Martes";
			2:
				dia <- "Miercoles";
			3:
				dia <- "Jueves";
			4:
				dia <- "Viernes";
			5:
				dia <- "Sabado";
			6:
				dia <- "Domingo";
		FinSegun

		Escribir "Ingrese la temperatura promedio del dia ", dia;
		Leer datos[i];

		Si (datos[i] > mayor) Entonces
			mayor <- datos[i];
			mayorDia <- dia;
		SiNo
			Si (datos[i] < menor) Entonces
				menor <- datos[i];
				menorDia <- dia;
			FinSi
		FinSi
	FinPara

	Escribir "El dia mas caluroso fue el ", mayorDia, " con ", mayor, " grados";
	Escribir "El dia mas helado fue el ", menorDia, " con ", menor, " grados";

FinProceso
