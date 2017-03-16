package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;


import model.Producto;

import view.VentanaProductos;

public class ControladorProductos implements ActionListener{
	
	private VentanaProductos ventana;
	private MainController mc;
	public static final String add = "a";
	

	
	public void actionPerformed(ActionEvent arg0) {
		
		String lista=(String)arg0.getActionCommand();
		
		if (lista.equals(add)){
		
			Producto productoNuevo = new Producto(ventana.campoNombre.getText(),ventana.campoDescripcion.getText(),ventana.campoPrecio.getText(),ventana.campoStock.getText(),ventana.campoImagen.getText());
		
		mc.listaProductos[0]=(Producto) productoNuevo;
		
		System.out.println("Producto añadido: "+ productoNuevo.getNombre()+ " " + productoNuevo.getdescripcion() + " " + productoNuevo.getPrecio() + " " + productoNuevo.getStock() + " " + productoNuevo.getImagen());
		this.guardarArchivo(productoNuevo);
		
	}
	}
	/**
	 * @param ventana
	 * @param mc
	 */
	public ControladorProductos(VentanaProductos ventana, MainController mc) {
		super();
		this.ventana = ventana;
		this.mc = mc;
	}
	
	
	
	
	public boolean guardarArchivo(Producto pp) {
		boolean bRet = true;
		try (FileWriter fw = new FileWriter("Producto.txt")) {
			String str = pp.getNombre() + ";" + pp.getdescripcion() + ";" + Double.toString(pp.getPrecio()) + ";" + Integer.toString(pp.getStock()) + ";" + pp.getImagen()  ;
	     fw.write(str);
	   // String listaProductos[] ;
	     //	for (int i=0; i<listaProductos.length; i++) { 
			//	System.out.println("Producto añadido: " + i + " = " + listaProductos[i]);
				//String str1 = listaProductos[i] + " "; 
				//fw.write(str1);
			//}
			
	     
		} catch(IOException exc) {
			System.err.println("Error al escribir en archivo: " + exc);
			bRet = false;
		}
		return bRet;
	}

}
