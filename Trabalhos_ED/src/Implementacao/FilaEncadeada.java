package Implementacao;
import _03_1_ListaEncadeada.*;

public class FilaEncadeada {
	ListaEncadeada filaEncadeada = new ListaEncadeada();
	 
	public void insere(Object item){
		filaEncadeada.insereFinal(item);
	}
	
	public Object removeInicio(){ //condiderando fila iniciando no indice 0
		return filaEncadeada.removeInicio();
	}
	
	public int tamanho(){
		return filaEncadeada.tamanho();
	}
	
	public boolean vazia(){
		return filaEncadeada.vazia();
	}
	
	public void imprime(){
		filaEncadeada.imprime();
	}
	
}
