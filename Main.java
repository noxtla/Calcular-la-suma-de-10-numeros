package ciclos;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	int numero,resultado=0;
	
	

	for (int i =0; i<10; i++) {
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero "));
		 resultado += numero;
	 }
	JOptionPane.showMessageDialog(null, "La suma es " + resultado); 
	}
}

