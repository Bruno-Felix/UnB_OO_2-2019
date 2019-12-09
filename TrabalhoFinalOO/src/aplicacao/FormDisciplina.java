package aplicacao;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import instituicao.Disciplina;
import instituicao.Turma;

import javax.swing.JButton;
public class FormDisciplina extends JFrame{
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormDisciplina frame = new FormDisciplina();
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
	public FormDisciplina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		setTitle("Disciplinas");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCriarDisciplina = new JButton("Criar Disciplina");
		btnCriarDisciplina.setBounds(30, 111, 150, 23);
		contentPane.add(btnCriarDisciplina);
		
		JButton btnListarDisciplinas = new JButton("Listar Disciplinas");
		btnListarDisciplinas.setBounds(296, 111, 150, 23);
		contentPane.add(btnListarDisciplinas);
		
		JButton btnAlterarDisciplina = new JButton("Alterar Disciplina");
		btnAlterarDisciplina.setBounds(155, 111, 150, 23);
		contentPane.add(btnAlterarDisciplina);
		setVisible(true);
	}
	class ActionListenerbtnCriarDisciplina implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Disciplina.criarDisciplina();
		}
	}
	
	class ActionListenerbtnListarDisciplinas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Disciplina.listarDisciplinas();
		}
	}
	
	class ActionListenerbtnAlterarDisciplina implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Disciplina.alterarDisciplina();
		}
	}
}
