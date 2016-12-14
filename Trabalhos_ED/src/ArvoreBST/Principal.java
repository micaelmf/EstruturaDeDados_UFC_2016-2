package ArvoreBST;

public class Principal {

	public static void main(String[] args) {
		
		ArvoreBST a = new ArvoreBST(11, 20);
		
		System.out.println("---| Inserindo |---");
		a.insere(12, 50);
		a.insere(10, 49);
		a.insere(13, 59);
		a.insere(49, 1);
		a.insere(32, 90);
		System.out.println("---|    Fim    |---");
		
		System.out.println("---|  Buscando |---");
		System.out.println(a.buscaBST(12));
		System.out.println("---|    Fim    |---");


	}

}
