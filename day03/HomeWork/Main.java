package day03.HomeWork;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Rectangular r = new Rectangular();
        r.setX(1);
        r.setY(1);
        r.setWidth(1);
        r.setLength(1);
        Rectangular rectangular = new Rectangular();
        rectangular.setX(0);
        rectangular.setY(0);
        rectangular.setWidth(2);
        rectangular.setLength(2);
        System.out.println("����1�����" +  r.getArea());
        System.out.println("����2�����" + rectangular.getArea());
        System.out.println("�������Ƿ��ཻ��" + r.isIntersection(rectangular));
        Point point = new Point();
        point.setX(3);
        point.setY(4);
        point.printPoint();
        TrainTicket ticket = new TrainTicket();
        ticket.setDepartureStation("�˳�վ");
        ticket.setArrivalStation("̫ԭվ");
        ticket.setStartTime(new Date(System.currentTimeMillis()));
        ticket.setIdentityId("3123123123122413312");
        ticket.setSeatId(213);
        ticket.setTrainNum("D3123");
        ticket.printTicket();

    }
}
