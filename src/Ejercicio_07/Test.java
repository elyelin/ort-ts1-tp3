package Ejercicio_07;

public class Test {

	public static void carrera(Gato gato, Raton raton, int distancia) {
		boolean pudoAlcanzarlo = gato.alcanzar(raton, distancia);
		if (pudoAlcanzarlo) {
			System.out.println("El gato pudo alcanzar al raton estando a " + distancia);
		} else {
			System.out.println("El gato no pudo alcanzar al raton estando a " + distancia);
		}
	}

	public static void main(String[] args) {

		Gato tom = new Gato(100);
		Raton jerry = new Raton(100);

		carrera(tom, jerry, 10);
		carrera(tom, jerry, 50);
		carrera(tom, jerry, 80);
	}

}
