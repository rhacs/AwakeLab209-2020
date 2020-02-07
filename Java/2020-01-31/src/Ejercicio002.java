import java.util.ArrayList;
import java.util.Scanner;

class Item {
	
	String nombre;
	int valorUnitario;
	int cantidad;

	Item(String nombre, int valorUnitario, int cantidad) {
		this.nombre = nombre;
		this.valorUnitario = valorUnitario;
		this.cantidad = cantidad;
	}

}

public class Ejercicio002 {

	static int existeProducto(ArrayList<Item> items, String nombre) {
		for(int i = 0; i < items.size(); ++i) {
			if(items.get(i).nombre.equals(nombre))
				return i;
		}

		return -1;
	}
	
	static int pedirNumero(Scanner scanner, String mensaje) {
		int numero;

		System.out.println(mensaje + ": ");
		do {
			while(!scanner.hasNextInt()) {
				System.err.println("Por favor, ingrese un numero valido.");
				scanner.next();
			}
			
			numero = scanner.nextInt();
			
			if(numero <= 0)
				System.err.println("Por favor, ingrese un numero mayor que 0 (cero)");
			
		} while(numero <= 0);

		return numero;
	}
	
	static void imprimirBoleta(ArrayList<Item> productos) {
		int total = 0;
		
		System.out.println("\n\nDetalle de Boleta --------------");
		
		for(Item producto : productos) {
			total += (producto.cantidad * producto.valorUnitario);
			
			System.out.println(producto.nombre + "\t\t\t\t$" + producto.valorUnitario);
			System.out.println("\t\t\t" + producto.cantidad + "x \t$" + (producto.cantidad * producto.valorUnitario));
		}
		
		System.out.println("\nSubTotal:\t\t\t$" + total);
		System.out.println("I.V.A.:\t\t\t\t$" + (float)(total * 0.19));
		System.out.println("Total:\t\t\t\t$" + (float)(total * 1.19));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Item> productos = new ArrayList<Item>();
		
		String nombre;
		int valor;
		int cantidad;
		
		do {
			System.out.println("Ingrese el nombre del producto: (\"total\" para imprimir la boleta)");
			nombre = scanner.next();
			
			if(!nombre.equals("total")) {
				valor = pedirNumero(scanner, "Ingrese el valor unitario del producto");
				cantidad = pedirNumero(scanner, "Ingrese la cantidad que lleva");

				int id = existeProducto(productos, nombre);
				if(id != -1) {
					Item producto = productos.get(id);
					
					producto.cantidad += cantidad;
					productos.set(id, producto);
				} else {
					Item producto = new Item(nombre, valor, cantidad);
					productos.add(producto);
				}
			}
		} while (!nombre.equals("total"));

		imprimirBoleta(productos);
	}

}
