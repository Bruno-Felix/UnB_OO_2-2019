package comunidade;

import java.util.ArrayList;
import java.util.List;

import instituicao.Campus;
import instituicao.Turma;

public class Professor extends Pessoa {
	
	public int cadastro;
	
	// association
	
	public List<Turma> turmas = new ArrayList<>();
		
	
	// constructor
	
	public Professor() {

	}
	
	public Professor(String nomeDaPessoa, int idadeDaPessoa, int cadastro){
		super(nomeDaPessoa, idadeDaPessoa);
		this.cadastro = cadastro;
	}
	
	///
			
	// methods
	
	public void listarTurmas() {
		
		if(this.getTurmas().size() == 0) {
			System.out.println("Não há turmas cadastradas para o professor: "+ this.getNomeDaPessoa());
		}else {
			
			System.out.println("Turmas cadastradas do professor: "+this.getNomeDaPessoa());
			
			for(int i=0; i < this.getTurmas().size() ; i++) {
				System.out.println(this.turmas.get(i));
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

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
	
}
