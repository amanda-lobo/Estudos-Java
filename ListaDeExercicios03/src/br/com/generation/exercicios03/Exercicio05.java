package br.com.generation.exercicios03;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		/*LAÇO DE REPETIÇÃO DO WHILE
		 5- Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 No final, mostre a soma dos números digitados.
		 */
		Scanner entrada = new Scanner(System.in);
			
		int num = 0, soma = 0;
		
		do 
		{
			soma += num;
			System.out.print("Digite um número para soma: ");
			num = entrada.nextInt();
		}
			while(num != 0);
		
		//soma = num + num;
		System.out.println("A soma dos números digitados é: "+soma);
		
		entrada.close();
	}

}
