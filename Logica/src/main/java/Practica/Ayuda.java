
package Practica;

public class Ayuda {
    
    private char letra;
    
    public Ayuda(char valor) {
        this.letra = valor;
    }
    
    public char getChar(){
        return letra;
    }
    
    public int getCharNum() {
        return letra;
    }
    
    public void sumar(int num) {
        letra = (char) (letra + num);
    }
    
}
