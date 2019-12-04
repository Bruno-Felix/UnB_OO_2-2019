package aplicacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class viewMenuPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewMenuPrincipal window = new viewMenuPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public viewMenuPrincipal() {
		frame = new JFrame();
		frame.setBounds(0, 0, 800, 600);
		frame.setTitle("Trabalho Final OO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		//Item Estruturas do Menu:
		JMenu Estruturas = new JMenu("Estruturas");
			JMenuItem Campus = new JMenuItem("Campus");
			JMenuItem Predio = new JMenuItem("Predio");
			JMenuItem Salas  = new JMenuItem("Salas");
		Estruturas.add(Campus);
		Estruturas.add(Predio);
		Estruturas.add(Salas);
		//Campus.addActionListener(new viewCampus());
		
		//Item Comunidade do Menu:
		JMenu Comunidade = new JMenu("Comunidade");
		JMenuItem Professores = new JMenuItem("Professores");
		JMenuItem Alunos = new JMenuItem("Alunos");
		Comunidade.add(Professores);
		Comunidade.add(Alunos);
		
		//Item Atividades do Menu:
		JMenu Atividades = new JMenu("Atividades");
		
		JMenuItem Disciplinas = new JMenuItem("Disciplinas");
		JMenuItem Periodos = new JMenuItem("Periodos");
		JMenuItem Turmas = new JMenuItem("Turmas");
		JMenuItem Ocupacoes = new JMenuItem("Ocupacoes");
		
		Atividades.add(Disciplinas);
		Atividades.add(Periodos);
		Atividades.add(Turmas);
		Atividades.add(Ocupacoes);
		
		JMenu Sobre = new JMenu("Sobre");
		
		
		menuBar.add(Estruturas);
		menuBar.add(Comunidade);
		menuBar.add(Atividades);
		menuBar.add(Sobre);
	}
}