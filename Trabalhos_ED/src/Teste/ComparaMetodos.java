package Teste;

import java.util.Random;

import Implementacao.*;

public class ComparaMetodos {
	
	
	public static void main(String[] args) {
		StopWatch relogio = new StopWatch();
		Random aleatorio = new Random();
		
/*
 *Trabalho 13 
 */
		
		InsertionSort insertion = new InsertionSort();
		SelectionSort selection = new SelectionSort();
		ShellSort shell = new ShellSort();
		
		
		//Gerando números aleatórios
		int tam1 = 250;
		System.out.println("-----------------| " + tam1 + " ELEMENTOS |-----------------");
		int[] vetor1 = new int [tam1];
		for (int i = 0; i < tam1; i++) {
			vetor1[i] = aleatorio.nextInt();
		}
		
		relogio.start();
		insertion.insertion(vetor1, tam1);
		System.out.println("InsertionSort, " + relogio.elapsedTime());
		
		relogio.start();
		selection.selectionSort(vetor1);
		System.out.println("SelectionSort, " + relogio.elapsedTime());
		
		relogio.start();
		shell.shellSort_internet(vetor1);
		System.out.println("    ShellSort, " + relogio.elapsedTime());
		
//-------------------------------------------------------------------------------------------------------
				
		//Gerando números aleatórios
		int tam2 = 500;
		System.out.println("-----------------| " + tam2 + " ELEMENTOS |-----------------");
		int[] vetor2 = new int [tam2];
		for (int i = 0; i < tam2; i++) {
			vetor2[i] = aleatorio.nextInt();
		}
		
		relogio.start();
		insertion.insertion(vetor2, tam2);
		System.out.println("InsertionSort, " + relogio.elapsedTime());
		
		relogio.start();
		selection.selectionSort(vetor2);
		System.out.println("SelectionSort, " + relogio.elapsedTime());
		
		relogio.start();
		shell.shellSort_internet(vetor2);
		System.out.println("    ShellSort, " + relogio.elapsedTime());
		
//-------------------------------------------------------------------------------------------------------
		
		//Gerando números aleatórios
		int tam3 = 1000;
		System.out.println("-----------------| " + tam3 + " ELEMENTOS |-----------------");
		int[] vetor3 = new int [tam3];
		for (int i = 0; i < tam3; i++) {
			vetor3[i] = aleatorio.nextInt();
		}
		
		relogio.start();
		insertion.insertion(vetor3, tam3);
		System.out.println("InsertionSort, " + relogio.elapsedTime());
		
		relogio.start();
		selection.selectionSort(vetor3);
		System.out.println("SelectionSort, " + relogio.elapsedTime());
		
		relogio.start();
		shell.shellSort_internet(vetor3);
		System.out.println("    ShellSort, " + relogio.elapsedTime());

//-------------------------------------------------------------------------------------------------------
		
		//Gerando números aleatórios
		int tam4 = 2000;
		System.out.println("-----------------| " + tam4 + " ELEMENTOS |-----------------");
		int[] vetor4 = new int [tam4];
		for (int i = 0; i < tam4; i++) {
			vetor4[i] = aleatorio.nextInt();
		}
		
		relogio.start();
		insertion.insertion(vetor4, tam4);
		System.out.println("InsertionSort, " + relogio.elapsedTime());
		
		relogio.start();
		selection.selectionSort(vetor4);
		System.out.println("SelectionSort, " + relogio.elapsedTime());
		
		relogio.start();
		shell.shellSort_internet(vetor4);
		System.out.println("    ShellSort, " + relogio.elapsedTime());
		
//-------------------------------------------------------------------------------------------------------

		//Gerando números aleatórios
		int tam5 = 4000;
		System.out.println("-----------------| " + tam5 + " ELEMENTOS |-----------------");
		int[] vetor5 = new int [tam5];
		for (int i = 0; i < tam5; i++) {
			vetor5[i] = aleatorio.nextInt();
		}
		
		relogio.start();
		insertion.insertion(vetor5, tam5);
		System.out.println("InsertionSort, " + relogio.elapsedTime());
		
		relogio.start();
		selection.selectionSort(vetor5);
		System.out.println("SelectionSort, " + relogio.elapsedTime());
		
		relogio.start();
		shell.shellSort_internet(vetor5);
		System.out.println("    ShellSort, " + relogio.elapsedTime());
		
//-------------------------------------------------------------------------------------------------------
		
		//Gerando números aleatórios
		int tam6 = 8000;
		System.out.println("-----------------| " + tam6 + " ELEMENTOS |-----------------");
		int[] vetor6 = new int [tam6];
		for (int i = 0; i < tam6; i++) {
			vetor6[i] = aleatorio.nextInt();
		}
		
		relogio.start();
		insertion.insertion(vetor6, tam6);
		System.out.println("InsertionSort, " + relogio.elapsedTime());
		
		relogio.start();
		selection.selectionSort(vetor6);
		System.out.println("SelectionSort, " + relogio.elapsedTime());
		
		relogio.start();
		shell.shellSort_internet(vetor6);
		System.out.println("    ShellSort, " + relogio.elapsedTime());
		
//-------------------------------------------------------------------------------------------------------
		//Gerando números aleatórios
		int tam7 = 15000;
		System.out.println("-----------------| " + tam7 + " ELEMENTOS |-----------------");
		int[] vetor7 = new int [tam7];
		for (int i = 0; i < tam7; i++) {
			vetor7[i] = aleatorio.nextInt();
		}
		
		relogio.start();
		insertion.insertion(vetor7, tam7);
		System.out.println("InsertionSort, " + relogio.elapsedTime());
		
		relogio.start();
		selection.selectionSort(vetor7);
		System.out.println("SelectionSort, " + relogio.elapsedTime());
		
		relogio.start();
		shell.shellSort_internet(vetor7);
		System.out.println("    ShellSort, " + relogio.elapsedTime());
//-------------------------------------------------------------------------------------------------------
		//Gerando números aleatórios
		int tam8 = 500000;
		System.out.println("-----------------| " + tam8 + " ELEMENTOS |-----------------");
		int[] vetor8 = new int [tam8];
		for (int i = 0; i < tam8; i++) {
			vetor8[i] = aleatorio.nextInt();
		}
		
		relogio.start();
		insertion.insertion(vetor8, tam8);
		System.out.println("InsertionSort, " + relogio.elapsedTime());
		
		relogio.start();
		selection.selectionSort(vetor8);
		System.out.println("SelectionSort, " + relogio.elapsedTime());
		
		relogio.start();
		shell.shellSort_internet(vetor8);
		System.out.println("    ShellSort, " + relogio.elapsedTime());		

		/*
		 *Trabalho 14 
		 */
		QuickSort quick = new QuickSort();
		MergeSort merge = new MergeSort();
//-------------------------------------------------------------------------------------------------------
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		
		//Gerando números aleatórios
		int tam9 = 250;
		System.out.println("-----------------| " + tam9 + " ELEMENTOS |-----------------");
		int[] vetor9 = new int [tam9];
		for (int i = 0; i < tam9; i++) {
			vetor9[i] = aleatorio.nextInt();
		}
		
		relogio.start();
		quick.quickSort(vetor9, 0, vetor9.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor9);
		System.out.println("QuickSort, " + relogio.elapsedTime());
		
//-------------------------------------------------------------------------------------------------------
		//Gerando números aleatórios
		int tam10 = 500;
		System.out.println("-----------------| " + tam10 + " ELEMENTOS |-----------------");
		int[] vetor10 = new int [tam10];
		for (int i = 0; i < tam10; i++) {
			vetor10[i] = aleatorio.nextInt();
		}
		relogio.start();
		quick.quickSort(vetor10, 0, vetor10.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor10);
		System.out.println("QuickSort, " + relogio.elapsedTime());
//-------------------------------------------------------------------------------------------------------
		//Gerando números aleatórios
		int tam11 = 1000;
		System.out.println("-----------------| " + tam11 + " ELEMENTOS |-----------------");
		int[] vetor11 = new int [tam11];
		for (int i = 0; i < tam11; i++) {
			vetor11[i] = aleatorio.nextInt();
		}
		relogio.start();
		quick.quickSort(vetor11, 0, vetor11.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor11);
		System.out.println("QuickSort, " + relogio.elapsedTime());
//-------------------------------------------------------------------------------------------------------
		int tam12 = 2000;
		System.out.println("-----------------| " + tam12 + " ELEMENTOS |-----------------");
		int[] vetor12 = new int [tam12];
		for (int i = 0; i < tam12; i++) {
			vetor12[i] = aleatorio.nextInt();
		}
		relogio.start();
		quick.quickSort(vetor12, 0, vetor12.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor12);
		System.out.println("QuickSort, " + relogio.elapsedTime());
//-------------------------------------------------------------------------------------------------------
		int tam13 = 4000;
		System.out.println("-----------------| " + tam13 + " ELEMENTOS |-----------------");
		int[] vetor13 = new int [tam13];
		for (int i = 0; i < tam13; i++) {
			vetor13[i] = aleatorio.nextInt();
		}
		relogio.start();
		quick.quickSort(vetor13, 0, vetor13.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor13);
		System.out.println("QuickSort, " + relogio.elapsedTime());
//-------------------------------------------------------------------------------------------------------
		int tam14 = 8000;
		System.out.println("-----------------| " + tam14 + " ELEMENTOS |-----------------");
		int[] vetor14 = new int [tam14];
		for (int i = 0; i < tam14; i++) {
			vetor14[i] = aleatorio.nextInt();
		}
		relogio.start();
		quick.quickSort(vetor14, 0, vetor14.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor14);
		System.out.println("QuickSort, " + relogio.elapsedTime());
//-------------------------------------------------------------------------------------------------------
		int tam15 = 15000;
		System.out.println("-----------------| " + tam15 + " ELEMENTOS |-----------------");
		int[] vetor15 = new int [tam15];
		for (int i = 0; i < tam15; i++) {
			vetor15[i] = aleatorio.nextInt();
		}
		relogio.start();
		quick.quickSort(vetor15, 0, vetor15.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor15);
		System.out.println("QuickSort, " + relogio.elapsedTime());
//-------------------------------------------------------------------------------------------------------
		int tam16 = 500000;
		System.out.println("-----------------| " + tam16 + " ELEMENTOS |-----------------");
		int[] vetor16 = new int [tam16];
		for (int i = 0; i < tam16; i++) {
			vetor16[i] = aleatorio.nextInt();
		}
		relogio.start();
		quick.quickSort(vetor16, 0, vetor16.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor16);
		System.out.println("QuickSort, " + relogio.elapsedTime());
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
	}

}
