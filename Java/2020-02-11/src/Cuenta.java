
/*
 * Descripcion del Problema
 * Crea una clase llamada Cuenta que tendra los siguientes atributos:
 *   - Titular: Obligatorio
 *   - Cantidad: Opcional
 * Crear metodos getters, setters y toString, ademas de:
 *   - Ingresar(cantidad)
 *   - Retirar(cantidad)
 *   
 * Crea una clase ejecutable para probar su comportamiento
 */

public class Cuenta {

    private String nombre;
    private double saldo;
    
    // Constructors ----------------------------------------------------------------------------
    
    Cuenta(String nombre) {
        this.nombre = nombre;
        this.saldo = 0D;
    }
    
    Cuenta(String nombre, int saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    // Methods ---------------------------------------------------------------------------------
    
    public double ingresar(double cantidad) {
        if(cantidad > 0)
            this.saldo += cantidad;
        
        return this.saldo;
    }
    
    public double retirar(double cantidad) {
        if(cantidad > 0 && cantidad <= this.saldo)
            this.saldo -= cantidad;
        else
            System.err.println("[!] Monto a retirar excede el saldo disponible." +
                    " Operacion cancelada.\n");
        
        return this.saldo;
    }
    
    public String toString() {
        return "Cuenta(nombre: '" + this.nombre + "', saldo: '$" + this.saldo + "')";
    }
    
    // Getters ---------------------------------------------------------------------------------
    
    public String getNombre() {
        return this.nombre;
    }
    
    public double getSaldo() {
        return this.saldo;
    }

}
