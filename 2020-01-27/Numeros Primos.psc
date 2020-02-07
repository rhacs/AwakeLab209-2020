Funcion res <- esNumeroPrimo(num)
	Definir res Como Logico;
	Definir i Como Entero;
	res <- Verdadero;
	
	Si (num > 1) Entonces
		Para i <- 2 Hasta (num / 2) Hacer
			Si (num % 2 = 0) Entonces
				res <- Falso;
				i <- num;
			FinSi
		FinPara
	SiNo
		res <- Falso;
	FinSi
FinFuncion

Proceso NumerosPrimos
	Definir n, i Como Entero;
	
	Repetir
		Limpiar Pantalla;
		
		Escribir "Ingrese un valor n entre 0 y 5000";
		Leer n;
	Hasta Que (n >= 0 || n <= 5000);
	
	Escribir "Los numeros primos entre 0 y ", n, " son:";
	Para i <- 0 Hasta (n - 1) Hacer
		Si (esNumeroPrimo(i)) Entonces
			Escribir Sin Saltar " ", i;
		FinSi
	FinPara
	
	Escribir "";
FinProceso
