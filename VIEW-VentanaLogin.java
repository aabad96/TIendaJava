package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class VentanaLogin{

	public static void main(String[] args) {
		JFrame frame = new JFrame("Login"); //Creamos una ventana, que tenga Login como nombre en la cabezera 
		frame.setSize(250, 150); //Dimensiones de la ventana 250px x 150px
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cuando se cierra la ventana se termina el programa
		
		JPanel panel = new JPanel(); 
		frame.add(panel);
		crearLogin(panel);
		
		frame.setVisible(true);
			
	}


	private static void crearLogin(JPanel panel) {

		panel.setLayout(null); //Organiza donde va a parar cada componente

		JLabel userLabel = new JLabel("Usuario: "); //Crea la etiqueta de texto que muesta usuario 
		userLabel.setBounds(10, 10, 80, 25); // Coordenadas 
		panel.add(userLabel);

		JTextField userText = new JTextField(20); // Crea un campo de texto vacio 
		userText.setBounds(100, 10, 130, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Contraseña: "); //Crea una etiqueta con caracteres especiales para no poder ver el texto 
		passwordLabel.setBounds(10, 40, 80, 25); // Coordenadas 
		panel.add(passwordLabel); //

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 130, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("Entrar"); //Creamos un boton que nos da acceso al programa
		loginButton.setBounds(20, 80, 85, 25);
		panel.add(loginButton);
		
		JButton crearCuenta = new JButton("Crear cuenta"); //Creamos un boton que nos permite crearnos una cuenta
		crearCuenta.setBounds(100, 80, 115, 25);
		panel.add(crearCuenta);
		


	
	
	}

}
