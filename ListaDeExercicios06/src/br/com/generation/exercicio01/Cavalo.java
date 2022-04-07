package br.com.generation.exercicio01;

public class Cavalo extends Animal {
	
	private String correr;

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void ExibeCavalo()
	{
		String nomeCavalo = this.getNome();
		String somCavalo = this.getSom();
		String correrCavalo = this.getCorrer();
		int idadeCavalo = this.getIdade();
		
		System.out.println("==========================");
		System.out.println("|         CAVALO         |");
		System.out.println("==========================");
		System.out.println("|       Nome: "+nomeCavalo+"      |");
		System.out.println("|     Idade: "+idadeCavalo+" ano(s)    |");
		System.out.println("|      Som: "+somCavalo+"     |");
		System.out.println("|     "+correrCavalo+"    |");
		System.out.println("==========================");
	}

}
