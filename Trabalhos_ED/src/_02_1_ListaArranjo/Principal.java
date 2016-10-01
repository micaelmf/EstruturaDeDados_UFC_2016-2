/*
 * TRABALHO 02 - Implementar quatro operações de uma LISTA Arranjo
 */

package _02_1_ListaArranjo;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		MinhaListaArranjo lista = new MinhaListaArranjo(1);
		
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
		
		System.out.println("------------");
		System.out.println("Removido: " + lista.removePrimeiro());
		System.out.println("Removido: " + lista.removePrimeiro());
		System.out.println("------------");

		
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
