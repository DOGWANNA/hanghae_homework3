public class Vehicle {
    private String carNum; // 차 번호
    private int fuel; // 연료량
    private int speed; // 속도
    private int changeSpeed;
    private int current_passenger; // 잔여 승객 수
    private String status; //운행 상태

    public Vehicle(){}
    public Vehicle(int current_passenger, String status){
        this.current_passenger = current_passenger;
        this.status = status;
        this.carNum = Integer.toString((int)(Math.random() * 9999)+1);
        this.fuel = 100;
        this.speed = 0;

        System.out.println(carNum+"번 버스 생성!!");

    }

    String changeBusStatus() {
        if(status.equals("운행")){
            status = "차고지로";
        }else{
            status = "운행";
        }
        System.out.println(status);
        return status;
    }

    int changeSpeed(int speed){ // 속도 변환
        this.speed += speed;

        return this.speed;
    }

    int takePassenger(int passenger){ // 최대 탑승량 - 현재 승객을 잔여 좌석 반환
        if(current_passenger - passenger < 0){
            System.out.println("!!!최대 승객 수 초과!!!");
            return 0;
        }else{
            current_passenger -= passenger;
            System.out.println("승객 " + passenger + "명이 탑승하였습니다.");
            System.out.println("남은 탑승 인원 : " + current_passenger + " 명");
            return current_passenger;
        }
    }

    void useFuel(int fuel){
        System.out.println("기름 " + fuel + " 을 사용했습니다.");
        this.fuel -= fuel;
        if(this.fuel <= 10){
            System.out.println("!!!주유 필요!!!");
            changeBusStatus();
        }
        System.out.println("잔여량 " + this.fuel);
    }
    void fillFuel(int fuel){
        System.out.println("기름 " + fuel + " 을 보충했습니다.");
        this.fuel += fuel;
        System.out.println("잔여량 " + this.fuel);
    }
    public String getCarNum() {
        return carNum;
    }

    public int getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public int getChangeSpeed() {
        return changeSpeed;
    }

    public int getCurrent_passenger() {
        return current_passenger;
    }

    public String getStatus() {
        return status;
    }
}
