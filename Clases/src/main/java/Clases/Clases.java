
package Clases;

import java.util.ArrayList;

public class Clases {

    public static void main(String[] args) {
        
        Fabrica f = new Fabrica();
        
        cargarFabrica(f);
        
//        f.listarInstrumentos();
        
//        ArrayList<Instrumento> tipos = f.instrumentosPorTipo(TipoInstrumento.VIENTO);
//        
//        for (Instrumento tipo : tipos) {
//            System.out.println(tipo);
//        }
        
//        f.listarInstrumentos();
//        
//        System.out.println("");
//        
//        Instrumento borrado = f.borrarInstrumento("ZZZ111");
//
//        if(borrado == null){
//            System.out.println("No existe instrumento");
//        } else {
//            System.out.println("Instrumento borrado:");
//            System.out.println(borrado);
//        }
//        
//        System.out.println("");
//        
//        f.listarInstrumentos();

//        double[] array = f.porcInstrumentoPorTipo("Sucursal A");
//        
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i] + " %");
//        }
        
    }
    
    private static void cargarFabrica(Fabrica f) {
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");
        
        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
        
        s1.agregarInstrumento(new Instrumento("ABC123", 1324, TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("BCD789", 1917, TipoInstrumento.VIENTO));
        s1.agregarInstrumento(new Instrumento("DEF593", 1546, TipoInstrumento.PERCUSION));
        
        s2.agregarInstrumento(new Instrumento("ABC354", 5234, TipoInstrumento.CUERDA));
        s2.agregarInstrumento(new Instrumento("BCD021", 9056, TipoInstrumento.VIENTO));
    }
    
}
