
package proyecto;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio {
    
    protected int numAlarmasRevisar;

    public RevisionAlarma(LocalDate fechaInicio, String cliente, int numAlarmasRevisar) {
        super("Revisor Especialista Contraincendios", fechaInicio, cliente);
        this.numAlarmasRevisar = numAlarmasRevisar;
    }

    @Override
    public double costeMaterial() {
        return 0.0;
    }

    @Override
    public double costeManoObra() {
        return (numAlarmasRevisar / 3) * 40;
    }

    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    @Override
    public String detalleServicio() {
        return "REVISION PERIODICA ALARMAS CONTRAINCENDIOS" +
                "\nCliente: " + cliente +
                "\nFecha revision: " + fechaInicio +
                "\nInspector: " + trabajador +
                "\n-------------------------------------" +
                "\nTOTAL: ............ " + costeTotal();
    }
    
}
