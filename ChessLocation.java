
public class ChessLocation
{
    private int row;
    private int col;

    public ChessLocation(int x,int y)
    {
        row = x;
        col = y;
    }
    public int getRow()
    {
        return row;
    }
    public void setRow(int row)
    {
        this.row = row;
    }
    public int getCol()
    {
        return col;
    }
    public void setCol(int col)
    {
        this.col = col;
    }
    public boolean equals(ChessLocation cp)
    {
        if(cp.getRow() == row && cp.getCol() == col)
        {
            return true;
        }
        return false;
    }
    
}
