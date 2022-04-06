package br.com.generation.exercicio05;

public class Patinete {
	/*5) Crie uma classe patinete e apresente os atributos e m�todos referentes esta classe, 
	 * em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as
	 *  informa��es deste objeto no console.
	 */
	
	String modelo;
	String cor;
	int velocidade;
	
	void VelocidadeMaxima(int maximo)
	{
		velocidade += maximo;
		System.out.println("A velocidade m�xima do patinete �: "+velocidade);
	}
	
	void VelocidadeMinima(int minimo)
	{
		velocidade -= minimo;	
		System.out.println("A velocidade min�ma do patinete �: "+velocidade);
	}

}
