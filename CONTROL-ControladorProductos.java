package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	

}
