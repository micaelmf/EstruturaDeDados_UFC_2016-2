package _04_1_FilaArranjoCircular;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Principal {

	public static void main(String[] args) {
		MinhaFilaArranjoCircular fila = new MinhaFilaArranjoCircular();
		
		Integer a = new Integer(1);
		Integer b = new Integer(2);
		Integer c = new Integer(3);
		Integer d = new Integer(4);
		
		fila.insere(a);
		fila.insere(b);
		fila.insere(c);
		fila.insere(d);
		fila.insere(a);
		fila.insere(b);
		fila.insere(c);
		fila.insere(d);
		/*
		*/
		Object removido = fila.remove();
		System.out.println("Removido: " + removido);
		/*
		*/
		
		fila.imprime();

	}

}
