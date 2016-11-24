package Teste;

import Implementacao.PilhaEncadeada;

public class TestePilhaEncadeada {

	public static void main(String[] args) {
		PilhaEncadeada pilha = new PilhaEncadeada();
		
		Integer a = new Integer(1);
		Integer b = new Integer(2);
		Integer c = new Integer(3);
		Integer d = new Integer(4);
		
		pilha.insere(a);
		pilha.insere(b);
		pilha.insere(c);
		pilha.insere(d);
		/*
		 */
		System.out.println("Tamanho: " + pilha.getTamanho());
		pilha.imprime();
		System.out.println("--------------------------------");
		
		System.out.println("O topo (" + pilha.remove() +") foi removido!");
		System.out.println("O topo (" + pilha.remove() +") foi removido!");
		System.out.println("O topo (" + pilha.remove() +") foi removido!");
		/*
		System.out.println("O topo (" + pilha.remove() +") foi removido!");
		System.out.println("O topo (" + pilha.remove() +") foi removido!");
		System.out.println("O topo (" + pilha.remove() +") foi removido!");
		 */
		
		System.out.println("--------------------------------");
		System.out.println("Tamanho: " + pilha.getTamanho());
		pilha.imprime();

	}

}
