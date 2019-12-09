package aplicacao;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import instituicao.Disciplina;
import instituicao.Turma;
import excessoes.*;

public class FormTurma extends JFrame {
	
	private JPanel contentPane;

	public FormTurma() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 200, 480, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Turmas");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarTurmas = new JButton("Cadastrar Turmas");
		btnCadastrarTurmas.setBounds(22, 81, 200, 30);
		contentPane.add(btnCadastrarTurmas);
		
		JButton btnListarTurmas = new JButton("Listar Turmas");
		btnListarTurmas.setBounds(258, 81, 200, 30);
		contentPane.add(btnListarTurmas);
		
		JButton btnAlteraTurmas = new JButton("Altera Turmas");
		btnAlteraTurmas.setBounds(22, 165, 200, 30);
		contentPane.add(btnAlteraTurmas);
		
		JButton btnListaAlunosDaTurma = new JButton("Lista Alunos Da Turma");
		btnListaAlunosDaTurma.setBounds(258, 165, 200, 30);
		contentPane.add(btnListaAlunosDaTurma);
		
		btnCadastrarTurmas.addActionListener(new ActionListenerbtnCadastrarTurmas());
		btnListarTurmas.addActionListener(new ActionListenerbtnListarTurmas());
		btnAlteraTurmas.addActionListener(new ActionListenerbtnAlteraTurmas());
		btnListaAlunosDaTurma.addActionListener(new ActionListenerbtnListaAlunosDaTurma());
		
		setVisible(true);
	}
	
	class ActionListenerbtnCadastrarTurmas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			DisciplinaNaoCriadaException.DisciplinaNCriadaException();
		}
	}
	
	class ActionListenerbtnListarTurmas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Turma.listarTurmas();
		}
	}
	
	class ActionListenerbtnAlteraTurmas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Turma.alterarTurmas();
		}
	}
	
	class ActionListenerbtnListaAlunosDaTurma implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Turma.listarAlunosDaTurma();
		}
	}
}
