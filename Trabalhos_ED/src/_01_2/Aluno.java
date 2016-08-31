package _01_2;

public class Aluno {
	private String nome;
	private String matricula;
	private String turma;
	private float p1;
	private float p2;
	private float p3;
	private float media;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length()>81){
			System.out.println("Nome fora do limite de 81 caracteres");
		}else{
			this.nome = nome;			
		}
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		if(matricula.length() > 8){
			System.out.println("Matrícula fora do limite de 8 caracteres");
		}else{
			this.matricula = matricula;						
		}
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public float getP1() {
		return p1;
	}
	public void setP1(float p1) {
		this.p1 = p1;
	}
	public float getP2() {
		return p2;
	}
	public void setP2(float p2) {
		this.p2 = p2;
	}
	public float getP3() {
		return p3;
	}
	public void setP3(float p3) {
		this.p3 = p3;
	}
	public float getMedia() {
		return media;
	}
	public void setMedia() {
		this.media = (getP1() + getP2() + getP3())/3;
	}
	
}
