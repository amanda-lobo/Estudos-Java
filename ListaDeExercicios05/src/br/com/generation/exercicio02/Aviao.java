package br.com.generation.exercicio02;

public class Aviao {
	/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,
	 * em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente 
	 * as informa��es deste objeto no console.
	 */
	String marca;
	String modelo;
	String proprietario;
	int velocidade;
	
	void VelocidadeMaxima(int acelerar)
	{
		acelerar+= velocidade;
		System.out.println(acelerar);
	}
	
	void VelocidadeMinima(int reduzir)
	{
		reduzir -= velocidade;
		System.out.println(reduzir);
	}

}
