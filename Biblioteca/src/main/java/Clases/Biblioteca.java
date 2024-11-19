package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    static ArrayList<Estante> estantes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;

        do {

            System.out.println("1. Agregar libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Mostrar estante mas solicitado");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese isbn y el nombre del libro separados por &");
                    System.out.println("(ISBN123&Libro1)");
                    String[] datos = sc.nextLine().split("&");
                    Libro libro = new Libro(datos[0], datos[1]);
                    int numeroEstante = 0;
                    String nombreEstante = "";
                    if (estantes.isEmpty()) {
                        System.out.println("Aun no se han creado estantes");
                        System.out.println("Ingrese nombre del nuevo estante:");
                        nombreEstante = sc.nextLine();
                    } else {
                        for (int i = 0; i < estantes.size(); i++) {
                            System.out.println(i + ". " + estantes.get(i).getNombreEstante());
                        }
                        System.out.println(estantes.size() + ". Disponible");
                        System.out.print("Ingrese numero de estante: ");
                        numeroEstante = Integer.parseInt(sc.nextLine());
                        if (numeroEstante >= estantes.size()) {
                            System.out.println("Ingrese nombre del nuevo estante:");
                            nombreEstante = sc.nextLine();
                        }
                    }
                    agregarLibro(numeroEstante, nombreEstante, libro);
                    break;
                case 2:
                    if(estantes.isEmpty()) {
                        System.out.println("Agregue un libro a un estante");
                    } else {
                        System.out.print("Ingrese el ISBN del libro que desee prestar: ");
                        String isbn = sc.nextLine();
                        prestarLibro(isbn);
                    }
                    break;
                case 3:
                    if(estantes.isEmpty()) {
                        System.out.println("Agregue un libro a un estante");
                    } else {
                        mostrarEstanteMasSolicitado();
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while (opcion != 4);

    }

    public static void agregarLibro(int numEstante, String nombreEstante, Libro libro) {
        if(numEstante < estantes.size()) {
            estantes.get(numEstante).agregarLibro(libro);
        } else {
            Estante estante = new Estante(nombreEstante);
            estante.agregarLibro(libro);
            estantes.add(estante);
        }
        for (int i = 0; i < estantes.size(); i++) {
            System.out.println(estantes.get(i));
            estantes.get(i).mostrarLibros();
        }
    }
    
    public static void prestarLibro(String isbn) {
        int i = 0;
        boolean bandera = true;
        while(i < estantes.size() && bandera) {
            if(estantes.get(i).buscarIsbn(isbn)) {
                estantes.get(i).prestarLibro(isbn);
                bandera = false;
            }
            i++;
        }
        if(!bandera) {
            System.out.println("El libro con " + isbn + " ha sido prestado");
        } else {
            System.out.println("No se ha encontrado ISBN");
        }
    }
    
    public static void mostrarEstanteMasSolicitado() {
        int estanteMasSolicitado = 0;
        Estante estanteMasSoli = new Estante("");
        for (Estante estante : estantes) {
            estanteMasSolicitado = estante.contadorLibros();
            if(estanteMasSoli.contadorLibros() < estanteMasSolicitado) {
                estanteMasSoli = estante;
            }
        }
        System.out.println("El estante mas solicitado es el " + estanteMasSoli);
    }

}
