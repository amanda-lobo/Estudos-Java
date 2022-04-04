package br.com.generation.exercicios03;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		/*LA�O DE REPETI��O WHILE
		 4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas 
		psicol�gicas dos indiv�duos de uma regi�o. 
		Para tanto, a cada uma das pessoas era perguntado: 
		idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
		Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
		o n�mero de pessoas calmas; 
		o n�mero de mulheres nervosas; 
		o n�mero de homens agressivos; 
		o n�mero de outros calmos;
		o n�mero de pessoas nervosas com mais de 40 anos; 
		o n�mero de pessoas calmas com menos de 18 anos.*/
		
		Scanner dados = new Scanner(System.in);
		
		int i = 0, idade, sexo, temperamento;//1= 0, temperamento2 = 0, temperamento3 = 0;
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, nervososMaisDe40 = 0, calmosMenosDe18 = 0;
		
		while(i <= 5)
		{
			System.out.println();
			System.out.print("Insira a sua idade: ");
			idade = dados.nextInt();
			System.out.println();
			
			System.out.println("Qual g�nero voc� se identifica?");
			System.out.println("1. Feminino");
			System.out.println("2. Masculino");
			System.out.println("3. Outros");
			System.out.print("Seu g�nero: ");
			sexo = dados.nextInt();
			
			if(sexo > 3)
			{
				System.out.println();
				System.out.println("----!OP��O INV�LIDA!----");
				System.out.println();
				System.out.print("Insira a sua idade: ");
				idade = dados.nextInt();
				System.out.println();
				
				System.out.println("Qual g�nero voc� se identifica?");
				System.out.println("1. Feminino");
				System.out.println("2. Masculino");
				System.out.println("3. Outros");
				System.out.print("Seu g�nero: ");
				sexo = dados.nextInt();
			}
			
			System.out.println();
			System.out.println("Qual � o seu temperamento?");
			System.out.println("1. Sou calmo");
			System.out.println("2. Sou nervoso");
			System.out.println("3. Sou agressivo");
			System.out.println("Seu temperamento: ");
			temperamento = dados.nextInt();
			
			switch(temperamento) 
			{
			case 1:
				if(temperamento == 1)
				{
					pessoasCalmas++;
				}
				if (sexo == 3)
				{
					outrosCalmos++;
				}
				if(idade <= 18)
				{
					calmosMenosDe18++;
				}
				break;
			case 2:
				if(sexo == 1)
				{
					mulheresNervosas++;
				}
				if(idade >= 40)
				{
					nervososMaisDe40++;
				}
				break;
			case 3:
				if(sexo == 2)
				{
					homensAgressivos++;
				}
				break;
			default:
				System.out.println();
				System.out.println("----!OP��O INV�LIDA!----");
				break;
				
			}
			
			i++;
		}	
		
		System.out.println();
		System.out.println("O total de pessoas calmas �: "+pessoasCalmas);
		System.out.println("O total de mulheres nervosas �: "+mulheresNervosas);
		System.out.println("O total de homens agressivos �: "+homensAgressivos);
		System.out.println("O total de outros calmos �: "+outrosCalmos);
		System.out.println("O total de pessoas nervosas com mais de 40 anos: "+nervososMaisDe40);
		System.out.println("O total de pessoas calmas com menos de 18 anos: "+calmosMenosDe18);
		
		dados.close();
	}

}
	/* ---> TESTE DE COD <---
	 switch(sexo) 
	{
	case 1:
		System.out.println();
		System.out.println("Qual � o seu temperamento?");
		System.out.println("1. Sou calma");
		System.out.println("2. Sou nervosa");
		System.out.println("3. Sou agressiva");
		System.out.print("Seu temperamento: ");
		temperamento1 = dados.nextInt();
		break;
		
	case 2:
		System.out.println();
		System.out.println("Qual � o seu temperamento?");
		System.out.println("1. Sou calmo");
		System.out.println("2. Sou nervoso");
		System.out.println("3. Sou agressivo");
		System.out.print("Seu temperamento: ");
		temperamento2 = dados.nextInt();
		break;
		
	case 3:
		System.out.println();
		System.out.println("Qual � o seu temperamento?");
		System.out.println("1. Sou calme");
		System.out.println("2. Sou nervose");
		System.out.println("3. Sou agressive");
		System.out.print("Seu temperamento: ");
		temperamento3 = dados.nextInt();
		break;
		
		default:
			System.out.println();
			System.out.println("----!OP��O INV�LIDA!----");
			break;
	}
	//n�meros de pessoas calmas
	if (temperamento1 == 1 || temperamento2 == 1 || temperamento3 == 1)
	{
		pessoasCalmas++;
	}
	//numero de mulheres nervosas
	if(sexo == 1 && temperamento1 == 2)
	{
		mulheresNervosas++;
	}
	//numero de homens agressivos
	if(sexo == 2 && temperamento2 == 3)
	{
		homensAgressivos++;
	}
	//numero de outros calmos
	if(sexo == 3 && temperamento3 == 1)
	{
		outrosCalmos++;
	}
	//mais de 40 nervosos
	if(idade >= 40 && temperamento1 == 2 || temperamento2 == 2 || temperamento3 == 2)
	{
		nervososMaisDe40++;
	}
	//menos de 18 calmos
	if(idade <= 18 && temperamento1 == 1 || temperamento2 == 2 || temperamento3 == 2)
	{
		calmasMenosDe18++;
	}*/
