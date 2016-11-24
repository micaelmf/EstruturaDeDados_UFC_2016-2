/*
 * Trabalho 11 - Implementar QuickSort e MergeSort
 */

package Implementacao;

public class QuickSort {
	
	public void quickSort(int vet[], int esq, int dir){
	    int pivo = esq, i, j, aux;			//Declara��o das variav�s e inicializa��o do pivo com o primeiro algarismo da sequencia
	    for(i = esq + 1; i <= dir ; i++){	//Percorre todos os espa�os do vetor
	        j = i;                      	//atribui��o de valor
	        if(vet[j] < vet[pivo]){     	//verifica se o vetor da posi��o pivo � maior que de outra posi��o
	         aux = vet[j];               	//aux recebe o valor que � menor
	         while(j > pivo){           	//repete enquanto o j, que � a posi��o do algarismo menor que o pivo, ficar na posi��o 0
	            vet[j] = vet[j-1];      	//reorganiza a posi��o de vetores
	            j--;                    	//decremento para a organiza��o
	         }
	         vet[j] = aux;               	// atribui��o da variavel menor que o pivo na posi��o inicial
	         pivo++;                    	// aumenta a posi��o do pivo em uma unidade
	        }  
	    }
	    if(pivo-1 >= esq){              	// verifica se o valor do pivo � maior que o final do vetor.
	        quickSort(vet,esq,pivo-1);      //final da execurs�o da fun��o
	    }
	    if(pivo+1 <= dir){              	//verifica se o valor do pivo � menor, indicando que ainda estar dentro das limita��es do vetor
	        quickSort(vet,pivo+1,dir);      //chama a fun��o para eecutar novamente
	    }
	 }
	
	
	public void imprimeVetor(int vetor[]){
		for(int i=0; i < vetor.length; i++){
			System.out.printf(" " + vetor[i]);
		}
		System.out.println("");
		
	}
}
