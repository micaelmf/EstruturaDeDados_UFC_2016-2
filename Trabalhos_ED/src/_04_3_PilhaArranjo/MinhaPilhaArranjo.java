package _04_3_PilhaArranjo;
import _02_1_ListaArranjo.*;

public class MinhaPilhaArranjo {
	MinhaListaArranjo a = new MinhaListaArranjo(5);
	
	//Insere na �ltima posi��o (mais a direita)
	public void inseri(Object item){
		a.insere(item);
	}
	
	//Remove o �ltimo elemento que entrou na pilha (mais a direita)
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
