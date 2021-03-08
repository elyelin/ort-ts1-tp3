package Ejercicio_04;

public class Cafetera {
	static private final int CAPACIDAD_MAX_INICIAL = 10000;
	static private final int CAPACIDAD_MAX_MINIMA = 250;
	static private final int MINIMO = 0;
	// static: atributo compartido por todas las instancias de cafetera
	// final: el valor no se puede modificar

	private int capacidadMaxima;
	private int cantidadActual;

	public Cafetera() {
		setCapacidadMaxima(CAPACIDAD_MAX_INICIAL);
		setCantidadActual(MINIMO);
	}

	public Cafetera(int capacidadMaxima) {
		// why ?????
		setCapacidadMaxima(capacidadMaxima);
		setCantidadActual(MINIMO);
	}

	public Cafetera(int capacidadMaxima, int cantidadActual) {
		setCapacidadMaxima(capacidadMaxima);
		setCantidadActual(cantidadActual);
	}

	public int llenar() {
		cantidadActual = capacidadMaxima;
		return cantidadActual;
	}

	public int servirTaza(int capacidadTaza) {
		if (capacidadTaza < cantidadActual) {
			cantidadActual -= capacidadTaza;
			System.out.println("Se sirvio una taza de cafe ");
		} else {
			System.out.println("No se puedo servir");
		}
		return capacidadTaza;
	}

	// int agregarCafe(int cafeAgregado)

	public void vaciar() {
		setCantidadActual(MINIMO);
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	private void setCapacidadMaxima(int capacidadMaxima) {
		if (capacidadMaxima < CAPACIDAD_MAX_MINIMA) {
			capacidadMaxima = CAPACIDAD_MAX_MINIMA;
		}
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	private void setCantidadActual(int cantidadActual) {
		if (cantidadActual < MINIMO) {
			cantidadActual = MINIMO;
		} else if (cantidadActual > capacidadMaxima) {
			cantidadActual = capacidadMaxima;
		}
		this.cantidadActual = cantidadActual;
	}

	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}
}
