package br.com.generation.exercicios03;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		/*LA�O DE REPETI��O DO WHILE
		 *6- Escrever um programa que receba v�rios n�meros inteiros no teclado. 
		E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero)
		 */
		
		Scanner receber = new Scanner(System.in);
		
		int num, soma = 0, contador = 0;
		int media = 0;
		
		do
		{
			System.out.print("Insira um n�mero: ");
			num = receber.nextInt();
			
			//if(num == 3 || num == 6 || num == 9)
			if(num % 3 == 0 && num != 0)
			{
				soma += num;
				contador++;
			}
		}
			while(num != 0);
		
		media = soma/contador;
		System.out.println();
		System.out.println("A m�dia dos n�meros multiplos de 3 �: "+media);
		
		receber.close();
	}

}
