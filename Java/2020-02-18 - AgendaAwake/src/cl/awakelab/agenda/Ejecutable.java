package cl.awakelab.agenda;

import java.util.List;
import java.util.Scanner;

import cl.awakelab.agenda.contacto.Amistad;
import cl.awakelab.agenda.contacto.Contacto;
import cl.awakelab.agenda.contacto.Familiar;
import cl.awakelab.agenda.contacto.Otro;
import cl.awakelab.funciones.Numericas;
import cl.awakelab.funciones.RandomData;

public class Ejecutable {
    
    // App methods -----------------------------------------------------------------------------
    
    static void menu() {
        System.out.println("\nAgenda");
        System.out.println(" 1 - Agregar contacto");
        System.out.println(" 2 - Eliminar contacto");
        System.out.println(" 3 - Buscar contacto");
        System.out.println(" 4 - Mostrar contactos");
        System.out.println(" 5 - Datos Falsos");
        System.out.println(" 6 - Espacio Libre");
        System.out.println(" 7 - Salir");
        System.out.print("Ingrese el numero correspondiente a la accion: ");
    }
    
    static void rellenarConFalsos(Agenda agenda) {
        if(agenda.isLlena())
            System.out.println("[!] Agenda llena.");
        else {
            int restante = agenda.espacioLibre();
            
            for(int i = 0; i < restante; i++) {
                RandomData rd = new RandomData();
                int categoria = (int) (Math.random() * 3 + 1);
                
                Contacto contacto;
                if(categoria == 1)
                    contacto = new Familiar(rd.getNombreCompleto(), rd.getTelefono());
                else if(categoria == 2)
                    contacto = new Amistad(rd.getNombreCompleto(), rd.getTelefono());
                else
                    contacto = new Otro(rd.getNombreCompleto(), rd.getTelefono());
                
                if(!agenda.agregarContacto(contacto))
                    i--;
            }
        }
    }
    
    // Agenda's Methods ------------------------------------------------------------------------
    
    static void agregarContacto(Scanner scanner, Agenda agenda) {
        if(agenda.isLlena())
            System.out.println("[!] La agenda se encuentra llena.");
        else {
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese el numero de telefono: ");
            String numero = scanner.nextLine();
            
            System.out.print("Ingrese la categoria (1 - Familiar, 2 - Amistad, 3 - Otro): ");
            int categoria = Numericas.pedirEntero(scanner, 1, 3);
            
            Contacto contacto;
            if(categoria == 1)
                contacto = new Familiar(nombre, numero);
            else if(categoria == 2)
                contacto = new Amistad(nombre, numero);
            else
                contacto = new Otro(nombre, numero);
            
            if(agenda.agregarContacto(contacto))
                System.out.println("Contacto agregado satisfactoriamente.\n");
            else
                System.out.println("[!] Contacto ya existe.\n");
        }
    }
    
    static void eliminarContacto(Scanner scanner, Agenda agenda) {
        if(agenda.isVacia())
            System.out.println("[!] La agenda se encuentra vacia.");
        else {
            System.out.println(agenda);
            System.out.print("Ingrese el nombre de la persona a eliminar: ");
            String nombre = scanner.nextLine();
            
            if(agenda.eliminarContacto(nombre))
                System.out.println("Contacto eliminado satisfactoriamente.\n");
            else
                System.out.println("[!] El contacto ingresado no existe.");
        }
    }
    
    static void buscarContacto(Scanner scanner, Agenda agenda) {
        if(agenda.isVacia())
            System.out.println("[!] La agenda se encuentra vacia.");
        else {
            System.out.print("Ingrese el nombre para buscarlo en la agenda: ");
            String nombre = scanner.nextLine();
            
            List<Contacto> contactos = agenda.buscarContacto(nombre);
            if(contactos.size() > 0) {
                System.out.println("\nCoincidencias: ");
                for(Contacto c : contactos)
                    System.out.println(String.format("%-30s %-10s", c.getNombre(), c.getNumero()));
            } else
                System.out.println("[!] " + nombre + " no existe en los registros.");
        }
    }
    
    static void mostrarAgenda(Agenda agenda) {
        if(agenda.isVacia())
            System.out.println("[!] La agenda se encuentra vacia.");
        else
            System.out.println(agenda);
    }
    
    static void mostrarEspacio(Agenda agenda) {
        System.out.println("El espacio libre restante es: " + agenda.espacioLibre());
    }
    
    // Main Loop -------------------------------------------------------------------------------
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad limite de contactos a almacenar " + 
                "(0 para usar valor por defecto)");
        int cantidadLimite = Numericas.pedirEntero(scanner, 0);
        
        if(cantidadLimite == 0)
            cantidadLimite = Agenda.CAPACIDAD_POR_DEFECTO;
        
        Agenda agenda = new Agenda(cantidadLimite);
        
        while(true) {
            menu();
            int opcion = Numericas.pedirEntero(scanner, 1, 7);
            
            System.out.println();
            if(opcion == 1)
                agregarContacto(scanner, agenda);
            else if(opcion == 2)
                eliminarContacto(scanner, agenda);
            else if(opcion == 3)
                buscarContacto(scanner, agenda);
            else if(opcion == 4)
                mostrarAgenda(agenda);
            else if(opcion == 5)
                rellenarConFalsos(agenda);
            else if(opcion == 6)
                mostrarEspacio(agenda);
            else
                break;
        }
        
        scanner.close();
    }

}
