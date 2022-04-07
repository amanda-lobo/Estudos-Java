package br.com.generation.exercicio01;

public class Principal {
	
	public static void main(String[] args) {
	
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Mike");
		cachorro.setIdade(1);
		cachorro.setSom("Latido");
		cachorro.setCorrer("Estou correndo!");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Belle");
		cavalo.setIdade(2);
		cavalo.setSom("Relinche");
		cavalo.setCorrer("Estou correndo!");
		
		Preguica preguica = new Preguica();
		preguica.setNome("Sid");
		preguica.setIdade(3);
		preguica.setSom("Bocejo");
		preguica.setSubirEmArvores("Estou escalando!");
		
		cachorro.ExibeCachorro();
		System.out.println();
		
		cavalo.ExibeCavalo();
		System.out.println();
		
		preguica.ExibePreguica();
	}

}
