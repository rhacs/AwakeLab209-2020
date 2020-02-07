Proceso ex_DiaSemana
	Definir input Como Entero;

	Escribir "Ingrese un numero del 1 al 7";
	Leer input;
	
	Segun input Hacer
		1:
			Escribir "Lunes";
		2:
			Escribir "Martes";
		3:
			Escribir "Miercoles";
		4:
			Escribir "Jueves";
		5:
			Escribir "Viernes";
		6:
			Escribir "Sabado";
		7:
			Escribir "Domingo";
		De Otro Modo:
			Escribir "Su numero excede los rangos";
	FinSegun
	
FinProceso
