package ArvoreBinaria;


public class ArvoreBinaria {
	public NoB raiz;
	
	public ArvoreBinaria(int valor){
		raiz = new NoB(valor);
	}

	private NoB no(int valor){
		NoB xNovo = new NoB(valor);
		return xNovo;
	}
	
	private NoB insere(NoB x, int valor){
		if(x == null){
			return no(valor);
		}else if(valor < x.valor){
			x.esq = insere(x.esq, valor);
		}else if(valor > x.valor){
			x.dir = insere(x.dir, valor);
		}
		return x;
	}
	
	public void insere(int valor){
		insere(raiz,valor);
	}

	private NoB removeMin(NoB x){
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
	
	public NoB remove(int valor){
		return remove(raiz, valor);
	}
	
	private NoB remove(NoB x, int valor){
		
		if(x == null){
			return null;
		}
		if(valor < x.valor){
			x.esq = remove(x.esq, valor);
		}
		if(valor > x.valor){
			x.dir = remove(x.dir,valor);
		}else{
			NoB t = x;
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
	
	public int buscaBST(int valor){
		NoB xBusca = this.raiz;
		while(xBusca != null){
			if(xBusca.valor == valor){
				return xBusca.valor;
			}else if(valor < xBusca.valor){
				xBusca = xBusca.esq;
			}else if(valor > xBusca.valor){
				xBusca = xBusca.dir;
			}
		}
		return -1;
	}
	
	private NoB min(NoB x){
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
	
	public NoB getRaiz() {
		return raiz;
	}

	public void setRaiz(NoB raiz) {
		this.raiz = raiz;
	}
	

}
