package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		/*8. O custo ao consumidor de um carro novo � a soma 
		do custo de f�brica com a percentagem do distribuidor e 
		dos impostos (aplicados ao custo de f�brica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 
		 */
		
		Scanner leia = new Scanner (System.in);
		
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.print("Insira o custo de F�brica: ");
		custoFabrica = leia.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica*0.28);
		custoConsumidor = distribuidor + (distribuidor*0.45);
		
		System.out.printf("O custo do consumidor �: %.2f",custoConsumidor);
		
		leia.close();
	}

}
