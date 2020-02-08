import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Haz una clase llamada Password que siga las siguientes condiciones:
 * - Que tenga los atributos longitud y contraseña. Por defecto, la longitud será de 8.
 * - Los constructores serán los siguientes:
 *      + Un constructor por defecto.
 *      + Un constructor con la longitud que nosotros le pasemos. Generará una contraseña aleatoria
 *        con esa longitud.
 * 
 * - Los métodos que implementa serán:
 *      + esFuerte():
 *        devuelve un booleano si es fuerte o no, para que sea fuerte debe tener más de 1 mayúscula,
 *        más de 0 minúsculas y más de 4 números.
 *      + generarPassword():
 *        genera la contraseña del objeto con la longitud que tenga.
 *        
 * - Método get para contraseña y longitud.
 * - Método set para longitud.
 */

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
        int numeros = (int) matcher.results().count();
        
        pattern = Pattern.compile("([a-z])");
        matcher = pattern.matcher(this.password);
        int minusculas = (int) matcher.results().count();

        pattern = Pattern.compile("([A-Z])");
        matcher = pattern.matcher(this.password);
        int mayusculas = (int) matcher.results().count();
        
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
