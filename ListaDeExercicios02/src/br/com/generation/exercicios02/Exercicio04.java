package br.com.generation.exercicios02;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer 
		 e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz 
		 quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		Scanner entrada = new Scanner (System.in);
		
		int num;
		
		System.out.print("Insira um n�mero para saber se ele � par ou imprar: ");
		num = entrada.nextInt();
		
		if (num % 2 == 0)
		{
			System.out.println();
			System.out.println("O n�mero digitado � par!");
			System.out.printf("A raiz quadrada do n�mero �: %.2f",Math.sqrt(num));
		}
		else if (num % 2 == 1)
		{
			System.out.println();
			System.out.println("O n�mero digitado � impar!");
			System.out.printf("O n�mero elevado ao quadrado �: %.2f",Math.pow(num, 2));
		}
		else
		{
			System.out.println();
			System.out.println("Ops... Alguma coisa deu errado!");
		}
		
		entrada.close();

	}

}
