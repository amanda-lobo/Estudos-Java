package br.com.generation.exercicios04;

import java.util.Scanner;

public class Exercicios04 {
	
	public static void main(String[] args) {
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
		 e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
		 ou seja, diagonal principal.
		 */
		
		Scanner receber = new Scanner(System.in);
		
		int[][] valorMatriz = new int[3][3];
		int somaDiagonal = 0, somaMatriz = 0;
		
		for(int l = 0; l < valorMatriz.length; l++)
		{
			for(int c = 0; c < valorMatriz.length; c++)
			{
				System.out.print("Insira um valor na Matriz: ");
				valorMatriz[l][c] = receber.nextInt();
				
				somaMatriz += valorMatriz[l][c];
			}
		}
		
		System.out.println();
		System.out.println("A soma total da Matriz é: "+somaMatriz);
		
		somaDiagonal = valorMatriz[0][0] + valorMatriz[1][1] + valorMatriz[2][2];		
		
		System.out.println("A soma total da diagonal principal da Matriz é: "+somaDiagonal);
		
		receber.close();
	}

}
