package Problem5;

public class Rook extends Piece {
    public Rook(Position p) {
        super(p);
    }

    public boolean isLegalMove(Position a, Position b){
        return (inBorders(a, b) && (a.X == b.X || a.Y == b.Y));
    }
}
