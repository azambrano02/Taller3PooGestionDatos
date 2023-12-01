package model;

public class Automovil extends Vehiculo {
	private int numPuertas;
	private int tamañoMotor;
	private double caballosFuerza;

	public int getNumPuertas() {
		return this.numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getTamañoMotor() {
		return this.tamañoMotor;
	}

	public void setTama�oMotor(int tamañoMotor) {
		this.tamañoMotor = tamañoMotor;
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