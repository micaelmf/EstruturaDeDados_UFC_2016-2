/*
 * TRABALHO 03 - Implementar quatro operações de uma lista encadeada com cabeça
 */

package _03_1_ListaEncadeada;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinhaListaEncadeada lista = new MinhaListaEncadeada();
		//lista.criaLista();
		lista.insere(1);
		lista.insere(2);
		lista.insere(3);
		lista.insere(4);
		lista.insere(5);
		lista.insere(6);
		/*

		 */
		System.out.println("Tamanho: " + lista.tamanho());
		System.out.println("Primeiro: " + lista.primeiro());
		System.out.println("Ultimo: " + lista.ultimo());
		lista.imprime();
		
		/*
		System.out.println("Item | " + lista.remove(5) + " | Removido");
		System.out.println("Item | " + lista.remove(4) + " | Removido");
		System.out.println("Item | " + lista.remove(3) + " | Removido");
		System.out.println("Item | " + lista.remove(2) + " | Removido");
		System.out.println("Item | " + lista.remove(1) + " | Removido");
		System.out.println("Item | " + lista.remove(0) + " | Removido");
		 */
		System.out.println("Tamanho: " + lista.tamanho());
		System.out.println("Primeiro: " + lista.primeiro());
		System.out.println("Ultimo: " + lista.ultimo());
		lista.imprime();
		
		System.out.println("Pesquisa: " + lista.pesquisa(1));
		System.out.println("A lista está vazia? " + lista.vazia());
	}

}
