package control;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import model.Archivo;
import model.Producto;

import view.VentanaProductos;
import view.VentanaPrincipal;



public class MainController implements ActionListener
{
	public final static String NUEVO="L";
	public final static String MOSTRAR="Tº";
	
	VentanaPrincipal ventanaControlada;
	Producto[] listaProductos = new Producto[20];
	
	Archivo miArchivo = new Archivo("MisProductos.txt");
	
	
	public MainController(VentanaPrincipal win){
		ventanaControlada = win;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		// Cambio el cursor por un reloj
		
		Cursor cur = new Cursor(Cursor.WAIT_CURSOR);
		
        ventanaControlada.setCursor(cur);        

    	String cmd = (String)(e.getActionCommand());
        abrirVentana(cmd);
		
		// Dejo el cursor como estaba
        
		cur = new Cursor(Cursor.DEFAULT_CURSOR);
        ventanaControlada.setCursor(cur);        
    } 
    
    public void abrirVentana(String cmd) {
    	
		if (cmd.equals(MainController.NUEVO)) {

			// Creo la ventana para representarlo
			VentanaProductos interna = new VentanaProductos();

			// Creo el controlador pasando la ventana
			ControladorProductos cp = new ControladorProductos(interna, this);

			// Le Asociamos el controlador a la ventana
			interna.addController(cp);
			interna.crearVista();

			// La a�ado a la ventana principal
			ventanaControlada.getContentPane().add(interna);
		} else {
			
			System.out.println(this.listaProductos);			
		}

	}	
    
    

	public void cerrarVentana()
	{
		ventanaControlada.dispose();
		System.exit(0);
	}	

	public static void main(String args[])
	{
		System.out.println("Starting VentanaPrincipal...");
		

		VentanaPrincipal mainFrame = new VentanaPrincipal();
		
		// Creo el controlador pasando la ventana
		MainController mc = new MainController(mainFrame);
		
		// Le Asociamos el controlador a la ventana
		
		mainFrame.addController(mc);
		
		mainFrame.crearVista();
		
	

	

	
}

}
