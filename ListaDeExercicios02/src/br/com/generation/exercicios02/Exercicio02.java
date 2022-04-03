package br.com.generation.exercicios02;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		//2- Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner numeros = new Scanner (System.in);
		
		int num1, num2, num3;
		
		System.out.print("Insira o 1° número: ");
		num1 = numeros.nextInt();
		
		System.out.print("Insira o 2° número: ");
		num2 = numeros.nextInt();
		
		System.out.print("Insira o 3° número: ");
		num3 = numeros.nextInt();
		
		if (num1 < num2 && num1 < num3 && num3 > num2)
		{
			System.out.println();
			System.out.println("Números em ordem crescente: ");
			System.out.println(num1+", "+num2+", "+num3);
		}
		else if (num2 < num1 && num2 < num3 && num3 > num1)
		{
			System.out.println();
			System.out.println("Números em ordem crescente: ");
			System.out.println(num2+", "+num1+", "+num3);
		}
		else if (num3 < num1 && num3 < num2 && num2 > num1)
		{
			System.out.println();
			System.out.println("Números em ordem crescente: ");
			System.out.println(num3+", "+num2+", "+num1);
		}
		else if (num3 < num2 && num3 < num1 && num1 > num2)
		{
			System.out.println();
			System.out.println("Números em ordem crescente: ");
			System.out.println(num3+", "+num1+", "+num2);
		}
		else if (num1 < num2 && num1 < num3 && num2 > num3)
		{
			System.out.println();
			System.out.println("Números em ordem crescente: ");
			System.out.println(num1+", "+num3+", "+num2);
		}
		else if (num2 < num1 && num2 < num3 && num1 > num3)
		{
			System.out.println();
			System.out.println("Números em ordem crescente: ");
			System.out.println(num2+", "+num3+", "+num1);
		}
		else 
		{
			System.out.println("Ops.. Alguma coisa deu errado.");
		}
		numeros.close();

	}

}
