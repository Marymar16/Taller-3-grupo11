import java.util.Scanner;

public class Menu {
    scanner sc = new Scanner(System.in);

public static void mostrarMenu() {
    int opcion;
        System.out.println("Menú:");
        System.out.println("1. Organizar productos por precio");
        System.out.println("2. Agregar nuevo cliente");
        System.out.println("3. Venta total por producto");
        System.out.println("4. Mostrar clientes que han comprado");
        System.out.println("5. Salir");
        opcion = sc.nextInt(); 
}

switch (opcion) {
            case 1:
                Productos.ordenarProducto();
                break;
            case 2:
                Clientes.agregarCliente();
                break;
            case 3:
                Ventas.ventaTotalPorProducto();
                break;
            case 4:
                Ventas.mostrarClientesQueHanComprado();
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }



}