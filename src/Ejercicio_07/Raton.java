package Ejercicio_07;

public class Raton {
	private final int ENERGIA_POR_METRO = 2;
	private int energia;

	public Raton(int energia) {
		this.energia = energia;
	}

	public int correr() {
		return this.energia / this.ENERGIA_POR_METRO;
	}

	@Override
	public String toString() {
		return "Raton [energia=" + energia + "]";
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
}
