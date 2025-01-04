
package proyecto;

import java.time.LocalDate;

public abstract class Empleado {
    
    private String dni;
    private String nombre;
    private String apellido;
    private int fechaIngreso;

    public Empleado(String dni, String nombre, String apellido, int fechaIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
    }
    
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public int antiguedad() {
        //int fechaActual = LocalDate.now().getYear();
        return 2022 - fechaIngreso;
    }
    
    public abstract double calcularSalario();
    
}
