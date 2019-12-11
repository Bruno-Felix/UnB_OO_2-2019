package instituicao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Predio extends Estrutura {
    public int numeroDeSalas;
	List<Sala> listaSala = new ArrayList<Sala>();

	@Override
	public String toString() {
		return nomeDaEstrutura;
	}
	 
    public void cadastrarPredio(String auxCampus, Predio novoPredio, List <Campus> listaDeCampus) {
    	
    	novoPredio.nomeDaEstrutura = JOptionPane.showInputDialog("Digite o nome do Prédio: ");
		novoPredio.numeroDeSalas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de Salas: "));
		
		for(int aux = 0; aux < Campus.listaDeCampus.size(); aux++) {
			if(Campus.listaDeCampus.get(aux).nomeDoCampus.equalsIgnoreCase(auxCampus)) {
				
				Campus.listaDeCampus.get(aux).numeroDeEstruturas++;
				Campus.listaDeCampus.get(aux).estruturasDoCampus.add(novoPredio);
				Campus.listaDeCampus.get(aux).listaDePredios.add(novoPredio);
			}
		}
    }
    
    public static void listarPredios() {
    	
    	try {
    	
    	Object[] objArrayCampus = Campus.listaDeCampus.toArray();
    	
    	String auxCampus = String.valueOf(JOptionPane.showInputDialog(
				null,"Listar Predios - Campus:","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArrayCampus,objArrayCampus[0]));
    	
    	
    	for(int aux = 0; aux < Campus.listaDeCampus.size(); aux++) {
			if(Campus.listaDeCampus.get(aux).nomeDoCampus.equalsIgnoreCase(auxCampus)) {
				
				System.out.println("---------------------");
				System.out.println("LISTA DE PREDIOS DO CAMPUS " + Campus.listaDeCampus.get(aux).nomeDoCampus+ ":\n");
				
				if( Campus.listaDeCampus.get(aux).listaDePredios.size() == 0) {
					
					System.out.println("# Nenhum Prédio Cadastrado no Campus " + Campus.listaDeCampus.get(aux).nomeDoCampus + "!\n");
				}
				else {
					for(int auxB = 0; auxB < Campus.listaDeCampus.get(aux).listaDePredios.size(); auxB++) {
						
						System.out.println(" - " + (auxB+1) + "º Predio:");
						System.out.println("   Nome do Predio: " + Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).nomeDaEstrutura);
						System.out.println("   Número de Salas: " + Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).numeroDeSalas + "\n");
					}
				}
			}
    	}
    	
    	} catch (ArrayIndexOutOfBoundsException e) {
    		
    		System.out.println("---------------------");
			System.out.println("LISTA DE PREDIOS DO CAMPUS:\n");
    		
    		System.out.println("# Nenhum Campus cadastrado para listar seus Prédios!\n");
    	}
    }
    
    public static void criarSalaNoPredio() {
    	
    	int opcao = 0;
    	
    	do {
	    	Object[] objArrayCampus = Campus.listaDeCampus.toArray();
	    	
	    	String auxCampus = String.valueOf(JOptionPane.showInputDialog(
					null,"Criar Sala - Campus:","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,objArrayCampus,objArrayCampus[0]));
	    	
	    	for(int aux = 0; aux<Campus.listaDeCampus.size(); aux++) {
				if(Campus.listaDeCampus.get(aux).nomeDoCampus.equalsIgnoreCase(auxCampus)) {
					
					Object[] objArrayPredio = Campus.listaDeCampus.get(aux).estruturasDoCampus.toArray();
							
					String auxPredio = String.valueOf(JOptionPane.showInputDialog(
							null,"Criar Sala - Predios:","Escolha",JOptionPane.QUESTION_MESSAGE,
							null,objArrayPredio,objArrayPredio[0]));
					
					for(int auxB = 0; auxB < Campus.listaDeCampus.get(aux).listaDePredios.size(); auxB++) {
						if(Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).nomeDaEstrutura.equalsIgnoreCase(auxPredio)) {
							
							Sala salaCriada = new Sala();
							
							System.out.println("---------------------");
							System.out.println("# Nova Sala Sendo Criada...");
							
							salaCriada.cadastrarSala(Campus.listaDeCampus.get(aux).listaDePredios.get(auxB), salaCriada);
							
							System.out.println("  Sala " + salaCriada.nomeDaSala + " Criada no Prédio " + auxPredio + ", Campus "+ auxCampus + "!\n");
						}
					}
				}
	    	}
	    	
	    	opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar Cadastrando Salas ?", "Escolha um", JOptionPane.YES_NO_OPTION);
    	}while(opcao == 0);
    }
}
