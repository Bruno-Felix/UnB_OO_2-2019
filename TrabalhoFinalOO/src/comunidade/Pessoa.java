package comunidade;

public class Pessoa {
	public String nomeDaPessoa;
	public int idadeDaPessoa;
	
	// constructors
	
	Pessoa() {
		
	}
	
	public Pessoa(String nomeDaPessoa, int idadeDaPessoa) {
		super();
		this.nomeDaPessoa = nomeDaPessoa;
		this.idadeDaPessoa = idadeDaPessoa;
	}

	//methods

	public void listarTurmas() {
		// sobrescrita em suas subclasses
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
