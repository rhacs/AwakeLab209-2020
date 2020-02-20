package cl.awakelab.funciones;

import java.util.Scanner;

public class Numericas {

    // Constants -------------------------------------------------------------------------------
    
    private static final String ENTERO_VALIDO = "[!] Por favor, ingrese un número válido";
    private static final String ENTERO_MAYOR = "[!] Por favor, ingrese un número mayor o igual a %d";
    private static final String ENTERO_BETWEEN = "[!] Por favor, ingrese un número entre %d y %d";
    
    // Números Enteros -------------------------------------------------------------------------
    
    public static int pedirEntero(Scanner scanner) {
        while(!scanner.hasNextInt()) {
            System.err.print(ENTERO_VALIDO + ": ");
            scanner.next();
        }
        
        return scanner.nextInt();
    }
    
    public static int pedirEntero(Scanner scanner, int limiteInferior) {
        int entero;
        
        do {
            entero = pedirEntero(scanner);
            
            if(scanner.hasNextLine())
                scanner.nextLine();
            
            if(entero < limiteInferior)
                System.err.print(String.format(ENTERO_MAYOR, limiteInferior) + ": ");
            
        } while(entero < limiteInferior);
        
        return entero;
    }
    
    public static int pedirEntero(Scanner scanner, int limiteInferior, int limiteSuperior) {
        int entero;
        
        do {
            entero = pedirEntero(scanner);
            
            if(scanner.hasNextLine())
                scanner.nextLine();
            
            if(entero < limiteInferior || entero > limiteSuperior)
                System.err.print(String.format(ENTERO_BETWEEN, limiteInferior, limiteSuperior));
            
        } while(entero < limiteInferior || entero > limiteSuperior);
        
        return entero;
    }
    
}
