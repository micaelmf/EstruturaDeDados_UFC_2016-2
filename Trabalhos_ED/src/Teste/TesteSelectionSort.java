package Teste;
import Implementacao.SelectionSort;

public class TesteSelectionSort {

	public static void main(String[] args) {
		SelectionSort selection = new SelectionSort();
		
		int[] vetor = {9,7,6,5,2,1,3,4,8};
		
		selection.imprimeVetor(vetor);
		System.out.println("");
		selection.selectionSort(vetor);
		selection.imprimeVetor(vetor);

	}

}
