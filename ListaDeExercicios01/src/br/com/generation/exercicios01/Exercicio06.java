package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		/*6. Construa um programa em que, tendo como dados 
		 de entrada dois pontos quaisquer no plano, 
		 P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
		 A fórmula que efetua tal cálculo é: d = raiz (x2 - x1)^2 + (y2 - y1)^2
		 */
		
		Scanner dados = new Scanner (System.in);
		
		double x1, x2, y1, y2, p1, p2, d;
		
		System.out.print("Insira o X1: ");
		x1 = dados.nextDouble();
		
		System.out.print("Insira o X2: ");
		x2 = dados.nextDouble();
		
		System.out.print("Insira o Y1: ");
		y1 = dados.nextDouble();
		
		System.out.print("Insira o Y2: ");
		y2 = dados.nextDouble();
		
		p1 = (x2 - x1) * (x2 - x1);
		p2 = (y2 - y1) * (y2 - y1);
		d = p1 + p2; 
		
		
		System.out.println();
		System.out.printf("A distância entre os pontos é: %.2f", Math.sqrt(d));
		
		dados.close();

	}

}
