
package ej.arr;

import java.util.Scanner;

public class Arreglos {
    
    static Empleado empleado;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int opcion;
        
        do {
            System.out.println("1. Ingresar datos generales");
            System.out.println("2. Ingresar una venta");
            System.out.println("3. Consultar una venta");
            System.out.println("4. Mostrar ventas del anio");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());
            
            switch(opcion) {
                case 1:
                    ingresarDatos();
                    break;
                case 2:
                    ingresarUnaVenta();
                    break;
                case 3:
                    consultarDatos();
                    break;
                case 4:
                    System.out.println(empleado.getDatos());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while(opcion != 5);
        
    }
    
    //COD123&Maxi&Gomeria&2024
    
    public static void ingresarDatos() {
        System.out.println("Ingrese datos del empleado separados por un &");
        System.out.println("codigo&nombre&departameto&anio");
        String[] datos = sc.nextLine().split("&");
        String codigo = datos[0];
        String nombre = datos[1];
        String departamento = datos[2];
        //agregar validaciones
        int anio = Integer.parseInt(datos[3]);
        empleado = new Empleado(codigo, nombre, departamento, anio);
    }
    
    public static void ingresarUnaVenta() {
        System.out.print("Ingrese el mes de la venta en valor numerico: ");
        int mes = Integer.parseInt(sc.nextLine());
        if(mes > 0 && mes < 13){
            System.out.print("Ingrese valor de la venta en el mes: ");
            float venta = Float.parseFloat(sc.nextLine());
            if (venta > -1) {
                empleado.setVentas(venta, mes);
            } else {
                System.out.println("Dato incorrecto");
            }
        } else {
            System.out.println("Dato incorrecto");
        }
        
    }
    
    public static void consultarDatos() {
        System.out.print("Ingrese el mes de la venta a consultar: ");
        int mes = Integer.parseInt(sc.nextLine());
        if(empleado.getVentas(mes) == 0){
            System.out.println("No se registra una venta.");
        } else if(mes > 0 && mes < 13) {
            System.out.println("La venta del mes fue de " + empleado.getVentas(mes));
        } else{
            System.out.println("Dato incorrecto");
        }
    }
    
}
