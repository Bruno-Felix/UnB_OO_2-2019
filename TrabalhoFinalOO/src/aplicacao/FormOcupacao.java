package aplicacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import aplicacao.FormCampus.ActionListenerbtnCriarCampus;
import aplicacao.FormCampus.ActionListenerbtnListarCampus;
import instituicao.Campus;
import instituicao.Ocupacao;

public class FormOcupacao extends JFrame {
	
	private JButton btnCriarOcupacao;
	private JButton btnListarOcupacao;
	
public FormOcupacao() {
		
		setBounds(800, 200, 480, 300);
		setLayout(null);
		setTitle("Ocupacao");
		
		btnCriarOcupacao = new JButton("Criar Ocupacao");
		btnCriarOcupacao.setBounds(52, 81, 150, 30);
		btnCriarOcupacao.addActionListener(new ActionListenerbtnCriarOcupacoes());
        add(btnCriarOcupacao);

        btnListarOcupacao = new JButton("Listar Ocupações");
        btnListarOcupacao.setBounds(278, 81, 150, 30);
        btnListarOcupacao.addActionListener(new ActionListenerbtnListarOcupacoes());
        add(btnListarOcupacao);
		
		setVisible(true);
	}

	class ActionListenerbtnCriarOcupacoes implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Ocupacao.criarECadastrarOcupacao();
		}
	}
	
	class ActionListenerbtnListarOcupacoes implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Ocupacao.listaDeOcupacoes();
		}
	}
}
