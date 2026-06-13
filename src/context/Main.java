package context;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//Atributos
		int v = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Velocidad"));
        int t = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Tiempo (Seg)"));
        
        //Formula
        int d = (v * t);
        
        //Resultado
        JOptionPane.showMessageDialog(null, "Distancia: " + d);
	}

}
