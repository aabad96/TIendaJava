package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

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
		
		mc.listaProductos.add(productoNuevo);
		
		System.out.println("Producto añadido: "+ productoNuevo.getNombre()+ " " + productoNuevo.getdescripcion() + " " + productoNuevo.getPrecio() + " " + productoNuevo.getStock() + " " + productoNuevo.getImagen());
		this.guardarArchivo(mc.listaProductos);
		
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

	
	
	
	public boolean guardarArchivo(Vector<Producto> listaProductos) {
		boolean bRet = true;
		try {
			FileWriter fw = new FileWriter("Producto.txt");
			String str = "";
	
	     for (int i=0; i < listaProductos.size(); i++){
	    	 str = listaProductos.get(i).getNombre() + ";" + listaProductos.get(i).getdescripcion() + ";" + Double.toString(listaProductos.get(i).getPrecio()) + ";" 
	    			 + Integer.toString(listaProductos.get(i).getStock()) + ";" + listaProductos.get(i).getImagen()  ;
	     		fw.write(str);
				
			}
			
	     
		} catch (IOException exc) {
			System.err.println("Error al escribir en archivo: " + exc);
			bRet = false;
		}
		return bRet;
	}

}
