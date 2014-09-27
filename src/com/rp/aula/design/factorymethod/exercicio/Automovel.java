package com.rp.aula.design.factorymethod.exercicio;

public abstract class Automovel {

	private int numeroPneus;
	private int kmAtual;

	public abstract int getNumeroPneus();

	public void setNumeroPneus(int numeroPneus) {
		this.numeroPneus = numeroPneus;
	}

	public int getKmAtual() {
		return kmAtual;
	}

	public void setKmAtual(int kmAtual) {
		this.kmAtual = kmAtual;
	}

}
