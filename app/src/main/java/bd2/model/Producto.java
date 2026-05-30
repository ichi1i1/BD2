package bd2.model;

public class Producto {
    public String nombre;
    public String tipo;
    public double precio;
    public int codigo;
    public int stock;

    public Producto() {
    }

    public Producto(String nombre, String tipo, double precio, int codigo, int stock) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.codigo = codigo;
        this.stock = stock;
    }
}
