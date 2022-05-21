package br.com.gft.desafios.repeticao.arrays;

import java.util.Scanner;

public class Exercicio04 {

	/*
	 * Faça um programa que peça N números inteiros, calcule e mostre a quantidade
	 * de némeros pares e a quantidade de números impares.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidadeN;
		int number;
		int quantidadePar = 0;
		int quantidadeImpar = 0;
		
		System.out.println("Digite a quantidade de números a ser digitados: ");
		quantidadeN = sc.nextInt();
		for (int i = 0; i < quantidadeN; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			number = sc.nextInt();
			if (number % 2 == 0) {
				quantidadePar++;
			}else {
				quantidadeImpar++; 
			}
		}
		System.out.println("A quantidade de números digitados: " + quantidadeN);
		System.out.println("A quantidade de números pares: " + quantidadePar);
		System.out.println("A quantidade de números impares: " + quantidadeImpar);
		sc.close();
	}

}
