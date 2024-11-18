
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
            
            switch(opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            
        } while(opcion != 4);
        
    }
}
