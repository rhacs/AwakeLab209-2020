Funcion mayorDeTres(num1, num2, num3)
	Si (num1 > num2 && num1 > num3) Entonces
		Escribir num1, " es mayor que ", num2, " y ", num3;
	SiNo
		Si (num2 > num3 && num2 > num3) Entonces
			Escribir num2, " es mayor que ", num3, " y ", num1;
		SiNo
			Escribir num3, " es mayor que ", num2, " y ", num1;
		FinSi
	FinSi
FinFuncion

Proceso Mayorisimo
	Definir num1, num2, num3 Como Entero;
	
	Escribir "Ingrese 3 numeros enteros naturales";
	Leer num1, num2, num3;
	mayorDeTres(num1, num2, num3);
FinProceso
