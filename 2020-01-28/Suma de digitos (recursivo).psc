Funcion ans <- sumaDigitos(numero)
	Definir ans Como Entero;
	
	Si (numero < 10 && numero > -10) Entonces
		ans <- trunc(numero);
	SiNo
		ans <- (numero % 10) + sumaDigitos(trunc(numero / 10));
	FinSi
FinFuncion

Proceso SumarDigitos
	Definir numero Como Entero;
	
	Escribir "Ingrese un numero para sumar sus digitos";
	Leer numero;
	
	Escribir "La suma de los digitos es: ", sumaDigitos(numero);
FinProceso
