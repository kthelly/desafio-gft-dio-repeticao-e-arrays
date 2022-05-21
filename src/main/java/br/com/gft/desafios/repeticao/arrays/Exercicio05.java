package br.com.gft.desafios.repeticao.arrays;

import java.util.Scanner;

public class Exercicio05 {

	/*
	 * Desenvolva um gerador de tabuada (multiplica��o), capaz de gerar a tabuada de qualquer n�mero
	 * inteiro entre o e 10. O usu�rio deve informar de qual n�mero (inteiro) ele deseja ver a tabuada.
	 * A sa�da deve ser conforme o exemplo abaixo:
	 * Tabuada de 5: 
	 * 5 * 0 = 0
	 * 5 * 1 = 5
	 * 5 * 2 = 10
	 * ...
	 * 5 * 10 = 50
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number; 
		System.out.println("Digite o n�mero que voc� gostaria de obter a tatuada de multiplica��o: ");
		number = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + (number*i));
		}
		sc.close();

	}

}
