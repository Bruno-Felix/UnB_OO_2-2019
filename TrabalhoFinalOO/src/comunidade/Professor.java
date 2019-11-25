package comunidade;

import javax.swing.JOptionPane;

import instituicao.Turma;

public class Professor extends Pessoa {
	
	public int cadastro;
		
	
	public Professor(String nomeDaPessoa, int idadeDaPessoa, int cadastro){
		super(nomeDaPessoa, idadeDaPessoa);
		this.cadastro = cadastro;
	}
	
	public Professor() {
		super();
		try {
	
			this.cadastro = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de cadastro: "));
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Campo cadastro deve ser numérico!");
		}
	}
	
	public void cadastrarPessoaEmTurma(Turma turma) {
		this.turmas.add(turma);
	}
	
	
	public void listarTurmasCadastradas() {
			
		JOptionPane.showMessageDialog(null, "Professor: "+this.getNomeDaPessoa());
		
		if(turmas.size() == 0) {
			
			JOptionPane.showMessageDialog(null, "Não há turmas cadastradas para o professor "+this.getNomeDaPessoa());
			
			}else {
				
				for(int i=0; i<turmas.size(); i++) {
					
					JOptionPane.showMessageDialog(null, "Turma: "+this.turmas.get(i).nomeDaTurma);
					JOptionPane.showMessageDialog(null, "Disciplina: "+this.turmas.get(i).disciplinaDaTurma);
					JOptionPane.showMessageDialog(null, "Vagas: "+this.turmas.get(i).numeroDeAlunos);
				
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
