Funcion iniciales(cadena)
	Definir i, j Como Entero;
	
	Escribir SubCadena(cadena, 0, 0) Sin Saltar;
	
	Para i <- 0 Hasta (Longitud(cadena) - 1) Hacer
		Si (SubCadena(cadena, i, i) = " ") Entonces
			Escribir Sin Saltar SubCadena(cadena, i + 1, i + 1);
		FinSi
	FinPara
	
	Escribir "";
FinFuncion

Proceso MostrarIniciales
	Definir cadena Como Caracter;
	
	Escribir "Ingrese un texto para obtener sus iniciales";
	Leer cadena;
	
	iniciales(cadena);
	
FinProceso
