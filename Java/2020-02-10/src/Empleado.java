
/*
 * Nos piden hacer una un programa que gestione personal de una empresa.
 * El personal se define, por tener: 
 *     - Nombre 
 *     - Edad 
 *     - Salario
 *     - También tendremos una constante llamada PLUS, que tendrá un valor de 50 mil pesos.
 * 
 * Tenemos dos tipos de personal:
 *     - El comercial, aparte de los atributos anteriores, tiene uno más llamado comisión (double)
 *     - El repartidor, aparte de los atributos de personal, tiene otro llamado zona (String).
 * 
 * Crea sus constructores, getters and setters y toString (piensa como aprovechar la herencia).
 * Las clases tendrán un método llamado plus, que según en cada clase tendrá una implementación
 * distinta. Este plus básicamente aumenta el salario del empleado.
 *     - En comercial, si tiene más de 30 años y cobra una comisión de más de 200 mil pesos,
 *       se le aplicara el plus.
 *     - En repartidor, si tiene menos de 25 y reparte en la “zona 3”, este recibirá el plus.
 *     
 * Puedes hacer que devuelva un booleano o que no devuelva nada, lo dejo a tu elección.
 * Crea una clase ejecutable donde crees distintos empleados y le apliques el plus para comprobar
 * que funciona.
 */

public class Empleado {

    private final double PLUS = 50000D;
    
    private String nombre;
    private int edad;
    private double salario;
    private boolean comercial;
    private double comision;
    private String zona;
    
    // Constructors ----------------------------------------------------------------------------
    
    Empleado(String nombre, int edad, double salario, boolean comercial, double comision,
            String zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.comercial = comercial;
        this.comision = comision;
        this.zona = zona;
    }
    
    // Methods ---------------------------------------------------------------------------------
    
    public double calcularSalarioFinal() {
        double salarioFinal = this.salario + this.comision;
        
        if(this.comercial && this.edad > 30 && this.comision > 200000) {
            salarioFinal += PLUS;
        } else if(!this.comercial && this.edad < 25 && this.zona.equalsIgnoreCase("zona 3")) {
            salarioFinal += PLUS;
        }
        
        return salarioFinal;
    }
    
    public String toString() {
        return "Empleado('" + 
                this.nombre + "', '" + 
                this.edad + " años', '$" + 
                this.salario + "', 'esComercial: " +
                this.comercial + "', '$" +
                this.comision + "', '" +
                this.zona + "')";
    }
    
    // Getters ---------------------------------------------------------------------------------
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public boolean isComercial() {
        return this.comercial;
    }
    
    public double getComision() {
        return this.comision;
    }
    
    public String getZona() {
        return this.zona;
    }
    
    // Setters ---------------------------------------------------------------------------------
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void setComercial(boolean comercial) {
        this.comercial = comercial;
    }
    
    public void setComision(double comision) {
        this.comision = comision;
    }
    
    public void setZona(String zona) {
        this.zona = zona;
    }
}
