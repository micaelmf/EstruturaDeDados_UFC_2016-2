package ArvoreBST;

import Arvore.No;

public class ArvoreBST {
	public NoBST raiz;
	
	public ArvoreBST(int chave, int valor){
		raiz = new NoBST(chave, valor);
	}

	private NoBST NoBST(int chave, int valor){
		NoBST x = new NoBST(chave,valor);
		return x;
	}
	
	private NoBST insere(NoBST x, int chave, int valor){
		if(x == null){
			return NoBST(chave,valor);
		}else if(chave < x.chave){
			insere(x.esq, chave, valor);
		}else if(chave > x.chave){
			insere(x.dir, chave, valor);
		}
		return x;
	}
	
	public void insere(int chave, int valor){
		insere(this.raiz,chave,valor);
	}

	private NoBST removeMin(NoBST x){
		if(x.esq == null){
			return x.dir;
		}
		x.esq = removeMin(x.esq);
		return x;
	}
	
	private NoBST delete(NoBST x, int chave){
		if(x == null){
			return null;
		}
		if(chave < x.chave){
			x.esq = delete(x.esq, chave);
		}
		if(chave > x.chave){
			x.dir = delete(x.dir,chave);
		}else{
			NoBST t = x;
			x = removeMin(t.dir);
			x.esq = t.esq;
		}
		return x;
	}
	
	public int buscaBST(int chave){
		NoBST x = this.raiz;
		while(x != null){
			if(x.chave == chave){
				return x.valor;
			}else if(chave < x.chave){
				x = x.esq;
			}else if(chave > x.chave){
				x = x.dir;
			}
		}
		return -1;
	}
	
	public NoBST getRaiz() {
		return raiz;
	}

	public void setRaiz(NoBST raiz) {
		this.raiz = raiz;
	}
	

}
