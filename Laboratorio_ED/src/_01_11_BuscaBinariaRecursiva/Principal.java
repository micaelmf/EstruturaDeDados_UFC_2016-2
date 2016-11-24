package _01_11_BuscaBinariaRecursiva;

public class Principal {

	public static void main(String[] args) {
		BuscaBinariaRecursiva busca = new BuscaBinariaRecursiva();
		int[] a = {1,2,3,4,5,6,7};
		
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		int result = busca.buscaBinaria(a, 2, 0, 6);
		System.out.println(result);
		
	}

}
