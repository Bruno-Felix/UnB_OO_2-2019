package aplicacao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import comunidade.*;

import instituicao.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Campus> UnB = new ArrayList<Campus>();
		int criar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo Campus?");
		while (criar == 0) {
			Campus.criarCampus(UnB);
			criar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo Campus?");
		}
		Campus.listarCampus(UnB);
		
		
		
	}

}