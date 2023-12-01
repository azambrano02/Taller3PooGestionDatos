package model;

public class Cliente {
	private String nombre;
	private String rut;
	private String correo;
	private TiendaVehiculos cuentaTienda;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Cliente(String nombre, String rut, String correo) {
		throw new UnsupportedOperationException();
	}

	public void agregarVehiculoCompra(Vehiculo vehiculo) {
		throw new UnsupportedOperationException();
	}
}