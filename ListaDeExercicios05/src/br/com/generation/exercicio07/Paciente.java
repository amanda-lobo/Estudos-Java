package br.com.generation.exercicio07;

public class Paciente {
	
	/*7) Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto paciente, defina as instancias deste objeto
	 *  e apresente as informações deste objeto no console.
	 */
	
	String nome;
	int idade;
	String sexo;
	int id;
	char liberacao;
	
	void PacienteLiberado ()
	{
		if(liberacao == 's' || liberacao == 'S')
		{
			System.out.println("Paciente está liberado!");
		}
	}
	void PacienteNaoLiberado ()
	{
		if(liberacao == 'n' || liberacao == 'N')
		{
			System.out.println("Paciente não está liberado!");
		}
	}

}
