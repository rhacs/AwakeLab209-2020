Proceso ex_PosicionBasketball
	Definir estatura Como Entero;
	
	Escribir "Ingrese su estatura (en centimetros)";
	Leer estatura;
	
	Escribir "Su posicion ideal en el campo de juego es: ", ;
	
	Si estatura < 160 Entonces
		Escribir " > Base";
	SiNo
		// antes: Si estatura >= 160 && estatura < 170 entonces
		Si estatura < 170 Entonces
			Escribir " > Escolta";
		SiNo
			// antes: Si estatura >= 170 && estatura < 175 entonces
			Si estatura < 175 Entonces
				Escribir " > Alero";
			SiNo
				Escribir " > Pivot";
			FinSi
		FinSi
	FinSi

FinProceso
