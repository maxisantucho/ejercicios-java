
package Practica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cereales implements EsAlimento {
    
    private String marca;
    private String tipoCereal;
    private double precio;
    private LocalDate fechaCaducidad;

    public Cereales(String marca, String tipoCereal, double precio) {
        this.marca = marca;
        this.tipoCereal = tipoCereal;
        this.precio = precio;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.fechaCaducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return LocalDate.of(0, 0, 0);
    }

    @Override
    public int getCalorias() {
        int calorias = 0;
        if(tipoCereal.equalsIgnoreCase("espelta")) {
            calorias = 5;
        } else if(tipoCereal.equalsIgnoreCase("maiz")) {
            calorias = 8;
        } else if(tipoCereal.equalsIgnoreCase("trigo")) {
            calorias = 12;
        } else {
            calorias = 15;
        }
        return calorias;
    }

    @Override
    public String toString() {
        return "Cereales" + "\nMarca: " + marca +
                "\nTipo de cereal: " + tipoCereal +
                "\nPrecio: " + precio +
                "\nFecha de caducidad: " + fechaCaducidad.format(DateTimeFormatter.ofPattern("dd/MM/yyy")) +
                "\nCalorias: " + getCalorias();
    }
    
    
    
}
