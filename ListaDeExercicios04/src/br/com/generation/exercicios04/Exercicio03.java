package br.com.generation.exercicios04;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
	*/
		Scanner entrada = new Scanner(System.in);
		
		int[][] n1 = new int[2][3];
		int[][] n2 = new int[2][3];
		int[][] m1 = new int[2][3];
		int[][] m2 = new int[2][3];
		
		for(int l = 0; l < 2; l++)
		{
			for(int c = 0; c < 3; c++)
			{
				System.out.print("Insira o N1: ");
				n1[l][c] = entrada.nextInt();
				
				System.out.print("Insira o N2: ");
				n2[l][c] = entrada.nextInt();
				
				System.out.println();
				
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
		
		System.out.println();
		
			for(int l = 0; l < 2; l++)
			{
				for(int c = 0; c < 3; c++)
				{
					System.out.println("Matriz M1: "+m1[l][c]);
					System.out.println("Matriz M2: "+m2[l][c]);
					System.out.println();
				}
			}
			entrada.close();

	}

}
