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
		
		setBounds(800, 200, 480, 300);
		setLayout(null); //nesse caso, uma tabela 3x3
		setTitle("Campos");
		
//		btnCriarCampus = new JButton("Criar Turma");
//		btnCriarCampus.addActionListener(new ActionListenerbtnCriarCampus());
//		add(btnCriarCampus);
//		
//		btnListarCampus = new JButton("Listar Turma");
//		btnListarCampus.addActionListener(new ActionListenerbtnListarCampus());
//		add(btnListarCampus);

        btnCriarCampus = new JButton("Criar Campus");
        btnCriarCampus.setBounds(22, 81, 132, 23);
        btnCriarCampus.addActionListener(new ActionListenerbtnCriarCampus());
        add(btnCriarCampus);

        btnListarCampus = new JButton("Listar Campus");
        btnListarCampus.setBounds(258, 81, 142, 23);
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
