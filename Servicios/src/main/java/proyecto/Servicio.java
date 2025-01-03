
package proyecto;

import java.time.LocalDate;

public abstract class Servicio {
    
    protected String trabajador;
    protected LocalDate fechaInicio;
    protected String cliente;

    public Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
        this.trabajador = trabajador;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }
    
    public abstract double costeMaterial();
    
    public abstract double costeManoObra();
    
    public abstract double costeTotal();
    
    public abstract String detalleServicio();
    
}
