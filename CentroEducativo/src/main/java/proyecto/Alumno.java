package proyecto;

import java.util.ArrayList;

public class Alumno implements Aprobable {

    private String dni;
    private String apellido;
    private String nombre;
    private ArrayList<Examen> examenesRealizados;

    public Alumno(String dni, String apellido, String nombre) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.examenesRealizados = new ArrayList<>();
    }

    public void agregarExamen(Examen e) {
        examenesRealizados.add(e);
    }

    @Override
    public boolean aprobo() {
        boolean bandera = true;
        int i = 0;
        while (i < examenesRealizados.size() && bandera) {
            if (!examenesRealizados.get(i).aprobo()) {
                bandera = false;
            }
            i++;
        }
        return bandera;
    }

}
