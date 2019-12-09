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


	public static List<Periodos> listaSegunda = new ArrayList<Periodos>();
	public static List<Periodos> listaTerca = new ArrayList<Periodos>();
	public static List<Periodos> listaQuarta = new ArrayList<Periodos>();
	public static List<Periodos> listaQuinta = new ArrayList<Periodos>();
	public static List<Periodos> listaSexta = new ArrayList<Periodos>();
	public static List<Periodos> listaSabado = new ArrayList<Periodos>();
	
	public static Object[] dias = {"Segunda", "Terca","Quarta","Quinta","Sexta","Sabado"};
	public static String [] horas = {"00","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"};
	public static String [] minutos;
    static int opcao;
	static int valido;
	
	@Override
	public String toString() {
		return horaInicio;
	}
	
    
	public static void cadastrarPeriodos() {
		do {
			Periodos preenchePeriodo = new Periodos();
			do {
		
				preencheArray();
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
				valido = verificaHorario(preenchePeriodo.horaInicio, preenchePeriodo.minutosInicio, preenchePeriodo.horaTermino,preenchePeriodo.minutosTermino,preenchePeriodo.diaDaSemana);
			}while(valido == 0);
			switch(preenchePeriodo.diaDaSemana) {
				case "Segunda":
					listaSegunda.add(preenchePeriodo);
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
			opcao = JOptionPane.showConfirmDialog(null, "Quer continuar cadastrando periodos ?", "Escolha um",
				JOptionPane.YES_NO_OPTION);
		}while(opcao==0);
	}
	
	public static void listarPeriodos() {
		
		for(int aux=0; aux<dias.length; aux++) {
			switch(aux) {
				case 0:
					if(listaSegunda.size()>0) {
						System.out.println(dias[aux]+"\n");
					}
					for(Periodos segunda : listaSegunda) {
						if(segunda.horaInicio != null && segunda.horaTermino != null && segunda.minutosInicio != null && segunda.minutosTermino != null ) {
							
							System.out.println(segunda.horaInicio.toString() + ":" +segunda.minutosInicio.toString() + " ate " +
									segunda.horaTermino.toString() + ":" + segunda.minutosTermino.toString());
							System.out.println("\n");
						}
					}
				break;
				case 1:
					if(listaTerca.size()>0) {
						System.out.println(dias[aux]+"\n");
					}
					for(Periodos terca : listaTerca) {
						if(terca.horaInicio != null && terca.horaTermino != null && terca.minutosInicio != null && terca.minutosTermino != null ) {
							System.out.println(terca.horaInicio.toString() + ":" +terca.minutosInicio.toString() + " ate " +
									terca.horaTermino.toString() + ":" + terca.minutosTermino.toString());
							System.out.println("\n");
						}
					}
				break;
				case 2:
					if(listaQuarta.size()>0) {
						System.out.println(dias[aux]+"\n");
					}
					for(Periodos quarta : listaQuarta) {
						if(quarta.horaInicio != null && quarta.horaTermino != null && quarta.minutosInicio != null && quarta.minutosTermino != null ) {
							
							System.out.println(quarta.horaInicio.toString() + ":" +quarta.minutosInicio.toString() + " ate " +
									quarta.horaTermino.toString() + ":" + quarta.minutosTermino.toString());
							System.out.println("\n");
						}
					}
				break;
				case 3:
					if(listaQuinta.size()>0) {
						System.out.println(dias[aux]+"\n");
					}
					for(Periodos quinta : listaQuinta) {
						if(quinta.horaInicio != null && quinta.horaTermino != null && quinta.minutosInicio != null && quinta.minutosTermino != null ) {
							
							System.out.println(quinta.horaInicio.toString() + ":" +quinta.minutosInicio.toString() + " ate " +
									quinta.horaTermino.toString() + ":" + quinta.minutosTermino.toString());
							System.out.println("\n");
						}
					}
				break;
				case 4:
					if(listaSexta.size()>0) {
						System.out.println(dias[aux]+"\n");
					}
					for(Periodos sexta : listaSexta) {
						if(sexta.horaInicio != null && sexta.horaTermino != null && sexta.minutosInicio != null && sexta.minutosTermino != null ) {
							
							System.out.println(sexta.horaInicio.toString() + ":" +sexta.minutosInicio.toString() + " ate " +
									sexta.horaTermino.toString() + ":" + sexta.minutosTermino.toString());
							System.out.println("\n");
						}
					}
				break;
				case 5:
					if(listaSabado.size()>0) {
						System.out.println(dias[aux]+"\n");
					}
					for(Periodos sabado : listaSabado) {
						if(sabado.horaInicio != null && sabado.horaTermino != null && sabado.minutosInicio != null && sabado.minutosTermino != null ) {
							
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
	
	
	
	//Objetivo: verificar se esse periodo cadastrado ja existe
	public static int verificaHorario(String horaInicio, String minutosInicio,String horaTermino, String minutosTermino,String diaDaSemana) {
		int	horaInicioMod = Integer.parseInt(horaInicio) * 60 + Integer.parseInt(minutosInicio);
		int	horaTerminoMod = Integer.parseInt(horaTermino)* 60 + Integer.parseInt(minutosTermino);
		switch(diaDaSemana) {
			case "Segunda":
				for(Periodos segunda : listaSegunda) {
					int horaInicioLista = Integer.parseInt(segunda.horaInicio) * 60 + Integer.parseInt(segunda.minutosInicio);
					int horaTerminoLista = Integer.parseInt(segunda.horaTermino) * 60 + Integer.parseInt(segunda.minutosTermino);
					if(horaInicioLista >= horaInicioMod && horaInicioLista <= horaTerminoMod){
						JOptionPane.showMessageDialog(null, "Horario invalido, cadastre outro diferente");
						return 0;
					}
					else if(horaTerminoLista >= horaInicioMod && horaTerminoLista <= horaTerminoMod) {
						JOptionPane.showMessageDialog(null, "Horario invalido, cadastre outro diferente");
						return 0;
					}
				}
			break;
			case "Terca":
				for(Periodos terca : listaTerca) {
					int horaInicioLista = Integer.parseInt(terca.horaInicio) * 60 + Integer.parseInt(terca.minutosInicio);
					int horaTerminoLista = Integer.parseInt(terca.horaTermino) * 60 + Integer.parseInt(terca.minutosTermino);
					if(horaInicioLista >= horaInicioMod && horaInicioLista <= horaTerminoMod){
						JOptionPane.showMessageDialog(null, "Horario invalido, cadastre outro diferente");
						return 0;
					}
					else if(horaTerminoLista >= horaInicioMod && horaTerminoLista <= horaTerminoMod) {
						JOptionPane.showMessageDialog(null, "Horario invalido, cadastre outro diferente");
						return 0;
					}
				}
			break;
			case "Quarta":
				for(Periodos quarta : listaQuarta) {
					int horaInicioLista = Integer.parseInt(quarta.horaInicio) * 60 + Integer.parseInt(quarta.minutosInicio);
					int horaTerminoLista = Integer.parseInt(quarta.horaTermino) * 60 + Integer.parseInt(quarta.minutosTermino);
					if(horaInicioLista >= horaInicioMod && horaInicioLista <= horaTerminoMod){
						JOptionPane.showMessageDialog(null, "Horario invalido, cadastre outro diferente");
						return 0;
					}
					else if(horaTerminoLista >= horaInicioMod && horaTerminoLista <= horaTerminoMod) {
						JOptionPane.showMessageDialog(null, "Horario invalido, cadastre outro diferente");
						return 0;
					}
				}
			break;
			case "Quinta":
				for(Periodos quinta : listaQuinta) {
					int horaInicioLista = Integer.parseInt(quinta.horaInicio) * 60 + Integer.parseInt(quinta.minutosInicio);
					int horaTerminoLista = Integer.parseInt(quinta.horaTermino) * 60 + Integer.parseInt(quinta.minutosTermino);
					if(horaInicioLista >= horaInicioMod && horaInicioLista <= horaTerminoMod){
						JOptionPane.showMessageDialog(null, "Horario invalido, cadastre outro diferente");
						return 0;
					}
					else if(horaTerminoLista >= horaInicioMod && horaTerminoLista <= horaTerminoMod) {
						JOptionPane.showMessageDialog(null, "Horario invalido, cadastre outro diferente");
						return 0;
					}
				}
			break;
			case "Sexta":
				for(Periodos sexta : listaSexta) {
					int horaInicioLista = Integer.parseInt(sexta.horaInicio) * 60 + Integer.parseInt(sexta.minutosInicio);
					int horaTerminoLista = Integer.parseInt(sexta.horaTermino) * 60 + Integer.parseInt(sexta.minutosTermino);
					if(horaInicioLista >= horaInicioMod && horaInicioLista <= horaTerminoMod){
						JOptionPane.showMessageDialog(null, "Horario invalido, cadastre outro diferente");
						return 0;
					}
					else if(horaTerminoLista >= horaInicioMod && horaTerminoLista <= horaTerminoMod) {
						JOptionPane.showMessageDialog(null, "Horario invalido, cadastre outro diferente");
						return 0;
					}
				}
			break;
			case "Sabado":
				for(Periodos sabado : listaSabado) {
					int horaInicioLista = Integer.parseInt(sabado.horaInicio) * 60 + Integer.parseInt(sabado.minutosInicio);
					int horaTerminoLista = Integer.parseInt(sabado.horaTermino) * 60 + Integer.parseInt(sabado.minutosTermino);
					if(horaInicioLista >= horaInicioMod && horaInicioLista <= horaTerminoMod){
						JOptionPane.showMessageDialog(null, "Horario invalido, cadastre outro diferente");
						return 0;
					}
					else if(horaTerminoLista >= horaInicioMod && horaTerminoLista <= horaTerminoMod) {
						JOptionPane.showMessageDialog(null, "Horario invalido, cadastre outro diferente");
						return 0;
					}
				}
			break;
			default:
				
			break;
		
		
		}
		return 1;
	}
	
	
	public static void preencheArray() {
		
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
