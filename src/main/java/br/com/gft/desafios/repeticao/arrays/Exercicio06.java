package br.com.gft.desafios.repeticao.arrays;

import java.util.Scanner;

public class Exercicio06 {
	
	/*
	 * Faça um programa que calcule o fatorial  de um número inteiro fornecido pelo usuário. 
	 * Ex: 5! = 5*4*3*2*1 = 120
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number; 
		int fatorial = 1; 
		System.out.println("Digite o número que você gostaria de calcuar o fatorial : ");
		number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			fatorial = fatorial * i;
		}
			System.out.println("O fatorial do número " + number + " é: " + fatorial);
		sc.close();
	}

}
