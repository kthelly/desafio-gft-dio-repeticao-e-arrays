package br.com.gft.desafios.repeticao.arrays;

import java.util.Scanner;

public class Exercicio06 {
	
	/*
	 * Fa�a um programa que calcule o fatorial  de um n�mero inteiro fornecido pelo usu�rio. 
	 * Ex: 5! = 5*4*3*2*1 = 120
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number; 
		int fatorial = 1; 
		System.out.println("Digite o n�mero que voc� gostaria de calcuar o fatorial : ");
		number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			fatorial = fatorial * i;
		}
			System.out.println("O fatorial do n�mero " + number + " �: " + fatorial);
		sc.close();
	}

}
