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
		
		
		int tam1 = 250;
		int[] vetor1 = new int [tam1];
		for (int i = 0; i < tam1; i++) {
			vetor1[i] = aleatorio.nextInt();
		}
		
		int tam2 = 500;
		int[] vetor2 = new int [tam2];
		for (int i = 0; i < tam2; i++) {
			vetor2[i] = aleatorio.nextInt();
		}
		
		int tam3 = 1000;
		int[] vetor3 = new int [tam3];
		for (int i = 0; i < tam3; i++) {
			vetor3[i] = aleatorio.nextInt();
		}

		int tam4 = 2000;
		int[] vetor4 = new int [tam4];
		for (int i = 0; i < tam4; i++) {
			vetor4[i] = aleatorio.nextInt();
		}
		
		int tam5 = 4000;
		int[] vetor5 = new int [tam5];
		for (int i = 0; i < tam5; i++) {
			vetor5[i] = aleatorio.nextInt();
		}
		
		int tam6 = 8000;
		int[] vetor6 = new int [tam6];
		for (int i = 0; i < tam6; i++) {
			vetor6[i] = aleatorio.nextInt();
		}
		
		int tam7 = 16000;
		int[] vetor7 = new int [tam7];
		for (int i = 0; i < tam7; i++) {
			vetor7[i] = aleatorio.nextInt();
		}
		
		int tam8 = 500000;
		int[] vetor8 = new int [tam8];
		for (int i = 0; i < tam8; i++) {
			vetor8[i] = aleatorio.nextInt();
		}
		
		System.out.println("-----------------| " + tam1 + " ELEMENTOS |-----------------");
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
		System.out.println("-----------------| " + tam2 + " ELEMENTOS |-----------------");
		
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
		System.out.println("-----------------| " + tam3 + " ELEMENTOS |-----------------");
		
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
		System.out.println("-----------------| " + tam4 + " ELEMENTOS |-----------------");
		
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
		System.out.println("-----------------| " + tam5 + " ELEMENTOS |-----------------");

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
		System.out.println("-----------------| " + tam6 + " ELEMENTOS |-----------------");
		
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
		System.out.println("-----------------| " + tam7 + " ELEMENTOS |-----------------");
		
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
		/*
		System.out.println("-----------------| " + tam8 + " ELEMENTOS |-----------------");
		
		relogio.start();
		insertion.insertion(vetor8, tam8);
		System.out.println("InsertionSort, " + relogio.elapsedTime());
		
		relogio.start();
		selection.selectionSort(vetor8);
		System.out.println("SelectionSort, " + relogio.elapsedTime());
		
		relogio.start();
		shell.shellSort_internet(vetor8);
		System.out.println("    ShellSort, " + relogio.elapsedTime());
		*/		
	 	
//-------------------------------------------------------------------------------------------------------
		
/*
 *Trabalho 14 
 */
		QuickSort quick = new QuickSort();
		MergeSort merge = new MergeSort();
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		
		System.out.println("-----------------| " + tam1 + " ELEMENTOS |-----------------");
		relogio.start();
		quick.quickSort(vetor1, 0, vetor1.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor1);
		System.out.println("QuickSort, " + relogio.elapsedTime());
		
//-------------------------------------------------------------------------------------------------------
		System.out.println("-----------------| " + tam2 + " ELEMENTOS |-----------------");
	
		relogio.start();
		quick.quickSort(vetor2, 0, vetor2.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor2);
		System.out.println("QuickSort, " + relogio.elapsedTime());
//-------------------------------------------------------------------------------------------------------
		System.out.println("-----------------| " + tam3 + " ELEMENTOS |-----------------");
	
		relogio.start();
		quick.quickSort(vetor3, 0, vetor3.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor3);
		System.out.println("QuickSort, " + relogio.elapsedTime());
//-------------------------------------------------------------------------------------------------------
		System.out.println("-----------------| " + tam4 + " ELEMENTOS |-----------------");
	
		relogio.start();
		quick.quickSort(vetor4, 0, vetor4.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor4);
		System.out.println("QuickSort, " + relogio.elapsedTime());
//-------------------------------------------------------------------------------------------------------
		System.out.println("-----------------| " + tam5 + " ELEMENTOS |-----------------");
	
		relogio.start();
		quick.quickSort(vetor5, 0, vetor5.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor5);
		System.out.println("QuickSort, " + relogio.elapsedTime());
//-------------------------------------------------------------------------------------------------------
		System.out.println("-----------------| " + tam6 + " ELEMENTOS |-----------------");
	
		relogio.start();
		quick.quickSort(vetor6, 0, vetor6.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor6);
		System.out.println("QuickSort, " + relogio.elapsedTime());
//-------------------------------------------------------------------------------------------------------
		System.out.println("-----------------| " + tam7 + " ELEMENTOS |-----------------");
	
		relogio.start();
		quick.quickSort(vetor7, 0, vetor7.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor7);
		System.out.println("QuickSort, " + relogio.elapsedTime());
//-------------------------------------------------------------------------------------------------------
		/*
		System.out.println("-----------------| " + tam8 + " ELEMENTOS |-----------------");
	
		relogio.start();
		quick.quickSort(vetor8, 0, vetor8.length-1);
		System.out.println("MergeSort, " + relogio.elapsedTime());
		
		relogio.start();
		merge.sort(vetor8);
		System.out.println("QuickSort, " + relogio.elapsedTime());
		*/
//-------------------------------------------------------------------------------------------------------		
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
	}

}
