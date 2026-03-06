public class Productos {
 
    private int id_producto;
    private String nombreproducto; 
    private String categoria;
    private int precio;
    private int stock;

    public Productos(int id_producto, String nombreproducto, String categoria, int precio, int stock) {
        this.id_producto = id_producto;
        this.nombreproducto=nombreproducto;
        this.categoria=categoria;
       this.precio=precio;
       this.stock=stock;
    }

      public int getIdpro(){return id_producto;}
    public String getNombreproducto(){return nombreproducto;}
    public String getcategoria(){return categoria;}
    public int getPrecio(){return precio;}
    public int getStock(){return stock;}
    public void setNombre(String nombreproducto){this.nombreproducto=nombreproducto;}
    public void setCategoria(String categoria){this.categoria=categoria;}
    

    @Override
    public String toString() {
        return id_producto + "," + nombreproducto + "," + categoria + "," + precio + "," + stock ;
    }

public static void ordenarProducto ()){
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

    public static void main(String[] args) {
        ordenarProductosPorPrecio();
    }

}

}