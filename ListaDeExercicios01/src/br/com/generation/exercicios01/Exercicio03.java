package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		/*3. Fa�a um sistema que leia o tempo de dura��o 
		de um evento em uma f�brica expressa em segundos
		e mostre-o expresso em horas, minutos e segundos.
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int segundos, horas, minutos, segundosEvento;
		int segundosHora = 3600, segundosMinuto = 60;
		
		System.out.print("Insira a dura��o do evento descrita em segundos: ");
		segundosEvento = leia.nextInt();
		System.out.println();
		
		horas = segundosEvento / segundosHora;
		minutos = (segundosEvento % segundosHora) / segundosMinuto;
		segundos = (segundosEvento % segundosHora) %segundosMinuto;
		
		System.out.println("O evento teve dura��o de "+horas+" hora(s) "+minutos+" minuto(s) e "+segundos+" segundos.");
		
		leia.close();
	}

}
