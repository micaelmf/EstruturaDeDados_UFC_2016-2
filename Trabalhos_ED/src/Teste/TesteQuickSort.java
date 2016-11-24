package Teste;

import Implementacao.QuickSort;

public class TesteQuickSort {

	public static void main(String[] args) {
		QuickSort quick = new QuickSort();
		
		
		int[] vetor = {8,7,3,6,5,4,9,1,10,2};
		
		quick.imprimeVetor(vetor);
		
		quick.quickSort(vetor, 0, vetor.length-1);

		quick.imprimeVetor(vetor);

	}

}
