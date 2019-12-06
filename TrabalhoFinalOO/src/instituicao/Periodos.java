package instituicao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Periodos {
	public int numeroDePeriodos;
	public String diaDaSemana;
	String horaInicio;
	String minutosInicio;
	String horaTermino;
	String minutosTermino;
	List<Periodos> listaSegunda = new ArrayList<Periodos>();
	List<Periodos> listaTerca = new ArrayList<Periodos>();
	List<Periodos> listaQuarta = new ArrayList<Periodos>();
	List<Periodos> listaQuinta = new ArrayList<Periodos>();
	List<Periodos> listaSexta = new ArrayList<Periodos>();
	List<Periodos> listaSabado = new ArrayList<Periodos>();
	Object[] dias = {"Segunda", "Terca","Quarta","Quinta","Sexta","Sabado"};
	String [] horas = {"00","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"};
    String [] minutos;
	public void cadastrarPeriodos() {
		preencheArray();
		Periodos preenchePeriodo = new Periodos();
			preenchePeriodo.diaDaSemana = String.valueOf(JOptionPane.showInputDialog(null, "Qual o dia da semana?", "Escolha",
							JOptionPane.QUESTION_MESSAGE, null, dias, dias[0]));
			preenchePeriodo.horaInicio = String.valueOf(JOptionPane.showInputDialog(null, "Digite a hora de inicio", "Escolha",
					JOptionPane.QUESTION_MESSAGE, null, horas, horas[0]));
			preenchePeriodo.minutosInicio = String.valueOf(JOptionPane.showInputDialog(null, "Digite os minutos de inicio", "Escolha",
					JOptionPane.QUESTION_MESSAGE, null, minutos, minutos[0]));
			preenchePeriodo.horaTermino = String.valueOf(JOptionPane.showInputDialog(null, "Digite a hora de termino", "Escolha",
					JOptionPane.QUESTION_MESSAGE, null, horas, horas[0]));
			preenchePeriodo.minutosTermino = String.valueOf(JOptionPane.showInputDialog(null, "Digite os minutos de termino", "Escolha",
					JOptionPane.QUESTION_MESSAGE, null, minutos, minutos[0]));
			//System.out.println("size1: " + listaSegunda.size());
			switch(preenchePeriodo.diaDaSemana) {
				case "Segunda":
					listaSegunda.add(preenchePeriodo);
					//System.out.println("size2: " + listaSegunda.size());
				break;
				case "Terca":
					listaTerca.add(preenchePeriodo);
				break;
				case "Quarta":
					listaQuarta.add(preenchePeriodo);
				break;
				case "Quinta":
					listaQuinta.add(preenchePeriodo);
				break;
				case "Sexta":
					listaSexta.add(preenchePeriodo);
				break;
				case "Sabado":
					listaSabado.add(preenchePeriodo);
				break;
				default:
				break;
			}
	}
	public void listarPeriodos() {
		for(int aux=0; aux<dias.length; aux++) {
			switch(aux) {
				case 0:
					for(Periodos segunda : listaSegunda) {
						if(segunda.horaInicio != null && segunda.horaTermino != null && segunda.minutosInicio != null && segunda.minutosTermino != null ) {
							System.out.println(dias[aux]+"\n");
							System.out.println(segunda.horaInicio.toString() + ":" +segunda.minutosInicio.toString() + " ate " +
									segunda.horaTermino.toString() + ":" + segunda.minutosTermino.toString());
							System.out.println("\n");
						}
					}
				break;
				case 1:
					for(Periodos terca : listaTerca) {
						if(terca.horaInicio != null && terca.horaTermino != null && terca.minutosInicio != null && terca.minutosTermino != null ) {
							System.out.println(dias[aux]+"\n");
							System.out.println(terca.horaInicio.toString() + ":" +terca.minutosInicio.toString() + " ate " +
									terca.horaTermino.toString() + ":" + terca.minutosTermino.toString());
							System.out.println("\n");
						}
					}
				break;
				case 2:
					for(Periodos quarta : listaQuarta) {
						if(quarta.horaInicio != null && quarta.horaTermino != null && quarta.minutosInicio != null && quarta.minutosTermino != null ) {
							System.out.println(dias[aux]+"\n");
							System.out.println(quarta.horaInicio.toString() + ":" +quarta.minutosInicio.toString() + " ate " +
									quarta.horaTermino.toString() + ":" + quarta.minutosTermino.toString());
							System.out.println("\n");
						}
					}
				break;
				case 3:
					for(Periodos quinta : listaQuinta) {
						if(quinta.horaInicio != null && quinta.horaTermino != null && quinta.minutosInicio != null && quinta.minutosTermino != null ) {
							System.out.println(dias[aux]+"\n");
							System.out.println(quinta.horaInicio.toString() + ":" +quinta.minutosInicio.toString() + " ate " +
									quinta.horaTermino.toString() + ":" + quinta.minutosTermino.toString());
							System.out.println("\n");
						}
					}
				break;
				case 4:
					for(Periodos sexta : listaSexta) {
						if(sexta.horaInicio != null && sexta.horaTermino != null && sexta.minutosInicio != null && sexta.minutosTermino != null ) {
							System.out.println(dias[aux]+"\n");
							System.out.println(sexta.horaInicio.toString() + ":" +sexta.minutosInicio.toString() + " ate " +
									sexta.horaTermino.toString() + ":" + sexta.minutosTermino.toString());
							System.out.println("\n");
						}
					}
				break;
				case 5:
					for(Periodos sabado : listaSabado) {
						if(sabado.horaInicio != null && sabado.horaTermino != null && sabado.minutosInicio != null && sabado.minutosTermino != null ) {
							System.out.println(dias[aux]+"\n");
							System.out.println(sabado.horaInicio.toString() + ":" +sabado.minutosInicio.toString() + " ate " +
									sabado.horaTermino.toString() + ":" + sabado.minutosTermino.toString());
							System.out.println("\n");
						}
					}
				break;
			    default:
			    break;
			
			}
		}
	}
	public void preencheArray() {
		minutos = new String[60];
		for(int i=0; i<60; i++) {
			if(i<10) {
				minutos[i] = "0" + String.valueOf(i);
			}
			else
				minutos[i] = String.valueOf(i);
		}
	}
}
