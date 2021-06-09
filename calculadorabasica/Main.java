package calculadorabasica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pode inserir o primeiro número, seu chato?");
		
		numero1 = input.nextInt();
		
		System.out.println("Pode inserir o segundo número, seu chato?");
		
		numero2 = input.nextInt();
		
		System.out.println("Soma: "+(numero1+numero2));
		System.out.println("Subtração: "+(numero1-numero2));
		System.out.println("Multiplicação: "+(numero1*numero2));
		System.out.println("Divisão: "+(numero1/numero2));
		
		//não lembro qual era a outra parte da tarefa: funções
	}

}
