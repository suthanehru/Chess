
public class Pawn extends ChessPiece
{
    public boolean firstMove;

    public Pawn(String owner,ChessLocation initialLocation, ChessGame game)
    {
       super(owner,initialLocation,game);
       firstMove = false;
       id = 'P';
      
    }
    
    public void moveTo(ChessLocation newLocation)
    {


    }

  
}
