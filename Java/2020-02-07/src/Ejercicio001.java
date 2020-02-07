
public class Ejercicio001 {
	
	public static void main(String[] args) {
		Password contrasena = new Password(15);
		contrasena.generarPassword();
		System.out.println(contrasena.getPassword());
		
		contrasena.setLongitud(21);
		contrasena.generarPassword();
		System.out.println(contrasena.getPassword());
	}

}
