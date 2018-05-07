import javax.swing.JOptionPane;

public class Exemplo03 {

	public static void main(String[] args) {
		
		int [] codigos = new int[5];
		String[] nomes = new String [5];
		
		for(int i = 0; i < codigos.length; i++){
			nomes[i] = JOptionPane.showInputDialog(null,
					"Digite o Nome: " + (i + i));
			codigos[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Digite o código: " + (i + 1)));
			
		}
		
		for(int i = 0; i < codigos.length; i++){
			System.out.println(
					"\nNOme: " + nomes[i] + 
					"\nCódigo: " + codigos[i]);
		}
		
		

	}

}
