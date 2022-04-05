package br.com.generation.exercicios04;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		/*2- Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		 A seguir determine e imprima a média aritmética dos lançamentos, contabilize e 
		 apresente também quantas foram as ocorrências da maior pontuação.
		 */

		Scanner entrada = new Scanner(System.in);
		
		int[] dado = new int [10];
		int mediaLancamentos, somaLancamentos = 0, maiorPontuacao = 0, ocorrenciasPontuacao = 0;
		
		for(int i = 0; i < dado.length; i++)
		{
			System.out.print("Insira o "+(i+1)+"º lançamento: ");
			dado[i] = entrada.nextInt();
			
			somaLancamentos += dado[i];
			
			if(dado[i] == 6)
			{
				maiorPontuacao = dado[i];
				ocorrenciasPontuacao++;
			}
		}
		mediaLancamentos = somaLancamentos / 10;
		System.out.println();
		System.out.println("A maior pontuação é: "+maiorPontuacao);
		System.out.println("As ocorrências da maior pontuação é: "+ocorrenciasPontuacao);
		System.out.println("A média dos lançamentos é: "+mediaLancamentos);
		
		entrada.close();
	}

}
