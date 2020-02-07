Funcion ans <- espaciar(cadena)
	Definir ans, temp Como Caracter;
	Definir i Como Entero;
	
	ans <- "";
	
	Para i <- 0 Hasta (Longitud(cadena) - 1) Hacer
		temp <- Concatenar(SubCadena(cadena, i, i), " ");
		ans <- Concatenar(ans, temp);
	FinPara
FinFuncion

Proceso RellenarConEspacios
	Definir cadena Como Caracter;
	
	Escribir "Ingrese una palabra/frase para rellenar con espacios";
	Leer cadena;
	
	Escribir "Resultado";
	Escribir espaciar(cadena);
FinProceso
