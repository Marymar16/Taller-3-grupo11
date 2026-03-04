public class Clientes {
 
    private int id_cliente;
    private String nombre; 
    private String email;

    public Clientes(int id_cliente,String nombre,String email) {
        this.id_cliente = id_cliente;
        this.nombre=nombre;
        this.email=email;
       
    }

      public int getId(){return id_cliente;}
    public String getNombre(){return nombre;}
    public String getEmail(){return email;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setEmail(String email){this.email=email;}
    

    @Override
    public String toString() {
        return id_cliente + "," + nombre + "," + email ;
    }
}