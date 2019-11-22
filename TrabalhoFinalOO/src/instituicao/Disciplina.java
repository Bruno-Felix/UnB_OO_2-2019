package instituicao;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
public class Disciplina {
	public String nomeDisciplina;
	public int numCreditos;
	static int opcao;
	//static int auxDisciplina=0;
	static List<Disciplina> dc = new ArrayList<Disciplina>();
	static List<Turma> tma = new ArrayList<Turma>();
	@Override
	public String toString() {
		nomeDisciplina = nomeDisciplina.substring(0, 1).toUpperCase() + nomeDisciplina.substring(1).toLowerCase();
		return  nomeDisciplina;
	}
	
	
	
	public void criarDisciplina() {
		do {
			Disciplina preenche = new Disciplina();
			preenche.nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
			preenche.nomeDisciplina = validaNome(preenche.nomeDisciplina);
			preenche.numCreditos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de créditos da disciplina"));
			preenche.numCreditos = validaNumCreditos(preenche.numCreditos);
			dc.add(preenche);
			opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar cadastrando disciplinas ?", "Escolha um", JOptionPane.YES_NO_OPTION);
		}while(opcao == 0);
	}
	
	//objetivo: quando o usuário selecionar a opção cadastrar turma, uma lista de disciplinas deve ser mostrada,
	//			e o usuário deverá escolher uma disciplina para essa turma, e depois os seus atributos
	public static void cadastrarTurmas() {
		Turma preenche = new Turma();
		 Object[] objArray = dc.toArray();
		do {
			String temporaria = String.valueOf(JOptionPane.showInputDialog(
					null,"Escolha a Disciplina dessa nova turma","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,objArray,objArray[0]));
			preenche.nomeTurma = JOptionPane.showInputDialog("Digite o nome da turma");
			preenche.nomeTurma = validaNome(preenche.nomeTurma);
			preenche.qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
			preenche.disciplina = temporaria;
			tma.add(preenche);
			opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar cadastrando turmas ?", "Escolha um", JOptionPane.YES_NO_OPTION);
		}while(opcao==0);
		
	}
	
	
	
	public static void listarTurmas() {
		/*String turmas = "";
		for(Turma turma : tma) {
			turmas += turma + "\n";
		}
		JOptionPane.showMessageDialog(null, turmas.toString());*/
		for(int i = 0; i < Disciplina.tma.size(); i++) {   
		    Disciplina.tma.get(i).nomeTurma = Disciplina.tma.get(i).nomeTurma + "\n";
		} 
		
		JOptionPane.showMessageDialog(Disciplina, tma);
	}

	public static int validaQtd(int qtd) {
		while(qtd<10 || qtd>130) {
			Integer.parseInt(JOptionPane.showInputDialog("Quantidade invalida, digite uma quantidade entre 10 e 130"));
		}
		return qtd;
	}
	
	
	//objetivo: validar o número de créditos, que não pode ser menor ou igual a 0, e não pode ser maior que 6
	public static int validaNumCreditos(int numCreditos) {
		while(numCreditos <= 0 || numCreditos > 6) {
			//exception
			numCreditos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de créditos da disciplina"));
		}
		return numCreditos;
	}
	
	
	//Objetivo: Validar o nome da Disciplina, pois ele não pode estar em branco
	public static String validaNome(String nome){
		while(nome == "") {
			//exception
			nome = JOptionPane.showInputDialog("Nome invalido, digite novamente");
		}
		return nome;
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
