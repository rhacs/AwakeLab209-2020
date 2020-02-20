package cl.awakelab.agenda.contacto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FamiliarTest {

    @Test
    public void shouldReturnFamiliar() {        
        String numero = new String("9" + (Math.random()*90000000 + 10000000 ));
        Familiar familiar = new Familiar("Nombre Apellido", numero);
        
        assertEquals("Familiar", familiar.getTipo());        
        
    }
    
    @Test
    public void shouldReturnName() {
        String numero = new String("9" + (Math.random()*90000000 + 10000000 ));
        Familiar familiar = new Familiar("Nombre Apellido", numero);
        
        assertEquals("Nombre Apellido", familiar.getNombre());
    }
    
    @Test
    public void shouldReturnPhoneNumber() {
        String numero = new String("9" + (Math.random()*90000000 + 10000000 ));
        Familiar familiar = new Familiar("Nombre Apellido", numero);
        
        assertEquals(numero, familiar.getNumero());
    }

}
