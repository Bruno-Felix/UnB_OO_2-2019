package instituicao;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Campus{
	
	public String nomeDoCampus;
    public String numeroDeEstruturas;
    public static int numeroDeCampus;
    
    
    public String getnomeDoCampus() {
        return nomeDoCampus;
    }

    public void setnomeDoCampus(String numeroDeEstruturas) {
        this.numeroDeEstruturas = numeroDeEstruturas;
    }

    public String getnumeroDeEstruturas() {
        return numeroDeEstruturas;
    }

    public void setnumeroDeEstruturas(String numeroDeEstruturas) {
        this.numeroDeEstruturas = numeroDeEstruturas;
    }
    
    
    public ArrayList<Campus> criarCampus(ArrayList<Campus> Lista) {
                
        Campus novoCampus = new Campus();
        novoCampus.nomeDoCampus = JOptionPane.showInputDialog("Digite o nome do Campus: ");
        novoCampus.numeroDeEstruturas = JOptionPane.showInputDialog("Digite o número de estruturas: ");
        
        Lista.add(novoCampus);
        
        numeroDeCampus++;
		
        return Lista;
    }
    
    public ArrayList<Campus> listarCampus(ArrayList<Campus> Lista) {
    	
    	int i=0;
        while(i<Lista.size()){
        	JOptionPane.showMessageDialog(null, "----------- \nNomeDoCampos: " + Lista.get(i).getnomeDoCampus()
        												    + "\nNumeroDeEstruturas: " + Lista.get(i).getnumeroDeEstruturas()
        												    + "\nNumeroDeCampus: " + Campus.numeroDeCampus);        	
        	i++;
        }
    	
    	return Lista;
    }
}