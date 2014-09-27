package com.rp.aula.design.factorymethod.exercicio;

public class Sistema {

	public static void main(String[] args) {
		Automovel a1 = AutomovelFactory.getInstance(TipoAutomovel.Motocicleta);
		System.out.println(a1.getNumeroPneus());
		
		Automovel a2 = AutomovelFactory.getInstance(TipoAutomovel.Carro);
		System.out.println(a2.getNumeroPneus());
		
		Automovel a3 = AutomovelFactory.getInstance(TipoAutomovel.Caminhao);
		System.out.println(a3.getNumeroPneus());
	}

}
