
public class ChessPiece
{

    private ChessGame game;
    private String player;
    private ChessLocation location;
    protected char id;

    public ChessPiece(String owner,ChessLocation initialLocation, ChessGame game)
    {
        player = owner;
        location = initialLocation;
        this.game = game;

    }

    public void moveTo(ChessLocation newLocation)
    {


    }
    protected boolean checkLineofSight(ChessLocation start,ChessLocation End)
    {
        return true;
    }
    public ChessLocation getLocation()
    {
        return this.location;
    }
    public void setLocation(ChessLocation location)
    {
        this.location = location;
    }
    public ChessGame getGame()
    {
        return this.game;
    }
    public String getPlayer()
    {
        return this.player;
        
    }
    
    
    
}
