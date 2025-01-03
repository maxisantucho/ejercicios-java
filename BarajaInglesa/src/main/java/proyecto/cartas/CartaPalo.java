
package proyecto.cartas;

import proyecto.Palo;

public abstract class CartaPalo extends Carta {
    
    private Palo palo;

    public CartaPalo(Palo palo) {
        this.palo = palo;
    }
    
    @Override
    public String getRepresentacion() {
        return " de " + palo;
    }
    
}
