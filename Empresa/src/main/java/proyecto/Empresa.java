
package proyecto;

import java.util.ArrayList;

public class Empresa {
    
    ArrayList<Empleado> empleados;
    
    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public static void main(String[] args) {
        
        Empresa e = new Empresa();
        
        e.agregarEmpleado(new EmpleadoFijo("123", "Ana", "Lopez", 2021, 45000));
        e.agregarEmpleado(new EmpleadoComision("123", "Pepe", "Gomez", 2021, 30000, 100, 500));
        e.agregarEmpleado(new EmpleadoFijo("123", "Luis", "Perez", 2019, 50000));
        e.agregarEmpleado(new EmpleadoComision("123", "Leo", "Torres", 2017, 30000, 200, 100));
        e.agregarEmpleado(new EmpleadoFijo("123", "Maria", "Perez", 2014, 100000));
        
        e.mostrarSalarios();
        
        Empleado empleadoMasClientes = e.empleadosConMasClientes();
        
        System.out.println("El empleado con mas clientes es: " + empleadoMasClientes.nombreCompleto());
        
    }
    
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }
    
    public void mostrarSalarios() {
        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.nombreCompleto());
            System.out.println("Salario: " + empleado.calcularSalario() + "$");
            System.out.println("");
        }
    }
    
    public Empleado empleadosConMasClientes() {
        int maximo = Integer.MIN_VALUE;
        Empleado masClientes = null;
        for (Empleado empleado : empleados) {
            if(empleado instanceof EmpleadoComision) {
                EmpleadoComision epc = (EmpleadoComision) empleado;
                int cantidad = epc.getNumClientes();
                if(cantidad > maximo) {
                    maximo = cantidad;
                    masClientes = epc;
                }
            }
        }
        return masClientes;
    }
    
}
