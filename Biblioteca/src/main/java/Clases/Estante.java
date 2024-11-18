
package Clases;

import java.util.ArrayList;

public class Estante {
    
    private String nombreEstante;
    private ArrayList<Libro> libros = new ArrayList<>();

    public Estante(String nombreEstante) {
        this.nombreEstante = nombreEstante;
    }
    
}
