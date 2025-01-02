
package oop;

public class Rectangulo extends Poligono {
    
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2, int numLados) {
        super(numLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}' + "\n" + super.toString();
    }
    
}
