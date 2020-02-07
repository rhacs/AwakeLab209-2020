Funcion mostrarDato(datos, posicion)
	Escribir "Valor en posicion ", posicion, " es: ", datos[posicion];
FinFuncion

Funcion encontrarValor(datos, aBuscar)
	Definir i Como Entero;
	Definir ans Como Logico;
	ans <- Falso;

	Para i <- 0 Hasta 7 Hacer
		Si (aBuscar = datos[i]) Entonces
			ans <- Verdadero;
			i <- 10;
		FinSi
	FinPara
	
	Si ans Entonces
		Escribir "Edad ", aBuscar, " existe";
	SiNo
		Escribir "Edad ", aBuscar, " no existe";
	FinSi
FinFuncion

Proceso Arreglos
	Definir datos, i, edad Como Entero;
	Dimension datos[8];
	
	datos[0] <- 20;
	datos[1] <- 21;
	datos[2] <- 23;
	datos[3] <- 30;
	datos[4] <- 32;
	datos[5] <- 40;
	datos[6] <- 44;
	datos[7] <- 61;

	mostrarDato(datos, 3);
	
	Escribir "";
	Escribir "Valores en el arreglo";
	Para i <- 0 Hasta 7 Hacer
		Escribir "Edades[", i, "] -> ", datos[i];
	FinPara
	
	Escribir "";
	Escribir "Ingrese la edad a buscar.";
	Leer edad;
	encontrarValor(datos, edad);
FinProceso
