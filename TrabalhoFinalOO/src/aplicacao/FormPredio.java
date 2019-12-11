package aplicacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import excessoes.CampusNaoCriadoException;
import instituicao.Campus;
import instituicao.Estrutura;
import instituicao.Predio;
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
		
		setBounds(800, 200, 480, 300);
		setTitle("Predio");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarPredios = new JButton("Cadastrar Predios");
		btnCadastrarPredios.setBounds(22, 70, 200, 35);
		btnCadastrarPredios.addActionListener(new ActionListenerbtnCadastrarPredios());
		contentPane.add(btnCadastrarPredios);
		
		JButton btnListarPredios = new JButton("Listar Predios");
		btnListarPredios.setBounds(258, 70, 200, 35);
		btnListarPredios.addActionListener(new ActionListenerbtnListarPredios());
		contentPane.add(btnListarPredios);
		
		JButton btnCadastrarEstruturas = new JButton("Cadastrar Estruturas");
		btnCadastrarEstruturas.setBounds(22, 140, 200, 35);
		btnCadastrarEstruturas.addActionListener(new ActionListenerbtnCadastrarEstruturas());
		contentPane.add(btnCadastrarEstruturas);
		
		JButton btnListarEstruturas = new JButton("Listar Estruturas");
		btnListarEstruturas.setBounds(258, 140, 200, 35);
		btnListarEstruturas.addActionListener(new ActionListenerbtnListarEstruturas());
		contentPane.add(btnListarEstruturas);
		
		setVisible(true);
	}
	
	class ActionListenerbtnCadastrarPredios implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			CampusNaoCriadoException.CampusNCriadoException();
			
		}
	}
	
	class ActionListenerbtnListarPredios implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Predio.listarPredios();
		}
	}
	
	class ActionListenerbtnCadastrarEstruturas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Campus.criarEstrutura();
			
		}
	}
	
	class ActionListenerbtnListarEstruturas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Estrutura.listarEstruturas();
		}
	}
}

