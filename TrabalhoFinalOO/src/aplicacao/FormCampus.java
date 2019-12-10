package aplicacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import instituicao.Campus;

public class FormCampus extends JFrame {

	private JButton btnCriarCampus;
	private JButton btnListarCampus;
	
	public FormCampus() {
		
		setBounds(800, 200, 480, 300);
		setLayout(null);
		setTitle("Campos");
		
        btnCriarCampus = new JButton("Criar Campus");
        btnCriarCampus.setBounds(22, 90, 200, 35);
        btnCriarCampus.addActionListener(new ActionListenerbtnCriarCampus());
        add(btnCriarCampus);

        btnListarCampus = new JButton("Listar Campus");
        btnListarCampus.setBounds(258, 90, 200, 35);
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
