
/*
 * (2) Crearemos una clase Videojuego con las siguientes características:
 * Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
 * Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de atributos
 * serán valores por defecto según el tipo del atributo.
 * 
 * Los constructores que se implementaran serán:
 *      - Un constructor por defecto.
 *      - Un constructor con el titulo y horas estimadas. El resto por defecto.
 *      - Un constructor con todos los atributos, excepto de entregado.
 * 
 * Los métodos que se implementara serán:
 *      - Métodos get de todos los atributos, excepto de entregado.
 *      - Métodos set de todos los atributos, excepto de entregado.
 *      - Sobrescribe los métodos toString.
 * 
 */

public class VideoJuego implements Entregable {

    // Attributes ------------------------------------------------------------------------------
    
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String company;
    
    // Constructors ----------------------------------------------------------------------------
    
    VideoJuego() {
        this.titulo = "";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "";
        this.company = "";
    }
    
    VideoJuego(String titulo, int horasEstimadas) {
        this();
        
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }
    
    VideoJuego(String titulo, int horasEstimadas, String genero, String company) {
        this(titulo, horasEstimadas);
        
        this.genero = genero;
        this.company = company;
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
        return this.horasEstimadas - ((VideoJuego) object).getHorasEstimadas();
    }
    
    @Override
    public String toString() {
        return "VideoJuego(" + 
                "titulo: '" + this.titulo + "', " + 
                "horasEstimadas: " + this.horasEstimadas + ", " +
                "entregado: " + this.entregado + ", " +
                "genero: '" + this.genero + "', " +
                "compañia: '" + this.company + "')";
    }
    
    // Getters ---------------------------------------------------------------------------------
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public int getHorasEstimadas() {
        return this.horasEstimadas;
    }
    
    public String getGenero() {
        return this.genero;
    }
    
    public String getCompany() {
        return this.company;
    }
    
    // Setters ---------------------------------------------------------------------------------
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
    
}
