package br.com.generation.exercicio04;

public class Funcionario {
	
	/*4) Crie uma classe funcionário e apresente os atributos e métodos 
	 * referentes esta classe, em seguida crie um objeto funcionário, 
	 * defina as instancias deste objeto e apresente as informações deste objeto no console.
	 */
		
	String nome;
	int idade;
	int id;
	char entrada;
	
	void PontoLiberado (char liberado)
	{
		if(entrada == 's' || entrada == 'S')
		{
		System.out.println("O funcionário já entrou e está liberado!");
		}
	}
	void PontoNaoLiberado (char naoLiberado)
	{
		if(entrada == 'n' || entrada == 'N')
		{
		System.out.println("O funcionário não entrou e não está liberado!");
		}
	}
}
