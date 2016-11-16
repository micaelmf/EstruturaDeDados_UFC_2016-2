package _01_11_BuscaBinariaRecursiva;

//import java.util.Comparator;

public class BuscaBinariaRecursiva/*<T extends Comparator<T>>*/ {
	
	public int buscaBinaria(int[]itens, int item, int i, int f){
		
		if(i>f){
			return -1;
		}
		int meio = (i+f)/2;
		if(itens[meio] == item){
			return meio;
		}
		if(itens[meio] > item){
			return buscaBinaria(itens, item, i, meio-1);
		}else{
			return buscaBinaria(itens, item, meio+1, f);
		}
	}
	
	
	
	/*
	public int buscaBinariaGenerica(T[]itens, T item, int i, int f){
		if(i>f){
			return -1;
		}
		int meio = (i+f)/2;
		if(itens[meio] == item){
			return meio;
		}
		if(compare(itens[meio],item)){
			buscaBinariaGenerica(itens, item, i, meio-1);
		}else{
			buscaBinariaGenerica(itens, item, meio+1, f);
		}
	}
	
	private boolean compare(T t, T item) {
		// TODO Auto-generated method stub
		return false;
	}
	 */
/*
	public int buscaBinariaDoProfessor(Object[]itens, Object item, int i, int f){
		if(i>f){
			return -1;
		}
		int meio = (i+f)/2;
		if(itens[meio] == item){
			return meio;
		}
		if(itens[meio] < item){
			buscaBinariaDoProfessor(itens, item, i, meio-1);
		}else{
			buscaBinariaDoProfessor(itens, item, meio+1, f);
		}
	}
*/
}
