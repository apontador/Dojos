package com.apontador.dojo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SudokuTest {

	Sudoku sudoku;
	
	int board[][] = {
		{1,2,4,3},
		{4,3,2,1},
		{4,3,2,1},
		{4,3,2,1}
    };

	
	@Before
	public void criaSudokuEPegaBoard(){
		sudoku = new Sudoku(board);		
	}
	
	@Test
	public void testValidate() {
		assertTrue(sudoku.validate());
	}	
	
	@Test
	public void testVerificaSeTamanhoDaLinhaEQuatro() {
		assertTrue(sudoku.validateLineCount());
	}
	
	@Test
	public void testVerificaSeTamanhoDaColunaEQuatro() {
		assertTrue(sudoku.validateColumnCount());
	}
	
	@Test
	public void testDeveFalharComONumeroDeColunasErrada() {
		int board[][] = {
				{1,2,4,3,1},
				{4,3,2,1,2},
				{4,3,2,1,3},
				{4,3,2,1,1}
		    };		
		
		Sudoku sudoku = new Sudoku(board);
		assertFalse(sudoku.validateColumnCount());
	}
	
	@Test
	public void testVerificaSeNumerosEstaoNoConjuntoAdequado(){
		assertTrue(sudoku.validateValuesInterval());
	}
	
	@Test
	public void testDeveFalharComNumerosForaDoConjuntoValido() {
		int board[][] = {
				{1,2,4,3},
				{4,3,2,1},
				{4,3,2,1},
				{4,3,2,-1}
		    };		
		
		Sudoku sudoku = new Sudoku(board);
		assertFalse(sudoku.validateValuesInterval());
	}

}
