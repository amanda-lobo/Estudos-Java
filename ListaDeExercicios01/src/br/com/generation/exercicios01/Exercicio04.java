package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		/*4. Escreva  um sistema que leia três números inteiros
		  e positivos (A, B, C) e calcule a seguinte expressão:
		  D = R + S / 2, onde R = (A + B) ^ 2 | S = (B + C) ^ 2.  
		 */
		
		Scanner numeros = new Scanner (System.in);
		
		int a, b, c;
		double r, s, d;
		
			System.out.println("|---------------------------------|");
			System.out.println("|      Calculando a Expressão     |");
			System.out.println("|---------------------------------|");
			
			System.out.print("       Digite o valor de A: ");
			a = numeros.nextInt();
			
			System.out.print("       Digite o valor de B: ");
			b = numeros.nextInt();
			
			System.out.print("       Digite o valor de C: ");
			c = numeros.nextInt();
			
			if (a >= 0 && b >= 0 && c >= 0)
			{
				r = (a + b) * (a + b);
				
				s = (b + c) * (b + c);
				
				d = (r + s)/2;
				
				System.out.println();
				System.out.printf("  O resultado da expressão é: %.1f",d);
				
			}
			else 
			{
				System.out.println();
				System.out.println("-------!VALOR INVÁLIDO POR SER NEGATIVO!-------");
				System.out.println();

			} 
			numeros.close();

	}

}
