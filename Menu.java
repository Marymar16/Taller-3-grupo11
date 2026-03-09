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
                clientesConCompras();
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    }while(opcion != 5);
}
public static void clientesConCompras(){

        try{

            BufferedReader brClientes = new BufferedReader(new FileReader("clientes.txt"));
            BufferedReader brPedidos = new BufferedReader(new FileReader("pedidos.txt"));

            ArrayList<Clientes> clientes = new ArrayList<>();
            ArrayList<Pedidos> pedidos = new ArrayList<>();

            String linea;

            while((linea = brClientes.readLine()) != null){

                String d[] = linea.split(",");

                clientes.add(new Clientes(
                        Integer.parseInt(d[0]),
                        d[1],
                        d[2]
                ));
            }

            while((linea = brPedidos.readLine()) != null){

                String d[] = linea.split(",");

                pedidos.add(new Pedidos(
                        Integer.parseInt(d[2]),
                        Integer.parseInt(d[1]),
                        Integer.parseInt(d[0]),
                        Integer.parseInt(d[3]),
                        d[4]
                ));
            }

            System.out.println("CLIENTES QUE HAN COMPRADO:");

            for(Clientes c : clientes){

                for(Pedidos p : pedidos){

                    if(c.getId() == p.getIdclte()){

                        System.out.println(c.getNombre());
                        break;

                    }

                }

            }

        }catch(Exception e){
            System.out.println("Error leyendo clientes");
        }

    }
}
