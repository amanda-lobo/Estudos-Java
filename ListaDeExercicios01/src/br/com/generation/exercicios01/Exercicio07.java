package br.com.generation.exercicios01;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		/*7. Um sistema de equações lineares do tipo: 
		 ax + by = c
		 dx + ey = f, pode ser resolvido segundo mostrado abaixo : 
		 x = ce - bf / ae - bd | y = af - cd / ae - bd
		 Escreva um sistema que lê os coeficientes a,b,c,d,e e f e 
		 calcula e mostra os valores de x e y. */
		
		Scanner coeficientes = new Scanner(System.in);
		
		double a, b, c, d, e, f;
		double x, y;
		
		System.out.print("Insira o valor de A: ");
		a = coeficientes.nextInt();
		
		System.out.print("Insira o valor de B: ");
		b = coeficientes.nextInt();
		
		System.out.print("Insira o valor de C: ");
		c = coeficientes.nextInt();
		
		System.out.print("Insira o valor de D: ");
		d = coeficientes.nextInt();
		
		System.out.print("Insira o valor de E: ");
		e = coeficientes.nextInt();
		
		System.out.print("Insira o valor de F: ");
		f = coeficientes.nextInt();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d) / (a * e) - (b * d));
		
		System.out.println();
		System.out.printf("O valor de X é: %.1f",x);
		System.out.printf("\nO valor de Y é: %.1f",y);
		
		coeficientes.close();
 

	}

}
