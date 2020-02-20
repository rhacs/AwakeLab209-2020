package cl.awakelab.agenda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cl.awakelab.agenda.contacto.Amistad;
import cl.awakelab.agenda.contacto.Familiar;
import cl.awakelab.agenda.contacto.Otro;

class AgendaTest {

    private Agenda agenda;
    private int cantidad = 10;
    
    @BeforeEach
    void setUp() throws Exception {
        this.agenda = new Agenda(cantidad);
        
        this.agenda.agregarContacto(new Familiar("Elsa Pallo", "989887789"));
        this.agenda.agregarContacto(new Otro("Elsa Capunta", "964783263"));
        this.agenda.agregarContacto(new Amistad("Ali Cate", "912322123"));
        this.agenda.agregarContacto(new Otro("Alan Brito", "986564773"));
        
        System.out.println("setup() before: ");
    }
    
    @Test
    public void contactShouldExist() {
        assertTrue(this.agenda.existeContacto("Elsa Pallo"));
        System.out.println("contactShouldExist()");
    }
    
    @Test
    public void contactShouldNotExist() {
        assertFalse(this.agenda.existeContacto("Rosamel"));
        System.out.println("contactShouldNotExist()");
    }
    
    @Test
    public void shouldAddContact() {
        Familiar familiar = new Familiar("Ali Mento", "989890765");
        assertTrue(this.agenda.agregarContacto(familiar));
        System.out.println("shouldAddContact()");
    }
    
    @Test
    public void shouldNotAddContact() {
        Otro otro = new Otro("Elsa Pallo", "921211234");
        assertFalse(this.agenda.agregarContacto(otro));
        System.out.println("shouldNotAddContact()");
    }
    
    @Test
    public void shouldRemoveContact() {
        assertTrue(this.agenda.eliminarContacto("Elsa Pallo"));
        System.out.println("shouldRemoveContact()");
    }
    
    @Test
    public void shouldNotRemoveContact() {
        assertFalse(this.agenda.eliminarContacto("Bob Marley"));
        System.out.println("shouldNotRemoveContact()");
    }
    
    @Test
    public void shouldNotBeEmpty() {
        assertFalse(this.agenda.isVacia());
        System.out.println("shouldNotBeEmpty()");
    }
    
    @Test
    public void shouldNotBeFull() {
        assertFalse(this.agenda.isLlena());
        System.out.println("shouldNotBeFull()");
    }

}
