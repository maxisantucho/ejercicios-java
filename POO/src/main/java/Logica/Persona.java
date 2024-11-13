
package Logica;

public class Persona {
    
    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Persona(String DNI, String nombre, String apellido, String telefono, String email) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }
    
    public String nombreApellido() {
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
}
