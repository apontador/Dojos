package br.com.dojo;

import java.util.ArrayList;
import java.util.List;

public class DotGameApp {

	public int thePlayerThatDidTheLastMove;

	public int[] accounting(List<Move> moves) {

		thePlayerThatDidTheLastMove = 2 - (moves.size() % 2);
		
		if (checkSquare(moves)) {
			return new int[] { 0, 1 };
		}

		return new int[] { 0, 0 };
	}

	private boolean checkSquare(List<Move> moves) {
		
		Point basePoint = new Point(0, 0);
		
		List<List<Move>> baseSquaresForPoint = createBaseSquaresForPoint(basePoint);
		for (List<Move> baseSquare : baseSquaresForPoint) {
			if (moves.containsAll(baseSquare)) {
				return true;
			}
		}

		return false;
	}
	
	private List<List<Move>> createBaseSquaresForPoint(Point point) {
		List<Move> square = new ArrayList<>();
		
		int x = point.getX();
		int y = point.getY();
		
		square.add(createMove(x, y, x, y+1));
		square.add(createMove(x, y+1, x+1, y+1));
		square.add(createMove(x+1, y+1, x+1, y));
		square.add(createMove(x+1, y, x, y));	
		
		List<List<Move>> squares = new ArrayList<>();
		squares.add(square);
		return squares;
	}

	public int getThePlayerThatDidTheLastMove() {

		return thePlayerThatDidTheLastMove;
	}

	private Move createMove(int x1, int y1, int x2, int y2) {
		return new Move(new Point(x1, y1), new Point(x2, y2));
	}
}
