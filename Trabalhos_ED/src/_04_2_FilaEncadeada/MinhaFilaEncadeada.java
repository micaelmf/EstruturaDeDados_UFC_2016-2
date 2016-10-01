package _04_2_FilaEncadeada;
import _03_1_ListaEncadeada.*;

public class MinhaFilaEncadeada {
	MinhaListaEncadeada filaEncadeada = new MinhaListaEncadeada();
	 
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
