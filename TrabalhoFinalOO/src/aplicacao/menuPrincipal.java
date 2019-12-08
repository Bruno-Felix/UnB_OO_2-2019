package aplicacao;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class menuPrincipal  extends JFrame{
	
	public menuPrincipal() {
		
		setBounds(0, 0, 800, 600);
		setTitle("Trabalho Final OO");
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));  
		
		
		//Inclusao de elementos graficos na Janela. 
		//Barra de Menu superior
		JMenuBar menuBar = new JMenuBar();
		
		//Item de barra de menu chamado "Estruturas"
		JMenu Estruturas = new JMenu("Estruturas");
			JMenuItem Campus = new JMenuItem("Campus");
			JMenuItem Predio = new JMenuItem("Predio");
			JMenuItem Salas  = new JMenuItem("Salas");	
			Estruturas.add(Campus);
			Estruturas.add(Predio);
			Estruturas.add(Salas);
			
			Campus.addActionListener(new ListenerCampus());
		
		//Item de barra de menu chamado "Comunidade"
		JMenu Comunidade = new JMenu("Comunidade");
			JMenuItem Professores = new JMenuItem("Professores");
			JMenuItem Alunos = new JMenuItem("Alunos");
			Comunidade.add(Professores);
			Comunidade.add(Alunos);
			
		//Item de barra de menu chamado "Atividades"
		JMenu Atividades = new JMenu("Atividades");
			JMenuItem Disciplinas = new JMenuItem("Disciplinas");
			JMenuItem Periodos = new JMenuItem("Periodos");
			JMenuItem Turmas = new JMenuItem("Turmas");
			JMenuItem Ocupacoes = new JMenuItem("Ocupacoes");
			Atividades.add(Disciplinas);
			Atividades.add(Periodos);
			Atividades.add(Turmas);
			Atividades.add(Ocupacoes);
		
		
		menuBar.add(Estruturas);
		menuBar.add(Comunidade);
		menuBar.add(Atividades);
		
		//Adiciona barra de menus ao formulario da aplicacao.
		add(menuBar);
		
		//Define o comportamento da aplicacao ao clicar no botao de saida
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Torna a janela visivel
		setVisible(true);
	}
}
