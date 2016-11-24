package Teste;
import Implementacao.SelectionSort;

public class TesteSelectionSort {

	public static void main(String[] args) {
		SelectionSort selection = new SelectionSort();
		
		int[] vetor = {1,2,3,6,5,4,9,8,7};
		
		selection.selectionSort(vetor);

	}

}
