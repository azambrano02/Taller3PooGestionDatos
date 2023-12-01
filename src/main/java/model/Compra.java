package model;

import java.sql.Date;
import java.util.List;

public class Compra {

    private  List<Vehiculo> vehiculos;
    private Cliente cliente;
    private Date fechacCompra;
    public Date getFechacCompra() {
        return fechacCompra;
    }

    public void setFechacCompra(Date fechacCompra) {
        this.fechacCompra = fechacCompra;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Compra(List<Vehiculo> vehiculos, Cliente cliente, Date fechacCompra) {
        this.vehiculos = vehiculos;
        this.cliente = cliente;
        this.fechacCompra = fechacCompra;
    }

    public void compra(List<Vehiculo> vehiculos, Cliente cliente, Date fechaCompra) {
        throw new UnsupportedOperationException();
    }
}
