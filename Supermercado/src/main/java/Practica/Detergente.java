
package Practica;

public class Detergente implements EsLiquido, ConDescuento {
    
    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private double descuento;

    public Detergente(String marca, double precio) {
        this.marca = marca;
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
        return "Detergente" + 
                "\nMarca: " + marca + 
                "\nPrecio: " + precio +
                "\nVolumen: " + volumen + 
                "\nTipo de envase: " + tipoEnvase +
                "\nDescuento: " + descuento +
                "\nPrecio con descuento: " + getPrecioDescuento();
    }
    
}
