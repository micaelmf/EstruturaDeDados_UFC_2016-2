/*
 * Inverter palavras de uma string
 * INPUT: "O fortaleza empatou"
 * OUTPUT: "empatou fortaleza O;
 */

package Implementacao;

import _04_3_PilhaArranjo.*;

public class InverteString {
	String[] aux;
	PilhaArranjo a = new PilhaArranjo();
	
	public void inverte(String string){
		//Divite a string 
		this.aux = string.split(" ");
	
		//Empilhando a string passada por parametro
		for(int i = 0; i < aux.length; i++){
			a.inseri(aux[i]);
		}	
		a.imprime();
		
		//Desempilhando dentro de uma nova pilha resultando na ordem inversa
		PilhaArranjo b = new PilhaArranjo();
		for(int i = 0; i < aux.length; i++){
			b.inseri(a.removeUltimo());
		}
		b.imprime();
	}
}
