package br.com.gft.desafios.repeticao.arrays;

import java.util.Scanner;

public class Exercicio02 {

	/*
	 * Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem
	 * caso o valor seja inv�lido e continue rodando at� que o usu�rio informe um
	 * valor v�lido..
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota; 
		System.out.println("Digite o valor da nota entre 0 e 10: ");
		nota = sc.nextDouble();
		
		while (nota < 0 || nota >10) {
			System.out.println("Nota inv�lida, por favor digite o valor da nota entre 0 e 10: ");
			nota = sc.nextDouble();
		}
		sc.close();
	}

}
