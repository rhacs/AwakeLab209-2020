Proceso ex_RangoEdad
	Definir edad Como Entero;
	Definir genero Como Caracter;
	
	Escribir "Ingrese su genero (f = femenino, m = masculino)";
	Leer genero;
	
	Escribir "Ingrese su edad";
	Leer edad;
	
	Si edad < 7 Entonces
		Escribir "No puede ingresar";
	SiNo
		Si edad < 11 Entonces
			Si genero = "f" Entonces
				Escribir "Usted pertenece a Bandada";
			SiNo
				Escribir "Usted pertenece a Manada";
			FinSi
		SiNo
			Si edad < 18 Entonces
				Si genero = "f" Entonces
					Escribir "Usted pertenece a Compania";
				SiNo
					Escribir "Usted pertenece a Tropa";
				FinSi
			SiNo
				Escribir "Usted pertenece a Ruta";
			FinSi
		FinSi
	FinSi
	
FinProceso
