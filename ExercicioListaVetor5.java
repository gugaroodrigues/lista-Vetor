package listaVetor;

import javax.swing.JOptionPane;

public class ExercicioListaVetor5 {

	public static void main(String[] args) {

		double[] pesos = new double[5];

		pesos[0] = Double.parseDouble(JOptionPane.showInputDialog(null, " Primeiro peso: ", "Sitema de pesagem",
				JOptionPane.QUESTION_MESSAGE));
		pesos[1] = Double.parseDouble(JOptionPane.showInputDialog(null, " Segundo peso: ", "Sitema de pesagem",
				JOptionPane.QUESTION_MESSAGE));
		pesos[2] = Double.parseDouble(JOptionPane.showInputDialog(null, " terceiro peso: ", "Sitema de pesagem",
				JOptionPane.QUESTION_MESSAGE));
		pesos[3] = Double.parseDouble(JOptionPane.showInputDialog(null, " Quarto peso: ", "Sitema de pesagem",
				JOptionPane.QUESTION_MESSAGE));
		
		double total = pesos[0] + pesos[1] + pesos[2] + pesos[3];
		double media = total/4;
		
		   JOptionPane.showMessageDialog(null, "Total dos pesos: " + total +  "\nMedia: " + media);

	}

}
