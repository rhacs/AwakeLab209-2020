
/*
 * Se desea manejar una lista de robots. Cada robot tiene un numero y un porcentaje de vida. El
 * numero de elementos de la lista sera un valor aleatorio entre 5 y 10. El porcentaje de vida de
 * cada robot sera un valor aleatorio entre 1 y 100.
 * 
 * Se pide construir una aplicacion en java que permita cumplir con la siguiente funcionalidad:
 *     - Imprimir la lista de robots ordenada por porcentaje de vida de estos. Al principio de la
 *       lista DEBEN estar los robots con menos porcentaje de vida.
 *     - Imprimir la cantidad de robot que tiene más del 50% de vida.
 *     - Imprimir el número de los TRES robots que tienen mayor porcentaje de vida.
 *     
 */

public class Robot implements Comparable<Robot> {
    private int vida;
    
    Robot(int vida) {
        this.vida = vida;
    }

    public String toString() {
        return "Robot('" + this.vida + "')";
    }

    public int getVida() {
        return this.vida;
    }

    @Override
    public int compareTo(Robot robot) {
        return this.vida - robot.getVida();
    }
}
