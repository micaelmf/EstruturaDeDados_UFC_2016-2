/*
 * TRABALHO 10 - Implementar shell sort
 */


package Implementacao;

public class ShellSort {
	
	public void shellSort_internet(int[] itens) {
	    int tPasso = 1;
	    int tLista = itens.length;
	    while(tPasso < tLista){
	    	tPasso = tPasso * 3 + 1;
	    }
	            
	    tPasso = tPasso / 3;
	    int elemento2, j;
	    while (tPasso > 0) {
	    	
	        for (int i = tPasso; i < tLista; i++) {
	            elemento2 = itens[i];
	            j = i;
	                
	            while (j >= tPasso && itens[j - tPasso] > elemento2) {
	                itens[j] = itens[j - tPasso]; //se o elemento1 for maior que o elemento2 acontece a troca 
	                j = j - tPasso; // volta fazendo mais comparações
	            }
	            itens[j] = elemento2; // quando o elemento2 for maior que o elemento1  
	        }
	        tPasso = tPasso / 2;
	    }
	}
	
	public void imprimeVetor(int vetor[]){
		for(int i=0; i < vetor.length; i++){
			System.out.printf(" " + vetor[i]);
		}
		System.out.println("");
	}
}
