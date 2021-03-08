package Ejercicio_01;

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		completarDatos(persona1, "Diego", "Diaz", "Yatay 240");
		mostrarPersona(persona1);
		System.out.println("nombre: " + persona1.getNombre());
		System.out.println("apellido: " + persona1.getApellido());
		System.out.println("direccion: " + persona1.getDireccion());

		completarDatos(persona2, "Pablo", "Gomez", "Av del Libertador 6796");
		mostrarPersona(persona2);
		System.out.println("nombre: " + persona2.getNombre());
		System.out.println("apellido: " + persona2.getApellido());
		System.out.println("direccion: " + persona2.getDireccion());

	}

	public static void completarDatos(Persona persona, String nombre, String apellido, String direccion) {
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		persona.setDireccion(direccion);
	};

	public static void mostrarPersona(Persona persona) {
		System.out.println(persona);
	};

}
