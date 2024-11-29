
package Practica;

import java.util.Scanner;

public class Logica {
        
//        https://www.youtube.com/playlist?list=PLeZ7bixkO9gGIy7i_6CitcOaIzOYTvzg-
//        el boli sabe
        
        static Scanner sc = new Scanner(System.in);
        
//        public static int invertirNumeros(int numero){
//            int resultado = 0;
//            while(numero > 0) {
//                int digito = numero % 10;
//                resultado = (resultado * 10) + digito;
//                numero /=10;
//            }
//            return resultado;
//        }
        
//        public static int busquedaBinaria(int[] A, int num) {
//            int inicio = 0, medio, fin = A.length - 1;
//            while(inicio <= fin) {
//                medio = (inicio + fin) / 2;
//                if(A[medio] == num) {
//                    return medio;
//                } else if(A[medio] < num) {
//                    inicio = medio + 1;
//                } else {
//                    fin = medio - 1;
//                }
//            }
//            return -1;
//        }
        
//        public static String mayorMenos(int numero) {
//            String resultado = "";
//            int contadorMayor = 1;
//            int contadorMenor = 1;
//            int mayor;
//            int menor;
//            if(numero > 0) {
//                mayor = numero % 10;
//                menor = numero % 10;
//                numero = numero / 10;
//                while(numero > 0){
//                    int digito = numero % 10;
//                    if(digito > mayor) {
//                        mayor = digito;
//                    } else if(digito < menor) {
//                        menor = digito;
//                    } else if(digito == mayor) {
//                        contadorMayor++;
//                    } else if (digito == menor) {
//                        contadorMenor++;
//                    }
//                    numero = numero / 10;
//                }
//                resultado = "El mayor es " + mayor + " y se repite " + contadorMayor + " veces\n";
//                resultado = resultado + "El menor es " + menor + " y se repite " + contadorMenor + " veces.";
//            } else {
//                System.out.println("Dato de entrada no valido.");
//            }
//            return resultado;
//        }
        
//        public static int verificador(int num) {
//            int resultado = -1;
//            if(num %  4 == 0) {
//                resultado = num;
//            }
//            return resultado;
//        }

    public static void main(String[] args) {
        
//        System.out.println(invertirNumeros(3345050));
        
//        int[] A = {1, 2, 4, 5, 6, 7, 8, 9, 10};
//        
//        int pos = busquedaBinaria(A, 9);
//        
//        if(pos == -1) {
//            System.out.println("El numero no esta en el arreglo");
//        } else {        
//            System.out.println("El numero se encuentra en la posicion " + pos);
//        }
        
//        System.out.println(mayorMenos(861114));
        
//        System.out.println(verificador(54325164));
//        en el caso que solo querramos los ultimos 2 numeros
//        de un entero los dividimos por 100 o dependiendo la cantidad
        
//        System.out.println("Ingrese un numero: ");
//        int num = Integer.parseInt(sc.nextLine());
//        
//        if(num > 0 && num <= 10) {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println( num + " x " + i + " = " + (num * i));
//            }
//        } else {
//            System.out.println("El numero debe estar entre 1 y 10");
//        }
        
//        System.out.println("Ingrese un numero: ");
//        int num = Integer.parseInt(sc.nextLine());
//
//        Debe ser mayor que 0
//
//        if(!(num % 2 == 0)) {
//            num--;
//        }
//        
//        while (num >= 0) {
//            System.out.println(num);
//            num -= 2;
//        }
        
//        System.out.print("Ingrese un numero: ");
//        int num = Integer.parseInt(sc.nextLine());
//        
//        for (int i = 1; i <= num; i++) {
//            if(i % 2 == 0) {
//                System.out.println(i + " es num par");
//            } else {
//                System.out.println(i + " es num impar");
//            }
//        }
        
    }
    
}
