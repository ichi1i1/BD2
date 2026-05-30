package bd2.model;

public class Empleado extends Persona {
    public int cuil; 
    public String tipo;   

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String dni, Domicilio domicilio, int cuil, String tipo) {
        super(nombre, apellido, dni, domicilio);
        this.cuil = cuil;
        this.tipo = tipo;
    }
}
