/*
Faça um TAD para representar veículos com a finalidade de realizar transporte de
carga em zonas urbanas. Estes veículos tem capacidade limitada, limite de tempo
de operação, número de visitas que é capaz de realizar em um dia e atributos
como: marca, modelo, ano, etc.
- Desenvolva o TAD conforme os exercícios 01 e 02.
 */

package _01_3;

public class Principal {

	public static void main(String[] args) {
		Entrega e1 = new Entrega();
		e1.setDestino("Empresa 1");
		e1.setPeso((float) 1.3);
		e1.setTempo(1);
		
		Entrega e2 = new Entrega();
		e2.setDestino("Empresa 2");
		e2.setPeso((float) 0.7);
		e2.setTempo(1);
		
		Entrega e3 = new Entrega();
		e3.setDestino("Empresa 3");
		e3.setPeso((float) 2);
		e3.setTempo(1);
		
		Transporte t1 = new Transporte();
		t1.setMarca("Mercedes");
		t1.setModelo("Atego");
		t1.setAno(2016);
		t1.setTempoOperacao(8);
		t1.setNumVisitasDia(10);
		t1.setCapacidade(4);
		
		t1.atribuiEntrega(e1);
		t1.atribuiEntrega(e2);
		t1.atribuiEntrega(e3);
		

	}

}
