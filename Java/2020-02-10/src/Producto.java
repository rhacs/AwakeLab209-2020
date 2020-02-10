
/*
 * Nos piden que gestionemos una serie de productos. Los productos tienen los siguientes atributos:
 *     - Nombre
 *     - Precio
 * 
 * Tenemos dos tipos de productos:
 *     - Perecedero: tiene un atributo llamado días a caducar
 *     - No perecedero: tiene un atributo llamado tipo
 *     
 * Crea sus constructores, getters, setters y toString.
 * Tendremos una función llamada calcular, que según cada clase hará una cosa u otra, a esta
 * función le pasaremos un numero siendo la cantidad de productos
 * 
 *     - En Producto, simplemente seria multiplicar el precio por la cantidad de productos pasados.
 *     - En Perecedero, aparte de lo que hace producto, el precio se reducirá según los días a
 *       caducar:
 *           - Si le queda 1 día para caducar, se reducirá 4 veces el precio final.
 *           - Si le quedan 2 días para caducar, se reducirá 3 veces el precio final.
 *           - Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final.
 *     - En NoPerecedero, hace lo mismo que en producto
 */

public class Producto {
    private String nombre;
    private int precio;
    private boolean perecible;
    private int diasPorCaducar;

    Producto(String nombre, int precio, boolean perecible, int diasPorCaducar) {
        this.nombre = nombre;
        this.precio = precio;
        this.perecible = perecible;
        this.diasPorCaducar = diasPorCaducar;
    }
    
    public int calcularPrecio(int cantidadProducto) {
        if(this.perecible) {
            int total = this.precio * cantidadProducto;
            
            if(this.diasPorCaducar == 1) {
                return total / 4;
            } else if(this.diasPorCaducar == 2) {
                return total / 3;
            } else if(this.diasPorCaducar == 3) {
                return total / 2;
            } else { 
                return total;
            }
        }

        return this.precio * cantidadProducto;
    }
    
    public String toString() {
        return "Producto('" + this.nombre + "', '" + this.precio + "', '" + this.perecible
                + "', '" + this.diasPorCaducar + "')";
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPerecible(boolean perecible) {
        this.perecible = perecible;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPrecio() {
        return this.precio;
    }

    public boolean getPerecible() {
        return this.perecible;
    }

    public int getDiasPorCaducar() {
        return this.diasPorCaducar;
    }
}
