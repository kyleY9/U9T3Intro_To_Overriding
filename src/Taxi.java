public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate,
                double tollFee,
                int passengers,
                boolean isElectric,
                double fareCollected) {
        super(licensePlate, tollFee, passengers, isElectric); // calls the Car constructor
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fare Collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        // update passenger count by calling inherited setter method
        setPassengers(getPassengers() + numRiders);

        // update Taxi's fareCollected instance variable
        double fareCost = numRiders * farePerRider;
        fareCollected += fareCost;

        // apply 50% discount if passengers is now greater than or equal to 4
        // and the Taxi has not already received a discount
        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() * 0.5);  // inherited method from Vehicle
            setDiscountApplied(true);  // setter method added to Car class
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        fareCollected += (getPassengers() - 1) * farePerRider;
        return dropOffPassengers(getPassengers() - 1);
    }

    @Override
    public void chargeTip() {
        System.out.println("Total Fare Before Tip: " + fareCollected);
        fareCollected *= 1.2; // adds a 20% tip
        System.out.println("Total Fare After Tip: " + fareCollected);
        System.out.println("Tip has been successfully collected.");
    }
}