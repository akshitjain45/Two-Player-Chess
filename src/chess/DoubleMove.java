package chess;


public class DoubleMove implements Move {


    public DoubleMove(SingleMove move1, SingleMove move2) {
        _move1 = move1;
        _move2 = move2;
    }

    @Override
    public boolean isDouble() {
        return true;
    }

    @Override
    public Move undoMove() {
        return new DoubleMove((SingleMove) _move2.undoMove(),
            (SingleMove) _move1.undoMove());
    }

    @Override
    public Piece movedPiece() {
        return _move1.movedPiece();
    }

    /** Returns the first move. */
    public SingleMove move1() {
        return _move1;
    }

    /** Returns the second move. */
    public SingleMove move2() {
        return _move2;
    }

    /** The first move. */
    private SingleMove _move1;

    /** The second move. */
    private SingleMove _move2;

}
