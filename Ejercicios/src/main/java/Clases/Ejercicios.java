
package Clases;

import java.util.Scanner;

public class Ejercicios {
    
    static Scanner sc = new Scanner(System.in);
    static Producto[][] productos = new Producto[2][2];
    static boolean bandera = true;
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese 4 productos en la matriz");
        System.out.println("Nombre, categoria y precio separados por un &");
        System.out.println("(nombre&categoria&precio)");
        
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[0].length; j++) {
                System.out.print("-> ");
                String datos[] = sc.nextLine().split("&");
                String nombre = datos[0];
                String categoria = datos[1];
                double precio = Double.parseDouble(datos[2]);
                productos[i][j] = new Producto(nombre, categoria, precio);
            }
        }
        //Queso&lacteo&30
        //Pan blanco&panaderia&28
        //Panque&panaderia&32
        //Paquete de hojas&papeleria&50
        int opcion = 0;
        
        do {
            System.out.println("1. Mostrar productos");
            System.out.println("2. Buscar un producto por nombre");
            System.out.println("3. Modificar un producto por nombre");
            System.out.println("4. Eliminar producto por nombre");
            System.out.println("5. Salir del programa");
            System.out.print("Ingrese una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());
            
            switch(opcion) {
                case 1:
                    mostrarProductos();
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de producto a buscar: ");
                    String nombreProducto = sc.nextLine();
                    buscarProducto(nombreProducto);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de producto a modificar: ");
                    String productoModificar = sc.nextLine();
                    modificarProducto(productoModificar);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre de producto a eliminar: ");
                    String productoEliminar = sc.nextLine();
                    eliminarProducto(productoEliminar);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                    break;
            }
        } while(opcion != 5);
        
    }
    
    public static void mostrarProductos() {
        int contador = 0;
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[0].length; j++) {
                if(productos[i][j] != null) {
                    System.out.println(productos[i][j]);
                    contador++;
                }
            }
        }
        if(contador == 0) {
            System.out.println("No hay productos");
        }
    }
    
    public static void buscarProducto(String nombreProducto) {
        Producto productoEncontrado = null;
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[0].length; j++) {
                if(productos[i][j].encontrarProducto(nombreProducto)) {
                    productoEncontrado = productos[i][j];
                }
            }
        }
        if(productoEncontrado != null) {
            System.out.println(productoEncontrado);
        } else {
            System.out.println("No se ha encontrado el producto.");
        }
    }
    
    public static void modificarProducto(String nombreProducto) {
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[0].length; j++) {
                if(productos[i][j].encontrarProducto(nombreProducto)) {
                    System.out.println("Desea modificar " + productos[i][j]);
                    int id = productos[i][j].getId();
                    System.out.println("Ingrese nombre, categoria y precio separados por un &");
                    System.out.println("(nombre&categoria&precio)");
                    System.out.print("-> ");
                    String datosNuevos[] = sc.nextLine().split("&");
                    String nombreNuevo = datosNuevos[0];
                    String categoriaNueva = datosNuevos[1];
                    double precioNuevo = Double.parseDouble(datosNuevos[2]);
                    productos[i][j] = new Producto(nombreNuevo, categoriaNueva, precioNuevo);
                    productos[i][j].setId(id);
                    System.out.println("Producto modificado: " + productos[i][j]);
                    bandera = false;
                }
            }
        }
        if(bandera) {
            System.out.println("No se ha encontrado el producto.");
        }
    }
    
    public static void eliminarProducto(String nombreProductoEliminar) {
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[0].length; j++) {
                if(productos[i][j] != null) {
                    if(productos[i][j].encontrarProducto(nombreProductoEliminar)) {
                        productos[i][j] = null;
                        System.out.println("Producto eliminado exitosamente.");
                        bandera = false;

                    }
                }
            }
        }
        if(bandera) {
            System.out.println("No se ha encontrado el producto.");
        }
        
    }
    
}

