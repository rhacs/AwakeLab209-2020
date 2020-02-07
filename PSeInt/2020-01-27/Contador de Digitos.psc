Funcion ans <- digitos(numero)
	Definir ans Como Entero;
	
	Si (numero < 10 && numero > -10) Entonces
		ans <- 1;
	SiNo
		ans <- 1 + digitos(numero / 10);
	FinSi
FinFuncion

Proceso ContadorDigitos
	Definir numero Como Entero;
	
	Escribir "Ingrese un número para conocer la cantidad de dígitos que tiene";
	Leer numero;
	
	Escribir "Cantidad de dígitos: ", digitos(numero);
FinProceso
