package br.com.gft.desafios.repeticao.arrays;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * Faça um programa que leia um conjunto de dois valores, o primeiro
	 * representando o nome do aluno e o segundo representando a sua idade. (Pare o
	 * programa inserindo o valor 0 no campo nome)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		int idade;

		while (true) {
			System.out.println("Digite o nome: ");
			nome = sc.next();
			if (nome.equals("0")) break;

			System.out.println("Digite a idade: ");
			idade = sc.nextInt();
		}
		sc.close();
	}

}
