package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		/*5. Fa�a um sistema que leia as 3 notas de um aluno e 
		calcule a m�dia final deste aluno. Considerar que a m�dia 
		� ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 
		 */
		
		Scanner nota = new Scanner (System.in);
		
		double nota1, nota2, nota3, mediaFinal;
		int mediaPonderada = 10;
		
		System.out.println("|-----------------------|");
		System.out.println("|   Calculado a M�dia   |");
		System.out.println("|-----------------------|");
		
		System.out.print("   Insira a 1� nota: ");
		nota1 = nota.nextDouble();
		
		System.out.print("   Insira a 2� nota: ");
		nota2 = nota.nextDouble();
		
		System.out.print("   Insira a 3� nota: ");
		nota3 = nota.nextDouble();
		
		mediaFinal = (nota1 * 2) + (nota2 * 3) + (nota3 * 5) / mediaPonderada;
		
		System.out.println();
		System.out.printf("A m�dia final �: %.1f", mediaFinal);
		
		nota.close();
	}

}
