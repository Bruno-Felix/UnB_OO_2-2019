package instituicao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import comunidade.Pessoa;
import comunidade.Professor;

public class ProjetoMain {

	public static void main(String[] args){
		
//		Campus classCampus = new Campus();
//		
//		ArrayList<Campus> listaCampus = new ArrayList<>();
//		
//		//CriaÃ§Ã£o do primeiro Campus:
//		listaCampus = classCampus.criarCampus(listaCampus);
		
		
		Turma oo = new Turma("B", 40, "Orientação a Objetos");
		
		//Professor p = new Professor("Andre", 21, 123456);
		
		Pessoa p1 = new Professor();
		
		p1.cadastrarPessoaEmTurma(oo);	
		
		System.out.println(p1.idadeDaPessoa);
//		p1.listarTurmasCadastradas();
		
		
	}
}