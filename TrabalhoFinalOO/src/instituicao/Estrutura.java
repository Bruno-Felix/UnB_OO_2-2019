package instituicao;

import java.util.List;

import javax.swing.JOptionPane;

public class Estrutura {
	
	public String nomeDaEstrutura;
	public Campus campusDaEstrutura;
	
	public void cadastrarPredio(String auxCampus, Estrutura novaEstrutura,  List <Campus> listaDeCampus){
		
		novaEstrutura.nomeDaEstrutura = JOptionPane.showInputDialog("Digite o nome da Estrutura: ");
		
		for(int aux = 0; aux < Campus.listaDeCampus.size(); aux++) {
			if(Campus.listaDeCampus.get(aux).nomeDoCampus.equalsIgnoreCase(auxCampus)) {
				
				novaEstrutura.campusDaEstrutura = Campus.listaDeCampus.get(aux);
				
				Campus.listaDeCampus.get(aux).numeroDeEstruturas++;
				Campus.listaDeCampus.get(aux).estruturasDoCampus.add(novaEstrutura);
			}
		}
	}
	
	public static void listarEstruturas() {
    	
    	try {
    	
    	Object[] objArrayCampus = Campus.listaDeCampus.toArray();
    	
    	String auxCampus = String.valueOf(JOptionPane.showInputDialog(
				null,"Listar Estruturas - Campus:","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArrayCampus,objArrayCampus[0]));
    	
    	
    	for(int aux = 0; aux < Campus.listaDeCampus.size(); aux++) {
			if(Campus.listaDeCampus.get(aux).nomeDoCampus.equalsIgnoreCase(auxCampus)) {
				
				System.out.println("---------------------");
				System.out.println("LISTA DE ESTRUTURAS DO CAMPUS " + Campus.listaDeCampus.get(aux).nomeDoCampus+ ":\n");
				
				if( Campus.listaDeCampus.get(aux).estruturasDoCampus.size() == 0) {
					
					System.out.println("# Nenhuma Estrutura Cadastrada no Campus " + Campus.listaDeCampus.get(aux).nomeDoCampus + "!\n");
				}
				else {
					for(int auxB = 0; auxB < Campus.listaDeCampus.get(aux).estruturasDoCampus.size(); auxB++) {
						
						System.out.println(" - " + (auxB+1) + "º Estrutura:");
						System.out.println("   Nome da Estrutura: " + Campus.listaDeCampus.get(aux).estruturasDoCampus.get(auxB).nomeDaEstrutura + "\n");
					}
				}
			}
    	}
    	
    	} catch (ArrayIndexOutOfBoundsException e) {
    		
    		System.out.println("---------------------");
			System.out.println("LISTA DE ESTRUTURAS DO CAMPUS:\n");
    		
    		System.out.println("# Nenhum Campus cadastrado para listar seus Estruturas!\n");
    	}
    }
}
