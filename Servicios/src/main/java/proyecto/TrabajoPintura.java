
package proyecto;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {
    
    private double superficie;
    private double precioPintura;

    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    @Override
    public double costeMaterial() {
        return (superficie / 7.8) * precioPintura;
    }

    @Override
    public double costeManoObra() {
        return (superficie / 10.0) * 9.5;
    }
    
    public double costeAdicional() {
        if(superficie < 50) {
            return (costeMaterial() + costeManoObra()) * 0.15;
        } else {
            return 0;
        }
    }

    @Override
    public double costeTotal() {
        double total = costeMaterial() + costeManoObra()+ costeAdicional();
        
        return total;
    }

    @Override
    public String detalleServicio() {
        return "TRABAJO DEPINTURA" + 
                "\nCliente : " + cliente +
                "\nFecha de inicio: " + fechaInicio +
                "\n-------------------------------------" +
                "\nPintor: " + trabajador +
                "\nCoste Material .... " + costeMaterial() +
                "\nCoste Mano Obra ... " + costeManoObra() +
                "\nCoste Adicional ... " + costeAdicional() +
                "\nTOTAL: ............ " + costeTotal();
    }
    
}
