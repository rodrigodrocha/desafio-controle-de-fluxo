import java.util.Scanner;

public class Contador extends Exception {
	public static void main(String[] args) throws ParametrosInvalidos {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		final int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidos e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro"); 
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidos {
		if(parametroUm > parametroDois){
			throw new ParametrosInvalidos(); 
			
		}
		
		
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++){
			System.out.println(i + ".");
		}
		//realizar o for para imprimir os números com base na variável contagem
	}
}