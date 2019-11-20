package comunidade;

public class Aluno extends Pessoa {
	public int matriculaDoAluno;
	public int periodosDoAluno;
	
	Aluno(String nomeDaPessoa, int idadeDaPessoa, int matriculaDoAluno, int periodosDoAluno){
		super(nomeDaPessoa, idadeDaPessoa);
		this.matriculaDoAluno = matriculaDoAluno;
		this.periodosDoAluno = periodosDoAluno;
	}
	
	public void verificarTurmasCadastradas() {
		
	}
	
	public void listarAlunos() {
		
	}
}
