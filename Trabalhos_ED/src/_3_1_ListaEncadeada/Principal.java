package _3_1_ListaEncadeada;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinhaListaEncadeada<Integer> lista = new MinhaListaEncadeada<Integer>();
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
		
		System.out.println("Pesquisa: " + lista.pesquisa(10));
		System.out.println("A lista est� vazia? " + lista.vazia());
	}

}
