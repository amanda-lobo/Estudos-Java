package br.com.generation.exercicios04;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		/*2- Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
		 Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
		 A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e 
		 apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
		 */

		Scanner entrada = new Scanner(System.in);
		
		int[] dado = new int [10];
		int mediaLancamentos, somaLancamentos = 0, maiorPontuacao = 0, ocorrenciasPontuacao = 0;
		
		for(int i = 0; i < dado.length; i++)
		{
			System.out.print("Insira o "+(i+1)+"� lan�amento: ");
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
		System.out.println("A maior pontua��o �: "+maiorPontuacao);
		System.out.println("As ocorr�ncias da maior pontua��o �: "+ocorrenciasPontuacao);
		System.out.println("A m�dia dos lan�amentos �: "+mediaLancamentos);
		
		entrada.close();
	}

}
