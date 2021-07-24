package application;

import player.PlayerPiece;

public class UI {
	
	public static void printBoard(PlayerPiece[][] pieces) {
		
		for(int i=0; i<pieces.length; i++) {
			System.out.print((16 - i) + " ");
			for(int j=0; j<pieces.length; j++) {
				printPiece(pieces[j][i]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h i j k l m n o p q ");
	}
	
	private static void printPiece(PlayerPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
