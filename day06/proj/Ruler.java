package day06.proj;

import java.util.Scanner;

/*
*
* 五子棋游戏规则
*
*
* */
public class Ruler {
    /*
    * 1 黑色
    * 2 白色
    * */
    public static void play(){
        ChessBoard c = new ChessBoard();
        c.init();
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (true) {
            System.out.println("请输入坐标位置来下棋");
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (count % 2 == 0){
                Piece p = new Piece(x, y, 'o');
                if (!isPlay(p, c))  continue;
                c.getPieces()[p.getX()][p.getY()] = p;
                c.print();
                if (isWin(p,c)) {
                    if (p.getSymbol() == '0')
                    System.out.println("白棋" + "获胜");
                    break;
                }
                count ++;
            }
            else{
                Piece p = new Piece(x, y, '0');
                if (!isPlay(p, c))  continue;
                c.getPieces()[p.getX()][p.getY()] = p;
                c.print();
                if (isWin(p,c)) {
                    if (p.getSymbol() == 'o')
                    System.out.println("黑棋" + "获胜");
                    break;
                }
                count ++;
            }

            }
        }



    /*
    * 是否可以 落子
    * */
    public static boolean isPlay(Piece p,ChessBoard c) {
    if (!isIndexOutOfChessBoard(p,c)){
        System.out.println("请在棋盘内下棋");
        return false;
    }
    if (isChessBoard(p,c)) {
        System.out.println("该位置有棋子");
        return false;
    }
    return true;
    }

//    棋盘边界判断
    private static boolean isIndexOutOfChessBoard(Piece piece , ChessBoard chessBoard){
        return piece.getX() >= 0 && piece.getX() <= chessBoard.getPieces().length - 1 && piece.getY() >= 0 && piece.getY() <= chessBoard.getPieces().length - 1;
    }
    private  static boolean isChessBoard(Piece piece , ChessBoard chessBoard){
        return chessBoard.getPieces()[piece.getX()][piece.getY()].getSymbol() == '0' || chessBoard.getPieces()[piece.getX()][piece.getY()].getSymbol() == 'o';
    }

    public static boolean isWin(Piece p , ChessBoard c) {
        int count = 1;      //本身一点为 1
        int posX;
        int posY;
        /*判断水平方向上的胜负
         */
        for(posX = p.getX() - 1; posX > 0 ; posX--) {
            if (c.getPieces()[posX][p.getY()].getSymbol() == p.getSymbol()) {
                count++;
                if (count >= 5) {
                    return true;
                }
            }else {
                break;
            }
        }    //向右边遍历
        for(posX = p.getX() + 1; posX <= 15; posX++) {
            if (c.getPieces()[posX][p.getY()].getSymbol() == p.getSymbol()) {
                count++;
                if (count >= 5) {
                    return true;
                }
            }else {
                break;
            }
        }
        /*判断垂直方向上的胜负
         */
        for(posY = p.getY() - 1; posY > 0; posY--) {
            if (c.getPieces()[p.getX()][posY].getSymbol() == p.getSymbol()) {
                count++;
                if (count >= 5) {
                    return true;
                }
            }else {
                break;
            }
        }//向下遍历
        for(posY = p.getY() + 1; posY <= 15; posY++) {
            if (c.getPieces()[p.getX()][posY].getSymbol() == p.getSymbol()) {
                count++;
                if (count >= 5) {
                    return true;
                }
            }else {
                break;
            }
        }
        /*判断左上右下方向上的胜负*/
        for(posX = p.getX() - 1, posY = p.getY() - 1; posX > 0 && posY > 0; posX--, posY--) {
            if (c.getPieces()[posX][posY].getSymbol() == p.getSymbol()) {
                count++;
                if (count >= 5) {
                    count = 1;
                    return true;
                }
            }else {
                break;
            }
        }//判断右边的
        for(posX = p.getX() + 1, posY = p.getY() + 1; posX <= 15 && posY <= 15; posX++, posY++) {
            if (c.getPieces()[posX][posY].getSymbol() == p.getSymbol()) {
                count++;
                if (count >= 5) {
                    count = 1;
                    return true;
                }
            }else {
                break;
            }
        }
        /*判断右下左下方向上的胜负*/
        for(posX = p.getX() + 1, posY = p.getY() - 1; posX <= 15 && posY > 0; posX++, posY--) {
            if (c.getPieces()[posX][posY].getSymbol() == p.getSymbol()) {
                count++;
                if (count >= 5) {
                    return true;
                }
            }else {
                break;
            }
        }//判断右边的
        for(posX = p.getX() - 1, posY = p.getY() + 1; posX > 0 && posY <= 15; posX--, posY++) {
            if (c.getPieces()[posX][posY].getSymbol() == p.getSymbol()) {
                count++;
                if (count >= 5) {
                    return true;
                }
            }else {
                break;
            }
        }
        return false;
    }

}
