package br.com.generation.exercicio02;

public class PrincipalAviao {
	
	public static void main(String[] args) {
		
		Aviao a = new Aviao();
		a.marca = "Boeing 747-8";
		a.modelo = "Widebody Quadrimotor";
		a.proprietario = "Edson";
		a.velocidade = 10;
		
		System.out.println("A marca do avi�o �: "+a.marca);
		System.out.println("O modelo do avi�o �: "+a.modelo);
		System.out.println(a.proprietario+" � o propriet�rio do avi�o.");
		
		System.out.println();
		System.out.println("A velocidade m�xima do avi�o �: ");
		a.VelocidadeMaxima(100);
		
		System.out.println("A velocidade m�nima do avi�o �: ");
		a.VelocidadeMinima(55);
		
	}

}
