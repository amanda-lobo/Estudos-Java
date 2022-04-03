package br.com.generation.exercicios02;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer 
		 e exiba se este número é par ou ímpar. Se for par exiba também a raiz 
		 quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
		 */
		Scanner entrada = new Scanner (System.in);
		
		int num;
		
		System.out.print("Insira um número para saber se ele é par ou imprar: ");
		num = entrada.nextInt();
		
		if (num % 2 == 0)
		{
			System.out.println();
			System.out.println("O número digitado é par!");
			System.out.printf("A raiz quadrada do número é: %.2f",Math.sqrt(num));
		}
		else if (num % 2 == 1)
		{
			System.out.println();
			System.out.println("O número digitado é impar!");
			System.out.printf("O número elevado ao quadrado é: %.2f",Math.pow(num, 2));
		}
		else
		{
			System.out.println();
			System.out.println("Ops... Alguma coisa deu errado!");
		}
		
		entrada.close();

	}

}
