package ArvoreBST;

public class Principal {

	public static void main(String[] args) {
		
		ArvoreBST a = new ArvoreBST(10, 50);
		
		System.out.println("---| Inserindo |---");
		a.insere(5, 49);
		a.insere(15, 59);
		a.insere(7, 1);
		a.insere(4, 70);
		a.insere(14, 40);
		a.insere(18, 33);
		a.insere(19, 13);
		System.out.println("---|    Fim    |---\n");
		
		int chave = 15;
		int removido = 0;
		
		System.out.println("---|  Buscando |---");
		removido = a.buscaBST(chave);
		if(removido == -1){
			System.out.println("Chave " + chave + " não encontrada");
		}else{
			System.out.println("Chave " + chave + " encontrada");
		}
		System.out.println("---|    Fim    |---\n");
		
		System.out.println("---| Removendo |---");
		System.out.println("Chave " + chave);
		a.remove(chave);
		System.out.println("---|    Fim    |---\n");
		
		System.out.println("---|  Buscando |---");
		removido = a.buscaBST(chave);
		if(removido == -1){
			System.out.println("Chave " + chave + " não encontrada");
		}else{
			System.out.println("Chave " + chave + " encontrada");
		}
		System.out.println("---|    Fim    |---\n");
		


	}

}
