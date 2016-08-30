import java.util.ArrayList;

public class PartidaHandBall {
	public String arbitro;
	public String t1;
	private ArrayList<String> jogadoresT1 = new ArrayList<>(); 
	public String t2;
	private ArrayList<String> jogadoresT2 = new ArrayList<>();
	private int placarTime1;
	private int placarTime2;
	private String fase;
	private int numCartoesAmarelosT1;
	private int numCartoesAmarelosT2;
	private int numCartoesVermelhosT1;
	private int numCartoesVermelhosT2;
	private int numDoisMinutosT1;
	private int numDoisMinutosT2;
	private int numSeteMetrosT1;
	private int numSeteMetrosT2;
	private String placarGeral;
	
	public String exibeResultado(){
		if(this.placarTime1 > this.placarTime2){
			return "Vitória para " + getT1() + "!";
		}else if (this.placarTime2 > this.placarTime1){
			return "Vitória para " + getT2() + "!";
		}else{
			return "Empate";
		}
	}
	
	public int getNumCartoesAmarelosT2() {
		return numCartoesAmarelosT2;
	}
	public void setNumCartoesAmarelosT2(int numCartoesAmarelosT2) {
		this.numCartoesAmarelosT2 = numCartoesAmarelosT2;
	}
	public int getNumCartoesVermelhosT1() {
		return numCartoesVermelhosT1;
	}
	public void setNumCartoesVermelhosT1(int numCartoesVermelhosT1) {
		this.numCartoesVermelhosT1 = numCartoesVermelhosT1;
	}
	public String getPlacarGeral() {
		return placarGeral;
	}
	
	public void setPlacarGeral(String placarGeral) {
		this.placarGeral = getPlacarTime1() + " X " + getPlacarTime2();
	}
	public String getArbitro() {
		return arbitro;
	}
	public void setArbitro(String arbitro) {
		this.arbitro = arbitro;
	}
	public String getT1() {
		return t1;
	}
	public void setT1(String t1) {
		this.t1 = t1;
	}
	public ArrayList<String> getJogadoresT1() {
		return jogadoresT1;
	}
	public void setJogadoresT1(ArrayList<String> jogadoresT1) {
		this.jogadoresT1 = jogadoresT1;
	}
	public String getT2() {
		return t2;
	}
	public void setT2(String t2) {
		this.t2 = t2;
	}
	public ArrayList<String> getJogadoresT2() {
		return jogadoresT2;
	}
	public void setJogadoresT2(ArrayList<String> jogadoresT2) {
		this.jogadoresT2 = jogadoresT2;
	}
	public int getPlacarTime1() {
		return placarTime1;
	}
	public void setPlacarTime1(int placarTime1) {
		this.placarTime1 = placarTime1;
	}
	public int getPlacarTime2() {
		return placarTime2;
	}
	public void setPlacarTime2(int placarTime2) {
		this.placarTime2 = placarTime2;
	}
	public String getFase() {
		return fase;
	}
	public void setFase(String fase) {
		this.fase = fase;
	}
	public int getNumCartoesAmarelosT1() {
		return numCartoesAmarelosT1;
	}
	public void setNumCartoesAmarelosT1(int numCartoesAmarelosT1) {
		this.numCartoesAmarelosT1 = numCartoesAmarelosT1;
	}
	public int getNumCartoesVermelhosT2() {
		return numCartoesVermelhosT2;
	}
	public void setNumCartoesVermelhosT2(int numCartoesVermelhosT2) {
		this.numCartoesVermelhosT2 = numCartoesVermelhosT2;
	}
	public int getNumDoisMinutosT1() {
		return numDoisMinutosT1;
	}
	public void setNumDoisMinutosT1(int numDoisMinutosT1) {
		this.numDoisMinutosT1 = numDoisMinutosT1;
	}
	public int getNumDoisMinutosT2() {
		return numDoisMinutosT2;
	}
	public void setNumDoisMinutosT2(int numDoisMinutosT2) {
		this.numDoisMinutosT2 = numDoisMinutosT2;
	}
	public int getNumSeteMetrosT1() {
		return numSeteMetrosT1;
	}
	public void setNumSeteMetrosT1(int numSeteMetrosT1) {
		this.numSeteMetrosT1 = numSeteMetrosT1;
	}
	public int getNumSeteMetrosT2() {
		return numSeteMetrosT2;
	}
	public void setNumSeteMetrosT2(int numSeteMetrosT2) {
		this.numSeteMetrosT2 = numSeteMetrosT2;
	}
	
	@Override
	public String toString() { 
        return  "Partida: " + getT1() + " X " + getT2() + "\n" + 
        		"Placar: " + getPlacarGeral() + "\n" +
        		"Resultado: " + exibeResultado() + "\n" +
        		"Fase: " + getFase() + "\n" +
        		"Arbitro: " + getArbitro() + "\n" +
        		"Jogadores - " + getT1() + ": " + getJogadoresT1() + "\n" +
        		"Jogadores - " + getT2() + getJogadoresT2() + "\n" +
        		"Cartoes Amarelos - " + getT1() + ": " + getNumCartoesAmarelosT1() + "\n" +
        		"Cartoes Amarelos - " + getT1() + ": " + getNumCartoesAmarelosT2() + "\n" +
        		"Cartoes Vermelhos - " + getT1() + ": " + getNumCartoesVermelhosT1() + "\n" +
        		"Cartoes Vermelhos - " + getT1() + ": " + getNumCartoesVermelhosT2() + "\n" +
        		"2 Minutos - " + getT1() + ": " + getNumDoisMinutosT1() + "\n" +
        		"2 Minutos - " + getT2() + ": " + getNumDoisMinutosT2() + "\n" +
        		"Sete Metos - " + getT1() + ": " + getNumSeteMetrosT1() + "\n" +
        		"Sete Metos - " + getT2() + ": " + getNumSeteMetrosT2() + "\n";
     } 
	
}


