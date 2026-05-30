package bd2.model;

public class Persona {
    public String nombre;
    public String apellido;
    public String dni;
    public Domicilio domicilio;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
    }
}
