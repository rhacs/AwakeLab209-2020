Funcion ans <- revertirCadena(cadena)
	Definir ans Como Caracter;
	
	Si (Longitud(cadena) = 1) Entonces
		ans <- cadena;
	SiNo
		ans <- Concatenar(SubCadena(cadena, Longitud(cadena) - 1, Longitud(cadena) - 1), revertirCadena(SubCadena(cadena, 0, Longitud(cadena) - 2)));
	FinSi
FinFuncion

Proceso InvertirCadena
	Definir cadena Como Caracter;
	
	Escribir "Ingrese una palabra/frase para revertirla";
	Leer cadena;
	
	Escribir revertirCadena(cadena);
FinProceso
