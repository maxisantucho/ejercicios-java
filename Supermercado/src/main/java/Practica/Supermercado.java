
package Practica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Supermercado {
    
    ArrayList<EsAlimento> productos = new ArrayList<>();
    //ARRAY SEGUN INTERFAZ

    public static void main(String[] args) {
        
        Supermercado s = new Supermercado();
        
        Detergente p1 = new Detergente("Limpiamas", 2.5);
        
        p1.setVolumen(33);
        p1.setDescuento(2);
        p1.setTipoEnvase("Botella de plastico small");
        
        System.out.println(p1);
        System.out.println("");
        
        Cereales p2 = new Cereales("Crunchy", "Espelta", 3);
        
        p2.setCaducidad(LocalDate.of(2022, 8, 2));
        
        System.out.println(p2);
        System.out.println("");
        
        Vino p3 = new Vino("Pimpiano", "Tinto", 12, 8);
        
        p3.setVolumen(330);
        p3.setTipoEnvase("Botella de vidrio");
        p3.setCaducidad(LocalDate.of(2023, 7, 12));
        p3.setDescuento(5);
        
        System.out.println(p3);
        System.out.println("");
        
        s.agregarProducto(p2);
        s.agregarProducto(p3);
        
        s.sumatoriaCalorias();
        
    }
    
    public void agregarProducto(EsAlimento p) {
        productos.add(p);
    }
    
    public void sumatoriaCalorias() {
        int sumatoria = 0;
        for (EsAlimento producto : productos) {
            sumatoria += producto.getCalorias();
        }
        System.out.println("La sumatoria de calorias es de: " + sumatoria);
    }
    
}
