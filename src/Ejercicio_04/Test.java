package Ejercicio_04;

public class Test {

	public static void main(String[] args) {
		Cafetera cafetera1 = new Cafetera();
		Cafetera cafetera2 = new Cafetera(200);
		Cafetera cafetera = new Cafetera(500, 700);
		System.out.println(cafetera1);
		System.out.println(cafetera2);
		System.out.println(cafetera);

		// cafetera.setCapacidadMaxima(257);
		// System.out.println(" llenar " + cafetera.llenar());
		// cafetera.servirTaza(500);
		/*
		 * System.out.println(cafetera); cafetera.vaciar();
		 * System.out.println(cafetera);
		 */

	}

}
