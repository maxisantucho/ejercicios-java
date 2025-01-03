package proyecto;

import proyecto.cartas.Carta;
import java.util.ArrayList;
import proyecto.cartas.CartaFigura;
import proyecto.cartas.CartaJoker;
import proyecto.cartas.CartaNum;

public class BarajaInglesa {

    ArrayList<Carta> cartas;

    public BarajaInglesa() {
        this.cartas = new ArrayList<>();
        generarCartas();
    }

    public static void main(String[] args) {
        
        BarajaInglesa baraja = new BarajaInglesa();
        
        baraja.mostrarCartas();

    }

    public void mostrarCartas() {
        for (Carta carta : cartas) {
            carta.darVuelta();
            carta.mostrar();
        }
    }

    private void generarCartas() {
        generarCartasNumerales();
        generarCartasFigura();
        generarCartasJoker();
    }

    public void generarCartasNumerales() {
        Palo[] palos = Palo.values();
        for (int p = 0; p < palos.length; p++) {
            Palo paloAct = palos[p];
            for (int i = 2; i <= 10; i++) {
                cartas.add(new CartaNum(i, paloAct));
            }
        }
    }

    public void generarCartasFigura() {
        char[] letras = {'A', 'J', 'Q', 'K'};
        Palo[] palos = Palo.values();
        for (int p = 0; p < palos.length; p++) {
            Palo paloAct = palos[p];
            for (int i = 0; i < letras.length; i++) {
                char letraAct = letras[i];
                cartas.add(new CartaFigura(letraAct, paloAct));
            }
        }
    }

    public void generarCartasJoker() {
        cartas.add(new CartaJoker(true));
        cartas.add(new CartaJoker(false));
    }

}
