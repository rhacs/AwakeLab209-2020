package cl.awakelab.agenda.contacto;

public class Familiar extends Contacto {

    public Familiar(String nombre, String numero) {
        super(nombre, numero);
    }

    @Override
    public String getTipo() {
        return "Familiar";
    }

}
