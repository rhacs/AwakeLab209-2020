Proceso ParImpar
	Definir num, i, limite Como Entero;

	limite <- 5;

	Para i <- 0 Hasta (limite - 1) Hacer
//		Repetir
//			Escribir "Ingrese un valor entre 1 y 10";
//			Leer num;
//		Hasta Que num > 0 && num < 11;

		num <- azar(10) + 1;

		Si (num % 2 = 0) Entonces
			Escribir num, " es par.";
		SiNo
			Escribir num, " es impar.";
		FinSi
	FinPara
FinProceso
