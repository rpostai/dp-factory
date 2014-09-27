package com.rp.aula.design.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sistema {

	public static void main(String[] args) {
		System.out.println("Informe a inscrição da pessoa na receita federal");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String inscricaoReceitaFederal;
		try {
			inscricaoReceitaFederal = br.readLine();
			Pessoa p = FactoryPessoa.getInstance(inscricaoReceitaFederal);
			System.out.println(p.formataDocumento());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
