package model;

public abstract class Vehiculo {
	private Marca marca;
	private String modelo;
	private int año;
	private double peso;
	private double precio;
	private int stock;
	private TiendaVehiculos tiendaVehiculos;
	public Marca unnamed_Marca_;

	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return this.año;
	}

	public void setA�o(int año) {
		this.año = año;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Vehiculo(Marca marca, String modelo, int año, double peso, double precio, int stock) {
		throw new UnsupportedOperationException();
	}

	public abstract String toString();
}