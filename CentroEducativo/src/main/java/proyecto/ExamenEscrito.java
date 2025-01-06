
package proyecto;

public class ExamenEscrito extends Examen{
    
    private static final int MIN_NOTA = 0;
    private static final int MAX_NOTA = 10;
    private static final int NOTA_APROB = 6;
    private static final int MIN_DURACION = 90;
    private int duracion;
    private int nota;

    public ExamenEscrito(int duracion, int nota, String fecha) {
        super(fecha);
        this.duracion = duracion;
        this.nota = nota;
    }

    @Override
    public boolean aprobo() {
        boolean rango = nota >= MIN_NOTA && nota <= MAX_NOTA;
        boolean aprobado = nota >= NOTA_APROB;
        boolean minutos = duracion <= MIN_DURACION;
        return rango && aprobado && minutos;
    }
    
}
