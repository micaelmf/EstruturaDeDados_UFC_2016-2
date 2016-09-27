package _04_1_FilaArranjo;
import _02_1_ListaArranjo.MinhaListaArranjo;

public class MinhaFilaArranjo {
	MinhaListaArranjo listaArranjo = new MinhaListaArranjo(10);	//Cria lista de Arranjo do pacote _02_1
	Object[] itens = listaArranjo.getItens();
	
	//Adiciona item na fila
	public void insere(Object item){
		listaArranjo.insere(item); //insere na última posição (mais a direita)
	}

	//Remove o primeiro da fila
	public Object remove(){
		return listaArranjo.removePrimeiro();
	}
	
	public void pesquisa (Object chave){
		listaArranjo.pesquisa(chave);
	}
	
	public boolean cheia(){
		return listaArranjo.listaCheia();
	}
}
