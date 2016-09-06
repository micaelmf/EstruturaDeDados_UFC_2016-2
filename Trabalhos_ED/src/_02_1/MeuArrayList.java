package _02_1;

public class MeuArrayList {
	private Object item[];
	private int primeiro = 0, ultimo = 0, posicao = 0;
	
	//Cria a lista
	public MeuArrayList(int maxTam){
		this.item = new Object[maxTam];
		this.primeiro = 0;
		this.ultimo = this.primeiro;
	}

	public boolean vazia(){
		return (this.primeiro == this.ultimo);
	}
	
	public Object pesquisa (Object chave){
		if(this.vazia() || chave == null){
			return null;
		}
		for (int p = 0; p < this.ultimo; p++){
			if(this.item[p].equals(chave)){
				return this.item[p];
			}
		}
		return null;
	}
	
	public void insere (Object x) throws Exception{
		if(this.ultimo >= this.item.length){
			throw new Exception ("Erro: A lista está vazia");
		}else{
			this.item[this.ultimo] = x;
			this.ultimo = this.ultimo + 1;
		}
	}
	
	public Object retira(Object chave) throws Exception{
		if(this.vazia() || chave == null){
			throw new Exception ("Erro: A lista está vazia");
		}
		int p = 0;
		while(p < this.ultimo && !this.item[p].equals(chave)){
			p++;
		}
		if(p >= this.ultimo){
			return null;//chave não econtrada
		}
		Object item = this.item[p];
		this.ultimo = this.ultimo - 1;
		for(int aux = p; aux < this.ultimo; aux++){
			this.item[aux] = this.item[aux + 1];
		}
		return item;
		
	}
	public Object[] getItem() {
		return item;
	}
	public void setItem(Object[] item) {
		this.item = item;
	}
	public int getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(int primeiro) {
		this.primeiro = primeiro;
	}
	public int getUltimo() {
		return ultimo;
	}
	public void setUltimo(int ultimo) {
		this.ultimo = ultimo;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
		
}
