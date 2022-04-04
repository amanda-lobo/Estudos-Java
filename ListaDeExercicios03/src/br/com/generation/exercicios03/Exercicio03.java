package br.com.generation.exercicios03;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		/*LAÇO DE REPETIÇÃO WHILE
		 3- Solicitar a idade de várias pessoas e imprimir: 
		 Total de pessoas com menos de 21 anos. 
		 Total de pessoas com mais de 50 anos. 
		 O programa termina quando idade for =-99.
		 */
		Scanner leia = new Scanner (System.in);
		
		int idade = 0;
		int pessoasMenos21 = 0, pessoasMais50 = 0;
		
		while(idade != -99)
		{
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		
			if(idade <= 21) 
			{
				pessoasMenos21++;
			}
			else if(idade >= 50)
			{
				pessoasMais50++;
			}
		}
		System.out.println();
		System.out.println("O total de pessoas com menos de 21 anos é: "+pessoasMenos21);
		System.out.println("O total de pessoas com mais de 50 anos é: "+pessoasMais50);
		leia.close();
	}	

}
