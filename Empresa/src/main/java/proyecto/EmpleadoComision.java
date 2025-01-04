
package proyecto;

public class EmpleadoComision extends Empleado {
    
    private double salarioMinimo;
    private int numClientes;
    private double montoPorCliente;

    public EmpleadoComision(String dni, String nombre, String apellido, int fechaIngreso, double salarioMinimo, int numClientes, double montoPorCliente) {
        super(dni, nombre, apellido, fechaIngreso);
        this.salarioMinimo = salarioMinimo;
        this.numClientes = numClientes;
        this.montoPorCliente = montoPorCliente;
    }

    public int getNumClientes() {
        return numClientes;
    }

    @Override
    public double calcularSalario() {
        double salario = numClientes * montoPorCliente;
        if(salario < salarioMinimo) {
            salario = salarioMinimo;
        }
        return salario;
    }
    
}
