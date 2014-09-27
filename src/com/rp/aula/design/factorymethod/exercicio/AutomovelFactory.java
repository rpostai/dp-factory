package com.rp.aula.design.factorymethod.exercicio;

public class AutomovelFactory {

	public static Automovel getInstance(TipoAutomovel tipo) {
		switch (tipo) {
		case Carro:
			return new Carro();
		case Caminhao:
			return new Caminhao();
		case Motocicleta:
			return new Motocicleta();
		default:
			throw new IllegalArgumentException(
					"Tipo de automóvel informado é inválido");
		}
	}
}
