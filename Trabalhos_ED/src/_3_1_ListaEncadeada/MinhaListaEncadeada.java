package _3_1_ListaEncadeada;

public class MinhaListaEncadeada {
	private Celula primeiro;
	private Celula ultimo;
	
	public void criaLista(){
		primeiro = new Celula();
		ultimo = primeiro;
		
	}
	
	public boolean insere(Object item){
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
				//remove
				Object item = aux.getProx().getValor();
				aux.setProx(aux.getProx().getProx());
				return item;
			}else{
				i++;
				aux = aux.getProx();
			}
		}
		return null;
	}
	
	public int size(){
		Celula aux = primeiro;
		int i;
		for(i = -1; aux != null; i++){
			aux = aux.getProx();
		}
		return i;
	}
	
	public Object get(int index){
		Celula aux = primeiro;
		for(int i = -1; aux != null && i < index; i++){
			aux = aux.getProx();
		}
		return aux.getValor();		
	}
}