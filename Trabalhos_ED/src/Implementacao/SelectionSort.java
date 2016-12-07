package Implementacao;

public class SelectionSort {
	
	int atual, menor, indiceMenor, valor;
	
	public void selectionSort(int vetor[]){
		for(int i = 0; i < vetor.length; i++){
			indiceMenor = i;
			menor = vetor[i];
			
			for(int j = i+1; j < vetor.length; j++){
				//valor = vetor[j];
				if(vetor[j] < menor ){
					menor = vetor[j];
					indiceMenor = j;
				}
			}
			
			vetor[indiceMenor] = vetor[i];
			vetor[i] = menor;
		}
		
	}
	
	public void imprimeVetor(int vetor[]){
		for(int i=0; i < vetor.length; i++){
			System.out.println(vetor[i]);
		}
		
	}
	
}


