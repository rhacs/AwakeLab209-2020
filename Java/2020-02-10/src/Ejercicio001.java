import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio001 {

	public static void main(String[] args) {
		List<Producto> productos = new ArrayList<Producto>();
		Random random = new Random();
		
		System.out.println("Listado de productos:");
		for(int i = 1; i < 11; i++) {
			boolean perecible = random.nextBoolean();
			
			Producto producto = new Producto(
					"Producto #" + i,
					random.nextInt(10000) + 1000,
					perecible,
					(perecible ? (random.nextInt(10) + 1) : 0));
			
			productos.add(producto);
			System.out.println("\t" + producto);
		}

		System.out.println("\nPrecio final de acuerdo a caducidad:");
		for(Producto producto : productos)
			System.out.println("\t" + producto.getNombre() + " $" + producto.calcularPrecio(5));
		
	}

}
