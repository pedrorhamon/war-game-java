package player;

import boardgame.Board;

public class PlayerMatch {
	
	private Board board;

	public PlayerMatch() {
		board = new Board(16,16);
	}

	public PlayerPiece[][] getPieces(){
		PlayerPiece[][] mat = new PlayerPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[j][i] = (PlayerPiece) board.piece(j,i);
			}
		}
		return mat;	
	}
}
