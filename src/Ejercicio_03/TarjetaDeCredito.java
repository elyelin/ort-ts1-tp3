package Ejercicio_03;

public class TarjetaDeCredito {
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;

	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		this.setNumero(numero);
		this.setTitular(titular);
		this.setLimiteDeCompra(limiteDeCompra);
		this.acumuladoActual = 0;
	}

	public double montoDisponible() {
		double diferencia = limiteDeCompra - acumuladoActual;
		if (diferencia < 0) {
			diferencia = 0;
		}
		return diferencia;
	}

	private boolean compraPosible(double montoCompra) {
		return montoCompra <= montoDisponible();
	}

	public void actualizarLimite(double limiteNuevo) {
		setLimiteDeCompra(limiteNuevo);
	}

	private void acumularGastoActual(double importeCompra) {
		this.acumuladoActual += importeCompra;
	}

	public boolean realizarCompra(double montoCompra) {
		boolean compraRealizada = compraPosible(montoCompra);
		if (compraRealizada) {
			acumularGastoActual(montoCompra);
		}
		return compraRealizada;
	}

	public String getTitular() {
		return titular;
	}

	private void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumero() {
		return numero;
	}

	private void setNumero(String numero) {
		this.numero = numero;
	}

	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}

	private void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}

	public double getAcumuladoActual() {
		return acumuladoActual;
	}

	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteDeCompra=" + limiteDeCompra
				+ ", acumuladoActual=" + acumuladoActual + " montoDisponible:  " + montoDisponible() + "]";
	}

}
