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
}