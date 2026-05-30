package bd2.model;

public class DetalleProducto {
    public Producto producto;
    public int cantidad;
    public double precioUnitario;

    public DetalleProducto() {
    }

    public DetalleProducto(Producto producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
}
