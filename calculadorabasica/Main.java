package calculadorabasica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pode inserir o primeiro n�mero, seu chato?");
		
		numero1 = input.nextInt();
		
		System.out.println("Pode inserir o segundo n�mero, seu chato?");
		
		numero2 = input.nextInt();
		
		System.out.println("Soma: "+(numero1+numero2));
		System.out.println("Subtra��o: "+(numero1-numero2));
		System.out.println("Multiplica��o: "+(numero1*numero2));
		System.out.println("Divis�o: "+(numero1/numero2));
		
		//n�o lembro qual era a outra parte da tarefa: fun��es
	}

}
