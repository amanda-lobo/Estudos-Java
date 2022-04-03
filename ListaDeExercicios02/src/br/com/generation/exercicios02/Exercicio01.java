package br.com.generation.exercicios02;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		//1 -Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner numeros = new Scanner (System.in);
		
		int num1, num2, num3;
		
		System.out.print("Insira o 1° número: ");
		num1 = numeros.nextInt();
		
		System.out.print("Insira o 2° número: ");
		num2 = numeros.nextInt();
		
		System.out.print("Insira o 3º número: ");
		num3 = numeros.nextInt();
		
		if (num1 > num2 && num1 > num3)
		{
			System.out.println();
			System.out.println("O número "+num1+" é o maior número digitado!");
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println();
			System.out.println("O número "+num2+" é o maior número digitado!");
		}
		else if (num3 > num1 && num3 > num2)
		{
			System.out.println();
			System.out.println("O número "+num3+" é o maior número digitado!");
		}
		else {
			System.out.println();
			System.out.println("Ops... Ocorreu um erro!");
		}
		numeros.close();
	}

}
