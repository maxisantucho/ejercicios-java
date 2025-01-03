
package proyecto;

public enum Palo {
    
    PICA(Color.ROJO),
    CORAZON(Color.ROJO),
    DIAMANTE(Color.NEGRO),
    TREBOL(Color.NEGRO);
    
    private Color color;
    
    private Palo(Color co) {
        this.color = co;
    }
    
}
