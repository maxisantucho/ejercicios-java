package proyecto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicios {

    ArrayList<Servicio> servicios = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Servicios s = new Servicios();

        int seguir = 3;

        while (seguir == 3) {

            int opcion = s.mostrarMenu();

            s.ejecutarPrograma(opcion);

            try {
                System.out.println("Desea seguir agregando servicios ? ingrese el numero 3:");
                seguir = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ime) {
                System.out.println("Error. No es un entero");
            }

        }

        if (s.servicios.isEmpty()) {
            System.out.println("");
        } else {
            s.mostrarTrabajos();
        }

    }

    public int mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("1. Trabajo de pintura");
            System.out.println("2. Revision de alarma");
            try {
                System.out.print("Ingrese una opcion: ");
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException ime) {
                System.out.print("Error. No es un entero");
            }
        } while (opcion < 1 && opcion > 2);
        return opcion;
    }

    public void ejecutarPrograma(int menu) {
        int seguir = 0;
        switch (menu) {
            case 1:
                agregarTrabajoPintura();
                break;
            case 2:
                agregarRevisionAlarma();
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }

    public void agregarTrabajoPintura() {
        System.out.print("Ingrese nombre del trabajador: ");
        String trabajador = sc.nextLine();
        System.out.print("Ingrese AAAA/MM/DD separada por un '/': ");
        String[] fecha = sc.nextLine().split("/");
        int aaaa = Integer.parseInt(fecha[0]);
        int mm = Integer.parseInt(fecha[1]);
        int dd = Integer.parseInt(fecha[2]);
        LocalDate local = LocalDate.of(aaaa, mm, dd);
        System.out.print("Ingrese cliente: ");
        String cliente = sc.nextLine();
        System.out.print("Superficie en metros: ");
        double superficie = Double.parseDouble(sc.nextLine());
        System.out.print("Precio de la pintura: ");
        double precioPintura = Double.parseDouble(sc.nextLine());
        Servicio tp = new TrabajoPintura(trabajador, local, cliente, superficie, precioPintura);
        servicios.add(tp);
    }

    public void agregarRevisionAlarma() {
        System.out.print("Ingrese AAAA/MM/DD separada por un '/': ");
        String[] fecha = sc.nextLine().split("/");
        int aaaa = Integer.parseInt(fecha[0]);
        int mm = Integer.parseInt(fecha[1]);
        int dd = Integer.parseInt(fecha[2]);
        LocalDate local = LocalDate.of(aaaa, mm, dd);
        System.out.print("Ingrese cliente: ");
        String cliente = sc.nextLine();
        System.out.print("Numero de alarmas del lugar: ");
        int numAlarmas = Integer.parseInt(sc.nextLine());
        Servicio ra = new RevisionAlarma(local, cliente, numAlarmas);
        servicios.add(ra);
    }

    public void mostrarTrabajos() {
        double costeTotal = 0.0;
        double costeManoObra = 0.0;
        for (Servicio servicio : servicios) {
            costeTotal += servicio.costeTotal();
            costeManoObra += servicio.costeManoObra();
            System.out.println("");
            System.out.println(servicio.detalleServicio());
        }
        System.out.println("");
        System.out.println("Coste total de todos los trabajos: " + costeTotal);
        System.out.println("Coste total de mano de obra: " + costeManoObra);
    }

}
