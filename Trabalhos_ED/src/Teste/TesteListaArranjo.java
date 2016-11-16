/*
 * TRABALHO 02 - Implementar quatro operações de uma LISTA Arranjo
 */

package Teste;

import Implementacao.ListaArranjo;

public class TesteListaArranjo {

	public static void main(String[] args) throws Exception {
		
		ListaArranjo lista = new ListaArranjo(1);
		
		Integer a = new Integer(1);
		Integer b = new Integer(2);
		Integer c = new Integer(3);
		Integer d = new Integer(4);
		
		lista.insere(a);
		lista.insere(b);
		lista.insere(c);
		lista.insere(d);
		lista.insere(a);
		lista.insere(b);
		lista.insere(c);
		/*
		lista.insere(d);
		*/
		System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println("Último: " + lista.getUltimo());
		lista.imprimeLista();
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Removido: " + lista.removeUltimo());
		System.out.println("Removido: " + lista.removeUltimo());
		System.out.println("-----------------------------------------------------");

		/*
		lista.removePosicao(a);
		lista.imprimeLista();
		lista.removePosicao(b);
		lista.imprimeLista();
		lista.removePosicao(c);
		lista.imprimeLista();
		lista.removePosicao(d);
		lista.imprimeLista();
		lista.removePosicao(a);
		lista.imprimeLista();
		lista.removePosicao(b);
		lista.imprimeLista();
		lista.remove(c);
		lista.imprimeLista();
		lista.remove(d);
		lista.imprimeLista();
		*/
		
		
		System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println("Último: " + lista.getUltimo());
		lista.imprimeLista();

		System.out.println("Pesquisa");
		System.out.println(lista.pesquisa(b));
	}

}
