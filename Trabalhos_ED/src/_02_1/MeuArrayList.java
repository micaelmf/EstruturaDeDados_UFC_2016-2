package _02_1;

public class MeuArrayList {
	private Object item[];
	private int primeiro = 0, ultimo = 0, posicao = 0, tamanho = 0;
	
	//Cria a lista
	public MeuArrayList(int maxTam){
		this.item = new Object[maxTam];
		this.primeiro = 0;
		this.ultimo = this.primeiro;
		setTamanho(maxTam);
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
	
	public void insere (Object x){
		if (!listaCheia()){
			this.item[this.ultimo] = x;
			this.ultimo = this.ultimo + 1;	
		}else{
			ampliaLista();
			this.item[this.ultimo] = x;
			this.ultimo = this.ultimo + 1;						
		}
	}
	
	public void ampliaLista(){
		//se a lista estiver cheia
		if (listaCheia()){
			//calculando o tamanho da nova lista
			int novoTamanho = getTamanho() + ((getTamanho() * 50)/100);
			if (novoTamanho == 1){
				novoTamanho = 2;
			}
			setTamanho(novoTamanho);
			//criando nova lista com tamanho calculado
			Object aux[] = new Object[novoTamanho];
			
			//Tranferindo itens entre as listas
			for(int i = 0; i < item.length; i++){
				aux[i] = item[i];
			}
			//Lista item recebe lista aux e lista aux é setada para null
			item = aux;
			aux = null;
		}	
	}
	
	public boolean listaCheia(){
		if (this.ultimo >= getTamanho()){
			return true;			
		}
		return false;
	}

	/*
	public int getTamanho(){
		int t = 0;
		while(t < item.length){
			t++;
		}
		return t;
	}
	*/
	
	public void retira (Object chave) {
		if(this.vazia() || chave == null){
			System.out.println("A a lista ou a chave estão vazias");
		}
		int i = 0;
		//procurando a posição do item
		while(i < this.ultimo && !this.item[i].equals(chave)){
			i++;
		}
		if (i >= ultimo){
			System.out.println("Chave não encontrada!");
			imprimeLista();
		}else{
			//apagando o conteudo da posição i
			item[i] = null;
			ultimo -= 1;
						
			//movendo itens da lista
			Object prox = item[i+1];
			
			while(i < ultimo-1){
				item[i] = prox;
				item[i+1] = null;
				i++;
				prox = item[i+1];					

			}
		}
	
		int novoTamanho = 0;
		if(getUltimo() <= (getTamanho()/2)){
			novoTamanho = ((getTamanho()/2) + ((getUltimo()+25)/100));
			Object aux[] = new Object[novoTamanho];
			//Tranferindo itens entre as listas
			for(int j = 0; j < novoTamanho; j++){
				aux[j] = item[j];
			}
			//Lista item recebe lista aux e lista aux é setada para null
			item = aux;
			aux = null;
			setTamanho(novoTamanho);
		}
	
	}
	
	/*
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
	*/
	
	public void imprimeLista(){
		int i = 0; 
		
		System.out.print("[");
		while(i < item.length){
			System.out.print(item[i]);
			i++;
			if(i < item.length){
				System.out.print(" - ");				
			}else{
				System.out.print("]");				
			}
		}
		System.out.println("");
		
	}
		
/*		
 		for(int i = 0; i < item.length; i++){
			System.out.print(item[i]);
			if(i < item.length - 1){
				System.out.print(" - ");				
			}else{
				System.out.print("]");				
			}
		}
*/	
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
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
