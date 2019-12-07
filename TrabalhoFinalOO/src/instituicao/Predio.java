package instituicao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Predio extends Estrutura {
    public int numeroDeSalas;
    List<Sala> listaSala = new ArrayList<Sala>();

    public void cadastrarPredio(String auxCampus, Predio novoPredio, List <Campus> listaDeCampus) {
    	
    	novoPredio.nomeDaEstrutura = JOptionPane.showInputDialog("Digite o nome da Estrutura: ");
    	//System.out.println("nomeDaEstrutura: " + novoPredio.nomeDaEstrutura);
		novoPredio.numeroDeSalas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de Salas: "));
		//System.out.println("numeroDeSalas: " + novoPredio.numeroDeSalas);
		
		for(int aux = 0; aux < Campus.listaDeCampus.size(); aux++) {
			
			
			
			if(Campus.listaDeCampus.get(aux).nomeDoCampus.equalsIgnoreCase(auxCampus)) {
				
				System.out.println("Nome do Campus: " + listaDeCampus.get(aux).nomeDoCampus);
				System.out.println("Numero de Estruturas: " + listaDeCampus.get(aux).numeroDeEstruturas);
				
				System.out.println("nomeDaEstrutura: " + novoPredio.nomeDaEstrutura);
				System.out.println("numeroDeSalas: " + novoPredio.numeroDeSalas);
				
				Campus.listaDeCampus.get(aux).estruturasDoCampus.add(novoPredio);
				Campus.listaDeCampus.get(aux).listaDePredios.add(novoPredio);
			}
		}
    }
    
    public static void listarPredios() {
    	
    	Object[] objArrayCampus = Campus.listaDeCampus.toArray();
    	
    	String auxCampus = String.valueOf(JOptionPane.showInputDialog(
				null,"Listar Alunos - Disciplina:","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArrayCampus,objArrayCampus[0]));
    	
    	
    	System.out.println("LISTA DE PREDIOS:");
    	
    	for(int aux = 0; aux<Campus.listaDeCampus.size(); aux++) {
			if(Campus.listaDeCampus.get(aux).nomeDoCampus.equalsIgnoreCase(auxCampus)) {
				
				for(int auxB = 0; auxB < Campus.listaDeCampus.get(aux).estruturasDoCampus.size(); auxB++) {
					System.out.println("Nome do Predio" + Campus.listaDeCampus.get(aux).estruturasDoCampus.get(auxB).nomeDaEstrutura);
				}
			}
    	}
    }
    
    public static void criarSalaNoPredio() {
    	
    	int opcao = 0;
    	
    	do {
	    	Object[] objArrayCampus = Campus.listaDeCampus.toArray();
	    	
	    	String auxCampus = String.valueOf(JOptionPane.showInputDialog(
					null,"Listar Alunos - Disciplina:","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,objArrayCampus,objArrayCampus[0]));
	    	
	    	for(int aux = 0; aux<Campus.listaDeCampus.size(); aux++) {
				if(Campus.listaDeCampus.get(aux).nomeDoCampus.equalsIgnoreCase(auxCampus)) {
					
					Object[] objArrayPredio = Campus.listaDeCampus.get(aux).estruturasDoCampus.toArray();
							
					String auxPredio = String.valueOf(JOptionPane.showInputDialog(
							null,"Listar Alunos - Disciplina:","Escolha",JOptionPane.QUESTION_MESSAGE,
							null,objArrayPredio,objArrayPredio[0]));
					
					for(int auxB = 0; auxB < Campus.listaDeCampus.size(); auxB++) {
						if(Campus.listaDeCampus.get(aux).estruturasDoCampus.get(auxB).nomeDaEstrutura.equalsIgnoreCase(auxPredio)) {
							
							Sala salaCriada = new Sala();
							
							salaCriada.cadastrarSala(Campus.listaDeCampus.get(aux).estruturasDoCampus.get(auxB));
						}
					}
				}
	    	}
	    	
	    	opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar cadastrando turmas ?", "Escolha um", JOptionPane.YES_NO_OPTION);
    	}while(opcao == 0);
    }
}
