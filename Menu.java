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
                ordenarProducto();
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
public static void ordenarProducto (){
        String[] nombres = new String[20];
        int[] precios = new int[20];
        int[] stock = new int[20];

        int n = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("Productos.txt"));
            String linea;

            br.readLine(); // saltar encabezado

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                nombres[n] = datos[1];
                precios[n] = Integer.parseInt(datos[3]);
                stock[n] = Integer.parseInt(datos[4]);

                n++;
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error leyendo archivo");
        }

        // Ordenamiento
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (precios[j] > precios[j + 1]) {

                    int tempPrecio = precios[j];
                    precios[j] = precios[j + 1];
                    precios[j + 1] = tempPrecio;

                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;

                    int tempStock = stock[j];
                    stock[j] = stock[j + 1];
                    stock[j + 1] = tempStock;
                }
            }
        }

        // Mostrar productos ordenados
        System.out.println("Productos ordenados por precio:");

        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i] + " - $" + precios[i] + " - Stock: " + stock[i]);
        }
    }
}
