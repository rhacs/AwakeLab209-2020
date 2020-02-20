package cl.awakelab.agenda.contacto;

public class Amistad extends Contacto {

    public Amistad(String nombre, String numero) {
        super(nombre, numero);
    }

    @Override
    public String getTipo() {
        return "Amistad";
    }

}
