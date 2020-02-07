Funcion res <- areaCirculo(radio)
	Definir res Como Real;
	res <- PI * radio * radio;
FinFuncion

Proceso FuncionesUno
	Definir radio Como Entero;
	
	Escribir "Ingrese el radio del circulo";
	Leer radio;
	
	Escribir "";
	Escribir "El area del circulo es: ", areaCirculo(radio);
FinProceso
