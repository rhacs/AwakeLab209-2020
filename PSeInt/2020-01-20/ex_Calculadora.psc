Funcion imprimirMenu
	Escribir "Calculadora v0.1";
	Escribir " [1] Sumar";
	Escribir " [2] Restar";
	Escribir " [3] Dividir";
	Escribir " [4] Multiplicar";
	Escribir " [5] Salir";
FinFuncion

Funcion pedirInteraccion
	Escribir "Presione una tecla para volver al menu";
	Esperar Tecla;
FinFuncion

Proceso ex_Calculadora
	Definir valor1, valor2, opcion Como Entero;
	Definir valor3 Como Real;
	Definir salir Como Logico;
	salir <- Falso;
	
	Mientras !salir Hacer
		Repetir
			Limpiar Pantalla;
			imprimirMenu();
			Leer opcion;
		Hasta Que opcion > 0 && opcion < 6

		Segun opcion Hacer
			1:
				// Sumar
				Escribir "Ingrese el primer valor: ";
				Leer valor1;
				Escribir "Ingrese el segundo valor: ";
				Leer valor2;

				Escribir "El resultado de ", valor1, " + ", valor2, " es: ", valor1 + valor2;
				pedirInteraccion();
			2:
				// Restar
				Escribir "Ingrese el primer valor";
				Leer valor1;
				Escribir "Ingrese el segundo valor";
				Leer valor2;

				Escribir "El resultado de ", valor1, " - ", valor2, " es: ", valor1 - valor2;
				pedirInteraccion();
			3:
				// Dividir
				Escribir "Ingrese el primer valor";
				leer valor1;

				Repetir
					Escribir "Ingrese el segundo valor (distinto de cero)";
					Leer valor2;
				Hasta Que valor2 <> 0

				valor3 <- valor1 / valor2;
				Escribir "El resultado de ", valor1, "/", valor2, " es: ", valor3;
				pedirInteraccion();
			4:
				// Multiplicar
				Escribir "Ingrese el primer valor";
				Leer valor1;
				Escribir "Ingrese el segundo valor";
				Leer valor2;

				Escribir "El resultado de ", valor1, " * ", valor2, " es: ", valor1 * valor2;
				pedirInteraccion();
			5:
				// Salir
				salir <- Verdadero;
		FinSegun
	FinMientras
FinProceso
