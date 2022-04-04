package br.com.generation.exercicios03;

public class Exercicio02 {
	
	public static void main(String[] args) {
		/* LAÇO DE REPETIÇÃO FOR
		 1- Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		 */
		int div, impar = 0, par = 0;
		
		for(int i = 0; i <= 10; i++)
		{
			div = i % 2;
			
			if(div == 1)
			{
				impar++;
			}
			else
			{
				par++;
			}
		}
		System.out.println("Quantidade números pares: "+par);
		System.out.println("Quantidade números impares: "+impar);
	}

}
