package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		/*5. Faça um sistema que leia as 3 notas de um aluno e 
		calcule a média final deste aluno. Considerar que a média 
		é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
		 */
		
		Scanner nota = new Scanner (System.in);
		
		double nota1, nota2, nota3, mediaFinal;
		int mediaPonderada = 10;
		
		System.out.println("|-----------------------|");
		System.out.println("|   Calculado a Média   |");
		System.out.println("|-----------------------|");
		
		System.out.print("   Insira a 1ª nota: ");
		nota1 = nota.nextDouble();
		
		System.out.print("   Insira a 2ª nota: ");
		nota2 = nota.nextDouble();
		
		System.out.print("   Insira a 3ª nota: ");
		nota3 = nota.nextDouble();
		
		mediaFinal = (nota1 * 2) + (nota2 * 3) + (nota3 * 5) / mediaPonderada;
		
		System.out.println();
		System.out.printf("A média final é: %.1f", mediaFinal);
		
		nota.close();
	}

}
