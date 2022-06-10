package day03.HomeWork;

import java.util.Date;

public class TrainTicket {
    private String departureStation;
    private String arrivalStation;
    private Date startTime;
    private String identityId;
    private double price;
    private Integer seatId;
    private String trainNum;

    public void printTicket(){

        System.out.println("����վ"+departureStation);
        System.out.println("����վ"+arrivalStation);
        System.out.println("����ʱ��"+startTime);
        System.out.println("���֤��"+identityId);
        System.out.println("Ʊ��"+price);
        System.out.println("��λ��"+seatId);
        System.out.println("����"+trainNum);


    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public String getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(String trainNum) {
        this.trainNum = trainNum;
    }
}
