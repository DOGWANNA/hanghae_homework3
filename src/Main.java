public class Main {
    public static void main(String[] args) {
//        Vehicle bus = new Bus();
//        Vehicle bus2 = new Bus();
//
//        ((Bus) bus).addPassenger(2);
//        ((Bus) bus).totalCharge();
//
//        bus.useFuel(50);
//        bus.changeStatus();
//        bus.fillFuel(10);
//        bus.changeStatus();
//
//        ((Bus) bus).addPassenger(45);
//        ((Bus) bus).addPassenger(5);
//        ((Bus) bus).totalCharge();
//
//        bus.useFuel(55);
        Vehicle taxi = new Taxi();
        Vehicle taxi2 = new Taxi();

        System.out.println("택시 번호 : " + taxi.getCarNum() + "," + taxi2.getCarNum());
        System.out.println(taxi.getCarNum()+"번 택시 주유량 : " + taxi.getFuel() + " / 상태 : " + taxi.getStatus());
        System.out.println(taxi2.getCarNum()+"번 택시 주유량 : " + taxi2.getFuel() + " / 상태 : " + taxi.getStatus());

        ((Taxi) taxi).addPassenger(2);
        ((Taxi) taxi).startDriving("서울역",2);
        System.out.println();
        System.out.println("기본요금 : " + ((Taxi) taxi).getBase_taxiFee());
        System.out.println("목적지 : " + ((Taxi) taxi).getDestination());
        System.out.println("목적지까지 거리 : " + ((Taxi) taxi).getDistance());
        System.out.println("지불할 요금 : " + (((Taxi) taxi).getBase_taxiFee() + ((Taxi) taxi).getSubFee()));
        System.out.println("상태 : " + ((Taxi) taxi).getStatus());

        System.out.println();
        taxi.useFuel(80);
        ((Taxi) taxi).paymentFee();

        System.out.println();
        System.out.println("연료량 : " + taxi.getFuel());
        System.out.println("지불할 요금 : " + (((Taxi) taxi).getBase_taxiFee() + ((Taxi) taxi).getSubFee()));

        ((Taxi) taxi).addPassenger(5);
        System.out.println();

        ((Taxi) taxi).addPassenger(3);
        ((Taxi) taxi).startDriving("구로디지털단지역",12);


        System.out.println();
        System.out.println("기본요금 : " + ((Taxi) taxi).getBase_taxiFee());
        System.out.println("목적지 : " + ((Taxi) taxi).getDestination());
        System.out.println("목적지까지 거리 : " + ((Taxi) taxi).getDistance());
        System.out.println("지불할 요금 : " + (((Taxi) taxi).getBase_taxiFee() + ((Taxi) taxi).getSubFee()));

        System.out.println();
        taxi.useFuelforTaxi(20);
        ((Taxi) taxi).paymentFee();

        System.out.println();
        System.out.println("상태 : " + taxi.getStatus());
        //기름 체크하면서 fuel
    }
}
