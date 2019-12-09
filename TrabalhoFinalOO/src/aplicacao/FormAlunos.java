package aplicacao;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import aplicacao.FormTurma.ActionListenerbtnCadastrarTurmas;
import comunidade.Aluno;
import instituicao.Campus;
import instituicao.Turma;

import javax.swing.JButton;

public class FormAlunos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormAlunos frame = new FormAlunos();
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
	public FormAlunos() {
		setBounds(100, 100, 450, 300);
		setTitle("Alunos");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarAlunos = new JButton("Cadastrar Alunos");
		btnCadastrarAlunos.setBounds(57, 112, 135, 31);
		btnCadastrarAlunos.addActionListener(new ActionListenerbtnCadastrarAlunos());
		contentPane.add(btnCadastrarAlunos);
		
		JButton btnListarAlunos = new JButton("Listar Alunos");
		btnListarAlunos.setBounds(244, 112, 117, 31);
		btnListarAlunos.addActionListener(new ActionListenerbtnListarAlunos());
		contentPane.add(btnListarAlunos);
		
		JButton btnListarTurmasDo = new JButton("Listar Turmas do aluno");
		btnListarTurmasDo.setBounds(145, 173, 185, 31);
		btnListarTurmasDo.addActionListener(new ActionListenerbtnListarTurmasDo());
		contentPane.add(btnListarTurmasDo);
	}
	class ActionListenerbtnCadastrarAlunos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Campus.criarAluno();
		}
	}
	
	class ActionListenerbtnListarAlunos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Aluno.listarAlunosCampus();
		}
	}
	
	class ActionListenerbtnListarTurmasDo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Aluno.listarTurmasDoAluno();
		}
	}

}
