package br.com.generation.exercicio01;

public class Preguica extends Animal{
	
	private String subirEmArvores;

	public String getSubirEmArvores() {
		return subirEmArvores;
	}

	public void setSubirEmArvores(String subirEmArvores) {
		this.subirEmArvores = subirEmArvores;
	}
	
	public void ExibePreguica()
	{
		String nomePreguica = this.getNome();
		String somPreguica = this.getSom();
		String escalaPreguica = this.getSubirEmArvores();
		int idadePreguica = this.getIdade();
		
		System.out.println("==========================");
		System.out.println("|        PREGUIÇA        |");
		System.out.println("==========================");
		System.out.println("|        Nome: "+nomePreguica+"       |");
		System.out.println("|     Idade: "+idadePreguica+" ano(s)    |");
		System.out.println("|       Som: "+somPreguica+"      |");
		System.out.println("|     "+escalaPreguica+"   |");
		System.out.println("==========================");
	}

}
