package ArvoreBinaria;

public class Principal {

	public static void main(String[] args) {
		
		ArvoreBinaria a = new ArvoreBinaria(50);
		
		System.out.println("---| Inserindo |---");
		a.insere(5);
		a.insere(15);
		a.insere(7);
		a.insere(4);
		a.insere(14);
		a.insere(18);
		a.insere(19);
		System.out.println("---|    Fim    |---\n");
		
		int valor = 15;
		int removido = 0;
		
		System.out.println("---|  Buscando |---");
		removido = a.buscaBST(valor);
		if(removido == -1){
			System.out.println("Valor " + valor + " não encontrado");
		}else{
			System.out.println("Valor " + valor + " encontrado");
		}
		System.out.println("---|    Fim    |---\n");
		
		System.out.println("---| Removendo |---");
		System.out.println("Valor " + valor);
		a.remove(valor);
		System.out.println("---|    Fim    |---\n");
		
		System.out.println("---|  Buscando |---");
		removido = a.buscaBST(valor);
		if(removido == -1){
			System.out.println("Valor " + valor + " não encontrado");
		}else{
			System.out.println("Valor " + valor + " encontrado");
		}
		System.out.println("---|    Fim    |---\n");
		


	}

}
