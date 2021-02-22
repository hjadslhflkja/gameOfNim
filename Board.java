public class Board {
    private static int pieces = 0;
    public static void populate()
    {
        pieces = ((int)(Math.random() * 41 + 10));
    }
    public static int getNumPieces()
    {
        return pieces;
    }
    public static void removePieces(int numPieces)
    {
        //if 
        //(numPieces >= 1 && numPieces <= pieces/2)
        {
            pieces -= numPieces;
        }
    }
}