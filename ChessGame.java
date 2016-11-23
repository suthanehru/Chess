
public class ChessGame
{
    private ChessBoard board;
    private String player1;
    private String player2;


    public ChessGame(String player1,String player2)
    {
        board = new ChessBoard();
        this.player1 = player1;
        this.player2 = player2;
        ChessLocation c = new ChessLocation(0,1);
        board.placePieceAt(new Knight(player1,c,this),c);
  
    }
    public ChessBoard getChessBoard()
    {
        return board;
    }

    
}
