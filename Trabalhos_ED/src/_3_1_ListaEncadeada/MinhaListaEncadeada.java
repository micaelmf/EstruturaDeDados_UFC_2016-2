package _3_1_ListaEncadeada;

public class MinhaListaEncadeada <T> {
	private Celula primeiro;
	private Celula ultimo;

	public MinhaListaEncadeada(){
		primeiro = new Celula();
		ultimo = primeiro;
		
	}
	
	public boolean insere(T item){
		ultimo.setProx(new Celula());
		ultimo = ultimo.getProx();
		ultimo.setValor(item);
		ultimo.setProx(null); //essaa linha pode ser descartada em java
		
		return true;
	}
	
	public Object remove(int indice){
		Celula aux = primeiro;
		int i = -1;
		
		while(aux != null && i < indice){
			if(i+1 == indice){
				Object item = aux.getProx().getValor();
				//remove
				aux.setProx(aux.getProx().getProx());
				if(i+1 == tamanho()){
					this.ultimo = aux;
				}
				return item;
			}else{
				i++;
				aux = aux.getProx();
			}
		}
		return null;
	}
	
	public int tamanho(){
		Celula aux = primeiro;
		int i;
		for(i = 0; aux != null; i++){
			aux = aux.getProx();
		}
		return i-1;
	}
	
	public Object pesquisa(int indice){
		Celula aux = primeiro;
		if(indice > tamanho()){
			System.out.println("Indice maior que o tamanho da lista");
		}else{
			for(int i = -1; aux != null && i < indice; i++){
				aux = aux.getProx();
			}
			return aux.getValor();					
		}
		return null;
	}
	
	public void imprime(){
		Celula aux = primeiro;
		
		int i = 0, t = tamanho();
		System.out.print("[");
		while(i < t){
			System.out.print(aux.getProx().getValor());
			aux = aux.getProx();
			if(aux.getProx() == null){
				System.out.println("]\n");
			}else{
				System.out.print(" - ");
			}
			i++;
		}
		
	}
	
	public boolean vazia(){
		if(tamanho() <= 1){
			return true;
		}
		return false;
	}
	
	public Object ultimo(){
		return getUltimo().getValor();
	}
	
	public Object primeiro(){
		return getPrimeiro().getProx().getValor();
	}
	
	public Celula getPrimeiro() {
		return primeiro;
	}
	
	public void setPrimeiro(Celula primeiro) {
		this.primeiro = primeiro;
	}
	
	public Celula getUltimo() {
		return ultimo;
	}
	
	public void setUltimo(Celula ultimo) {
		this.ultimo = ultimo;
	}
}
