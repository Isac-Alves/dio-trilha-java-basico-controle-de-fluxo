import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite o número: ");
		int NumeroUm = input.nextInt();
		System.out.println("Digite o segundo número: ");
		int NumeroDois = input.nextInt();
		
		try {
			contar(NumeroUm, NumeroDois);
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
		}

		input.close();
		
	}
	static void contar(int NumeroUm, int NumeroDois ) throws ParametrosInvalidosException {

		if(NumeroUm > NumeroDois){
			throw new ParametrosInvalidosException();
		}
		int contagem =  NumeroDois - NumeroUm;

		for(int contador = 1; contador <= contagem ; contador++){
			System.out.println("Imprimindo o número " + contador);
		}
	}
}