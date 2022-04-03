package br.com.generation.exercicios02;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto
		*/
		
		Scanner receber = new Scanner (System.in);
		
		int idade;
		
		System.out.println("|----------------------------|");
		System.out.println("| Descobindo a sua categoria |");
		System.out.println("|----------------------------|");
	
		System.out.print("     Digite a sua idade: ");
		idade = receber.nextInt();
		
		if (idade >= 10 && idade <= 14)
		{
			System.out.println();
			System.out.println("|----------------------------|");
			System.out.println("|     Categoria Infantil!    |");
			System.out.println("|----------------------------|");
		}
		else if (idade >= 15 && idade <= 17)
		{
			System.out.println();
			System.out.println("|----------------------------|");
			System.out.println("|     Categoria Juvenil!     |");
			System.out.println("|----------------------------|");
		}
		else if (idade >= 18 && idade <=25)
		{
			System.out.println();
			System.out.println("|----------------------------|");
			System.out.println("|      Categoria Adulto!     |");
			System.out.println("|----------------------------|");
		}
		else
		{
			System.out.println();
			System.out.println("Sinto muito! Sua idade não se enquadra em nenhuma categoria.");
		}
		receber.close();
	}
}
