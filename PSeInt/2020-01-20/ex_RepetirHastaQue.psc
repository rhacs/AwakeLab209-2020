Proceso ex_RepetirHastaQue
	Definir valor1 Como Entero;
	Definir valor2 Como Entero;
	Definir finalizar Como Caracter;

	Repetir
		Limpiar Pantalla;

		Escribir "Ingrese un numero";
		Leer valor1;
		Escribir "Ingrese un numero";
		Leer valor2;

		Si valor1 < valor2 Entonces
			Escribir "Entre ", valor1, " y ", valor2, ", ", valor1, " es el menor";
		SiNo
			Si valor1 = valor2 Entonces
				Escribir "Los valores son iguales";
			SiNo
				Escribir "Entre ", valor1, " y ", valor2, ", ", valor2, " es el menor";
			FinSi
		FinSi

		Escribir "Desea continuar? (s/n)";
		Leer finalizar;
	Hasta Que finalizar = "n" || finalizar = "N"
FinProceso
	