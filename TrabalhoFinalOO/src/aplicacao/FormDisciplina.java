package aplicacao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import instituicao.Disciplina;

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
		
		setBounds(800, 200, 480, 300);
		setTitle("Disciplinas");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCriarDisciplina = new JButton("Criar Disciplina");
		btnCriarDisciplina.setBounds(22, 70, 200, 35);
		btnCriarDisciplina.addActionListener(new ActionListenerbtnCriarDisciplina());
		contentPane.add(btnCriarDisciplina);
		
		JButton btnListarDisciplinas = new JButton("Listar Disciplinas");
		btnListarDisciplinas.setBounds(130, 140, 220, 35);
		btnListarDisciplinas.addActionListener(new ActionListenerbtnListarDisciplinas());
		contentPane.add(btnListarDisciplinas);
		
		JButton btnAlterarDisciplina = new JButton("Alterar Disciplina");
		btnAlterarDisciplina.setBounds(258, 70, 200, 35);
		btnAlterarDisciplina.addActionListener(new ActionListenerbtnAlterarDisciplina());
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
