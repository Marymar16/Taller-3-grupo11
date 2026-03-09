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
                calcularVentas();
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
 public static void calcularVentas() {

        ArrayList<Total_ventas> ventas = new ArrayList<>();
        HashMap<Integer, Integer> precios = new HashMap<>();
        HashMap<Integer, String> nombres = new HashMap<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader("productos.csv"));
            String linea;

            br.readLine();

            while((linea = br.readLine()) != null){

                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                int precio = Integer.parseInt(datos[3]);

                precios.put(id, precio);
                nombres.put(id, nombre);
            }

            br.close();


            BufferedReader br2 = new BufferedReader(new FileReader("pedidos.csv"));

            br2.readLine();

            HashMap<Integer,Integer> totalVentas = new HashMap<>();

            while((linea = br2.readLine()) != null){

                String[] datos = linea.split(",");

                int producto_id = Integer.parseInt(datos[2]);
                int cantidad = Integer.parseInt(datos[3]);

                int precio = precios.get(producto_id);

                int total = cantidad * precio;

                totalVentas.put(producto_id,
                        totalVentas.getOrDefault(producto_id,0) + total);
            }

            br2.close();


            for(Integer id : totalVentas.keySet()){

                ventas.add(new Total_ventas(
                        id,
                        nombres.get(id),
                        totalVentas.get(id)
                ));
            }


            for(int i=0;i<ventas.size()-1;i++){

                for(int j=0;j<ventas.size()-i-1;j++){

                    if(ventas.get(j).getTotal() < ventas.get(j+1).getTotal()){

                        Total_ventas temp = ventas.get(j);
                        ventas.set(j, ventas.get(j+1));
                        ventas.set(j+1, temp);
                    }
                }
            }


            BufferedWriter bw = new BufferedWriter(new FileWriter("total_ventas.csv"));

            bw.write("producto_id,nombre_producto,total\n");

            for(Total_ventas v : ventas){

                bw.write(v.toString());
                bw.newLine();
            }

            bw.close();

            System.out.println("Archivo total_ventas.csv creado correctamente");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
