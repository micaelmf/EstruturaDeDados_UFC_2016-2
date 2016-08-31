package _01_3;

import java.util.ArrayList;

public class Transporte {
	private String marca;
	private String modelo;
	private int ano;
	private float capacidade; //em toneladas
	private float tempoOperacao; //em horas
	private int numVisitasDia;
	private ArrayList<Entrega> entregas = new ArrayList<Entrega>();
	
	private float peso;
	private float tempoOperacaoDecorrido;
	private int numVisitasFeitas;
	
	
	public void atribuiEntrega(Entrega e){
		if((getPeso() + e.getPeso()) <= getCapacidade() && (getTempoOperacaoDecorrido() + e.getTempo()) <= getTempoOperacao() &&
				(getNumVisitasFeitas() + 1) <= getNumVisitasDia()){
			setPeso(e.getPeso());
			setTempoOperacaoDecorrido(e.getTempo());
			setNumVisitasFeitas();
			getEntregas().add(e);
			System.out.println("Entrega atribuida");
		}else{
			System.out.println("ATENÇÃO: Verifique a capacidade do veículo, o tempo de operação e/ou o número de visitas!");
		}
	}
	
	
	public int getNumVisitasFeitas() {
		return numVisitasFeitas;
	}

	public void setNumVisitasFeitas() {
		this.numVisitasFeitas += 1;
	}

	public float getTempoOperacaoDecorrido() {
		return tempoOperacaoDecorrido;
	}


	public void setTempoOperacaoDecorrido(float tempoOperacaoDecorrido) {
		this.tempoOperacaoDecorrido += tempoOperacaoDecorrido;
	}


	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso += peso;
	}
	
	public ArrayList<Entrega> getEntregas() {
		return entregas;
	}
	public void setEntregas(ArrayList<Entrega> entregas) {
		this.entregas = entregas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public float getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(float capacidade) {
		this.capacidade = capacidade;
	}
	public float getTempoOperacao() {
		return tempoOperacao;
	}
	public void setTempoOperacao(float tempoOperacao) {
		this.tempoOperacao = tempoOperacao;
	}
	public int getNumVisitasDia() {
		return numVisitasDia;
	}
	public void setNumVisitasDia(int numVisitasDia) {
		this.numVisitasDia = numVisitasDia;
	}
	
	
	
}
