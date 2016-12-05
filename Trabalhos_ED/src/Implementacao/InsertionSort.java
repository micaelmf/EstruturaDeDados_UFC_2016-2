package Implementacao;

public class InsertionSort {
	
	public int[] insertion(int vetor[], int tamanho){
		int i, j, atual;
		
		for(i = 1; i < tamanho; i++){
			atual = vetor[i];
			j = i - 1;
			
			while((j >= 0) && (atual < vetor[j])){
				vetor[j+1] = vetor[j];
				j = j-1;
			}
			
			vetor[j+1] = atual;
		}
		
		imprimeVetor(vetor);
		return vetor;
	}
	
	public void imprimeVetor(int vetor[]){
		for(int i=0; i < vetor.length; i++){
			System.out.println(vetor[i]);
		}
		
	}
	
}
