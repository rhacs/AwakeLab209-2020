Funcion piramideInvertida(altura)
	Definir i, j Como Entero;
	
	Para i <- altura Hasta 1 Con Paso -1 Hacer
		Para j <- 1 Hasta (altura - i) Hacer
			Escribir Sin Saltar " ";
		FinPara
		
		Para j <- 1 Hasta (i + (i - 1)) Hacer
			Escribir Sin Saltar "*";
		FinPara
		
		Escribir "";
	FinPara
FinFuncion

Proceso Piramide
	Definir altura Como Entero;
	
	Escribir "Ingrese la altura de la piramide";
	Leer altura;
	
	Si (altura < 1) Entonces
		Escribir "-1";
	SiNo
		Escribir "0";
		piramideInvertida(altura);
	FinSi
FinProceso
