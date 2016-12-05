package Implementacao;

public class CombSort {
	
	public void combSort(int[] itens){
		int passo = itens.length;
		boolean trocou = true;
				
		while(passo > 1 || trocou){
			if(passo > 1){
				passo = (int) (passo / 1.3);
			}
			
			int i = 0;
			trocou = false;
			while(i + passo < itens.length){
				if(itens[i] > itens[i + passo]){
					int aux = itens[i];
					itens[i]  = itens[i + passo];
					itens[i + passo] = aux;
					trocou = true; //trocou recebe true se acontecer pelo menos uma troca no laço atual
				}
				System.out.printf("" + trocou + " | " + passo + " |");
				imprimeVetor(itens);
				
				i++;
			}
			
		}
	}
		
	public void imprimeVetor(int vetor[]){
		for(int i=0; i < vetor.length; i++){
			System.out.printf(" " + vetor[i]);
		}
		System.out.println("");
	}
}
