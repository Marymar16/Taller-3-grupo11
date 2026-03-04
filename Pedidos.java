public class Pedidos {
 
    private int id_pedido;
    private int id_cliente; 
    private int id_producto;
    private int cantidad;
    private String fecha;

    public Pedidos(int id_producto, int id_cliente, int id_pedido, int cantidad, String fecha) {
        this.id_producto = id_producto;
        this.id_cliente=id_cliente;
        this.id_pedido=id_pedido;
       this.cantidad=cantidad;
       this.fecha=fecha;
    }

      public int getIdpro(){return id_producto;}
    public int getIdclte(){return id_cliente;}
    public int getIdped(){return id_pedido;}
    public int getcant(){return cantidad;}
    public String getfecha(){return fecha;}
    public void setfecha(String fecha){this.fecha=fecha;}
    
    

    @Override
    public String toString() {
        return id_pedido + "," + id_cliente + "," + id_producto + "," + cantidad + "," + fecha ;
    }
}