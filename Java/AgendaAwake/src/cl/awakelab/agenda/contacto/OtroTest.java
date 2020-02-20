package cl.awakelab.agenda.contacto;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class OtroTest {

    @Test
    public void shouldReturnOtro() {
        String numero = new String("9" + (Math.random()*90000000 + 10000000));
        Otro otro = new Otro ("Nombre Apellido", numero);
        
        assertEquals("Otro", otro.getTipo());
    }
    
    @Test
    public void shouldReturnName() {
        String numero = new String("9" + (Math.random()*90000000 + 10000000));
        Otro otro = new Otro("Nombre Apellido", numero);
        
        assertEquals("Nombre Apellido", otro.getNombre());
    }
    
    @Test
    public void shouldReturnPhoneNumber() {
        String numero = new String("9" + (Math.random()*90000000 + 10000000)); 
        Otro otro = new Otro("Nombre Apellido", numero);
        
        assertEquals(numero, otro.getNumero());
    }

}
