package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias.*/
		
		Scanner leia = new Scanner (System.in);
		
		int anos, meses, dias;
		int diasAno = 365, diasMes = 30;
		System.out.println("Insira a sua idade expressa em:");
		System.out.println();
		
		System.out.print("Anos: ");
		anos = leia.nextInt();
		
		System.out.print("Meses: ");
		meses = leia.nextInt();
		
		System.out.print("Dias: ");
		dias = leia.nextInt();
		
		dias += (anos * diasAno) + (meses * diasMes);
		
		System.out.println();
		
		System.out.println("Sua idade expressa em dias é: "+dias);
		
		leia.close();
		
	}

}
