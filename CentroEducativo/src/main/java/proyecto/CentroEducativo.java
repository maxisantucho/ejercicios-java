package proyecto;

import java.util.ArrayList;

public class CentroEducativo {

    private ArrayList<Alumno> alumnos;

    public CentroEducativo() {
        this.alumnos = new ArrayList<>();
    }

    public static void main(String[] args) {
        
        CentroEducativo c = new CentroEducativo();
        
        Alumno pepe = new Alumno("123", "Fulano", "Pepe");
        Alumno maria = new Alumno("124", "Mengano", "Maria");
        Alumno luis = new Alumno("125", "Sultano", "Luis");
        
        pepe.agregarExamen(new ExamenEscrito(40, 7, "00/00/0000"));
        pepe.agregarExamen(new ExamenOral(NivelDeSatisfaccion.SUFICIENTE, "00/00/0000"));
        
        maria.agregarExamen(new ExamenEscrito(60, 6, "00/00/0000"));
        maria.agregarExamen(new ExamenEscrito(65, 8, "00/00/0000"));
        maria.agregarExamen(new ExamenOral(NivelDeSatisfaccion.EXCELENTE, "00/00/0000"));
        
        luis.agregarExamen(new ExamenEscrito(100, 9, "00/00/0000"));
        luis.agregarExamen(new ExamenOral(NivelDeSatisfaccion.INSUFICIENTE, "00/00/0000"));
        luis.agregarExamen(new ExamenOral(NivelDeSatisfaccion.EXCELENTE, "00/00/0000"));

        c.agregarAlumno(pepe);
        c.agregarAlumno(maria);
        c.agregarAlumno(luis);
        
        System.out.println("Cantidad de aprobados: " + c.cantAprobados());
        
    }
    
    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }
    
    public int cantAprobados() {
        int contador = 0;
        for (Alumno alumno : alumnos) {
            if(alumno.aprobo()) {
                contador++;
            }
        }
        return contador;
    }
    
}
