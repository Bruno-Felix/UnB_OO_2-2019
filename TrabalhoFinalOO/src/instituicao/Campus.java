package instituicao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Campus {
	@Override
	public String toString() {
		return nomeDoCampus;
	}

	public String nomeDoCampus;
	public int numeroDeEstruturas;
	public static int numeroDeCampus;
	public static ArrayList<Campus> listaDeCampus = new ArrayList<Campus>();
	List<Estrutura> estruturasDoCampus; // ArrayList das estruturas desse campus
	List<Estrutura> listaDePredios;

	public String getnomeDoCampus() {
		return nomeDoCampus;
	}

	public void setnomeDoCampus(String nomeDoCampus) {
		this.nomeDoCampus = nomeDoCampus;
	}

	public int getnumeroDeEstruturas() {
		return numeroDeEstruturas;
	}

	public void setnumeroDeEstruturas(int numeroDeEstruturas) {
		this.numeroDeEstruturas = numeroDeEstruturas;
	}


	public static void criarCampus() {

		int opcao = 0;
		
		do {
			Campus novoCampus = new Campus();
			
			novoCampus.nomeDoCampus = JOptionPane.showInputDialog("Digite o nome do Campus: ");
			novoCampus.numeroDeEstruturas = 0; // numero de estruturas começa como 0 e aumenta com a criação de estruturas
			Campus.numeroDeCampus++;
			
			listaDeCampus.add(novoCampus);
			
			opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar criando Campus?", "Escolha um", JOptionPane.YES_NO_OPTION);
			
		}while(opcao == 0);
	}

	public static void listarCampus() {

		if (listaDeCampus.size() == 0) {
			System.out.println("Lista de Campus:\n");
		}else {
			System.out.println("Nenhum Campus Cadastrado!");
		}
		for(int aux = 0; aux<Campus.listaDeCampus.size(); aux++) {
		
			System.out.println("- " + aux + "º campus:");
			System.out.println("Nome do Campus: " + listaDeCampus.get(aux).nomeDoCampus);
			System.out.println("Numero de Estruturas: " + listaDeCampus.get(aux).numeroDeEstruturas);
		}
	}
	
	void criarEstrutura() { // Criação de estruturas fica para o campus no qual está a estrutura]
		
		Estrutura novaEstrutura = new Estrutura();
		
		novaEstrutura.nomeDaEstrutura = JOptionPane.showInputDialog("Digite o nome da Estrutura: ");
		novaEstrutura.campusDaEstrutura = this;
		this.numeroDeEstruturas++;
		
		estruturasDoCampus.add(novaEstrutura);
	}
	
	public static void criarPredio() { // Criação de predio
		
		int opcao = 0;
		
		do {
			Predio novoPredio = new Predio();
			
			Object[] objArrayCampus = listaDeCampus.toArray();
	    	
			System.out.println(listaDeCampus.size());
	    	String auxCampus = String.valueOf(JOptionPane.showInputDialog(
					null,"Listar de Campus:","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,objArrayCampus,objArrayCampus[0]));
	    			
			novoPredio.cadastrarPredio(auxCampus, novoPredio, listaDeCampus);
	    	
	    	opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar criando Predios?", "Escolha um", JOptionPane.YES_NO_OPTION);
	    	
		}while(opcao == 0);
	}
}
