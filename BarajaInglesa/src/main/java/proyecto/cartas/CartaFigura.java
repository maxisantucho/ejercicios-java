
package proyecto.cartas;

import proyecto.Palo;

public class CartaFigura extends CartaPalo{
    
    private char letra;

    public CartaFigura(char letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }
    
    @Override
    public String getRepresentacion() {
        return letra + super.getRepresentacion();
    }
    
}
