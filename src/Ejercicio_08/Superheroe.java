package Ejercicio_08;

public class Superheroe {
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;

	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		this.setNombre(nombre);
		this.setFuerza(fuerza);
		this.setResistencia(resistencia);
		this.setSuperpoderes(superpoderes);
	}

	public void competir(Superheroe rival) {
		int contador = 0;
		if (this.fuerza > rival.fuerza) {
			contador++;
		}
		if (this.resistencia > rival.resistencia) {
			contador++;
		}
		if (this.superpoderes > rival.superpoderes) {
			contador++;
		}

		switch (contador) {
		case 1:
			System.out.println("DERROTA ");
			break;
		case 2:
			System.out.println("TRIUNFO ");
			break;
		case 3:
			System.out.println("TRIUNFO ");
			break;
		case 0:
			System.out.println("EMPATE ");
			break;
		}
	}

	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private int getFuerza() {
		return fuerza;
	}

	private void setFuerza(int fuerza) {
		if (fuerza < 0) {
			fuerza = 0;
		} else if (fuerza >= 100) {
			fuerza = 100;
		}
		this.fuerza = fuerza;
	}

	private int getResistencia() {
		return resistencia;
	}

	private void setResistencia(int resistencia) {
		if (resistencia < 0) {
			resistencia = 0;
		} else if (resistencia >= 100) {
			resistencia = 100;
		}
		this.resistencia = resistencia;
	}

	private int getSuperpoderes() {
		return superpoderes;
	}

	private void setSuperpoderes(int superpoderes) {
		if (superpoderes < 0) {
			superpoderes = 0;
		} else if (superpoderes >= 100) {
			superpoderes = 100;
		}
		this.superpoderes = superpoderes;
	}

}
