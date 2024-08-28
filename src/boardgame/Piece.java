package boardgame;

public class Piece {

    // Uma peça tem uma Position.
    protected Position position;

    // Uma peça está/tem em/um Board.
    private Board board;

    // Toda Piece inicia com um Board,
    // porém ainda não tem uma Position específica.
    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
}
