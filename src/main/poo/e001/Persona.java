package main.poo.e001;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int anioNacimiento;

    public Persona(String nombre, String apellido, String dni, int anioNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.anioNacimiento = anioNacimiento;
    }

    @Override
    public String toString() {
        return "Persona {" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                '}';
    }
}
