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
        System.out.println("矩阵1的面积" +  r.getArea());
        System.out.println("矩阵2的面积" + rectangular.getArea());
        System.out.println("两矩阵是否相交？" + r.isIntersection(rectangular));
        Point point = new Point();
        point.setX(3);
        point.setY(4);
        point.printPoint();
        TrainTicket ticket = new TrainTicket();
        ticket.setDepartureStation("运城站");
        ticket.setArrivalStation("太原站");
        ticket.setStartTime(new Date(System.currentTimeMillis()));
        ticket.setIdentityId("3123123123122413312");
        ticket.setSeatId(213);
        ticket.setTrainNum("D3123");
        ticket.printTicket();

    }
}
