package instituicao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Sala {
	
	static int opcao;
	public String nomeDaSala;
	public int ocupacaoDaSala;
	public String tipoDeAtividade;
	public boolean possuiArCondicionado;
	public boolean possuiProjetor;
	public boolean possuiTelevisao;
	static List<Sala> listaSala = new ArrayList<Sala>();
	static Object[] Atividade = {"graduacao", "pos-graduacao", "extensao"};
	
	static public void cadastrarSala() {
		
		do {
			Sala preencheSala = new Sala();
			preencheSala.nomeDaSala = JOptionPane.showInputDialog("Digite o nome da sala");
			preencheSala.ocupacaoDaSala = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade de alunos na sala"));
			preencheSala.tipoDeAtividade = String.valueOf(JOptionPane.showInputDialog(
					null,"Selecione uma atividade","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,Atividade,Atividade[0]));
			
			int opcaoAr = JOptionPane.showConfirmDialog(null,
					"Quer continuar cadastrando salas?", "Escolha um", JOptionPane.YES_NO_OPTION);
			
			if(opcaoAr == 0) {
				preencheSala.possuiArCondicionado = true;
				System.out.println("Ar: " + preencheSala.possuiArCondicionado );
			}
			else {
				preencheSala.possuiArCondicionado = false;

			}
			listaSala.add(preencheSala);
			opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar cadastrando salas?", "Escolha um", JOptionPane.YES_NO_OPTION);
		
		}while(opcao == 0);
		
	}
	
	public void verificarAtividadeAtribuida() {
		
	}
	
	
}
