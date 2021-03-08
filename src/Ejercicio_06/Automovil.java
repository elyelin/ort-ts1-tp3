package Ejercicio_06;

public class Automovil {
	private String marca;
	private String modelo;
	private String patente;
	private double capacidadTanque;
	private double cantidadDeCombustible;
	private double rendimientoPorLitro;

	public Automovil(String marca, String modelo, String patente, double capacidadTanque) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.capacidadTanque = capacidadTanque;
	}

	public boolean cargarCombustible(double cantidad) {
		boolean cargado = false;
		if (cantidad > 0 && cantidad <= this.espacioDisponible()) {
			this.setCantidadDeCombustible(this.getCantidadDeCombustible() + cantidad);
			cargado = true;
		}
		return cargado;
	}

	// private
	public double consumirCombustible(double kilometros) {
		// no entiendo
		double litrosConsumidos = kilometros / this.getRendimientoPorLitro();
		if (litrosConsumidos > this.getCantidadDeCombustible()) {
			litrosConsumidos = this.getCantidadDeCombustible();
		}
		this.setCantidadDeCombustible(this.getCantidadDeCombustible() - litrosConsumidos);
		return litrosConsumidos;
	}

	public double viajar(double kilometros) {
		double kilometrosRealizados = 0;
		double litrosConsumidos;
		if (kilometros > 0) {
			litrosConsumidos = this.consumirCombustible(kilometros);
			kilometrosRealizados = litrosConsumidos * this.getRendimientoPorLitro();
		}
		return kilometrosRealizados;
	}

	// private
	public double espacioDisponible() {
		return this.getCapacidadTanque() - this.getCantidadDeCombustible();
	}

	public boolean pocoCombustible() {
		boolean pocoCombustible = false;
		if (this.getCantidadDeCombustible() * 100 / this.getCapacidadTanque() < 15) {
			pocoCombustible = true;
		}
		return pocoCombustible;
	}

	public String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public double getCapacidadTanque() {
		return capacidadTanque;
	}

	private void setCapacidadTanque(double capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	public double getCantidadDeCombustible() {
		return cantidadDeCombustible;
	}

	private void setCantidadDeCombustible(double cantidadDeCombustible) {
		this.cantidadDeCombustible = cantidadDeCombustible;
	}

	public double getRendimientoPorLitro() {
		return rendimientoPorLitro;
	}

	public void setRendimientoPorLitro(double rendimientoPorLitro) {
		this.rendimientoPorLitro = rendimientoPorLitro;
	}

	@Override
	public String toString() {
		return "Automovil [cantidadDeCombustible=" + this.cantidadDeCombustible + ", capacidadTanque "
				+ this.capacidadTanque + ", marca=" + marca + ", modelo=" + modelo + ", patente=" + patente
				+ ", rendimientoPorLitro=" + this.rendimientoPorLitro + ", pocoCombustible()=" + pocoCombustible()
				+ "]";
	}

}
