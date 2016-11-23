import java.util.*;

public class ChessBoard
{
    
    private Character[][] board;
    public ChessBoard()
    {
        board = new Character[8][8];
        for(Character[] c:board)
        {
            Arrays.fill(c,'-');
        }

    }

    public boolean isPieceAt(int row,int col)
    {
        if(board[row][col].compareTo('-') != 0)
        {
            return true;
        }
        
        return false;
        
    }
    public void placePieceAt(ChessPiece piece,ChessLocation location)
    {
        int row = location.getRow();
        int col = location.getCol();
        if(!isPieceAt(row,col))
        {
            board[row][col] = 'K';
           
        }
    
    }
    public void removePiece(ChessLocation location)
    {
        board[location.getRow()][location.getCol()] = '-';
    
    }

    public void printBoard()
    {
        for(int i = 0;i < 8;i++)
        {
            for(int j = 0;j < 8;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
