package com.rp.aula.design.factorymethod;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class PessoaJuridica extends Pessoa {

	private static final String PADRAO_CNPJ = "##.###.###/####-##";

	public PessoaJuridica(String inscricaoReceitaFederal) {
		super(inscricaoReceitaFederal);
	}

	@Override
	public String formataDocumento() {
		MaskFormatter mask;
		try {
			System.out.println("Pessoa Jurídica");
			mask = new MaskFormatter(PADRAO_CNPJ);
			mask.setValueContainsLiteralCharacters(false);
			return mask.valueToString(inscricaoReceitaFederal);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;

	}

}
