package comunidade;

import javax.swing.JOptionPane;

public class Pessoa {
	public String nomeDaPessoa;
	public int idadeDaPessoa;
	
	Pessoa() {
		this.nomeDaPessoa = JOptionPane.showInputDialog("Digite o nome: ");
		this.idadeDaPessoa = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
	}
	
	Pessoa(String nomeDaPessoa, int idadeDaPessoa) {
		this.nomeDaPessoa = nomeDaPessoa;
		this.idadeDaPessoa = idadeDaPessoa;
	}
	
	public void listarTurmasCadastradas() {
		
	}

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
