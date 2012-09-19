package com.apontador.dojo;


public class Sudoku {
	
	private static final int LINES = 4;
	private static final int COLUMNS = 4;
	
	private int[][] board;
	
	public Sudoku(int b[][]) {
		board = b;
	}
	
	public int[][] getBoard() {
        return board;
	}
	
	
	public boolean validate() {
		return validateLineCount() && validateValuesInterval();
	}
	
	boolean validateColumnCount() {
		for (int i = 0; i < board.length; i++) {
			if (board[i].length != COLUMNS) {
				return false;
			}
		}
		
		return true;
	}
	
	boolean validateValuesInterval()
	{
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] < 1 || board[i][j] > 4)
					return false;
			}
		}
		return true;
	}

	public boolean validateLineCount() {
		return LINES == board.length;
	}
	
}
