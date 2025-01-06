
package proyecto;

public class ExamenOral extends Examen{
    
    private NivelDeSatisfaccion nivelSatisfaccion;

    public ExamenOral(NivelDeSatisfaccion nivelSatisfaccion, String fecha) {
        super(fecha);
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    @Override
    public boolean aprobo() {
        return nivelSatisfaccion.ordinal() >= NivelDeSatisfaccion.SUFICIENTE.ordinal();
    }
    
}
