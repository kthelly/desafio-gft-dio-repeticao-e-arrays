package br.com.gft.desafios.repeticao.arrays;

import java.util.Scanner;

public class Exercicio03 {

	/*
	 * Faça um programa que leia 5 números e informe o maior número e a média desses
	 * números.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		int maior = 0;
		float soma = 0;
		int contador = 0;
		
		do {
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		if (numero >= maior) {
			maior = numero;
		}
		soma = soma + numero;
		contador++;
		}while (contador < 5);
		
		System.out.println("O maior numero é: " + maior);
		System.out.println("A média dos números é: " + soma/5);
		sc.close();

	}

}
