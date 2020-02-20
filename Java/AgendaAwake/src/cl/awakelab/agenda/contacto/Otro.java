package cl.awakelab.agenda.contacto;

public class Otro extends Contacto {

    public Otro(String nombre, String numero) {
        super(nombre, numero);
    }

    @Override
    public String getTipo() {
        return "Otro";
    }

}
