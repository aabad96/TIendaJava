package model;
/**
 * Clase encargada de gestionar los productos de nuestra tienda
 * @author Alejandro
 */
public class Producto {
  
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String imagen;//PATH IMAGEN
    
    public Producto (){        
    }

    public Producto(String nombre, String descripcion, String precio, String stock, String imagen) {
    	
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = Double.parseDouble(precio);
        this.stock = Integer.parseInt(stock);
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

    public int getStock() {
        return stock;
    }
    public String getImagen(){
    	return imagen;
    	
    }
/*
    public String getDisponibilidad (){
        if (stock > 0){
            return "Stock disponible";
        }else{
            return "Agotado";
        }
    }
    */
    
    
}
