package day06.proj;

import java.util.Arrays;

public class ChessBoard {
    Piece[][] pieces;
    public void init() {
      pieces = new Piece[15][15];
        for (int i = 0 ; i < pieces.length ; i ++) {
            for (int j = 0 ; j < pieces[i].length; j ++ ) {

                if (i == 0 && j == 0 ) {
                    pieces[i][j]  = new Piece(i,j,'©°');
                }
                if (i == pieces.length - 1 && j == 0) pieces[i][j] = new Piece(i,j,'©¸');
                if (i == pieces.length - 1 && j == pieces[i].length - 1) pieces[i][j] = new Piece(i,j,'©¼');
                if (i > 0 && j == 0 && i < pieces.length - 1 ) pieces[i][j] = new Piece(i,j,'©À');
                if (i > 0 && j == pieces[i].length - 1 && i < pieces.length - 1) pieces[i][j] = new Piece(i,j,'©È');
                if (j == pieces[i].length - 1 && i == 0) {
                    pieces[i][j] = new Piece(i,j,'©´');
                }
                if (i == 0 && j < pieces[i].length - 1 && j > 0)    pieces[i][j] = new Piece(i,j,'©Ð');
                if (i > 0 && i < pieces.length - 1 && j > 0 && j < pieces[i].length - 1 ) pieces[i][j] = new Piece(i,j, '©à');
                if (i == pieces.length - 1 && j > 0 && j < pieces[i].length - 1)    pieces[i][j] = new Piece(i,j,'©Ø');
            }

        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                if (j < pieces[i].length - 1)
                System.out.print(pieces[i][j] + "©¤©¤");
                else System.out.print(pieces[i][j]);
            }
            System.out.println();
        }
    }

    public void print() {
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                if (j < pieces[i].length - 1)
                    System.out.print(pieces[i][j] + "©¤©¤");
                else System.out.print(pieces[i][j]);
            }
            System.out.println();
        }
    }

    public ChessBoard() {
    }

    public ChessBoard(Piece[][] pieces) {
        this.pieces = pieces;
    }

    public Piece[][] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[][] pieces) {
        this.pieces = pieces;
    }
}
