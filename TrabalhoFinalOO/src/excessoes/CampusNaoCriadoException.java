package excessoes;

import java.util.ArrayList;

import instituicao.*;

public class CampusNaoCriadoException {
	
	public static ArrayList<Campus> listaDeCampus = new ArrayList<Campus>();
			
	public static void CampusNCriadoException()  {

		try {
			
			Campus.criarPredio();
		}
		catch(ArrayIndexOutOfBoundsException  e){
			
			System.out.println("---------------------");
			System.out.println("# ERRO: Nao existem campus cadastrados para atribui-lo ao predio.\n");

			System.out.println("# Por Favor, crie um Campus para atribui-lo a Turma.\n");
			
			Campus.criarCampus();

			Object[] objArrayCampus = listaDeCampus.toArray();
			
			Campus.criarPredio();
		}
	}
}