package Ejercicio_02;

public class Cuadrado {
	private int lado;

	public Cuadrado(int lado) {
		this.lado = lado;
	}

	public int getLado() {
		return this.lado;
	}

	public void setLado(int lado) {
		System.out.println("Se cambio el temaño del cuadrado a " + lado + " por lado");
		this.lado = lado;
	}

	public int perimetro() {
		int perim;
		perim = lado * 4;
		return perim;
	}

	public int superficie() {
		int sup;
		sup = lado * lado;
		return sup;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", perimetro()=" + perimetro() + ", superficie()=" + superficie() + "]";
	}

}
