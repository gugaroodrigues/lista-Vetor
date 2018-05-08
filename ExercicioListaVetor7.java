package listaVetor;

import javax.swing.JOptionPane;

public class ExercicioListaVetor7 {

	public static void main(String[] args) {
		
		double[]altura = new double[4];
		
		altura[0] = Double.parseDouble(JOptionPane.showInputDialog(null, " Primeira Altura: ", 
				"Controlador de altura", JOptionPane.QUESTION_MESSAGE));
		altura[1] = Double.parseDouble(JOptionPane.showInputDialog(null, " Segunda Altura: ", 
				"Controlador de altura", JOptionPane.QUESTION_MESSAGE));
		altura[2] = Double.parseDouble(JOptionPane.showInputDialog(null, " Terceira Altura: ", 
				"Controlador de altura", JOptionPane.QUESTION_MESSAGE));
		altura[3] = Double.parseDouble(JOptionPane.showInputDialog(null, " Quarta Altura: ", 
				"Controlador de altura", JOptionPane.QUESTION_MESSAGE));
		
		double menorAltura = Integer.MAX_VALUE;
		
		if(altura[0] < menorAltura){
			menorAltura = altura[0];
			JOptionPane.showMessageDialog(null, "A menor altura é: " + altura[0]);
			
		}if(altura[1] < menorAltura){
			menorAltura = altura[1];
			JOptionPane.showMessageDialog(null, "A menor altura é: " + altura[1]);
				
		}if(altura[2] < menorAltura){
			menorAltura = altura[2];
			JOptionPane.showMessageDialog(null, "A menor altura é: " + altura[2]);
			
		}if(altura[3] < menorAltura){
			menorAltura = altura[3];
			JOptionPane.showMessageDialog(null, "A menor altura é: " + altura[3]);
		} 
		

	}

}
