Funcion ans <- invertirCadena(cadena)
	Definir ans, temp Como Caracter;
	
	Si (Longitud(cadena) = 1) Entonces
		ans <- cadena;
	SiNo
		temp <- SubCadena(cadena, Longitud(cadena) - 1, Longitud(cadena) - 1);
		ans <- Concatenar(temp, invertirCadena(SubCadena(cadena, 0, Longitud(cadena) - 2)));
	FinSi
FinFuncion

Proceso Palindrome
	Definir cadena, aux Como Caracter;
	
	Escribir "Ingrese una palabra/frase para verificar si es Palindrome o no";
	Leer cadena;
	
	aux <- invertirCadena(cadena);
	Si (aux = cadena) Entonces
		Escribir "Es Palindrome, ya que: ";
		Escribir cadena, " = ", aux;
	SiNo
		Escribir "NO es Palindrome, ya que: ";
		Escribir cadena, " != ", aux;
	FinSi
FinProceso
