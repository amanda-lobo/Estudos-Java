package br.com.generation.exercicio05;

public class PrincipalPatinete {
	
	public static void main(String[] args) {
		
		Patinete patinete = new Patinete();
		
		patinete.cor = "rosa";
		patinete.modelo = "infantil";
		patinete.velocidade = 0;
		
		System.out.println("A cor do patinete é "+patinete.cor);
		System.out.println("O patinete "+patinete.cor+" é "+patinete.modelo);
		patinete.VelocidadeMaxima(5);
		patinete.VelocidadeMinima(1);
		
	}

}
