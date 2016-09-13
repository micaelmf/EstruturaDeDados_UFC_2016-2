package _3_1_ListaEncadeadaMicael;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinhaListaEncadeada lista = new MinhaListaEncadeada();
		lista.criaLista();
		lista.insere(1);
		lista.insere(10);
		lista.insere(3);

		
		lista.remove(1);
		
		System.out.println(lista.get(0));
		
		System.out.println("Tamanho: " + lista.tamanho());
	}

}
