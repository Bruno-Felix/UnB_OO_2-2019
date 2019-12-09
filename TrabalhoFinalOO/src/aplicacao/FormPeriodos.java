package aplicacao;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import instituicao.Periodos;
import instituicao.Turma;

import javax.swing.JButton;

public class FormPeriodos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPeriodos frame = new FormPeriodos();
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
	public FormPeriodos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Periodos");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarPeriodos = new JButton("Cadastrar Periodos");
		btnCadastrarPeriodos.setBounds(38, 106, 132, 33);
		contentPane.add(btnCadastrarPeriodos);
		
		JButton btnListarPeriodos = new JButton("Listar Periodos");
		btnListarPeriodos.setBounds(274, 106, 103, 33);
		contentPane.add(btnListarPeriodos);
		setVisible(true);
	}
	
	class ActionListenerbtnCadastrarPeriodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Periodos.cadastrarPeriodos();
		}
	}
	
	class ActionListenerbtnListarPeriodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Periodos.listarPeriodos();
		}
	}
}