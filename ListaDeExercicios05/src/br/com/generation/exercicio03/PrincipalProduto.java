package br.com.generation.exercicio03;

public class PrincipalProduto {
	
	public static void main(String[] args) {
	
		ProdutoEletronico produto = new ProdutoEletronico();
	
		produto.nomeProduto = "SmartPhone";
		produto.precoProduto = 1598.55;
		
		System.out.println("O produto adquirido foi: "+produto.nomeProduto);
		System.out.println("O pre�o do "+produto.nomeProduto+" �: $"+produto.precoProduto);
		produto.CompraProduto();
	}

}
