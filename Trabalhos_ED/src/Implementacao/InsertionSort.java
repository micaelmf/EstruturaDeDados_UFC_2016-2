package Implementacao;

public class InsertionSort {
	
	public int[] insertion(int original[], int tamanho){
		int i, j, atual;
		
		for(i = 1; i < tamanho; i++){
			atual = original[i];
			j = i - 1;
			
			while((j >= 0) && (atual < original[j])){
				original[j+1] = original[j];
				j = j-1;
			}
			
			original[j+1] = atual;
		}
		
		imprimeVetor(original);
		return original;
	}
	
	public void imprimeVetor(int vetor[]){
		for(int i=0; i < vetor.length; i++){
			System.out.println(vetor[i]);
		}
		
	}
	
}
