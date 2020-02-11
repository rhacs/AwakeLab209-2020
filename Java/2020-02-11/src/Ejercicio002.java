import java.util.Scanner;

public class Ejercicio002 {

    static int numeroEntero(Scanner scanner, int limiteInferior) {
        int entero;
        
        do {
            while(!scanner.hasNextInt()) {
                System.err.println("[!] Por favor, ingrese un numero valido.");
                scanner.next();
            }
            
            entero = scanner.nextInt();
            
            if(entero < limiteInferior)
                System.err.println("[!] Por favor, ingrese un numero mayor o igual a " + 
                        limiteInferior);
        } while (entero < limiteInferior);
        
        return entero;
    }
    
    static double numeroDecimal(Scanner scanner, int limiteInferior) {
        double decimal;
        
        do {
            while(!scanner.hasNextDouble()) {
                System.err.println("[!] Por favor, ingrese un decimal valido");
                scanner.next();
            }
            
            decimal = scanner.nextDouble();
            
            if(decimal < limiteInferior)
                System.err.println("[!] Por favor, ingrese un decimal mayor o igual a " + 
                        limiteInferior);
        } while (decimal < limiteInferior);
        
        return decimal;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Persona persona = new Persona();
        
        System.out.println("P1 Ingrese el nombre: ");
        persona.setNombre(scanner.next());
        
        System.out.println("P1 Ingrese la edad: ");
        persona.setEdad(numeroEntero(scanner, 1));
        
        System.out.println("P1 Ingrese el rut: ");
        persona.setRut(scanner.next());
        
        System.out.println("P1 Ingrese el genero (f/m/o): ");
        persona.setGenero(scanner.next().charAt(0));
        
        System.out.println("P1 Ingrese el peso (en kg): ");
        persona.setPeso(numeroDecimal(scanner, 0));
        
        System.out.println("P1 Ingrese la altura (en metros): ");
        persona.setAltura(numeroDecimal(scanner, 0));
        
        Persona otraPersona = new Persona();
        System.out.println("P2 Ingrese el nombre: ");
        otraPersona.setNombre(scanner.next());
        
        System.out.println("P2 Ingrese la edad: ");
        otraPersona.setEdad(numeroEntero(scanner, 1));
        
        System.out.println("P2 Ingrese el rut: ");
        otraPersona.setRut(scanner.next());
        
        System.out.println("P2 Ingrese el genero (f/m/o): ");
        otraPersona.setGenero(scanner.next().charAt(0));
        
        Persona nuevaPersona = new Persona();
        
        System.out.println("P1\n\t" + persona +
                "\n\tIMC: " + persona.calcularMC() +
                "\n\tMayor? " + persona.esMayorDeEdad());
        
        System.out.println("P2\n\t" + otraPersona + 
                "\n\tIMC: " + otraPersona.calcularMC() +
                "\n\tMayor? " + otraPersona.esMayorDeEdad());
        
        System.out.println("P3\n\t" + nuevaPersona + 
                "\n\tIMC: " + nuevaPersona.calcularMC() +
                "\n\tMayor? " + nuevaPersona.esMayorDeEdad());
        
        scanner.close();
    }

}
