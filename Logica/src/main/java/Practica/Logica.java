
package Practica;

public class Logica {
        
//        https://www.youtube.com/playlist?list=PLeZ7bixkO9gGIy7i_6CitcOaIzOYTvzg-
//        el boli sabe
    
        
        
//        public static void arraySinRepetidos() {
//            int[] arr1 = {13, 71, 15, 13, 2, 9, 1, 2};
//            int[] arr2 = new int[contador(arr1)];
//            int pos = 0;
//            boolean bandera = true;
//            for (int i = 0; i < arr1.length; i++) {
//                int j = i+1;
//                while(j < arr1.length && bandera){
//                    if(arr1[i] == arr1[j]) {
//                        bandera = false;
//                    }
//                    j++;
//                }
//                if(bandera) {
//                    arr2[pos] = arr1[i];
//                    pos++;
//                }
//                bandera = true;
//            }
//            for (int j = 0; j < arr2.length; j++) {
//                System.out.print(arr2[j] + "; ");
//            }
//        }
//        
//        public static int contador(int[] arr1) {
//            int contador = 0;
//            int i = 0;
//            while(i < arr1.length) {
//                int j = i+1;
//                int aux = 0;
//                while(j < arr1.length) {
//                    if(arr1[i] == arr1[j]){
//                        aux = arr1[j];
//                    }
//                    j++;
//                }
//                if(aux != arr1[i]) {
//                    contador++;
//                }
//                i++;
//            }
//            return contador;
//        }
        
//        public static void sonIgualesOno() {
//            int[] arr1 = {9, 11, 20};
//            int[] arr2 = {20, 23, 98, 11, 9, 31};
//            int i = 0;
//            boolean bandera = true;
//            while(i < arr1.length && bandera) {
//                int j = 0;
//                int aux = 0;
//                while(j < arr2.length && bandera) {
//                    if(arr1[i] == arr2[j]){
//                        aux = arr2[j];
//                    }
//                    j++;
//                }
//                if(aux != arr1[i]) {
//                    bandera = false;
//                }
//                i++;
//            }
//            if(bandera) {
//                System.out.println("B incluye todos los valores de A");
//            } else {
//                System.out.println("B NO incluye los valores de A");
//            }
//        }
    
//        public static void binarySearch(int num) {
//            int[] arr = {3, 7, 11, 11, 16, 24, 30, 31};
//            int res = -1;
//            int min = 0;
//            int max = arr.length - 1;
//            int mid;
//            while(res == -1 && min <= max) {
//                mid = (min + max) / 2;
//                if(arr[mid] == num) {
//                    res = mid;
//                } else if(arr[mid] < num) {
//                    min = mid + 1;
//                } else {
//                    max = min - 1;
//                }
//            }
//            if (res == -1) {
//                System.out.println("no se encontro el numero");
//            } else {
//                System.out.println("se encuentra en la poscion " + res);
//            }
//        }
    
//        public static void insertionSort() {
//            int[] arr = {52, 17, 21, 74, 3, 25, 47};
//            for (int i = 0; i < arr.length - 1; i++) {
//                for (int j = 1 + i; j > 0 && arr[j] < arr[j-1]; j--) {
//                    int aux = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = aux;
//                }
//            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + "; ");
//            }
//        }
        
//        public static void bubbleSort() {
//            int[] arr = {52, 17, 21, 74, 3, 25, 47};
//            int elemActual = 0;
//            for (int i = 0; i < arr.length - 1; i++) {
//                for (int j = 0; j < arr.length - 1; j++) {
//                    elemActual = arr[j];
//                    if(elemActual > arr[j+1]) {
//                        arr[j] = arr[j+1];
//                        arr[j+1] = elemActual;
//                    }
//                }
//            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + "; ");
//            }
//        }
    
//        public static void transformarNumeros() {
//            int[] arr = {3, 4, 435, 6, 4, 2, 232};
//            for (int i = 0; i < arr.length; i++) {
//                if(arr[i] % 2 != 0) {
//                    arr[i] += 1;
//                }
//                System.out.println(arr[i]);
//            }
//        }
        
//        public static void caracteresNumericos(String cadena) {
//            int tamArr = cadena.length();
//            int[] arr = new int[tamArr];
//            int num = 0;
//            for (int i = 0; i < tamArr; i++) {
//                char letra = cadena.charAt(i);
//                num = (int) letra;
//                arr[i] = num;
//                System.out.println(arr[i]);
//            }
//        }
    
//        public static void formarNumEntero() {
//            int[] arr = {6, 7, 8, 3};
//            int resultado = 0;
//            for (int i = 0; i < arr.length; i++) {
//                int num = arr[i];
//                resultado = (resultado * 10) + num;
//            }
//            System.out.println(resultado);
//        }
    
//        public static void llenarArreglo(int tam) {
//            int[] arr = new int[tam];
//            for (int i = 0; i < arr.length; i++) {
//                int numero = (int) (Math.random() * 100);
//                arr[i] = numero;
//                System.out.print(arr[i] + "; ");
//            }
//        }
        
//        public static int[] llenarArreglo2(int tam) {
//            int[] arr = new int[tam];
//            for (int i = arr.length - 1; i >= 0; i--) {
//                int numero = (int) (Math.random() * 100);
//                arr[i] = numero;
//                System.out.print(arr[i] + "; ");
//            }
//            return arr;
//        }
    
//        public static void cifradoVigener(String cadena) {
//            String resultado = "";
//            String clave = "SO LOSA IF NHDESP"; //o generarCadena(cadena.length());
//            for (int i = 0; i < cadena.length(); i++) {
//                char letraTexto = cadena.charAt(i);
//                char letraClave = clave.charAt(i);
//                if(esMinuscula(letraTexto)) {
//                    letraClave = clave.toLowerCase().charAt(i);
//                    int valor = (((letraTexto - 'a') + (letraClave - 'a')) % 26) + 'a';
//                    char letra = (char) valor;
//                    resultado += letra;
//                } else if(esMayuscula(letraTexto)) {
//                    int valor = (((letraTexto - 'A') + (letraClave - 'A')) % 26) + 'A';
//                    char letra = (char) valor;
//                    resultado += letra;
//                } else {
//                    resultado += letraTexto;
//                }
//            }
//            System.out.println(clave);
//            System.out.println(resultado);
//        }
//        // este ejercicio me jodio    
//        public static String generarCadena(int longitud) {
//            String resultado = "";
//            for (int i = 0; i < longitud; i++) {
//                int num = (int) (Math.random() * (('Z' - 'A') + 1) + 'A');
//                char letra = (char) num;
//                resultado += letra;
//            }
//            return resultado;
//        }

//        public static void generarCadenaAleatoria(int longitud) {
//            String resultado = "";
//            int index = longitud;
//            while(index > 0) {
//                int num = (int) (Math.random() * (('z' - 'a') + 1)) + 'a';
//                char letra = (char) num;
//                if(esMayuscula(letra) || esMinuscula(letra)) {
//                    resultado += letra;
//                    index--;
//                }
//            }
//            System.out.println(resultado);
//        }
    
//        public static void cifradoCesar(String cadena, int desplazar) {
//            String resultado = "";
//            int longCad = cadena.length();
//            for (int i = 0; i < longCad; i++) {
//                char index = cadena.charAt(i);
//                if(esMayuscula(index)) {
//                    index += desplazar;
//                    if(index > 'Z') {
//                        index -= 26;
//                        // otra es sacando el modulo y sumarle a 'a' o 'A'
//                    }
//                } else if(esMinuscula(index)) {
//                    index += desplazar;
//                    if(index > 'z') {
//                        index -= 26;
//                    }
//                }
//                resultado += index;
//            }
//            System.out.println(resultado);
//        }
        
//        private static boolean esMayuscula(char index){
//            return index >= 'A' && index <= 'Z';
//        }
//        
//        private static boolean esMinuscula(char index){
//            return index >= 'a' && index <= 'z';
//        }
        
//        public static int contarOcurrencias(String cadena, String subCadena) {
//            int resultado = 0;
//            String aux = "";
//            int logSubCad = subCadena.length();
//            for(int pos = 0; pos < cadena.length() - logSubCad; pos++) {
//                for(int i = pos; i < pos + logSubCad; i++) {
//                    aux += cadena.charAt(i);
//                }
//                if(aux.equalsIgnoreCase(subCadena)) {
//                    resultado++;
//                }
//                aux = "";
//            } ESTE ESTA GENIAL LASTIMA QUE NO LO ENTENDI
//            return resultado;
//        }
        
//        public static void esPalindromo(String palabra) {
//            String invertida = invertirCadenaWhile(palabra);
//            if(palabra.equalsIgnoreCase(invertida)) {
//                System.out.println("Es palindromo");
//            } else {
//                System.out.println("No es palindromo");
//            }
//        }
       
//        public static void esPalindromo2(String palabra) {
//            int inicio = 0;
//            int fin = palabra.length() - 1;
//            boolean bandera = false;
//            palabra = palabra.toLowerCase();
//            while(inicio < fin && !bandera) {
//                if(palabra.charAt(inicio) != palabra.charAt(fin)) {
//                    bandera = true;
//                }
//                inicio++;
//                fin--;
//            }
//            if(bandera) {
//                System.out.println("No es palindromo");
//            } else {
//                System.out.println("Es palindromo");
//            }
//        }
        
//        public static void esPalindromo3(String palabra) {
//            int fin = palabra.length() - 1;
//            boolean bandera = false;
//            palabra = palabra.toLowerCase();
//            for(int inicio = 0; inicio <= fin && !bandera; inicio++, fin--) {
//                if(palabra.charAt(inicio) != palabra.charAt(fin)) {
//                    bandera = true;
//                }
//            }
//            if(bandera) {
//                System.out.println("No es palindromo");
//            } else {
//                System.out.println("Es palindromo");
//            }
//        }
        
//        public static void invertirCadena(String objeto) {
//            String resultado = "";
//            for (int i = (objeto.length() - 1); i >= 0; i--) {
//                char cadena = objeto.charAt(i);
//                resultado += cadena; // otra manera es:
//                // resultado = cadena + resultado;
//            }
//            System.out.println(resultado);
//        }
       
//        public static String invertirCadenaWhile(String objeto) {
//            String resultado = "";
//            int contador = objeto.length() - 1;
//            while(contador >= 0) {
//                char cadena = objeto.charAt(contador);
//                resultado += cadena;
//                contador--;
//            }
//            return resultado;
//        }
        
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
        
//        public static int cantidadDigitos(int numero) {
//            int resultado = 0;
//            while(numero > 0) {
//                resultado++;
//                numero = numero / 10;
//            }
//            return resultado;
//        }
        
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
        
//        arraySinRepetidos();
        
//        sonIgualesOno();
        
//        binarySearch(11);
        
//        insertionSort();
        
//        bubbleSort();
        
//        transformarNumeros();
        
//        caracteresNumericos("Draco");
        
//        formarNumEntero();
        
//        llenarArreglo(5);
        
//        cifradoVigener("LA VIDA ES BONITA");
        
//        cifradoVigener();
        
//        generarCadenaAleatoria(6);
        
//        cifradoCesar("Unicornio", 7);
        
//        String cadena = "Como una estrella rota, mengua doliente..."
//                + "\nCuando dos estrellas chocan, mil esquirlas brotan."
//                + "\nSin ti Danae, mi vida es una derrota. Donde una estrella llora,"
//                + "\n Orion solloza por tu amor...";
//        
//        System.out.println(contarOcurrencias(cadena, "ota"));
        
//        esPalindromo3("Hola");
//        
//        esPalindromo3("Reconocer");
        
//        esPalindromo2("Hola");
//        
//        esPalindromo("Reconocer");
        
//        invertirCadena("Unicornio");
        
//        System.out.println(invertirCadenaWhile("Dragon"));;
        
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
