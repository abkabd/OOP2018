package Problem5;

public class King extends Piece {

    public King(Position p) {
        super(p);
    }

    public boolean isLegalMove(Position a, Position b){
        return  (inBorders(a, b) &&
                ((a.X == b.X && Math.abs(a.Y - b.Y) == 1) ||
                (a.Y == b.Y && Math.abs(a.X - b.X) == 1) ||
                (Math.abs(a.X - b.X) == 1 && Math.abs(a.Y - b.Y) == 1)));
    }
}
