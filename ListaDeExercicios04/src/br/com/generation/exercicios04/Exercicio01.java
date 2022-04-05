package br.com.generation.exercicios04;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		/*1- Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
		
		Scanner ler = new Scanner(System.in);
		
		int[] valoresPontuacao = new int[5];
		int maiorPontuacao = 0;
		
		for(int i = 0; i < valoresPontuacao.length; i++)
		{
			System.out.print("Insira o "+(i+1)+"º valor: ");
			valoresPontuacao[i] = ler.nextInt();
			
			if (valoresPontuacao[i] > maiorPontuacao)
			{
				maiorPontuacao = valoresPontuacao[i];
			}
		}
		System.out.println();
		
		for(int i = 0; i < valoresPontuacao.length; i++)
		{
		System.out.println("O "+(i+1)+" valor é: "+valoresPontuacao[i]);
		}
		System.out.println();
		System.out.println("A maior pontuação digitada é: "+maiorPontuacao);
		
		ler.close();
	}

}
