package aplicacao;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import aplicacao.FormCampus.ActionListenerbtnCriarCampus;
import instituicao.Predio;
import instituicao.Campus;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormPredio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPredio frame = new FormPredio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormPredio() {
		setBounds(100, 100, 600, 400);
		setTitle("Predio");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarPredios = new JButton("Cadastrar Predios");
		btnCadastrarPredios.setBounds(48, 111, 200, 35);
		btnCadastrarPredios.addActionListener(new ActionListenerbtnCadastrarPredios());
		contentPane.add(btnCadastrarPredios);
		
		JButton btnListarPredios = new JButton("Listar Predios");
		btnListarPredios.setBounds(238, 111, 200, 35);
		btnListarPredios.addActionListener(new ActionListenerbtnListarPredios());
		contentPane.add(btnListarPredios);
		setVisible(true);
	}
	class ActionListenerbtnCadastrarPredios implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Campus.criarPredio();
			
		}
	}
	
	class ActionListenerbtnListarPredios implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Predio.listarPredios();
		}
	}
}

