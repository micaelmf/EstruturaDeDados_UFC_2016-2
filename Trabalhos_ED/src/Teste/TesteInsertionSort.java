package Teste;

import Implementacao.InsertionSort;

public class TesteInsertionSort {
	
	public static void main(String[] args) {
		
		InsertionSort insert = new InsertionSort();
		
		int[] vetor = {1,2,3,6,5,4,9,8,7};
		
		insert.imprimeVetor(vetor);
		System.out.println("");
		insert.insertion(vetor, 9);
		insert.imprimeVetor(vetor);
		
	}
	

}
