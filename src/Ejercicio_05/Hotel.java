package Ejercicio_05;

public class Hotel {
	private String nombre;
	private String localidad;
	private int habitacionesTotales;
	private int habitacionesOcupadas;
	private int habitacionesReservadas;

	public Hotel(String nombre, String localidad, int habitacionesTotales) {
		this(nombre, localidad, habitacionesTotales, 0, 0);
	}

	public Hotel(String nombre, String localidad, int habitacionesTotales, int habitacionesOcupadas,
			int habitacionesReservadas) {
		this.nombre = nombre;
		this.localidad = localidad;
		this.setHabitacionesTotales(habitacionesTotales);
		this.habitacionesOcupadas = habitacionesOcupadas;
		this.setHabitacionesReservadas(habitacionesReservadas);
	}

	public boolean reservarHabitaciones(int cantidad) {
		boolean reservado = false;
		if (cantidad <= this.disponibilidad()) {
			reservado = true;
			this.habitacionesReservadas += cantidad;

		} else {
			System.out.println("No se pudo completar la accion");
		}
		return reservado;
	}

	private void ocuparSinReserva(int cantidad) {
		this.habitacionesOcupadas += cantidad;
	}

	private void ocuparConReserva(int cantidad) {
		this.habitacionesReservadas -= cantidad;
		this.habitacionesOcupadas += cantidad;
	}

	public boolean ocuparHabitaciones(int cantidad, boolean conReserva) {
		boolean pudoOcupar = false;
		if (conReserva) {
			if (cantidad <= this.habitacionesReservadas && cantidad <= this.cantidadHabitacionesLibres()) {
				this.ocuparConReserva(cantidad);
				pudoOcupar = true;
			}
		} else {
			if (cantidad <= this.disponibilidad()) {
				this.ocuparSinReserva(cantidad);
				pudoOcupar = true;
			}
		}
		return pudoOcupar;
	}

	public boolean desocuparHabitaciones(int cantidad) {
		boolean desocupar = false;
		if (cantidad <= this.habitacionesOcupadas) {
			desocupar = true;
			this.habitacionesOcupadas -= cantidad;
		} else {
			System.out.println("No se pudo completar");
		}
		return desocupar;
	}

	public int cantidadHabitacionesLibres() {
		// int libres = habitacionesTotales - habitacionesOcupadas;
		// System.out.println("Las habitaciones libres son: " + libres);
		return this.habitacionesTotales - this.habitacionesOcupadas;
	}

	public int disponibilidad() {
		// int disponibles = habitacionesTotales - habitacionesOcupadas -
		// habitacionesReservadas;
		// System.out.println("Habitaciones disponibles: " + disponibles);
		return this.habitacionesTotales - (this.habitacionesOcupadas + this.habitacionesReservadas);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	private void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getLocalidad() {
		return localidad;
	}

	private void setHabitacionesTotales(int habitacionesTotales) {
		if (habitacionesTotales < 1) {
			habitacionesTotales = 1;
		}
		this.habitacionesTotales = habitacionesTotales;
	}

	public int getHabitacionesTotales() {
		return habitacionesTotales;
	}

	private void setHabitacionesOcupadas(int habitacionesOcupadas) {
		this.habitacionesOcupadas = habitacionesOcupadas;
	}

	public int getHabitacionesOcupadas() {
		return habitacionesOcupadas;
	}

	private void setHabitacionesReservadas(int habitacionesReservadas) {
		if (habitacionesReservadas < 0) {
			habitacionesReservadas = 0;
		}
		if (habitacionesReservadas > this.cantidadHabitacionesLibres()) {
			habitacionesReservadas = this.cantidadHabitacionesLibres();
		}
		this.habitacionesReservadas = habitacionesReservadas;
	}

	public int getHabitacionesReservadas() {
		return habitacionesReservadas;
	}

	@Override
	public String toString() {
		return String.format("Hotel %s %s [habitaciones=%d, ocupadas=%d, reservadas=%d, libres=%d, disponibles=%d]",
				nombre, localidad, habitacionesTotales, habitacionesOcupadas, habitacionesReservadas,
				cantidadHabitacionesLibres(), disponibilidad());
	}

}
