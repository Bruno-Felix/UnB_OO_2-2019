package comunidade;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
	public int matriculaDoAluno;
	public int periodosDoAluno;
	
	public Aluno(){
		super();
		try {
			this.matriculaDoAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de matrícula: "));
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Campo matrícula deve ser numérico!");
		
		}
	}
	
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
