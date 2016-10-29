/*
 * TRABALHO 03 - Implementar quatro operações de uma lista encadeada com cabeça
 */

package _03_1_ListaEncadeada;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinhaListaEncadeada lista = new MinhaListaEncadeada();
		//lista.criaLista();
		/*
		lista.insereFinal(1);
		lista.insereFinal(2);
		lista.insereFinal(3);
		lista.insereFinal(4);
		lista.insereFinal(5);
		lista.insereFinal(6);

		 */
		System.out.println("Tamanho: " + lista.tamanho());
		System.out.println("Primeiro: " + lista.primeiro());
		System.out.println("Ultimo: " + lista.ultimo());
		lista.imprime();
		
		System.out.println("Item | " + lista.removePosicao(5) + " | Removido");
		System.out.println("Item | " + lista.removePosicao(4) + " | Removido");
		System.out.println("Item | " + lista.removePosicao(3) + " | Removido");
		System.out.println("Item | " + lista.removePosicao(2) + " | Removido");
		System.out.println("Item | " + lista.removePosicao(1) + " | Removido");
		System.out.println("Item | " + lista.removePosicao(0) + " | Removido");
		/*
		 */
		System.out.println("Tamanho: " + lista.tamanho());
		System.out.println("Primeiro: " + lista.primeiro());
		System.out.println("Ultimo: " + lista.ultimo());
		lista.imprime();
		
		System.out.println("Pesquisa: " + lista.pesquisa(1));
		System.out.println("A lista está vazia? " + lista.vazia());
	}

}
