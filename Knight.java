
public class Knight extends ChessPiece
{
    

    public Knight(String owner,ChessLocation initialLocation, ChessGame game)
    {
        super(owner,initialLocation,game);
        id = 'N';
        
    }

    public void moveTo(ChessLocation newLocation)
    {
        int currentrow = getLocation().getRow();
        int currentcol = getLocation().getCol();
        int newrow = newLocation.getRow();
        int newcol = newLocation.getCol();
        if(newcol >= 0 && newrow >= 0 && newcol < 8 && newrow < 8)
        {
            if(newrow == currentrow+2 && newcol == currentcol+1 || newrow == currentrow+2 && newcol == currentcol-1)
            {
                getGame().getChessBoard().removePiece(getLocation());
                getGame().getChessBoard().placePieceAt(this,newLocation);
                setLocation(newLocation);
            }
            else if(newrow == currentrow-2 && newcol == currentcol+1 || newrow == currentrow-2 && newcol == currentcol-1)
            {
                getGame().getChessBoard().removePiece(getLocation());
                getGame().getChessBoard().placePieceAt(this,newLocation);
                setLocation(newLocation);
            }
            else if(newrow == currentrow+1 && newcol == currentcol+2 || newrow == currentrow+1 && newcol == currentcol-2 )
            {
                getGame().getChessBoard().removePiece(getLocation());
                getGame().getChessBoard().placePieceAt(this,newLocation);
                setLocation(newLocation);
            }
            else if(newrow == currentrow-1 && newcol == currentcol+2 || newrow == currentrow-1 && newcol == currentcol-2 )
            {
                getGame().getChessBoard().removePiece(getLocation());
                getGame().getChessBoard().placePieceAt(this,newLocation);
                setLocation(newLocation);
            }
            else if(getLocation().equals(newLocation))
            {
                System.out.println("Same Spot");
            }
            else{
                System.out.println("Invalid Move");
            }
            
            
        }
    
    }
}
