package br.com.gft.desafios.repeticao.arrays;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * Fa�a um programa que pe�a N n�meros inteiros, calcule e mostre a quantidade
	 * de n�meros pares e a quantidade de n�meros impares.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidadeN;
		int number;
		int quantidadePar = 0;
		int quantidadeImpar = 0;
		
		System.out.println("Digite a quantidade de n�meros a ser digitados: ");
		quantidadeN = sc.nextInt();
		for (int i = 0; i < quantidadeN; i++) {
			System.out.println("Digite o " + (i + 1) + "� n�mero: ");
			number = sc.nextInt();
			if (number % 2 == 0) {
				quantidadePar++;
			}else {
				quantidadeImpar++; 
			}
		}
		System.out.println("A quantidade de n�meros digitados: " + quantidadeN);
		System.out.println("A quantidade de n�meros pares: " + quantidadePar);
		System.out.println("A quantidade de n�meros impares: " + quantidadeImpar);
		sc.close();
	}

}
