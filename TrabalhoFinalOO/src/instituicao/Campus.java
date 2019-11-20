package instituicao;

import javax.swing.JOptionPane;

public class Campus {
	
	public String nomeDoCampus;
    public String numeroDeEstruturas;
    public static int numeroDeCampus;

    void criarCampus() {
        this.nomeDoCampus = JOptionPane.showInputDialog("Digite o nome do Campus: ");

        this.numeroDeEstruturas = JOptionPane.showInputDialog("Digite o número de estruturas: ");

        int num = 10;
        Estrutura estrutura[] = new Estrutura[num];
        
        for (Estrutura est : estrutura) {
            est = new Estrutura();
            est.criarEstrutura();
        }
    }
}
