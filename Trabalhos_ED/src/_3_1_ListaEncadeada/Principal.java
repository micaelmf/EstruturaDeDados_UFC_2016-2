package _3_1_ListaEncadeada;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinhaListaEncadeada lista = new MinhaListaEncadeada();
		lista.criaLista();
		lista.insere(1);
		lista.insere(10);
		lista.insere(3);

		System.out.println(lista.get(1));
		
		System.out.println(lista.size());
	}

}