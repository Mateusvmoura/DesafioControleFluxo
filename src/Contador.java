
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        // Interagindo com usuário para leitura de dados
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
        
	 	
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
	
	}    
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm>parametroDois){
           throw new ParametrosInvalidosException();
        }
		
        
		int contagem = parametroDois - parametroUm;
		
        for ( int contador = 1; contador <= contagem; contador++ ){
            System.out.println("Imprimindo o número " + contador);
        }

	}
}