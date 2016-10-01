package _04_4_PilhaEncadeada;

public class Principal {

	public static void main(String[] args) {
		MinhaPilhaEncadeada pilha = new MinhaPilhaEncadeada();
		
		Integer a = new Integer(1);
		Integer b = new Integer(2);
		Integer c = new Integer(3);
		Integer d = new Integer(4);
		
		pilha.inseri(a);
		pilha.inseri(b);
		pilha.inseri(c);
		pilha.inseri(d);
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
