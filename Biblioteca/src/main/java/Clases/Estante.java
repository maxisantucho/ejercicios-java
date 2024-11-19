
package Clases;

import java.util.ArrayList;

public class Estante {
    
    private String nombreEstante;
    private ArrayList<Libro> libros = new ArrayList<>();

    public Estante(String nombreEstante) {
        this.nombreEstante = nombreEstante;
    }
    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public String getNombreEstante() {
        return nombreEstante;
    }
    
    public void mostrarLibros() {
        for (int i = 0; i < libros.size(); i++) {
            System.out.println(libros.get(i));
        }
    }
    
    public boolean buscarIsbn(String isbn) {
        int i = 0;
        boolean bandera = false;
        while(i < libros.size() && !bandera) {
            if(libros.get(i).getIsbn().equalsIgnoreCase(isbn)) {
                bandera = true;
            }
            i++;
        }
        return bandera;
    }
    
    public void prestarLibro(String isbn) {
        int i = 0;
        boolean bandera = true;
        while(i < libros.size() && bandera) {
            if(libros.get(i).getIsbn().equalsIgnoreCase(isbn)) {
                libros.get(i).cambiarEstado();
                bandera = false;
            }
            i++;
        }
    }
    
    public int contadorLibros() {
        int contador = 0;
        for (Libro libro : libros) {
            if(libro.isPrestado()) {
                contador++;
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        return "Estante{" + "nombreEstante=" + nombreEstante + '}';
    }
    
}
