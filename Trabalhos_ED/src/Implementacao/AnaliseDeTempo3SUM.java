package Implementacao;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class AnaliseDeTempo3SUM {
	
	public static void main(String[] args) {
		int[] a = new int[8];
		int cont = 0;
		
		a[0] = 30;
		a[1] = -40;
		a[2] = -20;
		a[3] = -10;
		a[4] = 40;
		a[5] = 0;
		a[6] = 10;
		a[7] = 5;
		
		for(int i = 0; i < 7; i++){
			for(int j = i+1; j < 7; j++){
				for(int k = j+1; k < 7; k++){
					if(a[i] + a[j] + a[k] == 0){
						cont++;
					}
				}
			}
		}
		System.out.println(cont);
		
		
		
		
		

	}

}
