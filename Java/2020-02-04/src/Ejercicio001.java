import java.util.ArrayList;
import java.util.List;

public class Ejercicio001 {
	
	static List<Integer> generarLista(int cantidadElementos) {
		List<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 1; i < (cantidadElementos + 1); i++)
			lista.add(i);
		
		return lista;
	}
	
	public static void main(String[] args) {
		List<Integer> lista = generarLista(100);
		
		System.out.println("lista(100):\n" + lista);
		
		int total = 0;
		for(int elemento : lista)
			total += elemento;
		
		List<Integer> suma = new ArrayList<Integer>();
		suma.add(total);
		
		List<Double> promedio = new ArrayList<Double>();
		promedio.add((double)(total / lista.size()));
		
		System.out.println("\nsuma(lista):\n" + suma);
		System.out.println("\npromedio(lista):\n" + promedio);
		
		List<Integer> multiplosTres = new ArrayList<Integer>();
		
		for(int elemento : lista)
			if(elemento % 3 == 0)
				multiplosTres.add(elemento);
		
		System.out.println("\nmultiplosDeTres(lista):\n" + multiplosTres);
	}

}
