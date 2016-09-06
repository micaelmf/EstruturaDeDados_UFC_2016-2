package _02_1;

public class Principal {

	public static void main(String[] args) throws Exception {
		MeuArrayList lista = new MeuArrayList(2);
		
		Integer a = new Integer(1);
		Integer b = new Integer(2);
		Integer c = new Integer(3);
		
		lista.insere(a);
		lista.insere(b);
		lista.insere(c);
		
		
		
		System.out.println(lista.getItem());
	}

}
