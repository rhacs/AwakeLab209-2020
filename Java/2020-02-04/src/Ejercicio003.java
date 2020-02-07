import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio003 {

	/**
	 * Genera un ArrayList de tamano "cantiadadElementos" con valores generados
	 * aleatoriamente entre "limiteInferior" y "limiteSuperior"
	 * 
	 * @param cantidadElementos Cantidad de elementos a generar
	 * @param limiteInferior Numero minimo que se va a generar
	 * @param limiteSuperior Numero maximo que se va a generar
	 * @return Una lista con "cantidadElementos" elementos, con valores entre
	 * limiteInferior y limiteSuperior
	 */
	static List<Integer> generarLista(int cantidadElementos, int limiteInferior,
			int limiteSuperior) {
		List<Integer> lista = new ArrayList<Integer>();
		Random random = new Random();
		
		for(int i = 0; i < cantidadElementos; i++)
			lista.add(random.nextInt(limiteSuperior + 1) + limiteInferior);
		
		return lista;
	}
	
	public static void main(String[] args) {
		
	}

}
