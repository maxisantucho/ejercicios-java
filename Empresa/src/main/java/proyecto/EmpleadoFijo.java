
package proyecto;

public class EmpleadoFijo extends Empleado {
    
    private static final double PORC1 = 0.05;
    private static final double PORC2 = 0.1;
    private static final int FECHA1 = 2;
    private static final int FECHA2 = 5;
    private double sueldoBasico;

    public EmpleadoFijo(String dni, String nombre, String apellido, int fechaIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, fechaIngreso);
        this.sueldoBasico = sueldoBasico;
    }
    
    private double porcentajeAdicional() {
        int antiguedad = antiguedad();
        double porcentaje = 0;
        if(antiguedad > FECHA2) {
            porcentaje = PORC2;
        } else if(antiguedad>= FECHA1) {
            porcentaje = PORC1;
        }
        return porcentaje;
    }

    @Override
    public double calcularSalario() {
        return sueldoBasico + sueldoBasico * porcentajeAdicional();
    }
    
}
