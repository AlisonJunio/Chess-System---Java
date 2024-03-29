package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import Chess.ChessException;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	ChessMatch chessMatch = new ChessMatch();
	
	while(true) {
		try {
		UI.clearScreen();
		UI.printBoard(chessMatch.getPieces());
		System.out.println();
		System.out.println("Source: ");
		ChessPosition source = UI.readChessPositio(sc);
		
	
		System.out.println();
		System.out.println("Target: ");
		ChessPosition target = UI.readChessPositio(sc);
		
		ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
		catch(ChessException e) {
			System.out.println(e.getMessage());
			sc.nextLine();
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			sc.nextLine();
		}
		}
	}
}
