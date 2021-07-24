package application;

import player.PlayerMatch;

public class Program {

	public static void main(String[] args) {
		
		PlayerMatch chessMatch = new PlayerMatch();
		UI.printBoard(chessMatch.getPieces());
	}
}
