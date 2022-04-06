package br.com.generation.exercicio02;

public class Aviao {
	/*2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
	 * em seguida crie um objeto avião, defina as instancias deste objeto e apresente 
	 * as informações deste objeto no console.
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
