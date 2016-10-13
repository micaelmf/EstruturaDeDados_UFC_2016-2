package _04_4_PilhaEncadeada;

import _03_1_ListaEncadeada.*;

public class MinhaPilhaEncadeada {
	private MinhaListaEncadeada listaEncadeada = new MinhaListaEncadeada();
	private int tamanho = 0; 
	
	
	public void insere(Object item){ //insere um elemento no topo (Considere topo o indice 0)		
		Celula aux = new Celula(); //cria uma nova celula (aux)
		aux.setValor(item); //atribui valor em aux
		aux.setProx(listaEncadeada.getPrimeiro().getProx()); //Define que aux aponta para o topo
		listaEncadeada.getPrimeiro().setProx(aux);
		tamanho++;
	}
	
	public Object remove(){
		if(vazia()){
			return null;
		}else{
			//pegando o valor do topo atual (celula após a cabeça)
			Object aux = listaEncadeada.getPrimeiro().getProx().getValor(); 
			//aponta a cabeça para a segunda celula. Transformando a segunda célula em topo
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
	
	public Celula getPrimeiro(){
		return listaEncadeada.getPrimeiro();
	}
	
	public void imprime(){
		if(vazia()){
			System.out.println("[---| LISTA VAZIA! |---]");
		}else{
			listaEncadeada.imprime();			
		}
	}

	public MinhaListaEncadeada getListaEncadeada() {
		return listaEncadeada;
	}

	public void setListaEncadeada(MinhaListaEncadeada a) {
		this.listaEncadeada = a;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
