package listaVetor;

import javax.swing.JOptionPane;

public class ExercicioListaVetor4 {

	public static void main(String[] args) {

		String materia = "";
		double[] nota = new double[4];

		materia = JOptionPane.showInputDialog(null, "Digite a materia: ");
		nota[0] = Double.parseDouble(JOptionPane.showInputDialog(null, " Primeira nota: "));
		nota[1] = Double.parseDouble(JOptionPane.showInputDialog(null, " Segunda nota: "));
		nota[2] = Double.parseDouble(JOptionPane.showInputDialog(null, " Terceira nota: "));
		nota[3] = Double.parseDouble(JOptionPane.showInputDialog(null, " Quarta nota: "));
		
		double media = (nota[0] + nota[1] + nota[2] + nota[3])/4;

		   JOptionPane.showMessageDialog(null, "Materia escolhida: " + materia + "\nMedia: " + media);
	}

}
