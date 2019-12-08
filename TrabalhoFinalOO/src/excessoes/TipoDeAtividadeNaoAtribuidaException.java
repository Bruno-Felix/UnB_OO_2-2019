package excessoes;

import javax.swing.JOptionPane;

import instituicao.Sala;

public class TipoDeAtividadeNaoAtribuidaException {
	
	static Object[] Atividade = {"graduacao", "pos-graduacao", "extensao"};
	
	public static void AtividadeNaoAtribuidaException(Sala salaCriada) {
		
		while(salaCriada.tipoDeAtividade == "null") {
			
			System.out.println("Não foi atribuido o tipo de atividade a sala");
			
			salaCriada.tipoDeAtividade = String.valueOf(JOptionPane.showInputDialog(
					null,"Selecione uma atividade","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,Atividade,Atividade[0]));
		}
	}
}