package instituicao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Campus {
	@Override
	public String toString() {
		return "  Nome do Campus: " + nomeDoCampus + "\n" + "  Numero de Estruturas: " + numeroDeEstruturas + "\n";
	}

	public String nomeDoCampus;
	public int numeroDeEstruturas;
	public static int numeroDeCampus;
	public ArrayList<Estrutura> estruturasDoCampus; // ArrayList das estruturas desse campus

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

	void criarEstrutura() { // Criação de estruturas fica para o campus no qual está a estrutura
		Estrutura novaEstrutura = new Estrutura();
		novaEstrutura.nomeDaEstrutura = JOptionPane.showInputDialog("Digite o nome da Estrutura: ");
		novaEstrutura.campusDaEstrutura = this;
		this.numeroDeEstruturas++;
		this.estruturasDoCampus.add(novaEstrutura);
	}

	public static ArrayList<Campus> criarCampus(ArrayList<Campus> Lista) {

		Campus novoCampus = new Campus();
		novoCampus.nomeDoCampus = JOptionPane.showInputDialog("Digite o nome do Campus: ");
		novoCampus.numeroDeEstruturas = 0; // numero de estruturas começa como 0 e aumenta com a criação de estruturas
		Lista.add(novoCampus);

		numeroDeCampus++;

		return Lista;
	}

	public static ArrayList<Campus> listarCampus(ArrayList<Campus> Lista) {

		int aux = 1;

		if (!Lista.isEmpty()) {
			System.out.println("Lista de Campus:\n");
		}else {
			System.out.println("Nenhum Campus Cadastrado!");
		}
		while (!Lista.isEmpty()) {

			System.out.println("- " + aux + "º campus:");
			System.out.println(Lista.remove(0));

			aux++;
		}

		return Lista;
	}
}
