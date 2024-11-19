
package Clases;

public class Libro {
    
    private String isbn;
    private String titulo;
    private boolean prestado;

    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
    }
    
    public void cambiarEstado() {
        prestado = true; 
    }

    public boolean isPrestado() {
        return prestado;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        String estado = "Disponible";
        if(prestado) {
            estado = "No disponible";
        }
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", estado=" + estado + '}';
    }
    
}
