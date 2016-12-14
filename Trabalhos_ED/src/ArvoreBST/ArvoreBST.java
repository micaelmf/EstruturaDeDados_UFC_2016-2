package ArvoreBST;

import Arvore.No;

public class ArvoreBST {
	public NoBST raiz;
	
	public ArvoreBST(int chave, int valor){
		raiz = new NoBST(chave, valor);
	}

	private NoBST NoBST(int chave, int valor){
		NoBST xNovo = new NoBST(chave,valor);
		return xNovo;
	}
	
	private NoBST insere(NoBST x, int chave, int valor){
		if(x == null){
			return NoBST(chave,valor);
		}else if(chave < x.chave){
			x.esq = insere(x.esq, chave, valor);
		}else if(chave > x.chave){
			x.dir = insere(x.dir, chave, valor);
		}
		return x;
	}
	
	public void insere(int chave, int valor){
		insere(raiz,chave,valor);
	}

	private NoBST removeMin(NoBST x){
		/*essa condição foi necessário pois se x for igual a null não é possível
		 * acessar o seus atributos direita e esquerda */
		if(x == null){
			return x;
		}
		if(x.esq == null){
			return x.dir;
		}
		x.esq = removeMin(x.esq);
		return x;
	}
	
	public NoBST remove(int chave){
		return remove(raiz, chave);
	}
	
	private NoBST remove(NoBST x, int chave){
		
		if(x == null){
			return null;
		}
		if(chave < x.chave){
			x.esq = remove(x.esq, chave);
		}
		if(chave > x.chave){
			x.dir = remove(x.dir,chave);
		}else{
			NoBST t = x;
			x = min(t.dir);
			
			/*essa condição foi necessário pois se x for igual a null não é possível
			 * acessar o seus atributos direita e esquerda */ 
			if(removeMin(t.dir) != null){
				x.dir = removeMin(t.dir);
				x.esq = t.esq;
			}
			
		}
		return x;
	}
	
	public int buscaBST(int chave){
		NoBST xBusca = this.raiz;
		while(xBusca != null){
			if(xBusca.chave == chave){
				return xBusca.valor;
			}else if(chave < xBusca.chave){
				xBusca = xBusca.esq;
			}else if(chave > xBusca.chave){
				xBusca = xBusca.dir;
			}
		}
		return -1;
	}
	
	private NoBST min(NoBST x){
		/*essa condição foi necessário pois se x for igual a null não é possível
		 * acessar o seus atributos direita e esquerda */
		if(x == null){
			return x;
		}
		if(x.esq == null){
			return x;
		}else{
			return min(x.esq);
		}
	}
	
	public int min(){
		return min(raiz).valor;
	}
	
	public NoBST getRaiz() {
		return raiz;
	}

	public void setRaiz(NoBST raiz) {
		this.raiz = raiz;
	}
	

}
