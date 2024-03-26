public class Main {
    public static void main(String[] args) {
        // initialize objects of each class
        Vehicle myVehicle = new Vehicle("AA111", 15, 5);
        Car myCar = new Car("BB222", 15, 4, true);
        Truck myTruck = new Truck("CC333", 15, 2, 4, true);
        Taxi myTaxi = new Taxi("DD444", 15, 5, false, 20.80);

        // call the chargeTip() method on each object
        System.out.println("VEHICLE OBJECT:\n----------");
        myVehicle.chargeTip();
        System.out.println("\nCAR OBJECT:\n----------");
        myCar.chargeTip();
        System.out.println("\nTRUCK OBJECT:\n----------");
        myTruck.chargeTip();
        System.out.println("\nTAXI OBJECT:\n----------");
        myTaxi.chargeTip();
    }
}