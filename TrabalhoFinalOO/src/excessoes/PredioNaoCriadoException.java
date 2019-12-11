package excessoes;

import instituicao.*;

public class PredioNaoCriadoException {
	
	public static void PredioNCriadoException() {
		
		try {
			
			Predio.criarSalaNoPredio();
		}
		catch(ArrayIndexOutOfBoundsException  e){
			System.out.println("---------------------");
			System.out.println("# ERRO: Nao existe um predio cadastrado para atribuir a sala.\n");

			System.out.println("# Por Favor, crie um Predio para atribui-lo a Sala.\n");
			CampusNaoCriadoException.CampusNCriadoException();
			Predio.criarSalaNoPredio();
		}
	}
}
