package Implementacao;

public class ListaEncadeada {
	final private CelulaListaEncadeada primeiro;
	private CelulaListaEncadeada ultimo;

	public ListaEncadeada(){
		this.primeiro = new CelulaListaEncadeada();
		this.ultimo = this.primeiro;
		
	}
	
	public boolean insereFinal(Object item){
		ultimo.setProx(new CelulaListaEncadeada());
		ultimo = ultimo.getProx();
		ultimo.setValor(item);
		//ultimo.setProx(null); //essaa linha pode ser descartada em java
		
		return true;
	}
	
	
	public Object removePosicao(int indice){
		CelulaListaEncadeada aux = primeiro;
		int i = -1;
		
		while(aux != null && i < indice){
			if(i+1 == indice){
				Object item = aux.getProx().getValor();
				//remove
				aux.setProx(aux.getProx().getProx());
				//quando o último for removido
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
	
	public Object removeInicio(){ //Considerando "inicio" sendo o indice 0.
		Object a = primeiro.getProx().getValor();
		primeiro.setProx(primeiro.getProx().getProx());
		return a; //retorna o elemento removido
	}
	
	public int tamanho(){
		CelulaListaEncadeada aux = primeiro;
		int i;
		for(i = 0; aux != null; i++){
			aux = aux.getProx();
		}
		return i-1;
	}
	
	public Object pesquisa(int indice){
		CelulaListaEncadeada aux = primeiro;

		if((vazia() != true) &&  (indice > tamanho())){
			for(int i = -1; (aux != null) && (i < indice); i++){
				aux = aux.getProx();
			}
			return aux.getValor();					
		}
		return null;		
	}
	
	public void imprime(){
		CelulaListaEncadeada aux = primeiro;
		
		int i = 0, t = tamanho();
		//System.out.print("[");
		while(i < t){
			System.out.print(aux.getProx().getValor());
			aux = aux.getProx();
			if(aux.getProx() == null){
				//System.out.println("]\n");
				System.out.println("\n");
			}else{
				//System.out.print(" - ");
				System.out.print("");
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
		if(tamanho() == 0){
			return null;
		}
		return getPrimeiro().getProx().getValor();
	}
	
	
	public CelulaListaEncadeada getPrimeiro() {
		return primeiro;
	}
	
	
/*	
	public void setPrimeiro(Celula primeiro) {
		this.primeiro = primeiro;
	}
*/
	public CelulaListaEncadeada getUltimo() {
		return ultimo;
	}
	
	public void setUltimo(CelulaListaEncadeada ultimo) {
		this.ultimo = ultimo;
	}
}
