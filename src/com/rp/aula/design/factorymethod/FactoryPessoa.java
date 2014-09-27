package com.rp.aula.design.factorymethod;

public class FactoryPessoa {

	private final static int TAMANHO_CPF = 11;
	private final static int TAMANHO_CNPJ = 14;

	private FactoryPessoa() {
	};

	public static Pessoa getInstance(String inscricaoReceitaFederal) {

		if (inscricaoReceitaFederal != null) {
			if (TAMANHO_CPF == inscricaoReceitaFederal.length()) {
				return new PessoaFisica(inscricaoReceitaFederal);
			} else if (TAMANHO_CNPJ == inscricaoReceitaFederal.length()) {
				return new PessoaJuridica(inscricaoReceitaFederal);
			}
		}

		throw new IllegalArgumentException(
				"Código na receita federal não é válido para CPF ou CNPJ");

	}
}
