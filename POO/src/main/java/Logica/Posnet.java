
package Logica;

public class Posnet {
    
    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTA = 1;
    public static final int MAX_CANT_CUOTA = 6;
    
    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuotas) {
        Ticket ticket = null;
        if(datosValidos(tarjeta, montoAAbonar, cantCuotas)) {
            double montoFinal = montoAAbonar + montoAAbonar * recargoSegunCuotas(cantCuotas);
            if(tarjeta.tieneSaldo(montoFinal)) {
                tarjeta.descontar(montoFinal);
                String nomApe = tarjeta.nomApe();
                double montoPorCuota = montoFinal / cantCuotas;
                ticket = new Ticket(nomApe, montoFinal, montoPorCuota);
            }
        }
        return ticket;
    }
    
    private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cant) {
        boolean tarjetaValida = tarjeta != null;
        boolean montoValido = monto > 0;
        boolean cantValidas = cant >= MIN_CANT_CUOTA && cant < MAX_CANT_CUOTA;
        return tarjetaValida && montoValido && cantValidas;
    }
    
    public double recargoSegunCuotas(int cantCuotas) {
        return (cantCuotas - 1) * RECARGO_POR_CUOTA;
    }
    
}
