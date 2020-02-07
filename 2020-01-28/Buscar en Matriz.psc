Funcion ans <- buscarValor(numero, matriz, tamano)
	Definir ans Como Logico;
	Definir i, j Como Entero;
	
	ans <- Falso;
	
	Para i <- 0 Hasta (tamano - 1) Hacer
		Para j <- 0 Hasta (tamano - 1) Hacer
			Si (matriz[i, j] = numero) Entonces
				ans <- Verdadero;
				j <- tamano;
				i <- tamano;
			FinSi
		FinPara
	FinPara
FinFuncion

Funcion imprimirMatriz(matriz, tamano)
	Definir i, j Como Entero;
	
	Para i <- 0 Hasta (tamano - 1) Hacer
		Si (i = 0) Entonces
			Escribir "[" Sin Saltar;
		SiNo
			Escribir " " Sin Saltar;
		FinSi
		
		Para j <- 0 Hasta (tamano - 1) Hacer
			Si (j = 0) Entonces
				Escribir "[", matriz[i, j] Sin Saltar;
			SiNo
				Si(j = (tamano - 1) && i < (tamano - 1)) Entonces
					Escribir Sin Saltar ", ", matriz[i, j], "],";
				SiNo
					Escribir Sin Saltar ", ", matriz[i, j];
				FinSi
			FinSi
		FinPara
		
		Si (i = (tamano - 1)) Entonces
			Escribir Sin Saltar "]";
		FinSi
		
		Escribir "";
	FinPara
FinFuncion

Proceso BuscarEnMatriz
	Definir matriz, tamano, i, j, numero Como Entero;
	
	tamano <- 5;
	Dimension matriz[tamano, tamano];
	
	// Generar valores en el arreglo
	Para i <- 0 Hasta (tamano - 1) Hacer
		Para j <- 0 Hasta (tamano - 1) Hacer
			matriz[i, j] <- azar(90) + 10;
		FinPara
	FinPara
	
	// Mostrar matriz
	Escribir "matriz[", tamano, ", ", tamano, "]";
	imprimirMatriz(matriz, tamano);
	
	// Pedir numero a usuario
	Escribir "Ingrese el valor a buscar";
	Leer numero;
	
	// Buscar numero en matriz
	Si (buscarValor(numero, matriz, tamano)) Entonces
		Escribir numero, " se encuentra en la matriz.";
	SiNo
		Escribir numero, " no se encuentra en la matriz.";
	FinSi
FinProceso
