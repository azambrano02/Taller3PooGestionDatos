package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import model.Vehiculo;
import model.Cliente;

public class TiendaVehiculos {
	private Date fechaCompra;
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public Date getFechaCompra() {
		return this.fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public TiendaVehiculos(Date fechaCompra) {
		throw new UnsupportedOperationException();
	}

	public Vehiculo bucarVehiculoMarca(Marca marca) {
		throw new UnsupportedOperationException();
	}

	public Vehiculo buscarVehiculoModelo(String modelo) {
		throw new UnsupportedOperationException();
	}

	public Vehiculo buscarVehiculoTipo(Automovil automovil, Motocicleta motocicleta) {
		throw new UnsupportedOperationException();
	}

	public void compra(List<Vehiculo> vehiculos, Cliente cliente, Date fechaCompra) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarCliente(Cliente cliente) {
		throw new UnsupportedOperationException();
	}
}