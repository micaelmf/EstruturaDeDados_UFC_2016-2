package Teste;

import Implementacao.CombSort;

public class TesteCombSort {

	public static void main(String[] args) {
		CombSort comb = new CombSort();
		
		int[] vetor = {8,7,3,6,5,4,9,1,10,2};
		
		comb.imprimeVetor(vetor);
		
		comb.combSort(vetor);

		comb.imprimeVetor(vetor);
	}
}
