
/*
 * (1) Crea una clase llamada Serie con las siguientes características:
 * Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
 * Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El resto de atributos
 * serán valores por defecto según el tipo del atributo.
 * 
 * Los constructores que se implementaran serán:
 *      - Un constructor por defecto.
 *      - Un constructor con el titulo y creador. El resto por defecto.
 *      - Un constructor con todos los atributos, excepto de entregado.
 * 
 * Los métodos que se implementara serán:
 *      - Métodos get de todos los atributos, excepto de entregado.
 *      - Métodos set de todos los atributos, excepto de entregado.
 *      - Sobrescribe los métodos toString.
 *      
 */

public class Serie implements Entregable {

    // Attributes ------------------------------------------------------------------------------
    
    private String titulo;
    private int temporadas;
    private boolean entregado;
    private String genero;
    private String creador;
    
    // Constructors ----------------------------------------------------------------------------
    
    Serie() {
        this.titulo = "";
        this.temporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }
    
    Serie(String titulo, String creador) {
        this();
        
        this.titulo = titulo;
        this.creador = creador;
    }
    
    Serie(String titulo, int temporadas, String genero, String creador) {
        this(titulo, creador);
        
        this.temporadas = temporadas;
        this.genero = genero;
    }
    
    // Methods ---------------------------------------------------------------------------------
    
    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }
    
    @Override
    public int compareTo(Object object) {
        return this.temporadas - ((Serie) object).getTemporadas();
    }
    
    @Override
    public String toString() {
        return "Serie(" + 
                "titulo: '" + this.titulo + "', " +
                "temporadas: " + this.temporadas + ", " + 
                "entregado: " + this.entregado + ", " + 
                "genero: '" + this.genero + "', " + 
                "creador: '" + this.creador + "')";
    }
    
    // Getters ---------------------------------------------------------------------------------
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public int getTemporadas() {
        return this.temporadas;
    }
    
    public String getGenero() {
        return this.genero;
    }
    
    public String getCreador() {
        return this.creador;
    }
    
    // Setters ---------------------------------------------------------------------------------
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void setCreador(String creador) {
        this.creador = creador;
    }
    
}
