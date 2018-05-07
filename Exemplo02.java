import java.util.Scanner;
public class Exemplo02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a quantidade " 
		+ "nomes que deseja cadastrar");
		int quantidadeRegistros = Integer.parseInt(teclado.nextLine());
		
		
		String[] nomes = new String[quantidadeRegistros];
		int [] idade = new  int[quantidadeRegistros];
		double [] pesos = new double[quantidadeRegistros];
		for(int i = 0; i < nomes.length; i++){
			System.out.print("Nome: ");
			nomes[i] = teclado.nextLine();
			
			System.out.print("Idade: ");
			idade [i] = Integer.parseInt(teclado.nextLine());
			
			System.out.print("Peso: ");
			pesos [i] = Double.parseDouble(teclado.nextLine());
		}
		
		for (int i = 0; i < idade.length; i++){
			System.out.println(
					"\nNomes: " + nomes [i]+
					"\nIdade: " + idade	[i]+
					"\nPeso: " + pesos[i]);
		}
		
		int somaIdades = 0;
		for (int i = 0; i <idade.length; i++){
			somaIdades = somaIdades + idade [i];
			
		}
		System.out.println("Soma das idadesé : " + somaIdades);
		
		double media = somaIdades / idade.length;
		
		int menorIdade =  Integer.MAX_VALUE;
		for(int i = 0; i < idade.length; i++){
			int idadeAtual = idade[i];
			
			if(idadeAtual > menorIdade){
				menorIdade = idadeAtual;
			}
		}
		
		int maiorIdade = Integer.MIN_VALUE;
		for(int i = idade.length - 1; i >= 0; i--){
			if(idade [i] > maiorIdade){
				maiorIdade = idade[i];
			}
		}
		System.out.println(
				"\nMaior idade: " + maiorIdade + 
				"\nMenor Idade: " + menorIdade + 
				"Soma das idades é: " + somaIdades + 
				"\nMedia das Idades é : " + media);


	}

}
