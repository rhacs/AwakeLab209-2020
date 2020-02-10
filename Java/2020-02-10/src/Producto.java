
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
            
            if(this.diasPorCaducar == 1)
                return total / 4;
            else if(this.diasPorCaducar == 2)
                return total / 3;
            else if(this.diasPorCaducar == 3)
                return total / 2;
            else
                return total;
        } else
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
