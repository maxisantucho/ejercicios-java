package proyecto.cartas;

public abstract class Carta {

    private boolean tapada;

    public Carta() {
        this.tapada = true;
    }

    public void darVuelta() {
        tapada = !tapada;
    }

    public boolean isTapada() {
        return tapada;
    }

    public void mostrar() {
        if (tapada) {
            System.out.println("************");
        } else {
            System.out.println(getRepresentacion());
        }
    }
    
    public abstract String getRepresentacion();

}
