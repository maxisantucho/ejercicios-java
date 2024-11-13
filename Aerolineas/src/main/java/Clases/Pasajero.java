
package Clases;

public class Pasajero {
    
    private String nombre;
    private int identificacion;

    public Pasajero(String nombre, int identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }
    
    public int getIdentificacion() {
        return identificacion;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "nombre=" + nombre + ", identificacion=" + identificacion + '}';
    }
    
}
