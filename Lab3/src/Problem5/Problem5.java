package Problem5;

import javafx.geometry.Pos;

public class Problem5 {
    public static void main(String args[]) {
        Position a = new Position(2, 4);
        Position b = new Position(2, 2);

        Pawn pawn = new Pawn(a);
        Knight knight = new Knight(a);;
        Bishop bishop = new Bishop(a);
        Rook rook = new Rook(a);
        Queen queen = new Queen(a);
        King king = new King(a);

        System.out.println("Pawn can move from A to B is:   \t" + pawn.isLegalMove(pawn.getPosition(), b));
        System.out.println("Knight can move from A to B is: \t" + knight.isLegalMove(knight.getPosition(), b));
        System.out.println("Bishop can move from A to B is: \t" + bishop.isLegalMove(bishop.getPosition(), b));
        System.out.println("Rook can move from A to B is:   \t" + rook.isLegalMove(rook.getPosition(), b));
        System.out.println("Queen can move from A to B is:  \t" + queen.isLegalMove(queen.getPosition(), b));
        System.out.println("King can move from A to B is:   \t" + king.isLegalMove(king.getPosition(), b));

    }
}
