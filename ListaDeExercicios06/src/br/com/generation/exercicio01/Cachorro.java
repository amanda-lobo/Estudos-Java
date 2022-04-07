package br.com.generation.exercicio01;

public class Cachorro extends Animal {
	
	private String correr;

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void ExibeCachorro()
	{
		String nomeCachorro = this.getNome();
		String somCachorro = this.getSom();
		String correrCachorro = this.getCorrer();
		int idadeCachorro = this.getIdade();
		
		System.out.println("==========================");
		System.out.println("|        CACHORRO        |");
		System.out.println("==========================");
		System.out.println("|       Nome: "+nomeCachorro+"       |");
		System.out.println("|     Idade: "+idadeCachorro+" ano(s)    |");
		System.out.println("|       Som: "+somCachorro+"      |");
		System.out.println("|     "+correrCachorro+"    |");
		System.out.println("==========================");
	}
	
}
