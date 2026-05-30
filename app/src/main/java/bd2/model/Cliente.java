package bd2.model;

public class Cliente extends Persona {
    public ObraSocial obraSocial;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String dni, Domicilio domicilio, ObraSocial obraSocial) {
        super(nombre, apellido, dni, domicilio);
        this.obraSocial = obraSocial;
    }
}
