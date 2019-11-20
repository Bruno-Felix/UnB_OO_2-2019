package instituicao;
import javax.swing.JOptionPane;
public class Disciplina {
	public String nomeDisciplina;
	public int numCreditos;
	public static void criarDisciplina(int auxDisciplina) {
		Disciplina dc[] = new Disciplina[10];
		dc[auxDisciplina].nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
		dc[auxDisciplina].nomeDisciplina = validaNomeDisciplina(dc[auxDisciplina].nomeDisciplina);
		dc[auxDisciplina].numCreditos = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de cr�ditos da disciplina"));
	}
	public static void cadastrarTurmas() {
		
	}
	public static void listarTurmas() {
		
	}
	//Objetivo: Validar o nome da Disciplina, pois ele n�o pode estar em branco
	public static String validaNomeDisciplina(String nomeDisciplina){
		while(nomeDisciplina == "") {
			//exception
			nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
		}
		return nomeDisciplina;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getNumCreditos() {
		return numCreditos;
	}
	public void setNumCreditos(int numCreditos) {
		this.numCreditos = numCreditos;
	}
}
