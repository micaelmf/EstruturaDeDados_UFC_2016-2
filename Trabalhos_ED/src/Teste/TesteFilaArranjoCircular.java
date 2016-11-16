package Teste;

import javax.swing.plaf.synth.SynthSeparatorUI;

import Implementacao.FilaArranjoCircular;

public class TesteFilaArranjoCircular {

	public static void main(String[] args) {
		FilaArranjoCircular circular = new FilaArranjoCircular(2);
		
		Integer a = new Integer(1);
		Integer b = new Integer(2);
		Integer c = new Integer(3);
		Integer d = new Integer(4);
		
		circular.insere(a);
		circular.imprime();
		circular.insere(b);
		circular.imprime();
		circular.insere(c);
		circular.imprime();
		circular.insere(d);
		circular.imprime();
		circular.remove();
		circular.imprime();
		circular.remove();
		circular.imprime();
		circular.insere(a);
		circular.imprime();
		circular.insere(a);
		circular.imprime();
		circular.insere(a);
		circular.imprime();
		circular.remove();
		circular.imprime();
		circular.insere(b);
		circular.imprime();
		circular.insere(c);
		circular.imprime();
		circular.insere(d);
		circular.imprime();
		circular.insere(c);
		circular.imprime();
		circular.insere(d);
		circular.imprime();
		circular.insere(d);
		/*
		*/
		circular.imprime();
		/*
		System.out.println("Removido: " + circular.remove());
		*/
		circular.imprime();

	}

}
