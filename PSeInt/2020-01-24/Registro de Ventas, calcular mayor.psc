Funcion ans <- devolverDia(dia)
	Definir ans Como Caracter;
	
	Segun dia Hacer
		0:
			ans <- "Lunes";
		1:
			ans <- "Martes";
		2:
			ans <- "Miercoles";
		3:
			ans <- "Jueves";
		4:
			ans <- "Viernes";
	FinSegun
FinFuncion

Proceso RegistroVentas
	Definir ventas, maximo, i, j, indice Como Entero;
	Definir dia Como Caracter;
	Dimension ventas[5, 5];

	maximo <- -1;
	
	Escribir "Detalle de Ventas: ";
	Escribir "";
	Escribir "                Lu  Ma  Mi  Ju  Vi";
	Para i <- 0 Hasta 4 Hacer
		Escribir "Vendedor #", i + 1, " -> " Sin Saltar;
		Para j <- 0 Hasta 4 Hacer
			ventas[i,j] <- azar(20) + 10;
			Escribir Sin Saltar "[", ventas[i,j], "]";

			Si (ventas[i,j] > maximo) Entonces
				maximo <- ventas[i,j];
				indice <- i + 1;
				dia <- devolverDia(j);
			FinSi
		FinPara
		
		Escribir "";
	FinPara
	
	Escribir "";
	Escribir "El Vendedor #", indice, " realizo ", maximo, " ventas el dia ", dia;
	
FinProceso
