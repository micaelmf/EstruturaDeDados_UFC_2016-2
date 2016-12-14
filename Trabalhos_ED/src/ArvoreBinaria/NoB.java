package ArvoreBinaria;

public class NoB {
	int valor;
	NoB esq;
	NoB dir;
	
	
	public NoB(int valor){
		this.setValor(valor);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}


	public NoB getEsq() {
		return esq;
	}


	public void setEsq(NoB esq) {
		this.esq = esq;
	}


	public NoB getDir() {
		return dir;
	}


	public void setDir(NoB dir) {
		this.dir = dir;
	}
	
	
}
