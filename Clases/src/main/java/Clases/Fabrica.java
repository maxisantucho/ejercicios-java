
package Clases;

import java.util.ArrayList;

public class Fabrica {
    
    private ArrayList<Sucursal> sucursales;
    
    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }
    
    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }
    
    public void listarInstrumentos() {
        for (Sucursal sucursal : sucursales) {
            System.out.println(sucursal.getTitulo());
            sucursal.listarInstrumentos();
        }
    }
    
    public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {
        ArrayList<Instrumento> tipos = new ArrayList<>();
        for (Sucursal sucursal : sucursales) {
            tipos.addAll(sucursal.instrumentoTipo(tipo));
        }
        return tipos;
    }
    
    public Instrumento borrarInstrumento(String id) {
        Instrumento borrado = null;
        int i = 0;
        while(i < sucursales.size() && borrado == null) {
            borrado = sucursales.get(i).borrarInstrumento(id);
            i++;
        }
        return borrado;
    }
    
    public double[] porcInstrumentoPorTipo(String sucursal) {
        double[] porcentajes = new double[TipoInstrumento.values().length];
        Sucursal sucEncontrada = buscarSucursal(sucursal);
        if(sucEncontrada != null) {
            porcentajes = sucEncontrada.porcentajePorTipo();
        }
        return porcentajes;
    }
    
    public Sucursal buscarSucursal(String nombre) {
        int i = 0;
        Sucursal sucEncontrada = null;
        while(i < sucursales.size() && sucursales.get(i).getTitulo().equalsIgnoreCase(nombre)) {
            i++;
        }
        if(i < sucursales.size()) {
            sucEncontrada = sucursales.get(i);
        }
        return sucEncontrada;
    }
    
}
