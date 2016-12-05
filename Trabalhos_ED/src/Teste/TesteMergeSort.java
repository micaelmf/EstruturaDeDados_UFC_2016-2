package Teste;

import Implementacao.MergeSort;

public class TesteMergeSort {

	public static void main(String[] args) {
		MergeSort merge = new MergeSort();
		
		
		int[] vetor = {8,7,3,6,5,4,9,1,10,2};
		
		merge.imprimeVetor(vetor);
		
		merge.sort(vetor);

		merge.imprimeVetor(vetor);

	}

}
