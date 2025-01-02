package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class OPP {

    static ArrayList<Poligono> poligonos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int opcion = 0;
        String opc = "";
        
        do {
            System.out.println("1. Triangulo");
            System.out.println("2. Rectangulo");
            System.out.print("Ingrese una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());
            llenarPoligonos(opcion);
            System.out.println("Desea seguir agregando poligonos ? Si / No");
            opc = sc.nextLine();
        } while(opc.equalsIgnoreCase("Si"));
        
        mostrarPoligonos(poligonos);

    }

    public static void llenarPoligonos(int opcion) {
        switch(opcion) {
            case 1:
                System.out.print("Ingrese lado 1: ");
                double lado1 = Double.parseDouble(sc.nextLine());
                System.out.print("Ingrese lado 2: ");
                double lado2 = Double.parseDouble(sc.nextLine());
                System.out.print("Ingrese lado 3: ");
                double lado3 = Double.parseDouble(sc.nextLine());
                Poligono t = new Triangulo(lado1, lado2, lado3, 3);
                poligonos.add(t);
                break;
            case 2:
                System.out.print("Ingrese lado 1: ");
                double ladoUno = Double.parseDouble(sc.nextLine());
                System.out.print("Ingrese lado 2: ");
                double ladoDos = Double.parseDouble(sc.nextLine());
                Poligono r = new Rectangulo(ladoUno, ladoDos, 2);
                poligonos.add(r);
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }

    public static void mostrarPoligonos(ArrayList array) {
        for (Poligono poligono : poligonos) {
            System.out.println("");
            System.out.println(poligono);
            System.out.println(poligono.area());
        }
    }

}
