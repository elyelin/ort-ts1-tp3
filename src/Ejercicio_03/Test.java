package Ejercicio_03;

public class Test {

	public static void main(String[] args) {
		TarjetaDeCredito visa = new TarjetaDeCredito("4145414122221111", "Juan Perez", 10000);

		System.out.println(visa);
		visa.realizarCompra(4000);
		System.out.println(visa);
		visa.actualizarLimite(3000);
		visa.realizarCompra(4000);
		System.out.println(visa);
	}

}
