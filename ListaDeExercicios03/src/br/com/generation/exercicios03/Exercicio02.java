package br.com.generation.exercicios03;

public class Exercicio02 {
	
	public static void main(String[] args) {
		/* LA�O DE REPETI��O FOR
		 1- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
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
		System.out.println("Quantidade n�meros pares: "+par);
		System.out.println("Quantidade n�meros impares: "+impar);
	}

}
