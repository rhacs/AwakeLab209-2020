Proceso ex_HorasSueldo
	Definir i Como Entero;
	Definir horas, mes, sueldo Como Real;

	mes <- 0;

	Para i <- 1 Hasta 4 Hacer
		Repetir
			Escribir "Ingrese el numero de horas trabajadas en la semana #", i;
			Leer horas;
			
			Si(horas < 1 || horas > 168) Entonces
				Escribir horas, " no es un valor valido (0 - 168)";
			FinSi
			
		Hasta Que (horas >= 0 && horas <= 168);

		mes <- horas + mes;
	FinPara

	sueldo <- mes * 5000;
	Escribir "Total de horas trabajadas en el mes: ", mes;
	Escribir "Sueldo recibido: ", sueldo;

	Si (mes < 180) Entonces
		Escribir " [*] El empleado trabajo menos de las horas legales";
	SiNo
		Si (mes = 180) Entonces
			Escribir " [*] El empleado trabaja las horas legales";
		SiNo
			Escribir " [*] El empleado trabaja mas de las horas legales";
		FinSi
	FinSi

	Si (sueldo < 301000) Entonces
		Escribir " [*] El empleado gana menos del sueldo minimo";
	SiNo
		Si (sueldo = 301000) Entonces
			Escribir " [*] El empleado gana el sueldo minimo";
		SiNo
			Escribir " [*] El empleado gana mas del sueldo minimo.";
		FinSi
	FinSi
	
FinProceso
