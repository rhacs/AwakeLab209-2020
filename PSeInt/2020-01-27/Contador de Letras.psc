Funcion ans <- long(cadena)
	Definir ans Como Entero;
	ans <- Longitud(cadena);
FinFuncion

Proceso ContadorLetras
	Definir cadena Como Caracter;
	
	Escribir "Ingrese una palabra para determinar la cantidad de letras que contiene";
	Leer cadena;
	
	Escribir "Cantidad de letras: ", long(cadena);
FinProceso
