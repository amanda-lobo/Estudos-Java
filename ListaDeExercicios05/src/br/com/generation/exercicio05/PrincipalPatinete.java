package br.com.generation.exercicio05;

public class PrincipalPatinete {
	
	public static void main(String[] args) {
		
		Patinete patinete = new Patinete();
		
		patinete.cor = "rosa";
		patinete.modelo = "infantil";
		patinete.velocidade = 0;
		
		System.out.println("A cor do patinete � "+patinete.cor);
		System.out.println("O patinete "+patinete.cor+" � "+patinete.modelo);
		patinete.VelocidadeMaxima(5);
		patinete.VelocidadeMinima(1);
		
	}

}
