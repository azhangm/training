package day06.proj;

import java.util.Scanner;

/*
*
* ��������Ϸ����
*
*
* */
public class Ruler {
    /*
    * 1 ��ɫ
    * 2 ��ɫ
    * */
    public static void play(){
        ChessBoard c = new ChessBoard();
        c.init();
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (true) {
            System.out.println("����������λ��������");
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (count % 2 == 0){
                Piece p = new Piece(x, y, 'o');
                if (!isPlay(p, c))  continue;
                c.getPieces()[p.getX()][p.getY()] = p;
                c.print();
                if (isWin(p,c)) {
                    if (p.getSymbol() == '0')
                    System.out.println("����" + "��ʤ");
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
                    System.out.println("����" + "��ʤ");
                    break;
                }
                count ++;
            }

            }
        }



    /*
    * �Ƿ���� ����
    * */
    public static boolean isPlay(Piece p,ChessBoard c) {
    if (!isIndexOutOfChessBoard(p,c)){
        System.out.println("��������������");
        return false;
    }
    if (isChessBoard(p,c)) {
        System.out.println("��λ��������");
        return false;
    }
    return true;
    }

//    ���̱߽��ж�
    private static boolean isIndexOutOfChessBoard(Piece piece , ChessBoard chessBoard){
        return piece.getX() >= 0 && piece.getX() <= chessBoard.getPieces().length - 1 && piece.getY() >= 0 && piece.getY() <= chessBoard.getPieces().length - 1;
    }
    private  static boolean isChessBoard(Piece piece , ChessBoard chessBoard){
        return chessBoard.getPieces()[piece.getX()][piece.getY()].getSymbol() == '0' || chessBoard.getPieces()[piece.getX()][piece.getY()].getSymbol() == 'o';
    }

    public static boolean isWin(Piece p , ChessBoard c) {
        int count = 1;      //����һ��Ϊ 1
        int posX;
        int posY;
        /*�ж�ˮƽ�����ϵ�ʤ��
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
        }    //���ұ߱���
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
        /*�жϴ�ֱ�����ϵ�ʤ��
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
        }//���±���
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
        /*�ж��������·����ϵ�ʤ��*/
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
        }//�ж��ұߵ�
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
        /*�ж��������·����ϵ�ʤ��*/
        for(posX = p.getX() + 1, posY = p.getY() - 1; posX <= 15 && posY > 0; posX++, posY--) {
            if (c.getPieces()[posX][posY].getSymbol() == p.getSymbol()) {
                count++;
                if (count >= 5) {
                    return true;
                }
            }else {
                break;
            }
        }//�ж��ұߵ�
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
