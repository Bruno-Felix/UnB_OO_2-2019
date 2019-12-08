package instituicao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import excessoes.TipoDeAtividadeNaoAtribuidaException;

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
	
	@Override
	public String toString() {
		return nomeDaSala;
	}
	
	
	public void cadastrarSala(Predio predio, Sala salaCriada) {
		
		salaCriada.nomeDaSala = JOptionPane.showInputDialog("Digite o nome da sala");
		salaCriada.ocupacaoDaSala = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade de alunos na sala"));
		salaCriada.tipoDeAtividade = String.valueOf(JOptionPane.showInputDialog(
				null,"Selecione uma atividade","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,Atividade,Atividade[0]));
		
		TipoDeAtividadeNaoAtribuidaException.AtividadeNaoAtribuidaException(salaCriada);
		
		
		
		int opcaoAr = 0;
		opcaoAr = JOptionPane.showConfirmDialog(null,
				"A Sala tem Arcondicionado?", "Escolha um", JOptionPane.YES_NO_OPTION);
		
		if(opcaoAr == 0) {
			
			salaCriada.possuiArCondicionado = true;
		}
		else {
			
			salaCriada.possuiArCondicionado = false;
		}
		
		int opcaoProj = 0;
		opcaoProj = JOptionPane.showConfirmDialog(null,
				"A Sala tem Projetor?", "Escolha um", JOptionPane.YES_NO_OPTION);
		
		if(opcaoProj == 0) {
			
			salaCriada.possuiProjetor = true;
		}
		else {
			
			salaCriada.possuiProjetor = false;
		}
		
		int opcaoTV = 0;
		opcaoTV = JOptionPane.showConfirmDialog(null,
				"A Sala possui Televisao", "Escolha um", JOptionPane.YES_NO_OPTION);
		
		if(opcaoTV == 0) {
			
			salaCriada.possuiTelevisao = true;
		}
		else {
			
			salaCriada.possuiTelevisao = false;
		}
		
		predio.listaSala.add(salaCriada);
	}

	public static void listarSalasDeUmPredio() {
		
		Object[] objArrayCampus = Campus.listaDeCampus.toArray();
		    	
		String auxCampus = String.valueOf(JOptionPane.showInputDialog(
				null,"Listar Sala - Campus:","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArrayCampus,objArrayCampus[0]));
		
		for(int aux = 0; aux<Campus.listaDeCampus.size(); aux++) {
			if(Campus.listaDeCampus.get(aux).nomeDoCampus.equalsIgnoreCase(auxCampus)) {
				
				Object[] objArrayPredio = Campus.listaDeCampus.get(aux).estruturasDoCampus.toArray();
				
				String auxPredio = String.valueOf(JOptionPane.showInputDialog(
						null,"Listar Sala - Predios:","Escolha",JOptionPane.QUESTION_MESSAGE,
						null,objArrayPredio,objArrayPredio[0]));
				
				for(int auxB = 0; auxB < Campus.listaDeCampus.get(aux).listaDePredios.size(); auxB++) {
					if(Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).nomeDaEstrutura.equalsIgnoreCase(auxPredio)) {
						
						System.out.println("---------------------");
						System.out.println("LISTA DE SALAS DO PRÉDIO " + Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).nomeDaEstrutura +  
								           " DO CAMPUS " + Campus.listaDeCampus.get(aux).nomeDoCampus+ ":\n");
						
						for(int auxC = 0; auxC < Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.size(); auxC++) {
							
							System.out.println(" - " + (auxC+1) + "º Sala:");
							System.out.println("   Nome da Sala: " + Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.get(auxC).nomeDaSala);
							System.out.println("   Ocupação Máxima: " + Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.get(auxC).ocupacaoDaSala);
							System.out.println("   Tipo de Atividade: " + Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.get(auxC).tipoDeAtividade);
							
							if(Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.get(auxC).possuiArCondicionado == true) {
								System.out.println("   Possui Ar Condicionado");
							}
							else {
								System.out.println("   Não Possui Ar Condicionado");
							}
							
							if(Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.get(auxC).possuiProjetor == true) {
								System.out.println("   Possui Projetor");
							}
							else {
								System.out.println("   Não Possui Projetor");
							}
							
							if(Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.get(auxC).possuiTelevisao == true) {
								System.out.println("   Possui Televisao\n");
							}
							else {
								System.out.println("   Não Possui Televisao\n");
							}	
						}
					}
				}
			}
		}
	}
	
	public void verificarAtividadeAtribuida() {
		
	}
}