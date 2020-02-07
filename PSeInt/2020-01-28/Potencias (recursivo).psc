Funcion ans <- potencia(base, exponente)
	Definir ans Como Entero;
	
	Si (exponente = 0) Entonces
		ans <- 1;
	SiNo
		ans <- base * potencia(base, exponente - 1);
	FinSi
FinFuncion

Proceso PotenciaRecursiva
	Definir base, exponente Como Entero;
	
	Escribir "Ingrese la base";
	Leer base;
	
	Escribir "Ingrese el exponente";
	Leer exponente;
	
	Escribir base, "^", exponente, " = ", potencia(base, exponente);
	
FinProceso
