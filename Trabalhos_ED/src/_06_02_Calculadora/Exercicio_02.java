package _06_02_Calculadora;

import _03_1_ListaEncadeada.Celula;
import _04_3_PilhaArranjo.MinhaPilhaArranjo;
import _04_4_PilhaEncadeada.MinhaPilhaEncadeada;

public class Exercicio_02 {
	String[] aux;
	private MinhaPilhaEncadeada pilhaEncadeada = new MinhaPilhaEncadeada();
	
	public void calculadora(String calculo){
		//Enfileira
		for(int i = 0; i < calculo.length(); i++){
			pilhaEncadeada.insere(calculo.charAt(i));
			//System.out.print(calculo.charAt(i));
		}
		
		//Desempilhando dentro de uma nova pilha resultando na ordem inversa
		MinhaPilhaEncadeada b = new MinhaPilhaEncadeada();
		int t = pilhaEncadeada.getTamanho();
		for(int i = 0; i < t; i++){
			b.insere(pilhaEncadeada.remove());
		}
		pilhaEncadeada = b;
		
		pilhaEncadeada.imprime();
		
		/*			
		Celula aux = pilhaEncadeada.getListaEncadeada().getPrimeiro().getProx();
		
		for(int i = 0; i < pilhaEncadeada.getTamanho(); i++){
			//pilhaEncadeada.getListaEncadeada().getPrimeiro().getProx().getValor() == 40
			if(aux.getValor().equals(40)){ //ESSA CONDICAO NUNCA É ATENDIDA... TEM QUE CORRIGIR
				System.out.println(aux.getValor());
			}
			aux = aux.getProx();
		}
		*/		
	}
}
