import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio002 {
    
    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<Robot>();
        Random random = new Random();
        int totalRobots = random.nextInt(6) + 5;
        
        for(int i = 0; i < totalRobots; i++) {
            int vida = random.nextInt(100) + 1;
            Robot robot = new Robot(vida);
            
            robots.add(robot);
        }

        Collections.sort(robots);
        System.out.println("Robots:");
        for(Robot robot : robots) {
            System.out.println("\t" + robot);
        }

        System.out.println("\nRobots si vida > 50:");
        boolean alMenosUno = false;
        
        for(Robot robot : robots) {
            if(robot.getVida() > 50) {
                System.out.println("\t" + robot);
                alMenosUno = true;
            }
        }

        if(!alMenosUno) {
            System.err.println("No hay robots que tengan mas del 50% de su vida");
        }

        System.out.println("\nRobots con mas vida");
        int contador = 3;
        while(contador > 0) {
            Robot robot = robots.get(robots.size() - contador);
            System.out.println("\t" + robot);
            contador--;
        }
    }

}
