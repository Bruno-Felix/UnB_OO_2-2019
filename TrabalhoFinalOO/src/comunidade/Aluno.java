package comunidade;

import java.util.List;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
	public int matriculaDoAluno;
	public int periodosDoAluno;
	
	public Aluno(){
//		super();
//		try {
//			this.matriculaDoAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de matr�cula: "));
//		}catch(NumberFormatException e) {
//			JOptionPane.showMessageDialog(null, "Campo matr�cula deve ser num�rico!");
//		
//		}
	}
	
	Aluno(String nomeDaPessoa, int idadeDaPessoa, int matriculaDoAluno, int periodosDoAluno){
		super(nomeDaPessoa, idadeDaPessoa);
		this.matriculaDoAluno = matriculaDoAluno;
		this.periodosDoAluno = periodosDoAluno;
	}
	
	
	public static Aluno cadastrarAluno(Aluno novoAluno) {
		
		novoAluno.nomeDaPessoa = JOptionPane.showInputDialog("Digite o nome do Aluno");
		novoAluno.matriculaDoAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula do Aluno:"));
		
		return novoAluno;
	}
	
	public void verificarTurmasCadastradas() {
		
	}
	
	public void listarAlunos() {
		
	}
}
