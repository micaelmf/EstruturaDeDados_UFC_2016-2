package Implementacao;
//import _02_1_ListaArranjo.*;

public class PilhaArranjo {
	ListaArranjo a = new ListaArranjo(5);
	
	//Insere na última posição (mais a direita)
	public void inseri(Object item){
		a.insere(item);
	}
	
	//Remove o último elemento que entrou na pilha (mais a direita)
	public Object removeUltimo(){
		return a.removeUltimo();
		
	}
	
	public Object ultimo(){
		return a.getUltimo();
	}
	
	public int tamanho(){
		return a.getTamanho();
	}
	
	public void imprime(){
		a.imprimeLista();
	}
	
	public void pesquisa(Object chave){
		a.pesquisa(chave);
	}
	
	public void pesquisaIndice(int indice){
		a.pesquisaIndice(indice);
	}
}
