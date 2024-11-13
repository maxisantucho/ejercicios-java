
package Clases;

public class Vuelo {

    private String origen;
    private String destino;
    private String hora;
    private Silla[][] avion = new Silla[8][4];
    private char[][] sillas = new char[8][4];
    private boolean estado = true;
    private int contador;

    public Vuelo(String origen, String destino, String hora) {
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
    }
    
    public boolean validarHora(String horaVuelo) {
        return hora.equalsIgnoreCase(horaVuelo);
    }

    public void llenarMatriz() {
        for (int i = 0; i < sillas.length; i++) {
            for (int j = 0; j < sillas[0].length; j++) {
                sillas[i][j] = '-';
            }
        }
    }

    public void mostrarMatrizX() {
        for (int i = 0; i < sillas.length; i++) {
            for (int j = 0; j < sillas[0].length; j++) {
                System.out.print(" " + sillas[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public boolean validarIdentificacion(int identificacion) {
        boolean resultado = true;
        for (int i = 0; i < avion.length; i++) {
            for (int j = 0; j < avion[0].length; j++) {
                if(sillas[i][j] == 'x' && avion[i][j].solicitarPasajero() == identificacion) {
                    resultado = true;
                } else {
                    resultado = false;
                }
            }
        }
        return resultado;
    }

    public void asignarSillaX(int fila, int columna) {
        sillas[fila][columna] = 'x';
    }

    public void anularSillaX(int fila, int columna) {
        sillas[fila][columna] = '-';
    }

    public void asignarSilla(Silla silla, int fila, int columna) {
        avion[fila][columna] = silla;
    }

    public Silla[][] getAvion() {
        return avion;
    }

    public char[][] getSillas() {
        return sillas;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int contarSillas() {
        int contador = 0;
        for (int i = 0; i < sillas.length; i++) {
            for (int j = 0; j < sillas[i].length; j++) {
                if (sillas[i][j] == 'x') {
                    contador++;
                }
            }
        }
        return contador;
    }

    public boolean estaDisponible() {
        return estado;
    }

    public void terminarVuelo() {
        estado = false;
    }

    public double tiquetesVendidos() {
        int contador = 0;
        for (int i = 0; i < avion.length; i++) {
            for (int j = 0; j < avion[i].length; j++) {
                if (sillas[i][j] == 'x') {
                    contador += avion[i][j].getPrecio();
                }
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "origen=" + origen + ", destino=" + destino + ", hora=" + hora + '}';
    }

}
