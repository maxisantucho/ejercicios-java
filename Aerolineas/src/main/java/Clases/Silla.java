
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
    
    public String asignarNumero(int fila, int columna) {
        String[] columnas = {"A", "B", "C", "D"};
        String[] filas = {"1", "2", "3", "4", "5", "6", "7", "8"};
        numero = columnas[columna] + filas[fila];
        return numero;
    }
    
    public String asignasClase(int fila, int columna) {
        int i = 0;
        while(i <= fila) {
            int j = 0;
            while (j <= columna) {
                if(i < 3 && j < 4) {
                    clase = "Ejecutivo";
                } else {
                    clase = "Turista";
                }
                j++;
            }
            i++;
        }
        return clase;
    }
    
    public String asignarUbicacion(int columna) {
        if(columna == 0 || columna == 3) {
            ubicacion = "Ventana";
        } else {
            ubicacion = "Pasillo";
        }
        return ubicacion;
    }
    
    public double asignarPrecio() {
        if(clase.equalsIgnoreCase("ejecutivo") && ubicacion.equalsIgnoreCase("ventana")) {
            precio = 40000;
        }
        if(clase.equalsIgnoreCase("ejecutivo") && ubicacion.equalsIgnoreCase("pasillo")) {
            precio = 30000;
        }
        if(clase.equalsIgnoreCase("turista") && ubicacion.equalsIgnoreCase("ventana")) {
            precio = 25000;
        }
        if(clase.equalsIgnoreCase("turista") && ubicacion.equalsIgnoreCase("pasillo")) {
            precio = 20000;
        }
        return precio;
    }

    public Pasajero getPasajero() {
        return pasajero;
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
