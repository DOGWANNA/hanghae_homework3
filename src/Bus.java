public class Bus extends Vehicle{
    private int passengerNum; // 현재 승객 수
    private int busFee; //버스 요금

    Bus(){
        super(30, 30, "운행");
        this.busFee = 1000;
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
        System.out.println("총 금액은 " + passengerNum * busFee + "원 입니다.");
    }
    public int getPassengerNum() {
        return passengerNum;
    }

    public int getBusFee() {
        return busFee;
    }

}
