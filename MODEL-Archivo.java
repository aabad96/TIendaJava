package model;


import java.io.FileWriter;
import java.io.IOException;

import java.util.InputMismatchException;

public class Archivo {

private String filename;
	
	
	public Archivo(String filename) {
		this.filename = filename;
	}
	
	
	public boolean guarda(Producto productoNuevo) {
		boolean bRet = true;
		try (FileWriter fw = new FileWriter(filename)) {
			String str = productoNuevo.toString();
	     fw.write(str);
	     // String listaProductos =  productoNuevo.toString();
	     	 
			//for (int i=0; i<listaProductos.length(); i++) { 
				
			//	String str1 = String.toString(listaProductos[i]) + " "; 
			//	fw.write(str1);
		//	}
	     
		} catch(IOException exc) {
			System.err.println("Error al escribir en archivo: " + exc);
			bRet = false;
		}
		return bRet;
	}
}
