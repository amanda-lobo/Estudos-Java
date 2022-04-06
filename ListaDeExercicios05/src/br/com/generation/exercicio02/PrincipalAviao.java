package br.com.generation.exercicio02;

public class PrincipalAviao {
	
	public static void main(String[] args) {
		
		Aviao a = new Aviao();
		a.marca = "Boeing 747-8";
		a.modelo = "Widebody Quadrimotor";
		a.proprietario = "Edson";
		a.velocidade = 10;
		
		System.out.println("A marca do avião é: "+a.marca);
		System.out.println("O modelo do avião é: "+a.modelo);
		System.out.println(a.proprietario+" é o proprietário do avião.");
		
		System.out.println();
		System.out.println("A velocidade máxima do avião é: ");
		a.VelocidadeMaxima(100);
		
		System.out.println("A velocidade mínima do avião é: ");
		a.VelocidadeMinima(55);
		
	}

}
