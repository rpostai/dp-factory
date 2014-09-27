package com.rp.aula.design.factorymethod;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class PessoaFisica extends Pessoa {

	private static final String PADRAO_CPF = "###.###.###-##";

	public PessoaFisica(String inscricaoReceitaFederal) {
		super(inscricaoReceitaFederal);
	}

	@Override
	public String formataDocumento() {
		try {
			System.out.println("Pessoa Física");
			MaskFormatter mask = new MaskFormatter(PADRAO_CPF);
			mask.setValueContainsLiteralCharacters(false);
			return mask.valueToString(inscricaoReceitaFederal);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
