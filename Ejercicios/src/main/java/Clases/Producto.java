
package Clases;

public class Producto {
    
    private static int contador;
    private int id;
    private String nombre;
    private String categoria;
    private double precio;

    public Producto(String nombre, String categoria, double precio) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public boolean encontrarProducto(String nombreProducto) {
        return this.nombre.equalsIgnoreCase(nombreProducto);
    }
    
    boolean bandera = true;
    
    public boolean aplicarDescuento() {
        if(bandera){
            precio -= precio * 10 / 100;
            bandera = false;
        }
        return bandera;
    }

    @Override
    public String toString() {
        if(categoria.equalsIgnoreCase("panaderia")) {
            aplicarDescuento();
            // se aplica un 10% de desc. a la categoria "panaderia"
        }
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + '}';
    }
    
}
