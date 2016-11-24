package Teste;

import Implementacao.PilhaArranjo;

/*
 * TRABALHO 02 - Implementar quatro operações de uma LISTA Arranjo
 */
public class TestePilhaArranjo {

	public static void main(String[] args) {
		PilhaArranjo pilha = new PilhaArranjo();
		
		Integer a = new Integer(11);
		Integer b = new Integer(12);
		Integer c = new Integer(13);
		Integer d = new Integer(14);
		
		pilha.inseri(a);
		pilha.inseri(b);
		pilha.inseri(c);
		pilha.inseri(d);		
		
		System.out.println("Tamanho: " + pilha.tamanho());
		System.out.println("Último: " + pilha.ultimo());
		pilha.imprime();
		
		System.out.println("------------------------------------------------");
		System.out.println("O topo (" + pilha.removeUltimo() +") foi removido!");
		System.out.println("O topo (" + pilha.removeUltimo() +") foi removido!");
		System.out.println("O topo (" + pilha.removeUltimo() +") foi removido!");
		System.out.println("O topo (" + pilha.removeUltimo() +") foi removido!");
		System.out.println("O topo (" + pilha.removeUltimo() +") foi removido!");
		System.out.println("------------------------------------------------");
		
		System.out.println("Tamanho: " + pilha.tamanho());
		System.out.println("Último: " + pilha.ultimo());
		pilha.imprime();
		
		
	}

}
