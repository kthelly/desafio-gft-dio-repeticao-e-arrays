package br.com.gft.desafios.repeticao.arrays;

import java.util.Scanner;

public class Exercicio03 {

	/*
	 * Fa�a um programa que leia 5 n�meros e informe o maior n�mero e a m�dia desses
	 * n�meros.
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
		
		System.out.println("O maior numero �: " + maior);
		System.out.println("A m�dia dos n�meros �: " + soma/5);
		sc.close();

	}

}
