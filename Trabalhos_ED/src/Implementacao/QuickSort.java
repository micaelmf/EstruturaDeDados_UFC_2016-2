/*
 * Trabalho 11 - Implementar QuickSort e MergeSort
 */

package Implementacao;

public class QuickSort {
	
	public void quickSort(int vet[], int esq, int dir){
	    int pivo = esq, i, j, aux;			//Declaração das variavés e inicialização do pivo com o primeiro algarismo da sequencia
	    for(i = esq + 1; i <= dir ; i++){	//Percorre todos os espaços do vetor
	        j = i;                      	//atribuição de valor
	        if(vet[j] < vet[pivo]){     	//verifica se o vetor da posição pivo é maior que de outra posição
	         aux = vet[j];               	//aux recebe o valor que é menor
	         while(j > pivo){           	//repete enquanto o j, que é a posição do algarismo menor que o pivo, ficar na posição 0
	            vet[j] = vet[j-1];      	//reorganiza a posição de vetores
	            j--;                    	//decremento para a organização
	         }
	         vet[j] = aux;               	// atribuição da variavel menor que o pivo na posição inicial
	         pivo++;                    	// aumenta a posição do pivo em uma unidade
	        }  
	    }
	    if(pivo-1 >= esq){              	// verifica se o valor do pivo é maior que o final do vetor.
	        quickSort(vet,esq,pivo-1);      //final da execursão da função
	    }
	    if(pivo+1 <= dir){              	//verifica se o valor do pivo é menor, indicando que ainda estar dentro das limitações do vetor
	        quickSort(vet,pivo+1,dir);      //chama a função para eecutar novamente
	    }
	 }
	
	
	public void imprimeVetor(int vetor[]){
		for(int i=0; i < vetor.length; i++){
			System.out.printf(" " + vetor[i]);
		}
		System.out.println("");
		
	}
}
