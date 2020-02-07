Proceso ex_CargoSeguro
	Definir nombre Como Caracter;
	Definir edad Como Entero;
	Definir genero Como Caracter;
	
	Escribir "Ingrese su Nombre, Genero y Edad";
	Leer nombre, genero, edad;
	
	Si edad > 0 Entonces
		Si genero = "masculino" Entonces
			Si edad < 25 Entonces
				Escribir nombre, ", a sus ", edad, ", La aseguradora le cobrara $1000";
			SiNo
				Si edad = 25 Entonces
					Escribir nombre, ", a sus ", edad, ", La aseguradora le cobrara $700";
				SiNo
					Escribir nombre, ", a sus ", edad, ", La aseguradora no le cobrara";
				FinSi
			FinSi
		SiNo
			Si edad < 21 Entonces
				Escribir nombre, ", a sus ", edad, ", La aseguradora le cobrara $500";
			SiNo
				Escribir nombre, ", a sus ", edad, ", La aseguradora no le cobrara";
			FinSi
		FinSi
	SiNo
		Escribir nombre, ", Su edad no es valida";
	FinSi

FinProceso
