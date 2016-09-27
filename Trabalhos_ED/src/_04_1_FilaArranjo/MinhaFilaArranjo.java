package _04_1_FilaArranjo;
import _02_1_ListaArranjo.MinhaListaArranjo;

public class MinhaFilaArranjo {
	MinhaListaArranjo listaArranjo = new MinhaListaArranjo(10);	//Cria lista de Arranjo do pacote _02_1
	Object a = listaArranjo;
	
	
	
	//Adiciona item na fila
	public void insere(Object item){
		listaArranjo.insere(item);
		
	}

	//Remove o primeiro da fila
	public void remove(){
		
	}
	
}
