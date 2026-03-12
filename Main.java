import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {

            System.out.println("------ MENU ------");
            System.out.println("1. Ordenar productos por precio");
            System.out.println("2. Agregar nuevo cliente");
            System.out.println("3. Calcular total de ventas por producto");
            System.out.println("4. Ver clientes que han hecho compras");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){

                case 1:
                    ordenarProductos();
                    break;

                case 2:
                    
                    break;

                case 3:
                   
                    break;

                case 4:
                    
                    break;

                case 5:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        }while(opcion != 5);

    }

    public static void ordenarProductos(){

        ArrayList<Productos> lista = new ArrayList<>();

        try{

            BufferedReader br = new BufferedReader(new FileReader("productos.txt"));
            String linea;

            while((linea = br.readLine()) != null){

                String datos[] = linea.split(",");

                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String categoria = datos[2];
                int precio = Integer.parseInt(datos[3]);
                int stock = Integer.parseInt(datos[4]);

                lista.add(new Productos(id,nombre,categoria,precio,stock));
            }

            br.close();

            Collections.sort(lista, new Comparator<Productos>(){

                public int compare(Productos p1, Productos p2){
                    return p1.getPrecio() - p2.getPrecio();
                }

            });

            System.out.println("PRODUCTOS ORDENADOS:");

            for(Productos p : lista){
                System.out.println(p);
            }

        }catch(Exception e){
            System.out.println("Error leyendo productos");
        }

    }
}