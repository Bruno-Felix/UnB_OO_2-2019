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


import instituicao.Sala;
import instituicao.Predio;

public class FormSala extends JFrame {
	
	private JButton btnCriarSala;
	private JButton btnListarSalas;
	
	public FormSala() {
		
		setBounds(800, 200, 480, 300);
		setLayout(null); //nesse caso, uma t
		setTitle("Sala");
		
//		btnCriarSala = new JButton("Criar Sala");
//		btnCriarSala.addActionListener(new ActionListenerbtnCriarSala());
//		add(btnCriarSala);
//		
//		btnListarSala = new JButton("Listar Sala");
//		btnListarSala.addActionListener(new ActionListenerbtnListarSala());
//		add(btnListarSala);

        btnCriarSala = new JButton("Criar Sala");
        btnCriarSala.setBounds(22, 81, 132, 23);
        btnCriarSala.addActionListener(new ActionListenerbtnCriarSala());
        add(btnCriarSala);

        btnListarSalas = new JButton("Listar Salas");
        btnListarSalas.setBounds(258, 81, 142, 23);
        btnListarSalas.addActionListener(new ActionListenerbtnListarSalas());
        add(btnListarSalas);
		
			
		setVisible(true);
	}
	
	class ActionListenerbtnCriarSala implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Predio.criarSalaNoPredio();
		}
	}
	
	class ActionListenerbtnListarSalas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Sala.listarSalasDeUmPredio();
		}
	}
}
