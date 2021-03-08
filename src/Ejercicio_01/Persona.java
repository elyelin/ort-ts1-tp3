package Ejercicio_01;

public class Persona {
	private String nombre;
	private String apellido;
	private String direccion;

	public Persona() {
		this.setNombre("");
		this.setApellido("");
		this.setDireccion("");
	}

	/*
	 * public void completarDatos(String nombre, String apellido, String
	 * direccion) { this.nombre = nombre; this.apellido = apellido;
	 * this.direccion = direccion; };
	 * 
	 * public void mostrarPersona(Persona persona) {
	 * System.out.println(persona); };
	 */

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}

}
