package Implementacao;

public class MDCEuclides {
	public int mdc(int x, int y){
		if(y == 0){
			return x;
		}else if (y != 0){
			return mdc(y, x%y);
		}
		return -1;
	}
}
