package modelo;
/**
 * Clase encargada de gestionar los productos de nuestra tienda
 * @author Alejandro
 */
public class Producto{
  
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
   //IMAGEN
    
    

    public Producto (){        
    }

    public Producto(String nombre, String descripcion, double precio, int stock) {
   
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
    
    public Producto(String nombre,String descripcion, double precio, int stock) {
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
       
       
    }


    public String getNombre() {
        return nombre;
    }
    
    public String getdescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getDisponibilidad (){
        if (stock > 0){
            return "Stock disponible";
        }else{
            return "Agotado";
        }
    }
}
