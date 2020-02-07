Proceso ex_NacimientoSigno
	Definir dia, mes Como Entero;
	
	
	Repetir
		Escribir "Ingrese su dia de nacimiento (1-31)";
		Leer dia;
	Hasta Que dia > 0 && dia < 32;

	Repetir
		Escribir "Ingrese su mes de nacimiento (1-12)";
		Leer mes;
	Hasta Que mes > 0 && mes < 13;

	Segun mes Hacer
		1:
			// Enero
			Si (dia < 20) Entonces
				Escribir "Capricornio";
			SiNo
				Escribir "Acuario";
			FinSi
		2:
			// Febrero
			Si (dia < 19) Entonces
				Escribir "Acuario";
			SiNo
				Escribir "Piscis";
			FinSi
		3:
			// Marzo
			Si (dia < 21) Entonces
				Escribir "Piscis";
			SiNo
				Escribir "Aries";
			FinSi
		4:
			// Abril
			Si (dia < 20) Entonces
				Escribir "Aries";
			SiNo
				Escribir "Tauro";
			FinSi
		5:
			// Mayo
			Si (dia < 21) Entonces
				Escribir "Tauro";
			SiNo
				Escribir "Geminis";
			FinSi
		6:
			// Junio
			Si (dia < 21) Entonces
				Escribir "Geminis";
			SiNo
				Escribir "Cancer";
			FinSi
		7:
			// Julio
			Si (dia < 22) Entonces
				Escribir "Cancer";
			SiNo
				Escribir "Leo";
			FinSi
		8:
			// Agosto
			Si (dia < 23) Entonces
				Escribir "Leo";
			SiNo
				Escribir "Virgo";
			FinSi
		9:
			// Septiembre
			Si (dia < 24) Entonces
				Escribir "Virgo";
			SiNo
				Escribir "Libra";
			FinSi
		10:
			// Octubre
			Si (dia < 24) Entonces
				Escribir "Libra";
			SiNo
				Escribir "Escorpio";
			FinSi
		11:
			// Noviembre
			Si (dia < 22) Entonces
				Escribir "Escorpio";
			SiNo
				Escribir "Sagitario";
			FinSi
		12:
			// Diciembre
			Si (dia < 22) Entonces
				Escribir "Sagitario";
			SiNo
				Escribir "Sagitario";
			FinSi
	FinSegun
	
FinProceso
