/*
 * TRABALHO 10 - Implementar shell sort
 */

package Teste;

import Implementacao.ShellSort;

public class TesteShellSort {

	public static void main(String[] args) {
		ShellSort shell = new ShellSort();
		
		int[] vetor = {8,7,3,6,5,4,9,1,2,10};
		
		shell.imprimeVetor(vetor);
		
		shell.shellSort_internet(vetor);

		shell.imprimeVetor(vetor);
	}

}
