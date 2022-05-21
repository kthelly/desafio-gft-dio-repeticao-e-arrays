package br.com.gft.desafios.repeticao.arrays;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
	 * caso o valor seja inválido e continue rodando até que o usuário informe um
	 * valor válido..
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota; 
		System.out.println("Digite o valor da nota entre 0 e 10: ");
		nota = sc.nextDouble();
		
		while (nota < 0 || nota >10) {
			System.out.println("Nota inválida, por favor digite o valor da nota entre 0 e 10: ");
			nota = sc.nextDouble();
		}
		sc.close();
	}

}
