package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		/*2. Faça um sistema que leia a idade de uma 
		pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int dias, meses, anos;
		int diasMes = 30, diasAno = 365;
		
		System.out.print("Escreva a sua idade expressa em dias: ");
		dias = leia.nextInt();
		
		anos = dias / diasAno;
		meses = (dias % diasAno) /diasMes;
		dias = (dias % diasAno) % diasMes;
		
		System.out.println();
		System.out.println("Sua idade expressa em: ");
		System.out.println("Anos: "+anos);
		System.out.println("Meses: "+meses);
		System.out.println("Dias: "+dias);
		
		leia.close();
	}

}
