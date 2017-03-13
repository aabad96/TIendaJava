package view;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import control.ControladorProductos;

import java.awt.FlowLayout;
import java.util.Vector;


public class VentanaProductos extends JInternalFrame{
	
	private ControladorProductos cp;

	JLabel titulo;
	JLabel etiquetaNombre;
	JLabel etiquetaDescripcion;
	JLabel etiquetaPrecio;
	public JTextField campoNombre;
	public JTextField campoDescripcion;
	public JTextField campoPrecio;
	public JButton botonAñadirUsuario;
	
	static int xPos=100;
	static int yPos=100;
	
	
    /**
	 * @param title
	 * @param resizable
	 * @param closable
	 * @param maximizable
	 * @param iconifiable
	 */
	public VentanaProductos() {
		super("Ventana Producto", false, true, true, true);
	}
	
	public void addController (ControladorProductos cp){
		 
		this.cp=cp;
	}

	public void crearVista() {
    	this.getContentPane().setLayout(new FlowLayout());
		
		JPanel panelDelCombo = new JPanel();
		JPanel panelDelUsuario = new JPanel();
		
		this.getContentPane().add(panelDelCombo);
		this.getContentPane().add(panelDelUsuario);
		this.setSize(450,125);
		this.setLocation(xPos, yPos);
        xPos=xPos+10;
        yPos=yPos+10;

		// Dibujo el panel del Combo
		titulo = new JLabel ("Gestión de Usuarios");
        panelDelCombo.add (titulo);
               		
		// Dibujo el panel del Usuario
        panelDelUsuario.setLayout(new FlowLayout());
		
        etiquetaNombre= new JLabel ("Nombre Producto");
        etiquetaDescripcion= new JLabel ("Descripcion");
        etiquetaPrecio= new JLabel ("Precio");
        campoDescripcion = new JTextField (10);
    	campoNombre = new JTextField (10);
    	campoPrecio = new JTextField (10);
    	botonAñadirUsuario = new JButton ("Añadir");

        panelDelUsuario.add(etiquetaNombre);
		panelDelUsuario.add(campoNombre);
		panelDelUsuario.add(etiquetaDescripcion);
		panelDelUsuario.add(campoDescripcion);
		panelDelUsuario.add(etiquetaPrecio);
		panelDelUsuario.add(campoPrecio);
		panelDelUsuario.add(botonAñadirUsuario);
		botonAñadirUsuario.addActionListener(this.cp);
		         
        this.setVisible(true);
        
    }
}
