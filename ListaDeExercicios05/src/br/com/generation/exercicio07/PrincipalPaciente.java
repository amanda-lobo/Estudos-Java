package br.com.generation.exercicio07;

public class PrincipalPaciente {
	
	public static void main(String[] args) {
		
		Paciente paciente = new Paciente();
		
		paciente.nome = "Eliane";
		paciente.idade = 55;
		paciente.sexo = "Feminino";
		paciente.id = 456;
		paciente.liberacao = 's';
		
		System.out.println("Paciente: "+paciente.nome);
		System.out.println("Idade: "+paciente.idade);
		System.out.println("G�nero: "+paciente.sexo);
		System.out.println("Identifica��o: "+paciente.id);
		System.out.println();
		paciente.PacienteLiberado();
		paciente.PacienteNaoLiberado();
		
	}

}
