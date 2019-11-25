package instituicao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Predio extends Estrutura {
	public int numeroDeSalas;
	ArrayList<Sala> salasDoPredio; //ArrayList das salas do prédio

	Predio() {
		this.numeroDeSalas = 0;
	}
	
	void criarSala() {
		//Implementação da criação de sala
		this.numeroDeSalas++;
	}
}
