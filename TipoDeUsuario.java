package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TipoDeUsuario extends JPanel
implements ActionListener {
	
	static String userString = "Usuario";
	static String adminString = "Administrador";

public  TipoDeUsuario() {
        super(new BorderLayout());
	
	JRadioButton userButton = new JRadioButton(userString);
    userButton.setMnemonic(KeyEvent.VK_B);
    userButton.setActionCommand(userString);
    userButton.setSelected(true);
    
    JRadioButton adminButton = new JRadioButton(adminString);
    adminButton.setMnemonic(KeyEvent.VK_C);
    adminButton.setActionCommand(adminString);
    
    ButtonGroup group = new ButtonGroup();
    group.add(userButton);
    group.add(adminButton);
    
    userButton.addActionListener(this);
    adminButton.addActionListener(this);
    
  
    JPanel radioPanel = new JPanel(new GridLayout(0, 1)); //Numero de filas y columnas 
    radioPanel.add(userButton);
    radioPanel.add(adminButton);
    
    add(radioPanel, BorderLayout.LINE_START);
    setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
	}
    
    private static void createAndShowGUI() {
    
        JFrame frame = new JFrame("Tipo de usuario");
        frame.setSize(200, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        
        JComponent newContentPane = new TipoDeUsuario();
        newContentPane.setOpaque(true); 
        frame.setContentPane(newContentPane);
 
        
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }


	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}
	
	
	}




