
package proyecto;

public class Producto {
    
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void registrarVenta(int cantidadVenta) {
        cantidad -= cantidadVenta;
    }
    
    public void agregarInventario(int cantidadProducto) {
        if(cantidadProducto > 0) {
            cantidad += cantidadProducto;
        } else {
            System.out.println("Alguno de los datos ingresados no es correcto.");
        }
    }

    @Override
    public String toString() {
        String enStock = "sin stock";
        if(cantidad > 0) {
            enStock = "en stock";
        }
        return "{'nombre':'" + nombre + "', 'precio':'" + precio + "', 'cantidad':'" + cantidad + "', 'estado':'" + enStock + "'}";
    }
    
}
