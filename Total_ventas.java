public class Total_ventas {
 
    private int id_producto;
    private String nombre_producto; 
    private int total;

    public Total_ventas(int id_producto,String nombre_producto,int total) {
        this.id_producto = id_producto;
        this.nombre_producto=nombre_producto;
        this.total=total;
       
    }

      public int getIdProd(){return id_producto;}
    public String getNombreProd(){return nombre_producto;}
    public int getTotal(){return total;}
    public void setNombre(String nombre_producto){this.nombre_producto=nombre_producto;}
    
    

    @Override
    public String toString() {
        return id_producto + "," + nombre_producto + "," + total ;
    }
}