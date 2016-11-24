package Implementacao;

public class ListaArranjo {
	private Object itens[];
	private int primeiro = 0, ultimo = 0, posicao = 0, tamanho = 0;
	
	//Cria a lista
	public ListaArranjo(int maxTam){
		this.itens = new Object[maxTam];
		this.primeiro = 0;
		this.ultimo = this.primeiro;
		setTamanho(maxTam);
	}
	//Verifica se a lista está vazia
	public boolean vazia(){
		return (this.primeiro == this.ultimo);
	}
	//Procura e retorna o indice de um item da lista
	//teste
	public int pesquisa (Object chave){
		if(this.vazia() || chave == null){
			return -1;
		}
		for (int i = 0; i < this.ultimo-1; i++){
			if(this.itens[i].equals(chave)){
				return i;
			}
		}	
		return -1;
	}
	
	//retorna o objeto do indice informado
	public Object pesquisaIndice (int indice){
		if(this.vazia() || indice < 0){
			return null;
		}
		for (int i = 0; i < this.ultimo-1; i++){
			if(indice == i){
				return itens[i];
			}
		}	
		return null;
	}
	
	//Insere um novo item ao final da lista
	public void insere (Object x){
		if (!listaCheia()){
			this.itens[this.ultimo] = x;
			this.ultimo = this.ultimo + 1;	
		}else{
			ampliaLista();
			this.itens[this.ultimo] = x;
			this.ultimo = this.ultimo + 1;						
		}
	}
	//Amplia a lista em 50% caso a lista estiver cheia
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
			for(int i = 0; i < itens.length; i++){
				aux[i] = itens[i];
			}
			//Lista item recebe lista aux e lista aux é setada para null
			itens = aux;
			aux = null;
		}	
	}
	//Verifica se a lista está cheia
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
	
	//Retira um item determinado da lista
	public void removePosicao (Object chave) {
		if(this.vazia() || chave == null){
			System.out.println("A a lista ou a chave estão vazias");
		}
		int i = 0;
		//procurando a posição do item
		while(i < this.ultimo && !this.itens[i].equals(chave)){
			i++;
		}
		if (i >= ultimo){
			System.out.println("Chave não encontrada!");
			imprimeLista();
		}else{
			//apagando o conteudo da posição i
			itens[i] = null;
			ultimo -= 1;
		}		
		deslocamento(i);
	}
	
	//Remove elemento mais a direta
	public Object removeUltimo(){
		if(vazia()){
			return null;
		}else{
			Object item = this.itens[this.ultimo-1]; 
			this.itens[this.ultimo-1] = null;
			this.ultimo -= 1;
			reduzLista();
			return item;			
		}
	}
	
	
	public void deslocamento(int i){
		//movendo itens da lista
		Object prox = itens[i+1];
		
		while(i < ultimo){
			itens[i] = prox;
			itens[i+1] = null;
			i++;
			prox = itens[i+1];					
		}
		
		reduzLista();
	}
	
	public void reduzLista(){
		int novoTamanho = 0;
		if(getUltimo() <= (getTamanho()/2)){
			novoTamanho = ((getTamanho()/2) + ((getUltimo()+25)/100)+1);
			Object aux[] = new Object[novoTamanho];
			//Tranferindo itens entre as listas
			for(int j = 0; j < novoTamanho; j++){
				aux[j] = itens[j];
			}
			//Lista item recebe lista aux e lista aux é setada para null
			itens = aux;
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
	
	//Exibe a lista na tela
	public void imprimeLista(){
		int i = 0; 
		
		System.out.print("[");
		while(i < itens.length){
			System.out.print(itens[i]);
			i++;
			if(i < itens.length){
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

	public Object[] getItens() {
		return itens;
	}
	public void setItens(Object[] item) {
		this.itens = item;
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
