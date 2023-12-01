package model;

public class Motocicleta extends Vehiculo {
	private String tipoMotor;
	private String suspencion;
	private double caballosFuerza;

	public String getTipoMotor() {
		return this.tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getSuspencion() {
		return this.suspencion;
	}

	public void setSuspencion(String suspencion) {
		this.suspencion = suspencion;
	}

	public double getCaballosFuerza() {
		return this.caballosFuerza;
	}

	public void setCaballosFuerza(double caballosFuerza) {
		this.caballosFuerza = caballosFuerza;
	}

	public double velocidadMaxima(double caballosFuerza, double peso) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}
}