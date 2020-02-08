import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    protected String password;
    protected int longitud;
    
    Password() {
        this.longitud = 8;
        generarPassword();
    }
    
    Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }
    
    public void generarPassword() {
        Random random = new Random();
        List<Character> password = new ArrayList<Character>();
        this.password = "";
        
        for(int i = 0; i < this.longitud; i++) {
            int opcion = random.nextInt(3) + 1;
            char simbolo = 97;
            
            switch(opcion) {
                case 1:
                    // Numero (0: 48, 9: 57)
                    simbolo = (char) (random.nextInt(10) + 48);
                    break;
                case 2:
                    // Mayuscula (A: 65, Z: 90)
                    simbolo = (char) (random.nextInt(26) + 65);
                    break;
                case 3:
                    // Minuscula (a: 97, z: 122)
                    simbolo = (char) (random.nextInt(26) + 97);
                    break;
            }
            
            password.add(simbolo);
        }
        
        Collections.shuffle(password);
        for(char c : password) {
            this.password += c;
        }
    }
    
    public boolean esFuerte() {
        if(this.longitud < 8)
            return false;
        
        Pattern pattern = Pattern.compile("([0-9])");
        Matcher matcher = pattern.matcher(this.password);
        int numeros = 0;
        
        while(matcher.find()) {
            numeros++;
        }
        
        pattern = Pattern.compile("([a-z])");
        matcher = pattern.matcher(this.password);
        int minusculas = 0;
        
        while(matcher.find()) {
            minusculas++;
        }
        
        pattern = Pattern.compile("([A-Z])");
        matcher = pattern.matcher(this.password);
        int mayusculas = 0;
        
        while(matcher.find()) {
            mayusculas++;
        }
        
        return (numeros > 4 && minusculas > 0 && mayusculas > 1);
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public int getLontigud() {
        return this.longitud;
    }
    
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
}
