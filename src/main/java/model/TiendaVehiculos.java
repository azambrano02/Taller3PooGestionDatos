package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import model.Vehiculo;
import model.Cliente;

public class TiendaVehiculos {
	private Date fechaCompra;
	private List<Vehiculo> vehiculos;
	private List<Cliente> clientes;

	public Date getFechaCompra() {
		return this.fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public TiendaVehiculos(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
		this.vehiculos = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public Vehiculo bucarVehiculoMarca(Marca marca) {
		throw new UnsupportedOperationException();
	}

	public Vehiculo buscarVehiculoModelo(String modelo) {
		for (Vehiculo vehiculo : this.vehiculos) {
			if (vehiculo.getModelo().equals(modelo))
				return vehiculo;
		}
		return null;
	}

	public Vehiculo buscarVehiculoTipo(Automovil automovil, Motocicleta motocicleta, Modelo modelo) {

		}
	}

	public boolean agregarVehiculo(Vehiculo vehiculo) {
		if (!vehiculoExiste(vehiculo)) {
			this.vehiculos.add(vehiculo);
			return true;
		} else {
			return false;
		}
	}
	public boolean vehiculoExiste(Vehiculo vehiculo){
		for(Vehiculo v : this.vehiculos) {
			if(vehiculo.getCodigo().equals(v.getCodigo())) {
				return true;
			}
		}

		return false;
	}
	public boolean agregarCliente(Cliente cliente) {
		if (!clienteExiste(cliente)) {
			this.clientes.add(cliente);
			return true;
		} else {
			return false;
		}
	}
	public boolean clienteExiste(Cliente cliente){
		for(Cliente c : this.clientes) {
			if(cliente.getRut().equals(c.getRut())) {
				return true;
			}
		}

		return false;
	}

	public void agregarCompra(List<Vehiculo> vehiculos, Cliente cliente, Date fechaCompra) {
		Compra nuevacompra = new Compra(vehiculos,cliente,fechaCompra);
	}
}