
package Clases;

import java.util.ArrayList;

public class Sucursal {
    
    private String titulo;
    private ArrayList<Instrumento> instrumentos;

    public Sucursal(String titulo) {
        this.titulo = titulo;
        this.instrumentos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void agregarInstrumento(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }
    
    public void listarInstrumentos() {
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento);
        }
    }
    
    public ArrayList<Instrumento> instrumentoTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> tipos = new ArrayList<>();
        for (Instrumento instrumento : instrumentos) {
            if(instrumento.getTipo() == tipo) {
                tipos.add(instrumento);
            }
        }
        return tipos;
    }
    
    public Instrumento borrarInstrumento(String id) {
        Instrumento encontrado = null;
        int i = 0;
        while(i < instrumentos.size() && encontrado == null) {
            if(instrumentos.get(i).getId().equalsIgnoreCase(id)) {
                encontrado = instrumentos.get(i);
            }
            i++;
        }
        instrumentos.remove(encontrado);
        return encontrado;
    }
    
    public double[] porcentajePorTipo() {
        int cantInstrumentos = TipoInstrumento.values().length;
        double[] porcentajes = new double[cantInstrumentos];
        for(Instrumento instrumento : instrumentos) {
            porcentajes[instrumento.getTipo().ordinal()]++;
        }
        absolutoPorcentaje(porcentajes);
        return porcentajes;
    }
    
    public void absolutoPorcentaje(double[] porcentajes) {
        for (int i = 0; i < porcentajes.length; i++) {
            porcentajes[i] = (porcentajes[i] * 100) / instrumentos.size();
        }
    }
    
}
