package Ejercicio_06;

public class Test {
	public static Automovil crearAuto(String marca, String modelo, String patente, double capacidadTanque) {
		Automovil auto = new Automovil(marca, modelo, patente, capacidadTanque);
		System.out.println(auto);
		return auto;
	}

	public static void setearRendimiento(Automovil auto, double rendimiento) {
		System.out.println("Seteo el rendimiento por litro en " + rendimiento + " (km)");
		auto.setRendimientoPorLitro(rendimiento);
		System.out.println(auto);
	}

	public static void cargarCombustible(Automovil auto, double cantidad) {
		System.out.println("Cargo " + cantidad + " litros de combustible");
		if (!auto.cargarCombustible(cantidad)) {
			System.out.println("No se pudo cargar");
		}
		System.out.println(auto);
	}

	public static void viajar(Automovil auto, double kilometros) {
		double kilometrosRecorridos = auto.viajar(kilometros);
		System.out.println("Intento recorrer " + kilometros + " kilometros y recorri " + kilometrosRecorridos);
		System.out.println(auto);
	}

	public static void main(String[] args) {
		Automovil auto1 = crearAuto("Ford", "Fiesta", "ABOE45", 40);
		setearRendimiento(auto1, 10);
		cargarCombustible(auto1, 20);
		viajar(auto1, 180);
		viajar(auto1, 50);
	}

}
