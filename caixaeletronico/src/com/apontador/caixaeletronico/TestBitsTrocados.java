package com.apontador.caixaeletronico;

import org.junit.*;

public class TestBitsTrocados {

	@Test
	public void deveRetornarUmaNotaDe1bit() {
		CalculadoraDeNotas calculadora = new CalculadoraDeNotas();
		Assert.assertEquals("0 0 0 1", calculadora.calcular(1));
	}
	
	@Test
	public void deveRetornarUmaNotaDe5bits() {
		CalculadoraDeNotas calculadora = new CalculadoraDeNotas();
		Assert.assertEquals("0 0 1 0", calculadora.calcular(5));
	}
	
	@Test
	public void deveRetornarQuatroNotasDe1bit() {
		CalculadoraDeNotas calculadora = new CalculadoraDeNotas();
		Assert.assertEquals("0 0 0 4", calculadora.calcular(4));
	}
	
	@Test
	public void passa6Retorna0011() {
		CalculadoraDeNotas calculadora = new CalculadoraDeNotas();
		Assert.assertEquals("0 0 1 1", calculadora.calcular(6));
	}	

	@Test
	public void passa9Retorna0014() {
		CalculadoraDeNotas calculadora = new CalculadoraDeNotas();
		Assert.assertEquals("0 0 1 4", calculadora.calcular(9));
	}
	
	@Test
	public void passa10Retorna0100() {
		CalculadoraDeNotas calculadora = new CalculadoraDeNotas();
		Assert.assertEquals("0 1 0 0", calculadora.calcular(10));
	}
	
	@Test
	public void passa33Retorna0303() {
		CalculadoraDeNotas calculadora = new CalculadoraDeNotas();
		Assert.assertEquals("0 3 0 3", calculadora.calcular(33));
	}

	@Test
	public void passa50Retorna1000() {
		CalculadoraDeNotas calculadora = new CalculadoraDeNotas();
		Assert.assertEquals("1 0 0 0", calculadora.calcular(50));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void passaMenos1LancaExcecao() {
		CalculadoraDeNotas calculadora = new CalculadoraDeNotas();
		calculadora.calcular(-1);
	}	
	
	@Test
	public void passa0Retorna0000() {
		CalculadoraDeNotas calculadora = new CalculadoraDeNotas();
		Assert.assertEquals("0 0 0 0", calculadora.calcular(0));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void passa10001LancaExcecao() {
		CalculadoraDeNotas calculadora = new CalculadoraDeNotas();
		calculadora.calcular(10001);
	}
	
	@Test
	public void passa10000Retorna200000() {
		CalculadoraDeNotas calculadora = new CalculadoraDeNotas();
		Assert.assertEquals("200 0 0 0", calculadora.calcular(10000));
	}
	
	@Test
	public void passa549Retorna10414() {
		CalculadoraDeNotas calculadora = new CalculadoraDeNotas();
		Assert.assertEquals("10 4 1 4", calculadora.calcular(549));
	}
}
