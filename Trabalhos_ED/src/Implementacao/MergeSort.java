package Implementacao;

public class MergeSort {
	
	public MergeSort() {
		
	}
	
	public void sort(int[] a) {
		if (a.length < 2) {
			return;
		}
		int tam = a.length;
		int[] aux = new int[tam];
		mergesort(a, aux, 0, tam-1);
	}
	
	public void mergesort(int[]vetor, int[]aux, int lo, int hi) {
		//
		if(lo < hi) {
			int mid = (lo + hi) / 2;
			mergesort(vetor, aux, lo, mid);
			mergesort(vetor, aux, (mid + 1), hi);
			merge(vetor, aux, lo, mid, hi);
		}
	}
	
	public void merge(int[]vetor, int[]aux, int lo, int mid, int hi) {
		int i = lo;
		int j = mid + 1;
		
		//Stopwatch tempo = new Stopwatch();
		
		for (int k = lo; k <= hi; k++) {
			aux[k] = vetor[k];
		}
		
		for (int k = lo; k <= hi; k++) {
			if (i > mid)								//se o primeiro metade acabar, o vetor meio copia os elementos da segunda metada para o vetor
				vetor[k] = aux[j++];					
			else if (j > hi)							//se a segunda metade acabar, copia os elementos da primeira metade
				vetor[k] = aux[i++];		 
			else if (aux[i] < aux[j])					//se ainda tem elementos nas metades, compara se sao menores e guarda
				vetor[k] = aux[i++];
			else 										// ou guarda o restante na outr parte
				vetor[k] = aux[j++];
			
		}
		//double tempoT = tempo.elapsedTime();
		//System.out.println(tempoT + " nanosegundos");
		
	}
	
	
	public void exibir(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	
	public void imprimeVetor(int vetor[]){
		for(int i=0; i < vetor.length; i++){
			System.out.printf(" " + vetor[i]);
		}
		System.out.println("");
		
	}	

	/*
	public static int[] gerarAleatorios(int[]a ) {
		for(int i = 0; i < a.length; i++) {
			a[i] = -20000 + (int) (Math.random()*(20000-(-20000)));
			//System.out.println(aleatorio[i]);
			
		}
		return a;
	}
	 */
}
