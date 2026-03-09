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
                agregarCliente();
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
public static void agregarCliente(){

        try{

            System.out.println("ID cliente:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Nombre:");
            String nombre = sc.nextLine();

            System.out.println("Email:");
            String email = sc.nextLine();

            Clientes c = new Clientes(id,nombre,email);

            FileWriter fw = new FileWriter("clientes.txt", true);
            fw.write(c.toString() + "\n");
            fw.close();

            System.out.println("Cliente agregado");

        }catch(Exception e){
            System.out.println("Error agregando cliente");
        }

    }
}
