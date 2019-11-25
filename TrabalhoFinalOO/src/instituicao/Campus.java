package instituicao;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Campus{
	
	@Override
	public String toString() {
		return "  Nome do Campus: " + nomeDoCampus + "\n" 
	         + "  Numero de Estruturas: " + numeroDeEstruturas + "\n";
	}

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
        
        novoCampus.nomeDoCampus = JOptionPane.showInputDialog(null, "Digite o nome do Campus: ", "Nome do Campus");
        novoCampus.numeroDeEstruturas = JOptionPane.showInputDialog(null, "Digite o número de estruturas: ", "Número de estruturas");
        
        Lista.add(novoCampus);
        
        numeroDeCampus++;
		
        return Lista;
    }
    
    public ArrayList<Campus> listarCampus(ArrayList<Campus> Lista) {
    	
    	int aux = 1;
    	
    	System.out.println("Lista de Campus:\n");
    	while(!Lista.isEmpty()){
    		
    		System.out.println("- " + aux + "º campus:");
    		System.out.println(Lista.remove(0));
    		
    		aux++;
        }
    	
    	return Lista;
    }
}