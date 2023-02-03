public class Main {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle bus2 = new Bus();

        ((Bus) bus).addPassenger(2);
        ((Bus) bus).totalCharge();

        bus.useFuel(50);
        bus.changeBusStatus();
        bus.fillFuel(10);
        bus.changeBusStatus();

        ((Bus) bus).addPassenger(45);
        ((Bus) bus).addPassenger(5);
        ((Bus) bus).totalCharge();

        bus.useFuel(55);
    }
}
