package Ejercicio_08;

public class Test {

	public static void main(String[] args) {
		Superheroe super1 = new Superheroe("Batman", 90, 70, 0);
		Superheroe super2 = new Superheroe("Superman", 95, 60, 70);
		Superheroe super3 = new Superheroe("Sup", 50, 20, 30);
		Superheroe super4 = new Superheroe("man", 50, 20, 30);
		;
		super1.competir(super2);
		super2.competir(super1);
		System.out.println("-");
		super3.competir(super4);
		super4.competir(super3);

	}

}
