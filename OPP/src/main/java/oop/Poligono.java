
package oop;

public abstract class Poligono {
    
    protected int numLados;

    public Poligono(int numLados) {
        this.numLados = numLados;
    }
    
    public abstract double area();

    @Override
    public String toString() {
        return "Poligono{" + "numLados=" + numLados + '}';
    }
    
}
