package bd2.model;

public class Sucursal {
    public String nombre;
    public Domicilio domicilio;
    public String puntoVenta;

    public Sucursal() {
    }

    public Sucursal(String nombre, Domicilio domicilio, String puntoVenta) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.puntoVenta = puntoVenta;
    }
}
