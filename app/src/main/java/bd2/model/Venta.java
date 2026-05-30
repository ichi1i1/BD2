package bd2.model;

import java.util.List;

public class Venta {
 public String fecha;

    // Embebidos (desnormalización)
    public Cliente cliente;
    public Empleado cajero;
    public Empleado despachante;
    public Sucursal sucursal;

    // Lista de productos vendidos
    public List<DetalleProducto> productos;

    public double total;

    public Venta() {
    }

    public Venta(String fecha, Cliente cliente, Empleado cajero, Empleado despachante, Sucursal sucursal, List<DetalleProducto> productos, double total) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.cajero = cajero;
        this.despachante = despachante;
        this.sucursal = sucursal;
        this.productos = productos;
        this.total = total;
    }
}
