package br.com.generation.exercicio06;

public class PrincipalContaBancaria {
	
	public static void main(String[] args) {
		
		ContaBancaria banco = new ContaBancaria();
		
		banco.user = "Lobo";
		banco.password = "Amanda123";
		banco.money = 1.25;
		
		banco.BoasVindas();
		System.out.println();
		System.out.println("Usuário: "+banco.user);
		System.out.println("Senha: "+banco.password);
		System.out.println("Saldo: "+banco.money); // to falida T-T
	}

}
