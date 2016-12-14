package ArvoreBST;

public class NoBST {
	int chave;
	int valor;
	NoBST esq;
	NoBST dir;
	
	
	public NoBST(int chave, int valor){
		this.setChave(chave);
		this.setValor(valor);
	}


	public int getChave() {
		return chave;
	}


	public void setChave(int chave) {
		this.chave = chave;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public NoBST getEsq() {
		return esq;
	}


	public void setEsq(NoBST esq) {
		this.esq = esq;
	}


	public NoBST getDir() {
		return dir;
	}


	public void setDir(NoBST dir) {
		this.dir = dir;
	}
	
	
}
