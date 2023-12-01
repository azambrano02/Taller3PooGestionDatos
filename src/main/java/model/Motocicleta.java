package model;

public class Motocicleta extends Vehiculo {
	private String tipoMotor;
	private String suspencion;
	private double caballosFuerza;

	public Motocicleta(Marca marca, String modelo, int año, double peso, double precio,String codigo, int stock, String tipoMotor, String suspencion, double caballosFuerza){
		super(marca, modelo, año, peso, precio, stock, codigo);
		this.tipoMotor = tipoMotor;
		this.suspencion = suspencion;
		this.caballosFuerza = caballosFuerza;
	}
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
		return ((caballosFuerza * 2) / peso) * 20;
	}

	public String toString() {
		return marca+modelo+año+peso+precio+stock+tipoMotor+suspencion+caballosFuerza;
	}
}