Proceso MatricesCuatro
	Definir articulos, i, j, contador, total Como Entero;
	Definir seguir Como Caracter;
	Dimension articulos[300, 2];
	
	contador <- 0;
	total <- 0;
	
	Repetir
		Limpiar Pantalla;
		Escribir "Ingrese el Precio Unitario del producto";
		Leer articulos[contador, 0];

		Escribir "Ingrese la Cantidad del Producto";
		Leer articulos[contador, 1];

		total <- total + (articulos[contador, 0] * articulos[contador, 1]);
		contador <- contador + 1;

		Escribir "Desea continuar? (s/n)";
		Leer seguir;
	Hasta Que seguir = "n";

	Limpiar Pantalla;
	Escribir "Detalle de la compra:";
	Para i <- 0 Hasta contador - 1 Hacer
		Escribir " [", articulos[i, 1], "] Articulo #", i + 1, "  p.u.  $", articulos[i, 0];
		Escribir "               subtot.  $", (articulos[i, 0] * articulos[i, 1]);
	FinPara

	Escribir "-------------------------------";
	Escribir " SubTotal:              $", total;
	Escribir " 19% Impuesto:          $", redon(total * 0.19);
	Escribir " Total:                 $", redon(total * 1.19);
FinProceso
