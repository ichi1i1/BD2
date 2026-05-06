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
}
