package _05_1_FilaArranjoCircular;
import _02_1_ListaArranjo.*;

public class MinhaFilaArranjoCircular {
	//MinhaListaArranjo a = new MinhaListaArranjo(5);
	private Object itens[];
	int tam, frente, tras, numElementos;
	
	public MinhaFilaArranjoCircular(int maxTam) {
		this.itens = new Object[maxTam];
		this.frente = 0;
		this.tras = 0;
		this.tam = maxTam;
	}
	
	public MinhaFilaArranjoCircular(){
		this.itens = new Object[5];
		this.frente = 0;
		this.tras = 0;
		this.tam = 5;
	}
	
	public void insere (Object item){
		if(!cheia()){ //tem espaço?
			itens[tras] = item;
			tras = (tras+1)%tam;
			numElementos++;
		}else{
			ampliaLista();
			itens[tras] = item;
			tras = (tras+1)%tam;
			numElementos++;
		}
	}
	
	public Object remove(){
		if(vazia()){
			System.out.println("[---| LISTA VAZIA |---]");;
			return null;
		}else{
			Object i = itens[frente];
			itens[frente] = null;
			frente = (frente+1)%tam;
			numElementos--;
			return i;
		}
	}
	
	public void reduz(){
		if(this.numElementos < (this.tam/2)){
			int novoTamanho = ((tam/2) + ((numElementos + 25)/100)+1);
			Object aux[] = new Object[novoTamanho];
			//tranferindo itens
			for(int i = 0; i < this.tam; i++){
				aux[i] = itens[i];
			}
			itens = aux;
			aux = null;
			tam = novoTamanho;
		}
	}
	
	public void ampliaLista(){
		int novoTamanho = tam + ((tam * 50)/100);
		Object aux[] = new Object[novoTamanho];
		for(int i = 0; i < this.numElementos; i++){
			aux[i] = itens[(frente + i)%tam];
		}
		itens = aux;
		frente = 0;
		tras = numElementos;
		tam = novoTamanho;
	}
	
	public boolean vazia(){
		return frente == tras;
	}
	
	public boolean cheia(){
		return (tras+1)%tam == frente;
	}
	
	//Exibe a lista na tela
		public void imprime(){
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
	
	public Object[] getItens() {
		return itens;
	}

	public void setItens(Object[] itens) {
		this.itens = itens;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getFrente() {
		return frente;
	}

	public void setFrente(int frente) {
		this.frente = frente;
	}

	public int getTras() {
		return tras;
	}

	public void setTras(int tras) {
		this.tras = tras;
	}

	public int getNumElementos() {
		return numElementos;
	}

	public void setNumElementos(int numElementos) {
		this.numElementos = numElementos;
	}
	
}
