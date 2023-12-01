package model;

public class Automovil extends Vehiculo {
	private int numPuertas;
	private int tamañoMotor;
	private double caballosFuerza;

	public Automovil(Marca marca, String modelo, int año, double peso, double precio, int stock, String codigo,int numPuertas,int tamañoMotor , double caballosFuerza){
		super(marca, modelo, año, peso, precio, stock, codigo);
		this.numPuertas = numPuertas;
		this.tamañoMotor = tamañoMotor;
		this.caballosFuerza = caballosFuerza;
	}
	public int getNumPuertas() {
		return this.numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getTamañoMotor() {
		return this.tamañoMotor;
	}

	public void setTamañoMotor(int tamañoMotor) {
		this.tamañoMotor = tamañoMotor;
	}

	public double getCaballosFuerza() {
		return this.caballosFuerza;
	}

	public void setCaballosFuerza(double caballosFuerza) {
		this.caballosFuerza = caballosFuerza;
	}

	public double velocidadMaxima(double caballosFuerza, double peso) {
		return (caballosFuerza / peso) * 10;
	}

	public String toString() {
		return marca+modelo+año+peso+precio+stock+numPuertas+tamañoMotor+caballosFuerza;
	}
}