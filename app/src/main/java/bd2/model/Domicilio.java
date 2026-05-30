package bd2.model;

public class Domicilio {
    public String calle;
    public int numero;
    public String localidad;
    public String provincia;

    public Domicilio() {
    }

    public Domicilio(String calle, int numero, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }
}
