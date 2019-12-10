package aplicacao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comunidade.Professor;
import instituicao.Campus;

import javax.swing.JButton;

public class FormProfessor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormProfessor frame = new FormProfessor();
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
	public FormProfessor() {
		
		setBounds(800, 200, 480, 300);
		setTitle("Professor");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarProfessor = new JButton("Cadastrar Professor");
		btnCadastrarProfessor.setBounds(22, 70, 200, 35);
		btnCadastrarProfessor.addActionListener(new ActionListenerbtnCadastrarProfessor());
		contentPane.add(btnCadastrarProfessor);
		
		JButton btnListarProfessor = new JButton("Listar Professor");
		btnListarProfessor.setBounds(258, 70, 200, 35);
		btnListarProfessor.addActionListener(new ActionListenerbtnListarProfessor());
		contentPane.add(btnListarProfessor);
		
		JButton btnListarTurmasDo = new JButton("Listar Turmas do Professor");
		btnListarTurmasDo.setBounds(130, 140, 220, 35);
		btnListarTurmasDo.addActionListener(new ActionListenerbtnListarTurmasDo());
		contentPane.add(btnListarTurmasDo);
		
		setVisible(true);
	}
	
	class ActionListenerbtnCadastrarProfessor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Campus.criarProfessor();
		}
	}
	
	class ActionListenerbtnListarProfessor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Professor.listarProfessoresCampus();
		}
	}
	
	class ActionListenerbtnListarTurmasDo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			//editar metodo para static
			//Professor.listarTurmas();
		}
	}

}
