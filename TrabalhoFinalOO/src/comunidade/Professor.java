package comunidade;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import instituicao.Turma;

public class Professor extends Pessoa {
	
	public int cadastro;
	public ArrayList<Turma> turmas = new ArrayList<>();
	
	
	
	public Professor(String nomeDaPessoa, int idadeDaPessoa, int cadastro){
		super(nomeDaPessoa, idadeDaPessoa);
		this.cadastro = cadastro;
	}
	
	public Professor() {
		super();
		this.cadastro = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de cadastro: "));
	}
	
	public void cadastrarProfessorEmTurma(Turma turma) {
		this.turmas.add(turma);
	}
	
	
	public void listarTurmasCadastradas() {
			
		JOptionPane.showMessageDialog(null, "Professor: "+this.getNomeDaPessoa());
		if(turmas.size() == 0) {
			
			JOptionPane.showMessageDialog(null, "Não há turmas cadastradas para o professor "+this.getNomeDaPessoa());
			
			}else {
				
				for(int i=0; i<turmas.size(); i++) {
					
					JOptionPane.showMessageDialog(null, "Turma: "+turmas.get(i).nomeDaTurma);
					JOptionPane.showMessageDialog(null, "Disciplina: "+turmas.get(i).disciplinaDaTurma);
					JOptionPane.showMessageDialog(null, "Vagas: "+turmas.get(i).numeroDeAlunos);
				
			}
		}
	}
	
	
	
	// getters e setters
	
	
	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}
	
}
