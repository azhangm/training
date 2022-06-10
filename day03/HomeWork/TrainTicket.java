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

        System.out.println("出发站"+departureStation);
        System.out.println("到达站"+arrivalStation);
        System.out.println("出发时间"+startTime);
        System.out.println("身份证号"+identityId);
        System.out.println("票价"+price);
        System.out.println("座位号"+seatId);
        System.out.println("车次"+trainNum);


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
