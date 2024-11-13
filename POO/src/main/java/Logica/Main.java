package Logica;

public class Main {

    public static void main(String[] args) {
        
        Posnet posnet = new Posnet();
        Persona p = new Persona("90789432", "Pepe", "Gomez", "4443355", "pepeguares@hotmail.com");
        TarjetaDeCredito t = new TarjetaDeCredito("FakeBank", "123 234 589", 15000, p, EntidadFinanciera.VISA);
        
        System.out.println("Tarjeta antes del pago:");
        System.out.println(t);
        
        System.out.println("Ticket tras el pago:");
        Ticket ticketGenerado = posnet.efectuarPago(t, 10000, 5);
        System.out.println(ticketGenerado);
        
        System.out.println("Tarjeta despues del pago:");
        System.out.println(t);
        
    }

}
