package model;

public abstract class Vehiculo {
	protected Marca marca;
	protected String modelo;
	protected int año;
	protected double peso;
	protected double precio;
	protected int stock;
	protected TiendaVehiculos tiendaVehiculos;

	protected String codigo;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

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

	public void setAño(int año) {
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

	public Vehiculo(Marca marca, String modelo, int año, double peso, double precio, int stock, String codigo) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.peso = peso;
		this.precio = precio;
		this.stock = stock;
		this.codigo = codigo;

	}
	public abstract String toString();
}