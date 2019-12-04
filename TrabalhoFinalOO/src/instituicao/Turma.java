package instituicao;

public class Turma {
	
	public String nomeDaTurma;
	public int numeroDeAlunos;
	public String disciplinaDaTurma;
	
	public Turma() {}
	
	public Turma(String nomeDaTurma, int numeroDeAlunos, String disciplinaDaTurma) {
		super();
		this.nomeDaTurma = nomeDaTurma;
		this.numeroDeAlunos = numeroDeAlunos;
		this.disciplinaDaTurma = disciplinaDaTurma;
	}

	public void matricularAlunos() {
		
	}
	
	public void inscreverProfessor() {
		
	}
	public String getNomeDaTurma() {
		return nomeDaTurma;
	}
	public int getNumeroDeAlunos() {
		return numeroDeAlunos;
	}
	public String getDisciplinaDaTurma() {
		return disciplinaDaTurma;
	}
}
