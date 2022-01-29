package player;

import java.awt.Color;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public class PlayerPiece extends Piece{
	
	private Color color;
	private int moveCount;

	public PlayerPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	protected void increaseMoveCount() {
		moveCount++;
	}

	protected void decreaseMoveCount() {
		moveCount--;
	}

	public PlayerPiece getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		PlayerPiece p = (PlayerPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
}
