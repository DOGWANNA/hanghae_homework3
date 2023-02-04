public class Taxi extends Vehicle{
    private String destination; // 목적지
    private int distance; // 총 운행 거리(km)
    private int base_distance; // 기본 거리(km)
    private int base_taxiFee; // 기본 요금
    private int dis_per_Taxifee; // 거리당 요금
    private int subFee; // 추가된 요금
    private int passengerNum; // 현재 탑승 인원
    private int total; // 총 수익


    Taxi(){
        super(4, 4, "일반");
        this.base_taxiFee = 3000;
        this.dis_per_Taxifee = 1000;
        this.base_distance = 1;
    }

    public void addPassenger(int passenger){
        if(passengerNum + passenger > getMax_passenger()){
            System.out.println("!!!최대 승객 수 초과!!!");
            System.out.println("현재 탑승 인원 : " + passengerNum);
            return;
        }
        this.passengerNum += passenger;
        takePassenger(passenger);
        System.out.println("탑승 인원 : " + passengerNum);
        System.out.println("잔여 승객 수 : " + (getMax_passenger() - passengerNum));
    }
    void startDriving(String destination, int distance){
        if(distance > base_distance){
            subFee += dis_per_Taxifee * Math.abs(base_distance - distance);
            System.out.println(destination+" 까지의 거리가 기본거리를 초과하여 추가요금 " + subFee + "원 이 발생했습니다." );
        }
        this.destination = destination;
        this.distance = distance;
        changeTaxiStatus();
    }
    void paymentFee(){
        System.out.println("요금 " + (base_taxiFee + subFee) + " 이 결제되었습니다.");
        this.total += base_taxiFee + subFee;
        System.out.println("누적 요금 : " + total);
        this.subFee = 0; //결제 후 추가 요금 초기화
        this.passengerNum = 0; // 승객 없음
        this.distance = 0; // 거리 초기화
        this.destination = ""; // 목적지 초기화
        changeTaxiStatus();
    }

    void changeTaxiStatus(){
        if(checkfuel()){
            if(getStatus().equals("일반")){
                setStatus("운행중");
                System.out.println("상태 : " + getStatus());
            }else if(getStatus().equals("운행중")){
                setStatus("일반"); // 운행 끝났을때 초기화
                System.out.println("상태 : " + getStatus());
            }
        }else if(!checkfuel()){
            setStatus("운행불가");
            System.out.println("운행불가!! 연료를 보충하세요.");
        }
    }
    Boolean checkfuel(){
        if(getFuel() <= 10){
            return false;
        }
        return true;
    }


    public String getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }

    public int getBase_distance() {
        return base_distance;
    }

    public int getBase_taxiFee() {
        return base_taxiFee;
    }

    public int getDis_per_Taxifee() {
        return dis_per_Taxifee;
    }

    public int getSubFee() {
        return subFee;
    }

    public int getPassengerNum() {
        return passengerNum;
    }

    public int getTotal() {
        return total;
    }
}


