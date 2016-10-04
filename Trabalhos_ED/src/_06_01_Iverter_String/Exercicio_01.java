/*
 * Inverter palavras de uma string
 * INPUT: "O fortaleza empatou"
 * OUTPUT: "empatou fortaleza O;
 */

package _06_01_Iverter_String;
import _04_3_PilhaArranjo.*;


public class Exercicio_01 {
	String[] pilhaString;
	MinhaPilhaArranjo a = new MinhaPilhaArranjo();
	
	public void le(String string){
		pilhaString = string.split(" ");
		a = pilhaString.;
		
		for(int i = a.tamanho(); i > 0; i--){
			System.out.println("" + a.pesquisa(i));
		}
		
		/*
		for(int i = pilhaString.length; i > 0; i--){
			System.out.print(pilhaString[i-1] + " ");
		}
		*/
		

	}
	

}
