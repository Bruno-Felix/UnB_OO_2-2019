package instituicao;

import javax.swing.JOptionPane;

public class Campus {
    public String nomeDoCampus;
    public int numeroDeEstruturas;
    public static int numeroDeCampus;

    void criarCampus() {
        this.nomeDoCampus = JOptionPane.showInputDialog("Digite o nome do Campus: ");

        this.numeroDeEstruturas = JOptionPane.showInputDialog("Digite o número de estruturas: ");

        Estrutura estrutura[] = new Estrutura[num];
        for (Estrutura est : estrutura) {
            est = new Estrutura();
            est.criarEstrutura();
        }
    }
}
