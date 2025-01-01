
package proyecto;

public class Empleado {
    
    private String nombre;
    private int cantidadProductos;
    private double ventasRegistradas;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public double getVentasRegistradas() {
        return ventasRegistradas;
    }
    
    public void registrarVenta(int cantidad, double precio) {
        ventasRegistradas = precio * cantidad;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void aumentarCantidad(int cantidad) {
        cantidadProductos += cantidad;
    }

    @Override
    public String toString() {
        return "{'nombre':'" + nombre + "', 'cantidadProductos':'" + cantidadProductos + "'}";
    }
    
}
