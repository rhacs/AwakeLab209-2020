import java.util.Random;

public class Persona {

    private int id;
    private String nombre;
    private int edad;
    private String rut;
    private char genero;
    private double peso;
    private double altura;
    
    private final int IMC_BAJOPESO = -1;
    private final int IMC_NORMAL = 0;
    private final int IMC_SOBREPESO = 1;
    
    Persona() {
        this.id = this.generarId();
        this.nombre = "";
        this.edad = 0;
        this.rut = "";
        this.genero = 'o';
        this.peso = 0D;
        this.altura = 0D;
    }
    
    Persona(String nombre, int edad, String rut, char genero) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.genero = (this.comprobarGenero(genero) ? genero : 'o');
    }
    
    Persona(String nombre, int edad, String rut, char genero, double peso, double altura) {
        this(nombre, edad, rut, genero);
        this.peso = peso;
        this.altura = altura;
    }
    
    public int calcularMC() {
        if(this.altura > 0) {
            double masaCorporal = this.peso / (this.altura * this.altura);
            
            if(masaCorporal < 20)
                return this.IMC_BAJOPESO;
            else if(masaCorporal >= 20 && masaCorporal <= 25)
                return this.IMC_NORMAL;
            else
                return this.IMC_SOBREPESO;
        } else
            return -100;
    }
    
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }
    
    private boolean comprobarGenero(char genero) {
        if(genero == 'm' || genero == 'f' || genero == 'o')
            return true;
        
        return false;
    }
    
    private int generarId() {
        Random random = new Random(System.currentTimeMillis());
        return random.nextInt(89999999) + 10000000;
    }

    public String toString() {
        return "Persona(" +
                "id: '" + this.id + "'," +
                " nombre: '" + this.nombre + "'," +
                " edad: '" + this.edad + "'," +
                " rut: '" + this.rut + "'," +
                " genero: '" + this.genero + "'," +
                " peso: '" + this.peso + "'," +
                " altura: '" + this.altura + "')";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getId() {
        return id;
    }
    
}
