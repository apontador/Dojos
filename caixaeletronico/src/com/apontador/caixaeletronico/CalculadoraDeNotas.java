package com.apontador.caixaeletronico;

public class CalculadoraDeNotas {

	public String calcular(int quantia) {
		if (quantia < 0 || quantia > 10000){
			throw new IllegalArgumentException("Aceita uma balinha?");
		}
		
		int notasDe50 = quantia / 50;
		quantia = quantia % 50;
		
		int notasDe10 = quantia / 10;
		quantia = quantia % 10;
				
		int notasDe5 = quantia / 5;
		quantia = quantia % 5;
		
		int notasDe1 = quantia % 5;
		
		return String.format("%d %d %d %d", notasDe50, notasDe10, notasDe5, notasDe1);
	}

}
