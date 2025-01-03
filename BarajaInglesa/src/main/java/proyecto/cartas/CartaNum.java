
package proyecto.cartas;

import proyecto.Palo;

public class CartaNum extends CartaPalo {
    
    private int numero;

    public CartaNum(int numero, Palo palo) {
        super(palo);
        this.numero = numero;
    }
    
    @Override
    public String getRepresentacion() {
        return numero + super.getRepresentacion();
    }
    
}
