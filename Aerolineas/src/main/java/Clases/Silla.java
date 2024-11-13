
package Clases;

public class Silla {
    
    private String numero;
    private String clase;
    private String ubicacion;
    private double precio;
    private Pasajero pasajero;

    public Silla(String numero, String clase, String ubicacion, double precio, Pasajero pasajero) {
        this.numero = numero;
        this.clase = clase;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.pasajero = pasajero;
    }
    
    public int solicitarPasajero() {
        return pasajero.getIdentificacion();
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Silla{" + "numero=" + numero + ", clase=" + clase + ", ubicacion=" + ubicacion + ", precio=" + precio + ", pasajero=" + pasajero + '}';
    }
    
}
