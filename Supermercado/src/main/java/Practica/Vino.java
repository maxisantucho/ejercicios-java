
package Practica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vino implements EsLiquido, EsAlimento, ConDescuento {
    
    private String marca;
    private String tipoVino;
    private double grados;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private LocalDate caducidad;
    private double descuento;

    public Vino(String marca, String tipoVino, double grados, double precio) {
        this.marca = marca;
        this.tipoVino = tipoVino;
        this.grados = grados;
        this.precio = precio;
    }

    @Override
    public void setVolumen(double v) {
        this.volumen = v;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public int getCalorias() {
        return (int) grados * 10;
    }

    @Override
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return precio - (precio * (descuento / 100));
    }

    @Override
    public String toString() {
        return "Vino" + 
                "\nMarca: " + marca + 
                "\nTipo de vino: " + tipoVino +
                "\nGrados: " + grados + 
                "\nPrecio: " + precio + 
                "\nVolumen: " + volumen +
                "\nTipo de envase: " + tipoEnvase + 
                "\nCaducidad: " + caducidad.format(DateTimeFormatter.ofPattern("dd/MM/yyy")) + 
                "\nDescuento: " + descuento + 
                "\nPrecio con descuento: " + getPrecioDescuento() + 
                "\nCalorias: " + getCalorias();
    }
    
}
