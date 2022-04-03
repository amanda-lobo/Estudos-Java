package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		/*8. O custo ao consumidor de um carro novo é a soma 
		do custo de fábrica com a percentagem do distribuidor e 
		dos impostos (aplicados ao custo de fábrica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
		 */
		
		Scanner leia = new Scanner (System.in);
		
		double custoFabrica, custoConsumidor, distribuidor;
		
		System.out.print("Insira o custo de Fábrica: ");
		custoFabrica = leia.nextDouble();
		
		distribuidor = custoFabrica + (custoFabrica*0.28);
		custoConsumidor = distribuidor + (distribuidor*0.45);
		
		System.out.printf("O custo do consumidor é: %.2f",custoConsumidor);
		
		leia.close();
	}

}
