package Implementacao;

public class CalculadoraPolonesa {
	PilhaEncadeada p1 = new PilhaEncadeada();
	PilhaEncadeada p2 = new PilhaEncadeada();
	private char v;
	
	
	public void calculadora(String calculo){

		for(int i = 0; i < calculo.length(); i++){
			v =(calculo.charAt(i));
			//System.out.print(calculo.charAt(i));


			if (v != '+' && v != '*'){
				p1.insere(v);			
			}else{
				p2.insere(v);
			}
			
			
			if(p2.CelulaPrimeiro().equals('+')){
				double a = (double) p1.CelulaPrimeiro().getProx().getValor();
				double b = (double) p1.CelulaPrimeiro().getValor();
				p1.CelulaPrimeiro().getProx().setValor(a + b);
				System.out.println(p1.CelulaPrimeiro().getProx().getValor());
				p2.insere(v);				
			}else if (p2.CelulaPrimeiro().equals('*')){
				double a = (double) p1.CelulaPrimeiro().getProx().getValor();
				double b = (double) p1.CelulaPrimeiro().getValor();
				p1.CelulaPrimeiro().getProx().setValor(a * b);
				System.out.println(p1.CelulaPrimeiro().getProx().getValor());
				p2.insere(v);
			}else{
				p2.insere(v);
			}
			System.out.println("+++++++++++");
			p1.imprime();
			p2.imprime();
			System.out.println("----------");
		}
	}


	public char getV() {
		return v;
	}


	public void setV(char v) {
		this.v = v;
	}
	
}
