import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * (4) Ahora crea una aplicación ejecutable y realiza lo siguiente:
 *      - Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
 *      - Crea un objeto en cada posición del array, con los valores que desees, puedes usar
 *        distintos constructores.
 *      - Entrega algunos Videojuegos y Series con el método entregar().
 *      - Cuenta cuántas Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
 *      - Por último, indica el Videojuego tiene más horas estimadas y la serie con mas
 *        temporadas. Muestralos en pantalla con toda su información (usa el método toString()).
 */

public class Ejercicio003 {
    
    // Series ----------------------------------------------------------------------------------
    
    private final static String[] SERIES_TITULOS = {"Game of Thrones", "Breaking Bad",
            "The Walking Dead", "Friends", "Stranger Things", "The Big Bang Theory", "Chernobyl",
            "Arrow", "Black Mirror", "Vikings"};
    
    private final static int[] SERIES_TEMPORADAS = {8, 5, 11, 10, 4, 12, 1, 8, 5, 6};
    
    private final static String[] SERIES_GENEROS = {"Acción, Aventura, Drama",
            "Crimen, Drama, Suspenso", "Drama, Horror, Suspenso", "Comedia, Romance",
            "Drama, Fantasía, Horror", "Comedia, Romance", "Drama, Historia, Suspenso",
            "Acción, Aventura, Crimen", "Drama, Ciencia Ficción, Suspenso",
            "Acción, Aventura, Drama"};
    
    private final static String[] SERIES_CREADORES = {"David Benioff & D.B. Weiss",
            "Vince Gilligan", "Frank Darabont & Angela Kang", "David Crane & Marta Kauffman",
            "Matt Duffer & Ross Duffer", "Chuck Lorre & Bill Prady", "Craig Mazin",
            "Greg Berlanti, Marc Guggenheim & Andrew Kreisberg", "Charlie Brooker",
            "Michael Hirst"};
    
    // Video Juegos ----------------------------------------------------------------------------
    
    private final static String[] VJ_TITULOS = {"The Witcher 3: Wild Hunt", "God of War",
            "The Last of Us", "Persona 5", "Chrono Trigger", 
            "The Legend of Zelda: Breath of the Wild", "Silent Hill 2",
            "Metal Gear Solid 3: Snake Eater", "Paper Mario: The Thousand-Year Door",
            "Red Dead Redemption 2"};
    
    private final static int[] VJ_HORAS = {171, 50, 22, 171, 46, 182, 14, 23, 64, 160};
    
    private final static String[] VJ_GENEROS = {"Aventura, RPG", "Aventura, RPG",
            "Aventura, Shooter", "Aventura, Plataforma, RPG", "RPG", "Aventura, RPG",
            "Aventura, Puzzle", "Aventura, Shooter, Táctico", "Aventura, RPG",
            "Aventura, RPG, Shooter"};
    
    private final static String[] VJ_COMPANIAS = {"CD Projekt RED", "SIE Santa Monica Studio",
            "Naughty Dog", "Atlus", "Square Enix", "Nintendo EPD", 
            "Konami Computer Entertainment Tokyo", "Konami Computer Entertainment Japan",
            "Intelligent Systems Co., Ltd.", "Rockstar Studios"};
    
    // Main loop -------------------------------------------------------------------------------
    
    public static void main(String[] args) {
        List<Serie> series = new ArrayList<Serie>();
        List<VideoJuego> videoJuegos = new ArrayList<VideoJuego>();
        Random random = new Random(System.currentTimeMillis());
        
        int cantidadElementos = random.nextInt(6) + 2;
        
        // Crea un objeto en cada posición del array, con los valores que desees, puedes usar
        // distintos constructores.
        
        System.out.println("Series disponibles (" + cantidadElementos + "): ");
        for(int i = 0; i < cantidadElementos; i++) {
            Serie serie = new Serie(
                    SERIES_TITULOS[i],
                    SERIES_TEMPORADAS[i],
                    SERIES_GENEROS[i],
                    SERIES_CREADORES[i]);
            series.add(serie);
            System.out.println("  " + serie);
        }
        
        cantidadElementos = random.nextInt(6) + 2;
        System.out.println("\nVideo juegos disponibles (" + cantidadElementos + "): ");
        for(int i = 0; i < cantidadElementos; i++) {
            VideoJuego videoJuego = new VideoJuego(
                    VJ_TITULOS[i],
                    VJ_HORAS[i],
                    VJ_GENEROS[i],
                    VJ_COMPANIAS[i]);
            videoJuegos.add(videoJuego);
            System.out.println("  " + videoJuego);
        }
        
        // Entrega algunos Videojuegos y Series con el método entregar().
        
        int elementosAEntregar = random.nextInt(series.size());
        for(int i = 0; i < elementosAEntregar; i++) {
            int aux = random.nextInt(series.size());
            
            if(!series.get(aux).isEntregado())
                series.get(aux).entregar();
            else
                i--;
        }
        
        elementosAEntregar = random.nextInt(videoJuegos.size());
        for(int i = 0; i < elementosAEntregar; i++) {
            int aux = random.nextInt(videoJuegos.size());
            
            if(!videoJuegos.get(aux).isEntregado())
                videoJuegos.get(aux).entregar();
            else
                i--;
        }
        
        // Cuenta cuántas Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
        // Series:
        System.out.println("\nSeries entregadas: ");
        int contador = 0;
        for(Serie serie : series) {
            if(serie.isEntregado()) {
                contador++;
                System.out.println("  " + serie);
            }
        }
        System.out.println("Total: " + contador);
        
        // Video juegos:
        System.out.println("\nVideo juegos entregados: ");
        contador = 0;
        for(VideoJuego videoJuego : videoJuegos) {
            if(videoJuego.isEntregado()) {
                contador++;
                System.out.println("  " + videoJuego);
            }
        }
        System.out.println("Total: " + contador);
        
        // Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas.
        System.out.println("\nSerie con mayor cantidad de temporadas: ");
        Collections.sort(series);
        System.out.println("  " + series.get(series.size() - 1));
        
        System.out.println("\nVideo juego con mayor cantidad de horas estimadas: ");
        Collections.sort(videoJuegos);
        System.out.println("  " + videoJuegos.get(videoJuegos.size() - 1));
    }

}
