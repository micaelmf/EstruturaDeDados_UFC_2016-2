package Implementacao;
/*
package _06_02_Calculadora;

import java.util.Stack;

import _03_1_ListaEncadeada.Celula;
import _04_3_PilhaArranjo.MinhaPilhaArranjo;
import _04_4_PilhaEncadeada.MinhaPilhaEncadeada;

/*
public class Calculadora {
	String[] aux;
	private MinhaPilhaEncadeada pilhaEncadeada = new MinhaPilhaEncadeada();
	
	public void inverteCalculo(String calculo){
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
		
		calculadora(pilhaEncadeada);
		
		
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


/*
	}
	
	public void calculadora(MinhaPilhaEncadeada pilhaEncadeada){
		Celula aux = pilhaEncadeada.CelulaPrimeiro();
	
		System.out.println(aux.getValor());
		
		boolean paratese1 = false, num1 = false, num2 = false, parentese2 = false;
		char operador = 0;
		
		pilhaEncadeada.imprime();
		
		for(int i = 0; !pilhaEncadeada.vazia(); i++){
			System.out.println(aux.getValor());
			
			if(aux.getValor().equals('(')){
				paratese1 = true;
				if(aux.getValor().equals('(')){
					Celula inicio = pilhaEncadeada.getPrimeiro();
				}
			}else if(aux.getValor().equals(')')){
				parentese2 = true;
			}else if(aux.getValor().equals('+')){
				operador = (char) aux.getValor();
			}else if(aux.getValor().equals('-')){
				operador = (char) aux.getValor();
			}else if(aux.getValor().equals('/')){
				operador = (char) aux.getValor();
			}else if(aux.getValor().equals('*')){
				operador = (char) aux.getValor();
			}else{
				if(num1 == false){
					num1 = true;
				}else{
					num2 = true;
				}
				
			}
			
			if(paratese1 && num1 && operador == 0 && num2 == false && parentese2){
				aux.setValor(aux.getProx().getValor());
				aux.setProx(aux.getProx().getProx());
			}
			
			int result;
			int n1, n2;
			

			if(paratese1 && num1 && operador > 0 && num2){
				switch ((char)operador) {
				case '+':
					for(int j = 0; !aux.getProx().getValor().equals('('); j++){
						n1 = (int) aux.getProx().getValor();
						n2 = (int) aux.getProx().getProx().getProx().getValor();
						result = n1 + n2;
						aux.getProx().setValor(result);
						aux.setProx(aux.getProx().getProx().getProx().getProx());
						System.out.println("Resultado: " + result);
					}
					break;
				case '-':
					for(int j = 0; !aux.getProx().getValor().equals('('); j++){
						n1 = (int) aux.getProx().getValor();
						n2 = (int) aux.getProx().getProx().getProx().getValor();
						result = n1 - n2;
						aux.getProx().setValor(result);
						aux.setProx(aux.getProx().getProx().getProx().getProx());
					}
					break;
				case '/':
					for(int j = 0; !aux.getProx().getValor().equals('('); j++){
						n1 = (int) aux.getProx().getValor();
						n2 = (int) aux.getProx().getProx().getProx().getValor();
						result = n1 / n2;
						aux.getProx().setValor(result);
						aux.setProx(aux.getProx().getProx().getProx().getProx());
					}
					break;
				case '*':
					for(int j = 0; !aux.getProx().getValor().equals('('); j++){
						n1 = (int) aux.getProx().getValor();
						n2 = (int) aux.getProx().getProx().getProx().getValor();
						result = n1 * n2;
						aux.getProx().setValor(result);
						aux.setProx(aux.getProx().getProx().getProx().getProx());
					}
					break;
				default:
					System.out.println("FERROU!!!");
					break;
				}
			}

			aux = aux.getProx();
			
		}
		pilhaEncadeada.imprime();
	}
}
*/