Proceso ex_SumaParImpar
	Definir par, impar Como Entero;
	Definir continuar Como Caracter;

	Repetir
		Limpiar Pantalla;

		Repetir
			Escribir "Ingrese un numero par (1-100): " Sin Saltar;
			Leer par;
		Hasta Que (par % 2 = 0 && (par > 0 && par < 101))

		Repetir
			Escribir "Ingrese un numero impar (1-100): " Sin Saltar;
			Leer impar;
		Hasta Que (impar % 2 <> 0 && (impar > 0 && impar < 101))

		Escribir "La suma entre el numero par ", par, " y el numero impar ", impar, " es: ", par + impar;

		Escribir "Quiere continuar? (s/n)";
		Leer continuar;
	Hasta Que (continuar = "n")

//	Para i <- 1 Hasta 100 Hacer
//		Si (i % 2 <> 0) Entonces
//			Escribir i, " + ", i + 1, " = ", (i + (i+1));
//		FinSi
//	FinPara
FinProceso
