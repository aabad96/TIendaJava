package model;

public class Producto {


	private String nombre;
	private String descripcion;
	private String precio;
	
	
	
	
	/**
	 * @param nombre
	 */
	public Producto(String nombre, String descripcion, String precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public String toString() {

		return nombre;
	}
	
}
