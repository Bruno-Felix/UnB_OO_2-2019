package instituicao;

import javax.swing.JOptionPane;

public class Predio extends Estrutura {
    public int numeroDeSalas;

    @Override
    void criarEstrutura() {
        this.nomeDaEstrutura = JOptionPane.showInputDialog("Digite o nome do Prédio: ");

        this.numeroDeSalas = JOptionPane.showInputDialog("Digite o número de Salas: ");
    }
}
