package br.com.generation.exercicio05;

public class Patinete {
	/*5) Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as
	 *  informações deste objeto no console.
	 */
	
	String modelo;
	String cor;
	int velocidade;
	
	void VelocidadeMaxima(int maximo)
	{
		velocidade += maximo;
		System.out.println("A velocidade máxima do patinete é: "+velocidade);
	}
	
	void VelocidadeMinima(int minimo)
	{
		velocidade -= minimo;	
		System.out.println("A velocidade miníma do patinete é: "+velocidade);
	}

}
