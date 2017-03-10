package model;
/**
 * Clase encargada de gestionar el carrito de nuestra tienda
 * @author Alejandro
 */
public class Carrito{
  
    private String nombre;
    private String descripcion;
    private double precio;
    private String imagen;//PATH IMAGEN
    private int cantidad;
    
    public Carrito (){        
    }

    public Carrito(String nombre, String descripcion, double precio,String imagen, int cantidad) {
   
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.imagen = imagen;
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

    
    public String getImagen(){
    	return imagen;
    	
    }
    
    public int getCantidad(){
    	return cantidad;
    }
    
}
