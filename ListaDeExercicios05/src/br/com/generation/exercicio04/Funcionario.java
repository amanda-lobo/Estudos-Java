package br.com.generation.exercicio04;

public class Funcionario {
	
	/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos 
	 * referentes esta classe, em seguida crie um objeto funcion�rio, 
	 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.
	 */
		
	String nome;
	int idade;
	int id;
	char entrada;
	
	void PontoLiberado (char liberado)
	{
		if(entrada == 's' || entrada == 'S')
		{
		System.out.println("O funcion�rio j� entrou e est� liberado!");
		}
	}
	void PontoNaoLiberado (char naoLiberado)
	{
		if(entrada == 'n' || entrada == 'N')
		{
		System.out.println("O funcion�rio n�o entrou e n�o est� liberado!");
		}
	}
}
