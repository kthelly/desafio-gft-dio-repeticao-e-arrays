package br.com.gft.desafios.repeticao.arrays;

import java.util.Scanner;

public class Exercicio07 {

	/*
	 * Crie um vetor de 6 números inteiros e mostre o na ordem reversa
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int[] vetor = new int [6];
		 int contador =0;
		 
		 System.out.println("Digite o número do vetor: ");
		 
		 for (int i = 0; i < vetor.length; i++) { 
			 System.out.print("->"); 
			 vetor[i] = sc.nextInt(); 
		 }
	        System.out.print("Vetor: ");
	        
	        while(contador < (vetor.length)) {
	            System.out.print(vetor[contador] + " ");
	            contador++;
	        }

	        System.out.print("\nVetor: ");
	        for(int i = (vetor.length - 1); i >= 0; i --) {
	            System.out.print(vetor[i] + " ");
	        }

	    }
	

}


