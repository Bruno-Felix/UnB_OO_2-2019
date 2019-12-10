package aplicacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import excessoes.*;
import instituicao.Sala;

public class FormSala extends JFrame {
	
	private JButton btnCriarSala;
	private JButton btnListarSalas;
	
	public FormSala() {
		
		setBounds(800, 200, 480, 300);
		setLayout(null);
		setTitle("Sala");

        btnCriarSala = new JButton("Criar Sala");
        btnCriarSala.setBounds(22, 90, 200, 35);
        btnCriarSala.addActionListener(new ActionListenerbtnCriarSala());
        add(btnCriarSala);

        btnListarSalas = new JButton("Listar Salas");
        btnListarSalas.setBounds(258, 90, 200, 35);
        btnListarSalas.addActionListener(new ActionListenerbtnListarSalas());
        add(btnListarSalas);
		
		setVisible(true);
	}
	
	class ActionListenerbtnCriarSala implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			PredioNaoCriadoException.PredioNCriadoException();
	
		}
	}
	
	class ActionListenerbtnListarSalas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Sala.listarSalasDeUmPredio();
		}
	}
}
