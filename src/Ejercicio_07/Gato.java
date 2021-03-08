package Ejercicio_07;

public class Gato {
	private final int ENERGIA_POR_METRO = 1;
	private int energia;

	public Gato(int energia) {
		this.setEnergia(energia);
	}

	public int correr() {
		return this.energia / this.ENERGIA_POR_METRO;
	}

	public boolean alcanzar(Raton raton, int distancia) {
		boolean pudoAlcanzarlo = false;

		if (this.correr() - raton.correr() >= distancia) {
			pudoAlcanzarlo = true;
		}
		return pudoAlcanzarlo;
	}

	@Override
	public String toString() {
		return "Gato [energia=" + energia + "]";
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
}
