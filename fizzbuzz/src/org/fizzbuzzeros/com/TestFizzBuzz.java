package org.fizzbuzzeros.com;

import static org.junit.Assert.*;

import org.junit.Test;

/*
*     		Sempre que um numero for divisível por 3 e por 5 escreve FizzBuzz
*    		 //Sempre que um numero contiver os números 3 e 5 escreve FizzBuzz
*     		Sempre que um numero for divisível por 3 escreve Fizz
*   		  Sempre que um numero contiver o números 3 escreve Fizz
*    		 Sempre que um numero for divisível por 5 escreve Buzz
*    		 Sempre que um numero contiver o números 5 escreve Buzz
*     Caso não atenda nenhuma das regras citadas, escreve o mesmo numero passado.
*/


public class TestFizzBuzz {

	@Test
	public void testQuandoEnviar3RetornaFizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(3);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void testQuandoEnviar9RetornaFizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(9);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void testQuandoEnviar1Retorna1() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(1);
		assertEquals("1", result);
	}
	
	@Test
	public void testQuandoEnviar5RetornaBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(5);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void testQuandoEnviar10RetornaBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(10);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void testQuandoEnviar15RetornaFizzBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(15);
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void testQuandoEnviar750RetornaFizzBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(750);
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void testQuandoEnviar13RetornaFizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(13);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void testQuandoEnviar31RetornaFizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(31);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void testQuandoEnviar30RetornaFizzBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(30);
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void testQuandoEnviar59RetornaBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(59);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void testQuandoEnviar51RetornaFizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(51);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void testQuandoEnviar53RetornaBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(53);
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void testQuandoEnviar57RetornaBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(57);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void testQuandoEnviar2Retorna2() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(2);
		assertEquals("2", result);
	}
	
	@Test
	public void testQuandoEnviar1e2Retorna1_2() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(1,2);
		assertEquals("1,2", result);
	}
	
	@Test
	public void testQuandoEnviar1e2e3Retorna1_2_Fizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String result = fizzbuzz.print(1,2,3);
		assertEquals("1,2,Fizz", result);
	}
}
