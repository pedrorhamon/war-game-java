package player;

import boardgame.Board;
import boardgame.Piece;

public class PlayerPiece extends Piece{
	
	private Countries countries;

	public PlayerPiece(Board board, Countries countries) {
		super(board);
		this.countries = countries;
	}

	public Countries getCountries() {
		return countries;
	}
}
