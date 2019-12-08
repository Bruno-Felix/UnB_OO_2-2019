package aplicacao;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
//import javax.swing.JOptionPane;
//import javax.swing.JTextField;

import instituicao.Campus;

public class FormCampus extends JFrame {

	//private Campus campus;
	private JButton btnCriarCampus;
	private JButton btnListarCampus;
	
	public FormCampus() {
		
		setBounds(50, 50, 300, 400);
		setLayout(new GridLayout(3, 3)); //nesse caso, uma tabela 3x3
		setTitle("Campos");
		
		btnCriarCampus = new JButton("Criar Turma");
		btnCriarCampus.addActionListener(new ActionListenerbtnCriarCampus());
		add(btnCriarCampus);
		
		btnListarCampus = new JButton("Listar Turma");
		btnListarCampus.addActionListener(new ActionListenerbtnListarCampus());
		add(btnListarCampus);
		
			
		setVisible(true);
	}
	
	class ActionListenerbtnCriarCampus implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Campus.criarCampus();
		}
	}
	
	class ActionListenerbtnListarCampus implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Campus.listarCampus();
		}
	}
}
