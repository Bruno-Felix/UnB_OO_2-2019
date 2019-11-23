package instituicao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ProjetoMain {

	public static void main(String[] args){
		
		Campus classCampus = new Campus();
		
		ArrayList<Campus> listaCampus = new ArrayList<>();
		
		//Criação do primeiro Campus:
		listaCampus = classCampus.criarCampus(listaCampus);
	}
}