package br.com.generation.exercicio04;

public class PrincipalFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = "Thamires";
		funcionario.idade = 25;
		funcionario.id = 123;
		funcionario.entrada = 'n';
		
		System.out.println("Nome do(a) funcion�rio(a): "+funcionario.nome);
		System.out.println("Idade do(a) funcion�rio(a) "+funcionario.nome+": "+funcionario.idade);
		System.out.println("A identifica��o do(a) funcion�rio(a) "+funcionario.nome+" �: "+funcionario.id);
		System.out.println();
		funcionario.PontoLiberado(' ');
		funcionario.PontoNaoLiberado(' ');
		
	}

}
