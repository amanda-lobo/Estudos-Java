package br.com.generation.exercicio01;

public class PrincipalCliente {
	
	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		c.idade = 10;
		c.nome = "Glico";
		c.sexo = "Feminino";
		
		
		c.Exibir();
		System.out.println("O nome do(a) cliente é: "+c.nome);
		System.out.println("A idade do(a) cliente é: "+c.idade);
		System.out.println(c.nome+" se identifica com o gênero "+c.sexo);
		
	}

}
