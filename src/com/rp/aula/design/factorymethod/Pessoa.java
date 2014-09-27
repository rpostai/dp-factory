package com.rp.aula.design.factorymethod;

public abstract class Pessoa {

	protected final String inscricaoReceitaFederal;

	public Pessoa(String inscricaoReceitaFederal) {
		this.inscricaoReceitaFederal = inscricaoReceitaFederal;
	}

	public abstract String formataDocumento();

}
