package br.com.generation.exercicios03;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		/*LA�O DE REPETI��O DO WHILE
		 5- Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		 No final, mostre a soma dos n�meros digitados.
		 */
		Scanner entrada = new Scanner(System.in);
			
		int num = 0, soma = 0;
		
		do 
		{
			soma += num;
			System.out.print("Digite um n�mero para soma: ");
			num = entrada.nextInt();
		}
			while(num != 0);
		
		//soma = num + num;
		System.out.println("A soma dos n�meros digitados �: "+soma);
		
		entrada.close();
	}

}
