package comunidade;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import instituicao.Turma;

public class Pessoa {
	public String nomeDaPessoa;
	public int idadeDaPessoa;
	public ArrayList<Turma> turmas;
	
	Pessoa() {
					
//		this.turmas = new ArrayList<Turma>();
//		
//		try {
//			this.nomeDaPessoa = JOptionPane.showInputDialog("Digite o nome: ");
//			this.idadeDaPessoa = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
//			
//		}catch(NumberFormatException ex) {
//			JOptionPane.showMessageDialog(null, "Campo idade deve ser num�rico!");
//		}
	}
	
	Pessoa(String nomeDaPessoa, int idadeDaPessoa) {
	
			this.nomeDaPessoa = nomeDaPessoa;
			this.idadeDaPessoa = idadeDaPessoa;
		
	}
	
	public void cadastrarPessoaEmTurma(Turma turma) {}
	
	
	public void listarTurmasCadastradas() {}

	// getters e setters
	
	public String getNomeDaPessoa() {
		return nomeDaPessoa;
	}

	public void setNomeDaPessoa(String nomeDaPessoa) {
		this.nomeDaPessoa = nomeDaPessoa;
	}

	public int getIdadeDaPessoa() {
		return idadeDaPessoa;
	}

	public void setIdadeDaPessoa(int idadeDaPessoa) {
		this.idadeDaPessoa = idadeDaPessoa;
	}
	
	
}
