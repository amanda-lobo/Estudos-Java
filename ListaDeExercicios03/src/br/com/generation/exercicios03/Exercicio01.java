package br.com.generation.exercicios03;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		/*LA�O DE REPETI��O FOR
		 1 -Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
		 */
		
		for(int i = 1000; i <= 1999; i++)
		{
			if (i % 11 == 5)
			{
				System.out.println(i);
			}
		}
	}

}