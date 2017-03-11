package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Producto;

import view.VentanaProductos;

public class ControladorProductos implements ActionListener{
	
	private VentanaProductos ventana;
	private MainController mc;

	public void actionPerformed(ActionEvent arg0) {

		Producto productoNuevo = new Producto(ventana.campoNombre.getText(),ventana.campoDescripcion.getText(),ventana.campoPrecio.getText());
		mc.listaProductos.add(productoNuevo);
		
		System.out.println("Producto añadido: "+productoNuevo);
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
