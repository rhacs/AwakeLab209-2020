Proceso ex_NumeroAMesMientras
	Definir mes Como Entero;
	Definir continuar Como Caracter;
	
	continuar <- "s";
	
	Mientras continuar = "s" Hacer
		
		Escribir "Ingrese un numero cualquiera: ";
		Leer mes;
		
		Segun mes Hacer
			1:
				Escribir mes, " Corresponde a Enero";
			2:
				Escribir mes, " Corresponde a Febrero";
			3:
				Escribir mes, " Corresponde a Marzo";
			4:
				Escribir mes, " Corresponde a Abril";
			5:
				Escribir mes, " Corresponde a Mayo";
			6:
				Escribir mes, " Corresponde a Junio";
			7:
				Escribir mes, " Corresponde a Julio";
			8:
				Escribir mes, " Corresponde a Agosto";
			9:
				Escribir mes, " Corresponde a Septiembre";
			10:
				Escribir mes, " Corresponde a Octubre";
			11:
				Escribir mes, " Corresponde a Noviembre";
			12:
				Escribir mes, " Corresponde a Diciembre";
			De Otro Modo:
				Escribir mes, " no corresponde a ningun mes";
		FinSegun
		
		Escribir "Desea continuar (s/n)";
		Leer continuar;
	FinMientras
FinProceso
