package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class LimpiezaLtda {

    private Scanner sc = new Scanner(System.in);
    private Estante[] estantes = new Estante[5];
    private Producto[] productos = new Producto[5];
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {

        LimpiezaLtda negocio = new LimpiezaLtda();

        System.out.println("Bienvenidos a Productos de Limpieza Ltda.");

        negocio.mostrarMenu();

    }

    public void mostrarMenu() {
        String menu = "1. Registrar empleado"
                + "\n2. Registrar producto en el almacen"
                + "\n3. Cambiar producto de estante"
                + "\n4. Agregar producto al inventario"
                + "\n5. Registrar venta"
                + "\n6. Mostrar mejor empleado"
                + "\n7. Mostrar ingresos totales"
                + "\n8. Mostrar inventario"
                + "\n9. Mostrar empleados"
                + "\n10. Salir";
        System.out.println(menu);
        System.out.print("Ingrese una opcion: ");
        int opcion = Integer.parseInt(sc.nextLine());
        ejecutarMenu(opcion);
        System.out.println("");
        mostrarMenu();
    }

    public void ejecutarMenu(int opcion) {
        switch (opcion) {
            case 1:
                if (empleados.size() > 10) {
                    System.out.println("Soy hay un maximo de 10 empleados.");
                } else {
                    registrarEmpleado();
                }
                break;
            case 2:
                registrarProducto();
                break;
            case 3:
                cambiarProductoEstante();
                break;
            case 4:
                if (estaVacio(productos)) {
                    System.out.println("Aun no hay productos registrados");
                } else {
                    agregarProductoInventario();
                }
                break;
            case 5:
                if (empleados.isEmpty() || estaVacio(productos)) {
                    System.out.println("Aun no hay productos o empleados registrados");
                } else {
                    registrarVenta();
                }
                break;
            case 6:
                if (empleados.isEmpty()) {
                    System.out.println("Aun no se han registrado ventas");
                } else {
                    mostrarMejorEmpleado();
                }
                break;
            case 7:
                mostrarIngresoTotal();
                break;
            case 8:
                mostrarInventario();
                break;
            case 9:
                if (empleados.isEmpty()) {
                    System.out.println("Aun no se han registrado empleados en el sistema");
                } else {
                    mostrarEmpleados();
                }
                break;
            case 10:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion incorrecta.");
                break;
        }
    }

    public void registrarEmpleado() {
        System.out.print("Nombre empleado: ");
        String nombre = sc.nextLine();
        Empleado e = new Empleado(nombre);
        empleados.add(e);
        System.out.println("Empleados registrados:");
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println((i + 1) + ". " + empleados.get(i));
        }
    }

    public void registrarProducto() {
        System.out.println("ALMACEN: Estado de los estantes");
        for (int i = 0; i < estantes.length; i++) {
            if (estantes[i] != null) {
                System.out.println((i + 1) + ". " + estantes[i]);
            } else {
                System.out.println((i + 1) + ". Estante disponible");
            }
        }
        System.out.print("\nNombre, precio y estante del nuevo producto (separe los datos con un &): ");
        String[] datos = sc.nextLine().split("&");
        String nombre = datos[0];
        double precio = Double.parseDouble(datos[1]);
        int numEstante = Integer.parseInt(datos[2]);
        numEstante -= 1;
        if (numEstante > estantes.length || numEstante < -1) {
            System.out.println("El id de estante no existe en el almacen.");
        } else {
            if (estantes[numEstante] != null && !estantes[numEstante].isEstado()) {
                System.out.println("Estante ya esta ocupado.");
            } else {
                Producto p = new Producto(nombre, precio);
                boolean estado = false;
                Estante e = new Estante((numEstante + 1), nombre, estado);
                estantes[numEstante] = e;
                productos[numEstante] = p;
                System.out.println("ALMACEN: Estado de los estantes");
                for (int i = 0; i < estantes.length; i++) {
                    if (estantes[i] != null) {
                        System.out.println((i + 1) + ". " + estantes[i]);
                    } else {
                        System.out.println((i + 1) + ". Estante disponible");
                    }
                }
            }
        }
    }

    public void cambiarProductoEstante() {
        System.out.println("ALMACEN: Estado de los estantes");
        for (int i = 0; i < estantes.length; i++) {
            if (estantes[i] != null) {
                System.out.println((i + 1) + ". " + estantes[i]);
            } else {
                System.out.println((i + 1) + ". Estante disponible");
            }
        }
        System.out.print("Ingrese estante actual y nuevo (separe los datos con un &): ");
        String[] datos = sc.nextLine().split("&");
        int actual = Integer.parseInt(datos[0]);
        int nuevo = Integer.parseInt(datos[1]);
        actual -= 1;
        nuevo -= 1;
        if (actual > estantes.length || nuevo < -1 || actual < -1 || nuevo > estantes.length) {
            System.out.println("El id de estante no existe en el almacen.");
        } else if (estaVacio(estantes) || estantes[actual] == null) {
            System.out.println("No existe el producto seleccionado.");
        } else if (estantes[nuevo] != null && !estantes[nuevo].isEstado()) {
            System.out.println("No es posible mover el producto " + estantes[actual] + " al estante seleccionado porque se encuentra ocupado con el producto " + estantes[nuevo]);
        } else {
            estantes[nuevo] = estantes[actual];
            estantes[actual] = null;
            productos[nuevo] = productos[actual];
            productos[actual] = null;
        }
    }

    public void agregarProductoInventario() {
        System.out.println("ALMACEN: Estado de los estantes");
        for (int i = 0; i < estantes.length; i++) {
            if (estantes[i] != null) {
                System.out.println((i + 1) + ". " + estantes[i]);
            } else {
                System.out.println((i + 1) + ". Estante disponible");
            }
        }
        System.out.print("Id producto a ingresar: ");
        int idProducto = Integer.parseInt(sc.nextLine());
        idProducto -= 1;
        if (idProducto > estantes.length || idProducto < -1) {
            System.out.println("Dato incorrecto.");
        } else if (estantes[idProducto] == null) {
            System.out.println("Estante vacio.");
        } else {
            System.out.print("Cantidad: ");
            int cantidad = Integer.parseInt(sc.nextLine());
            productos[idProducto].agregarInventario(cantidad);
        }
    }

    public void registrarVenta() {
        System.out.println("Empleados registrados:");
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println((i + 1) + ". " + empleados.get(i));
        }
        System.out.println("");
        System.out.println("ALMACEN: Estado de los estantes");
        for (int i = 0; i < estantes.length; i++) {
            if (estantes[i] != null) {
                System.out.println((i + 1) + ". " + estantes[i]);
            } else {
                System.out.println((i + 1) + ". Estante disponible");
            }
        }
        System.out.println("");
        System.out.print("Id empleado e id producto (separe los dos numeros usando un &): ");
        String[] datos = sc.nextLine().split("&");
        int idEmpleado = Integer.parseInt(datos[0]);
        int idProducto = Integer.parseInt(datos[1]);
        idEmpleado -= 1;
        idProducto -= 1;
        if (idEmpleado >= empleados.size() || idEmpleado < 0 || idProducto < 0 || idProducto >= productos.length) {
            System.out.println("El id de estante no existe en el almacen.");
        } else {
            System.out.print("Cantidad: ");
            int cantidad = Integer.parseInt(sc.nextLine());
            if (cantidad <= 0) {
                System.out.println("Alguno de los datos ingresados no es correcto");
            } else if (cantidad <= productos[idProducto].getCantidad()) {
                empleados.get(idEmpleado).aumentarCantidad(cantidad);
                productos[idProducto].registrarVenta(cantidad);
                empleados.get(idEmpleado).registrarVenta(cantidad, productos[idProducto].getPrecio());
            } else {
                System.out.println("Cantidad debe ser menor o igual que el stock");
            }
        }
    }

    public void mostrarMejorEmpleado() {
        Empleado mejorEmpleado = new Empleado("");
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getCantidadProductos() > mejorEmpleado.getCantidadProductos()) {
                mejorEmpleado = empleados.get(i);
            }
        }
        if (mejorEmpleado.getCantidadProductos() == 0) {
            System.out.println("Ningun empleado ha registrado ventas.");
        } else {
            System.out.println("El mejor empleado es: " + mejorEmpleado + " con " + mejorEmpleado.getCantidadProductos() + " ventas realizadas.");
        }
    }

    public void mostrarIngresoTotal() {
        double ingresosTotales = 0;
        for (Empleado empleado : empleados) {
            ingresosTotales += empleado.getVentasRegistradas();
        }
        System.out.println("Los ingresos totales son: " + ingresosTotales);
    }

    public void mostrarInventario() {
        System.out.println("INVENTARIO: Cantidad actual de productos");
        for (int i = 0; i < estantes.length; i++) {
            if (productos[i] != null) {
                System.out.println((i + 1) + ". " + productos[i]);
            } else {
                System.out.println((i + 1) + ". Estante disponible");
            }
        }
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados registrados:");
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println((i + 1) + ". " + empleados.get(i));
        }
    }

    public boolean estaVacio(Object[] arr) {
        boolean bandera = true;
        int i = 0;
        while (i < arr.length && bandera) {
            if (arr[i] != null) {
                bandera = false;
            }
            i++;
        }
        return bandera;
    }

}
