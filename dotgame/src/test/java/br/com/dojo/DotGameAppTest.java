package br.com.dojo;

/*
 * using nome_da_lib; do C#
 * require "nome_da_lib" do Ruby
 * #include<nome_da_lib>; do C
 * import em Objective-C
 * import nome_da_lib; em Scala
 * -import(nome_da_lib) do Erlang
 * import "nome_da_lib" do Go
 * #import('nome_da_lib'); do Dart
 */
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DotGameAppTest {

	private DotGameApp dotDojoApp;

	private List<Move> moves = new ArrayList<Move>() {
		{
			add(new Move(new Point(0, 0), new Point(0, 1)));
			add(new Move(new Point(0, 1), new Point(1, 1)));
			add(new Move(new Point(1, 1), new Point(1, 2)));
			add(new Move(new Point(1, 1), new Point(2, 1)));
			add(new Move(new Point(1, 0), new Point(1, 1)));
			add(new Move(new Point(0, 0), new Point(1, 0)));
			add(new Move(new Point(1, 0), new Point(2, 0)));
			add(new Move(new Point(2, 0), new Point(2, 1)));
			add(new Move(new Point(1, 2), new Point(2, 2)));
			add(new Move(new Point(0, 2), new Point(1, 2)));
			add(new Move(new Point(0, 1), new Point(0, 2)));
			add(new Move(new Point(2, 1), new Point(2, 2)));
		}
	};

	@Before
	public void before() {
		dotDojoApp = new DotGameApp();
	}

	@Test
	public void testOneMove() throws Exception {
		List<Move> oneMove = new ArrayList<>();
		oneMove.add(new Move(new Point(0, 0), new Point(0, 1)));
		int[] result = dotDojoApp.accounting(oneMove);
		Assert.assertEquals(0, result[0]);
		Assert.assertEquals(0, result[1]);
	}
	
	@Test
	public void testTwoMoves() throws Exception {
		List<Move> twoMoves = new ArrayList<>();
		twoMoves.add(createMove(0,0,0,1));
		twoMoves.add(createMove(0,0,1,0));
		
		int[] result = dotDojoApp.accounting(twoMoves);
		Assert.assertEquals(0, result[0]);
		Assert.assertEquals(0, result[1]);
	}
	
	@Test
	public void testThreeMoves() throws Exception {
		List<Move> twoMoves = new ArrayList<>();
		twoMoves.add(createMove(0,0,0,1));
		twoMoves.add(createMove(0,0,1,0));
		twoMoves.add(createMove(1,0,1,1));
		
		int[] result = dotDojoApp.accounting(twoMoves);
		Assert.assertEquals(0, result[0]);
		Assert.assertEquals(0, result[1]);
	}
	
	@Test
	public void testFourMoves() throws Exception {
		List<Move> twoMoves = new ArrayList<>();
		twoMoves.add(createMove(0,0,0,1));
		twoMoves.add(createMove(0,0,1,0));
		twoMoves.add(createMove(1,0,1,1));
		twoMoves.add(createMove(1,1,1,2));
		
		int[] result = dotDojoApp.accounting(twoMoves);
		Assert.assertEquals(0, result[0]);
		Assert.assertEquals(0, result[1]);
	}

	@Test
	public void testSquare() throws Exception {
		List<Move> square = new ArrayList<>();
		square.add(createMove(0, 0, 0, 1));
		square.add(createMove(0, 1, 1, 1));
		square.add(createMove(1, 1, 1, 0));
		square.add(createMove(1, 0, 0, 0));

		int[] result = dotDojoApp.accounting(square);
		Assert.assertEquals(0, result[0]);
		Assert.assertEquals(1, result[1]);
	}
	
	@Test
	public void testGetThePlayerThatDidTheLastMove() throws Exception {
		List<Move> square = new ArrayList<>();
		square.add(createMove(0, 0, 0, 1));
		
		dotDojoApp.accounting(square);
		Assert.assertEquals(1, dotDojoApp.getThePlayerThatDidTheLastMove());
	}
	
	@Test
	public void testGetThePlayerThatDidTheLastMoveWithTwoMoves() throws Exception {
		List<Move> square = new ArrayList<>();
		square.add(createMove(0, 0, 0, 1));
		square.add(createMove(0, 0, 1, 0));
		
		dotDojoApp.accounting(square);
		Assert.assertEquals(2, dotDojoApp.getThePlayerThatDidTheLastMove());
	}
	
	private Move createMove(int x1, int y1, int x2, int y2) {
		return new Move(new Point(x1, y1), new Point(x2, y2));
	}
}
