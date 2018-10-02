package Problem5;

public class Pawn extends Piece {
    public Pawn(Position p) {
        super(p);
    }

    public boolean isLegalMove(Position a, Position b){
        if(a.X != b.X || b.Y < a.Y || a.Y == 1) return false;
        if((a.Y == 2 && b.Y - a.Y < 3) || (a.Y != 2 &&  b.Y - a.Y < 2)) return inBorders(a, b);
        return false;
    }
}
