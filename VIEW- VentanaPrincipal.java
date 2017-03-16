package view;


import java.awt.event.KeyEvent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import control.MainController;


public class VentanaPrincipal extends JFrame
{
	MainController controlador;
	
	public VentanaPrincipal () {
		super();
		
		// Creamos la vista 
		setSize(1200, 1200);
		setTitle("VentanaPrincipal");
		
		
	}
	
	public void addController (MainController mc) { 
		controlador=mc;		
	}
	
	public void crearVista ()
	{
		crearMenu();
		
		setContentPane(new JDesktopPane());
		setVisible(true);
	}
	
	public void crearMenu ()
	{	

          JMenuBar menuBar;
          JMenu menu;
          JMenuItem menuItem;
          
          //Crea la barra de men�
          menuBar = new JMenuBar();
          setJMenuBar(menuBar);

          //Primer men�
          menu = new JMenu("Producto");
          menu.setMnemonic(KeyEvent.VK_P);
 
          //Submen� 1
          menuItem = new JMenuItem("Nuevo",KeyEvent.VK_N);
          menuItem.getAccessibleContext().setAccessibleDescription("Nuevo");
          // A�adimos controlador al item de men�
          menuItem.addActionListener(controlador);
          // Asociamos un comando del controlador
          menuItem.setActionCommand(MainController.NUEVO);
          menu.add(menuItem);
          
          //Submen� 2
          menuItem = new JMenuItem("Mostrar",KeyEvent.VK_M);
          menuItem.getAccessibleContext().setAccessibleDescription("Mostrar");
          // A�adimos controlador al item de men�
          menuItem.addActionListener(controlador);
          // Asociamos un comando del controlador
          menuItem.setActionCommand(MainController.MOSTRAR);
          menu.add(menuItem);
          
         
          
          menuBar.add(menu);
	}


}
