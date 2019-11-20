package instituicao;

import javax.swing.JOptionPane;

public class Estrutura {
    public String nomeDaEstrutura;

    void criarEstrutura() {
        this.nomeDaEstrutura = JOptionPane.showInputDialog("Digite o nome da Estrutura: ");
    }
}
