package cl.awakelab.agenda.contacto;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class AmistadTest {
    
    @Test
    public void shouldReturnAmistad() {
        String numero = new String("9" + (Math.random()*90000000 + 10000000));
        Amistad amistad = new Amistad("Nombre Apellido", numero);
            
        assertEquals("Amistad", amistad.getTipo());
    }
    
    @Test
    public void shouldReturnName() {
        String numero = new String("9" + (Math.random()*90000000 + 10000000));
        Amistad amistad = new Amistad("Nombre Apellido", numero);
        
        assertEquals("Nombre Apellido", amistad.getNombre());
    }
    
    @Test
    public void shouldReturnPhoneNumber() {
        String numero = new String("9" + (Math.random()*90000000 + 10000000)); 
        Amistad amistad = new Amistad("Nombre Apellido", numero);
        
        assertEquals(numero, amistad.getNumero());
    }

}
