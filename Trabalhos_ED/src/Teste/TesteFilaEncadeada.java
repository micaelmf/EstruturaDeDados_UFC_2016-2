package Teste;

import Implementacao.FilaEncadeada;

public class TesteFilaEncadeada {

	public static void main(String[] args) {
		FilaEncadeada fila = new FilaEncadeada();
		
		Integer a = new Integer(1);
		Integer b = new Integer(2);
		Integer c = new Integer(3);
		Integer d = new Integer(4);
		Integer e = new Integer(5);
		
		fila.insere(a);
		fila.insere(b);
		fila.insere(c);
		fila.insere(d);
		
		/*
		 */
		System.out.println("Tamanho: " + fila.tamanho());
		fila.imprime();
		
		System.out.println("O primeiro (" + fila.removeInicio() + ") saiu da fila!\n");
		
		System.out.println("Tamanho: " + fila.tamanho());
		fila.imprime();
		

	}

}
