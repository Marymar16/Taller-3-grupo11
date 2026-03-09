import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

 public static void menu(String[] args) {
    int opcion;
    do{
        System.out.println("Menú:");
        System.out.println("1. Organizar productos por precio");
        System.out.println("2. Agregar nuevo cliente");
        System.out.println("3. Venta total por producto");
        System.out.println("4. Mostrar clientes que han comprado");
        System.out.println("5. Salir");

        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    }while(opcion != 5);
}
}
