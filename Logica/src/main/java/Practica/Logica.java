
package Practica;

import java.util.Scanner;

public class Logica {
        
//        https://www.youtube.com/playlist?list=PLeZ7bixkO9gGIy7i_6CitcOaIzOYTvzg-
//        el boli sabe
        
        static Scanner sc = new Scanner(System.in);
        
        public static void invertirCadena(String objeto) {
            String resultado = "";
            for (int i = (objeto.length() - 1); i >= 0; i--) {
                char cadena = objeto.charAt(i);
                resultado += cadena; // otra manera es:
                // resultado = cadena + resultado;
            }
            System.out.println(resultado);
        }
        
        public static void invertirCadenaWhile(String objeto) {
            String resultado = "";
            int contador = objeto.length() - 1;
            while(contador >= 0) {
                char cadena = objeto.charAt(contador);
                resultado += cadena;
                contador--;
            }
            System.out.println(resultado);
        }
        
//        public static void esFelizOno(int numero) {
//            boolean bandera = true;
//            int original = numero;
//            while(bandera) {
//                int sumatoria = 0;
//                int reemplazo = numero;
//                while(reemplazo > 0) {
//                    int digito = reemplazo % 10;
//                    int base = (int) Math.pow(digito, 2);
//                    sumatoria += base;
//                    reemplazo /= 10;
//                }
//                if(sumatoria == 1) {
//                    System.out.println("Es un numero feliz");
//                    bandera = false;
//                } else if(sumatoria == original) {
//                    System.out.println("No es numero feliz");
//                    bandera = false;
//                } else if(sumatoria < 10 && sumatoria != 7) {
//                    System.out.println("No es numero feliz");
//                    bandera = false;
//                }
//                numero = sumatoria;
//            }
//        }
        
//        public static void numeroUnicornio(int numero) {
//            int mitad = 0;
//            int resultado = 0;
//            if(cantidadDigitos(numero) % 2 == 0) {
//                mitad = (cantidadDigitos(numero) / 2) - 1;
//                numero = mitadNumero(mitad, numero);
//                numero %= 100;
//                System.out.println(resultadoUnicornio(numero));
//            } else {
//                mitad = cantidadDigitos(numero) / 2;
//                numero = mitadNumero(mitad, numero);
//                numero %= 10;
//                System.out.println(resultadoUnicornio(numero));
//            }
//        }
//        
//        public static String resultadoUnicornio(int resultado) {
//            String respuesta = "";
//            if(resultado % 3 == 0) {
//                respuesta = "Es un numero unicornio";
//            } else {
//                respuesta = "No es un numero unicornio";
//            }
//            return respuesta;
//        }
//        
//        public static int mitadNumero(int mitad, int numero) {
//            while(mitad > 0) {
//                    numero /= 10;
//                    mitad--;
//                }
//            return numero;
//        }
        
//        public static void binarioDecimal(int numero) {
//            int resultado = 0;
//            int contador = cantidadDigitos(numero);
//            int numeroFinal = 0;
//            while(resultado < contador) {
//                int decimal = numero % 10;
//                int potencia = (int) (decimal * (Math.pow(2, resultado)));
//                numeroFinal += potencia;
//                numero /= 10;
//                resultado++;
//            }
//            System.out.println(numeroFinal);
//        }
        
//        public static void multiplicarSumando(int numero, int multiplo) {
//            int resultado = 0;
//            while(multiplo > 0) {
//                resultado += numero;
//                multiplo--;
//            }
//            System.out.println("El resultado es " + resultado);
//        }
        
//        public static void dividirRestando(int numero, int divisor) {
//            int resultado = 0;
//            while(divisor <= numero) {
//                 numero -= divisor;
//                 resultado++;
//            }
//            System.out.println("el resultado es: " + resultado);
//            System.out.println("y su reciduo es: " + numero);
//        }
        
//        public static void sonNoviosOno(int num1, int num2) {
//            int sumatoria1 = sumatoriaDivisores(num1);
//            int sumatoria2 = sumatoriaDivisores(num2);
//            int totalNovios = num1 + num2 + 1;
//            if(sumatoria1 == sumatoria2  && sumatoria1 == totalNovios) {
//                System.out.println("Estos numeros son novios.");
//            } else {
//                System.out.println("No son novios");
//            }
//        }
        
//        public static void intercambiarVariables(int a, int b) {
//            System.out.println("Valor de a: " + a);
//            System.out.println("Valor de b: " + b);
//            a = a + b;
//            b = a - b;
//            a = a - b;
//            System.out.println("Ahora el valor de a es: " + a);
//            System.out.println("Y el valor de b es: " + b);
//        }
        
//        public static void decimalBinario(int numero) {
//            int numBinario = 0;
//            int base = 10;
//            int exp = 0;
//            while(numero > 0) {
//                int residuo = numero % 2;
//                numBinario += (residuo * ((int) Math.pow(base, exp)));
//                exp++;
//                numero /= 2;
//                
//            }
//            System.out.println("El numero binario es " + numBinario);
//        }
        
//        public static void numeroNarcisista(int numero) {
//            int resultado = 0;
//            int cantidad = cantidadDigitos(numero);
//            int sumatoria = numero;
//            while(numero > 0) {
//                int digito = numero % 10;
//                int potencia = (int) Math.pow(digito, cantidad);
//                resultado += potencia;
//                numero /= 10;
//            }
//            if(sumatoria == resultado) {
//                System.out.println("Es un numero narcisista");
//            } else {
//                System.out.println("No es narcisista");
//            }
//        }
        
//        public static void sonAmigosOno(int num1, int num2) {
//            int sumatoria1 = sumatoriaDivisores(num1);
//            int sumatoria2 = sumatoriaDivisores(num2);
//            if(sumatoria1 == num2 && sumatoria2 == num1) {
//                System.out.println("Son amigos");
//            } else {
//                System.out.println("No son amigos");
//            }
//        }
        
//        public static int sumatoriaDivisores(int numero) {
//            int contador = 1;
//            int sumatoria = 0;
//            while(contador <= numero) {
//                if(numero % contador == 0) {
//                    sumatoria = sumatoria + contador;
//                }
//                contador++;
//            }
//            return sumatoria;
//        }
        
//        public static void perfectoDefectivoAbundante(int numero) {
//            int sumatoria = sumatoriaDivisores(numero);
//            if(sumatoria == numero) {
//                System.out.println("El numero es perfecto");
//            } else if(sumatoria < numero) {
//                System.out.println("El numero es defectivo");
//            } else if(sumatoria > numero){
//                System.out.println("El numero es abundante");
//            }
//        }
        
//        public static void rotarNumero(int numero, int veces) {
//            int exponente = cantidadDigitos(numero) - 1;
//            int auxiliar = (int) Math.pow(10, exponente);
//            for (int i = 0; i < veces; i++) {
//                int digito = numero % 10;
//                numero = numero / 10;
//                int base = auxiliar * digito;
//                numero = numero + base;
//                System.out.println(numero);
//            }
//        }
        
        public static int cantidadDigitos(int numero) {
            int resultado = 0;
            while(numero > 0) {
                resultado++;
                numero = numero / 10;
            }
            return resultado;
        }
        
//        public static int primeroUltimo(int numero) {
//            int resultado = 0;
//            if(numero < 10) {
//                resultado = numero;
//            } else {
//                int ultimo = numero % 10;
//                while(numero >= 10) {
//                    numero = numero / 10;
//                }
//                resultado = (numero * 10) + ultimo;
//            }
//            return resultado;
//        }
        
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
//            int contadorMayor = 0;
//            int contadorMenor = 0;
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
//                    }
//                    if(digito == mayor) {
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
        
        invertirCadena("Unicornio");
        
        invertirCadenaWhile("Dragon");
        
//        esFelizOno(203);
//        
//        esFelizOno(342);
        
//        numeroUnicornio(234534);
//        
//        numeroUnicornio(21);
//        
//        numeroUnicornio(51713);
        
//        binarioDecimal(1101);
        
//        multiplicarSumando(5, 5);
        
//        dividirRestando(12, 3);
        
//        sonNoviosOno(48, 75);
        
//        intercambiarVariables(83, 523);
        
//        decimalBinario(12);
        
//        numeroNarcisista(153);
        
//        sonAmigosOno(220, 283);
        
//        perfectoDefectivoAbundante(496);
        
//        rotarNumero(19040, 3); El mismo proglema con el 0
        
//        System.out.println(primeroUltimo(234500)); Este funciona
        
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
        
//        System.out.println(mayorMenos(846111));
        
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
