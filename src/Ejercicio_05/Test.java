package Ejercicio_05;

public class Test {

	public static void estadoInicial(Hotel hotel) {
		System.out.println("Estado inicial del hotel " + hotel.getNombre() + " (" + hotel.getLocalidad() + ")");
		System.out.println(hotel);
	}

	public static void probarAccion(String accion, Hotel hotel, int cantidad, boolean conReserva) {
		String conReservaString = "con";
		String pudeAccionar = "ude " + accion + " las habitaciones requeridas";
		boolean pude = false;

		if (accion.equals("ocupar")) {
			if (!conReserva) {
				conReservaString = "sin";
			}
			conReservaString = conReservaString + " reserva";
		} else {
			conReservaString = "";
		}
		System.out.println("Intento " + accion + " " + cantidad + " habitaciones " + conReservaString);

		switch (accion) {
		case "ocupar":
			pude = hotel.ocuparHabitaciones(cantidad, conReserva);
			break;
		case "reservar":
			pude = hotel.reservarHabitaciones(cantidad);
			break;
		case "liberar":
			pude = hotel.desocuparHabitaciones(cantidad);
			break;
		}
		if (pude) {
			pudeAccionar = "p" + pudeAccionar;
		} else {
			pudeAccionar = "No p" + pudeAccionar;
		}
		System.out.println(pudeAccionar);
		System.out.println(hotel);
	}

	public static void main(String[] args) {
		Hotel hotel1 = new Hotel("Hilton", "CABA", 200);

		estadoInicial(hotel1);
		probarAccion("ocupar", hotel1, 201, false);
		probarAccion("ocupar", hotel1, 30, false);
		probarAccion("reservar", hotel1, 50, false);
		probarAccion("liberar", hotel1, 200, false);
		probarAccion("ocupar", hotel1, 30, true);
		probarAccion("liberar", hotel1, 40, false);

	}

}
