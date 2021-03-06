package Implementacao;

//import _03_1_ListaEncadeada.*;

public class PilhaEncadeada {
	private ListaEncadeada listaEncadeada = new ListaEncadeada();
	private int tamanho = 0; 
	
	
	public void insere(Object item){ //insere um elemento no topo (Considere topo o indice 0)		
		CelulaListaEncadeada aux = new CelulaListaEncadeada(); //cria uma nova celula (aux)
		aux.setValor(item); //atribui valor em aux
		aux.setProx(listaEncadeada.getPrimeiro().getProx()); //Define que aux aponta para o topo
		listaEncadeada.getPrimeiro().setProx(aux);
		tamanho++;
	}
	
	public Object remove(){
		if(vazia()){
			return null;
		}else{
			//pegando o valor do topo atual (celula ap�s a cabe�a)
			Object aux = listaEncadeada.getPrimeiro().getProx().getValor(); 
			//aponta a cabe�a para a segunda celula. Transformando a segunda c�lula em topo
			listaEncadeada.getPrimeiro().setProx(listaEncadeada.getPrimeiro().getProx().getProx());
			tamanho--;
			return aux;			
		}
	}
	
	public int getTamanho(){
		return this.tamanho;
	}
	
	public boolean vazia(){
		if(tamanho < 1){
			return true;
		}
		return false;
	}
	
	public CelulaListaEncadeada getPrimeiro(){
		return listaEncadeada.getPrimeiro();
	}
	
	public CelulaListaEncadeada CelulaPrimeiro(){
		return listaEncadeada.getPrimeiro().getProx();
	}
	
	public void imprime(){
		if(vazia()){
			System.out.println("[---| LISTA VAZIA! |---]");
		}else{
			listaEncadeada.imprime();			
		}
	}

	public ListaEncadeada getListaEncadeada() {
		return listaEncadeada;
	}

	public void setListaEncadeada(ListaEncadeada a) {
		this.listaEncadeada = a;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
