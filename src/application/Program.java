package application;

import Chess.ChessMatch;


/**
 *
 * @author Rafael
 */
public class Program {
    
    public static void main(String[] args){
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    } 
    
}
