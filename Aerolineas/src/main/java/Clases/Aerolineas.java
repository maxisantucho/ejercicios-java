package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Aerolineas {

    static final String NOMBRE = "JAVA";
    static ArrayList<Vuelo> vuelos = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bienvenidos a Aerolineas " + Aerolineas.NOMBRE);

        int opcion;

        do {
            System.out.println("1. Agregar vuelo");
            System.out.println("2. Vender tiquete");
            System.out.println("3. Cambiar silla");
            System.out.println("4. Anular tiquete");
            System.out.println("5. Consultar vuelo mas vendido");
            System.out.println("6. Terminar vuelo");
            System.out.println("7. Presentar balance de ventas");
            System.out.println("8. Mostrar mapa");
            System.out.println("9. Salir del programa");
            System.out.print("Seleccione una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    agregarVuelo();
                    break;
                case 2:
                    if (vuelos.isEmpty()) {
                        System.out.println("Aun no se han registrado vuelos.");
                    } else {
                        System.out.println("Vuelos existentes");
                        for (int i = 0; i < vuelos.size(); i++) {
                            System.out.println((i) + ". " + vuelos.get(i));
                        }
                        System.out.print("Seleccione un vuelo: ");
                        int vuelo = Integer.parseInt(sc.nextLine());
                        if (vuelos.get(vuelo).estaDisponible()) {
                            vuelos.get(vuelo).mostrarMatrizX();
                            venderTiquete(vuelos.get(vuelo));
                        } else {
                            System.out.println("El vuelo ha terminado.");
                        }
                    }
                    break;
                case 3:
                    if (vuelos.isEmpty()) {
                        System.out.println("Aun no se han registrado vuelos.");
                    } else {
                        System.out.print("Ingrese identificacion del pasajero: ");
                        int identificacion = Integer.parseInt(sc.nextLine());
                        boolean bandera = true;
                        int i = 0;
                        while (i < vuelos.size() && bandera) {
                            if (vuelos.get(i).identificacionExiste(identificacion)) {
                                if (vuelos.get(i).estaDisponible()) {
                                    Silla sillaBuscada = vuelos.get(i).buscarSilla(identificacion);
                                    if (sillaBuscada != null) {
                                        bandera = false;
                                        cambiarSilla(identificacion, i, sillaBuscada);
                                    }
                                }
                            }
                            i++;
                        }
                        if (bandera) {
                            System.out.println("Error. No se encontro identificacion o el vuelo ha terminado.");
                        }
                    }
                    break;
                case 4:
                    if (vuelos.isEmpty()) {
                        System.out.println("Aun no se han registrado vuelos.");
                    } else {
                        System.out.print("Ingrese identificacion del pasajero: ");
                        int identificacion = Integer.parseInt(sc.nextLine());
                        boolean bandera = true;
                        int i = 0;
                        while (i < vuelos.size() && bandera) {
                            if (vuelos.get(i).identificacionExiste(identificacion)) {
                                if (vuelos.get(i).estaDisponible()) {
                                    Silla sillaBuscada = vuelos.get(i).buscarSilla(identificacion);
                                    if (sillaBuscada != null) {
                                        bandera = false;
                                        anularTiquete(identificacion, i, sillaBuscada);
                                    }
                                }
                            }
                            i++;
                        }
                        if (bandera) {
                            System.out.println("Error. No se encontro identificacion o el vuelo ha terminado.");
                        }
                    }
                    break;
                case 5:
                    if (vuelos.isEmpty()) {
                        System.out.println("Aun no se han registrado vuelos.");
                    } else {
                        vueloMasVendido();
                    }
                    break;
                case 6:
                    if (vuelos.isEmpty()) {
                        System.out.println("Aun no se han registrado vuelos.");
                    } else {
                        for (int i = 0; i < vuelos.size(); i++) {
                            System.out.println(i + ". " + vuelos.get(i));
                        }
                        System.out.print("Seleccione el vuelo a terminar: ");
                        int vuelo = Integer.parseInt(sc.nextLine());
                        terminarVuelo(vuelo);
                    }
                    break;
                case 7:
                    if (vuelos.isEmpty()) {
                        System.out.println("Aun no se han registrado vuelos.");
                    } else {
                        presentarBalanceDeVentas();
                    }
                    break;
                case 8:
                    if(vuelos.isEmpty()) {
                        System.out.println("Aun no se registran vuelos.");
                    } else {
                        for (Vuelo vuelo : vuelos) {
                            vuelo.mostrarMatrizX();
                            vuelo.mostrarMatrizSillas();
                        }
                    }
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }
        } while (opcion != 9);

    }

    public static void agregarVuelo() {
        System.out.println("Ingrese los datos del vuelo");
        System.out.print("Origen: ");
        String origen = sc.nextLine();
        System.out.print("Destino: ");
        String destino = sc.nextLine();
        if (vuelos.isEmpty()) {
            System.out.print("Hora: ");
            String hora = sc.nextLine();
            Vuelo vueloNuevo = new Vuelo(origen, destino, hora);
            vueloNuevo.llenarMatriz();
            vuelos.add(vueloNuevo);
            System.out.println("Vuelo agregado");
            System.out.println(vueloNuevo);
        } else {
            System.out.print("Hora: ");
            String hora = sc.nextLine();
            for (int i = 0; i < vuelos.size(); i++) {
                if (vuelos.get(i).validarHora(hora)) {
                    System.out.println("Ya existe un vuelo a esa hora.");
                    System.out.print("Ingrese hora del vuelo nuevamente: ");
                    hora = sc.nextLine();
                    i = -1;
                }
            }
            Vuelo vueloNuevo = new Vuelo(origen, destino, hora);
            vueloNuevo.llenarMatriz();
            vuelos.add(vueloNuevo);
            System.out.println("Vuelo agregado");
            System.out.println(vueloNuevo);
        }
    }

    public static void venderTiquete(Vuelo vuelo) {
        System.out.println("Eliga su silla");
        System.out.print("Fila: ");
        int fila = Integer.parseInt(sc.nextLine());
        System.out.print("Columna: ");
        int columna = Integer.parseInt(sc.nextLine());
        vuelo.asignarSillaX(fila, columna);
        System.out.println("Ingrese sus datos personales");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Numero: ");
        int identificacion = Integer.parseInt(sc.nextLine());
        Pasajero pasajero = new Pasajero(nombre, identificacion);
        Silla silla = vuelo.venderSilla(pasajero, fila, columna);
        vuelo.asignarSilla(silla, fila, columna);
        System.out.println("Tiquete vendido exitosamente");
        System.out.println(silla);
    }
    
    public static void cambiarSilla(int identificacion, int vuelo, Silla silla) {
        Vuelo vueloAsignado = vuelos.get(vuelo);
        int i = 0;
        boolean bandera = true;
        while (i < vueloAsignado.getSillas().length && bandera) {
            int j = 0;
            while (j < vueloAsignado.getSillas()[i].length && bandera) {
                if (vueloAsignado.getSillas()[i][j] == 'x' && vueloAsignado.getAvion()[i][j].solicitarPasajero() == identificacion) {
                    System.out.println("Su asiento es la " + silla);
                    System.out.println("Se encuentra en la fila " + i + ", columna " + j);
                    vueloAsignado.mostrarMatrizX();
                    System.out.println("Ingrese posicion de silla nueva");
                    System.out.print("Fila: ");
                    int filaNueva = Integer.parseInt(sc.nextLine());
                    System.out.print("Columna: ");
                    int columnaNueva = Integer.parseInt(sc.nextLine());
                    vueloAsignado.asignarSillaX(filaNueva, columnaNueva);
                    vueloAsignado.venderSilla(silla.getPasajero(), filaNueva, columnaNueva);
                    vueloAsignado.anularSilla(i, j);
                    vueloAsignado.anularSillaX(i, j);
                    System.out.println("Su silla se cambio exitosamente");
                    bandera = false;
                }
                j++;
            }
            i++;
        }
    }

    public static void anularTiquete(int identificacion, int vuelo, Silla silla) {
        Vuelo vueloAsignado = vuelos.get(vuelo);
        int i = 0;
        boolean bandera = true;
        while (i < vueloAsignado.getSillas().length && bandera) {
            int j = 0;
            while (j < vueloAsignado.getSillas()[i].length && bandera) {
                if (vueloAsignado.getSillas()[i][j] == 'x' && vueloAsignado.getAvion()[i][j].solicitarPasajero() == identificacion) {
                    System.out.println("Su asiento es el " + vueloAsignado.getAvion()[i][j]);
                    System.out.println("Se encuentra en la fila " + i + ", columna " + j);
                    System.out.print("Desea anular esta silla ? SI / NO: ");
                    String opcion = sc.nextLine();
                    if (opcion.equalsIgnoreCase("si")) {
                        vueloAsignado.anularSilla(i, j);
                        vueloAsignado.anularSillaX(i, j);
                        System.out.println("Asiento anulado exitosamente");
                        vueloAsignado.mostrarMatrizX();
                    }
                    bandera = false;
                }
                j++;
            }
            i++;
        }
    }

    public static void vueloMasVendido() {
        Vuelo vueloMasVendido = new Vuelo("", "", "");
        vueloMasVendido.setContador(0);
        int contador = 0;
        for (Vuelo vuelo : vuelos) {
            contador = vuelo.contarSillas();
            vuelo.setContador(contador);
            if (vueloMasVendido.getContador() < vuelo.getContador() && vuelo.estaDisponible()) {
                vueloMasVendido = vuelo;
            }
        }
        if (vueloMasVendido.getContador() == 0) {
            System.out.println("Aun no se han vendido tiquetes.");
        } else {
            System.out.println("El vuelo mas vendido fue ");
            System.out.println(vueloMasVendido);
            System.out.println("Cantidad de tiquetes vendidos " + vueloMasVendido.getContador());
        }
    }

    public static void terminarVuelo(int vuelo) {
        if (vuelos.get(vuelo).estaDisponible()) {
            vuelos.get(vuelo).terminarVuelo();
            System.out.println("Vuelo terminado.");
        } else {
            System.out.println("El " + vuelos.get(vuelo) + " ya fue sido terminado.");
        }
    }

    public static void presentarBalanceDeVentas() {
        for (Vuelo vuelo : vuelos) {
            int cantidadTiquetesVendidos = vuelo.contarSillas();
            double ingresosTotales = vuelo.tiquetesVendidos();
            System.out.println("El " + vuelo);
            System.out.println("Ha vendido una cantidad de tiquetes de " + cantidadTiquetesVendidos);
            System.out.println("Con unos ingresos totales de " + ingresosTotales);
        }
    }
}
