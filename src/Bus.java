public class Bus extends Vehicle{
    private int passengerNum; // 현재 승객 수
    private int busCharge; //버스 요금

    Bus(){
        super(30, "운행");
        this.busCharge = 1000;
    }

    public void addPassenger(int passenger){
        if(passengerNum + passenger > 30){
            return;
        }
        this.passengerNum += passenger;
        takePassenger(passenger);
        System.out.println("탑승 인원 : " + passengerNum);
    }

    public void totalCharge(){
        System.out.println("총 금액은 " + passengerNum * busCharge + "원 입니다.");
    }
    public int getPassengerNum() {
        return passengerNum;
    }

    public int getBusCharge() {
        return busCharge;
    }
}
