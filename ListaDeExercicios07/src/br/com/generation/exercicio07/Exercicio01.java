package br.com.generation.exercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
public static void main(String[] args) {
	/*
	 * Crie uma um programa para trabalhar com estoque de uma loja, 
o programa deverá trabalhar com Collection do tipo List do Java para manipular 
os dados desse estoque, o programa deverá atender as seguintes funcionalidades:

Armazenar dados da List  concluido
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/
	Scanner scan = new Scanner(System.in);
	String armazena;
	String opcao;
	String delete;
	String itemAtualizado;
	
	ArrayList<String> estoque = new ArrayList<String>();
	
	for(int i = 0; i < 3; i++)
	{
	System.out.print("Armazene um item na lista: ");
	armazena = scan.nextLine();
	estoque.add(armazena);
	}
	System.out.println();
	System.out.println("Lista atualizada: "+estoque);
	System.out.println();
	System.out.println("Deseja atualizar algo da lista?");
	System.out.print("Sua resposta: ");
	opcao = scan.nextLine();
	
	if(opcao.toUpperCase().equals("S") || opcao.toUpperCase().equals("SIM"))
	{
		System.out.println();
		System.out.println("Qual opção você deseja atualizar?");
		System.out.println("Posição 1 = "+estoque.get(0));
		System.out.println("Posição 2 = "+estoque.get(1));
		System.out.println("Posição 3 = "+estoque.get(2));
		System.out.print("Sua resposta: ");
		int atualiza = scan.nextInt()-1;
		
		System.out.print("Digite o item atualizado: ");
		itemAtualizado = scan.next();
		
		estoque.set(atualiza, itemAtualizado);
	}	
		System.out.println();
		System.out.println("Lista atualizada: "+estoque);
		System.out.println();
		
		System.out.println("Deseja remover algo da lista?");
		System.out.print("Sua resposta: ");
		opcao = scan.next();
		
		if(opcao.toUpperCase().equals("S") || opcao.toUpperCase().equals("SIM"))
		{
			System.out.println("Digite o item que você deseja remover: ");
			delete = scan.next();
			estoque.remove(delete);
		}
		System.out.println();
		System.out.println("Lista atualizada: "+estoque);
	}
}
