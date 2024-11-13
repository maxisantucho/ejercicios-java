
package Logica;

public class TarjetaDeCredito {
    
    private String entidadBancaria;
    private String numTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    public TarjetaDeCredito(String entidadBancaria, String numTarjeta, double saldo, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.numTarjeta = numTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }
    
    public boolean tieneSaldo(double monto) {
        return saldo >= monto;
    }
    
    public void descontar(double monto) {
        saldo -= monto;
    }
    
    public String nomApe() {
        return titular.nombreApellido();
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", numTarjeta=" + numTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }
    
}
