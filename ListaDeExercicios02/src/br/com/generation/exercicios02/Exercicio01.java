package br.com.generation.exercicios02;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		//1 -Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner numeros = new Scanner (System.in);
		
		int num1, num2, num3;
		
		System.out.print("Insira o 1� n�mero: ");
		num1 = numeros.nextInt();
		
		System.out.print("Insira o 2� n�mero: ");
		num2 = numeros.nextInt();
		
		System.out.print("Insira o 3� n�mero: ");
		num3 = numeros.nextInt();
		
		if (num1 > num2 && num1 > num3)
		{
			System.out.println();
			System.out.println("O n�mero "+num1+" � o maior n�mero digitado!");
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println();
			System.out.println("O n�mero "+num2+" � o maior n�mero digitado!");
		}
		else if (num3 > num1 && num3 > num2)
		{
			System.out.println();
			System.out.println("O n�mero "+num3+" � o maior n�mero digitado!");
		}
		else {
			System.out.println();
			System.out.println("Ops... Ocorreu um erro!");
		}
		numeros.close();
	}

}
