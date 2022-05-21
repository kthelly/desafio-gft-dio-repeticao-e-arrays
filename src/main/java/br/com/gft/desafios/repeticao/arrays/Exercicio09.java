package br.com.gft.desafios.repeticao.arrays;

import java.util.Random;

public class Exercicio09 {

	/*
	 * Faça um programa que leia 20 números ineiros aleatórios (entre 0 e 100)
	 * armazenando em um vetor. Ao final mostre os numeros e seus antecessores .
	 */
	public static void main(String[] args) {
		Random random = new Random();

		int[] numerosAleatorios = new int[20];

		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}

		System.out.print("Numeros Aleatorios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}

		System.out.print("\nAntecessor dos Numeros Aleatorios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero - 1) + " ");
		}
	}
}
