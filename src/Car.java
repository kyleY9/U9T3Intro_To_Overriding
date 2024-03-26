public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public void setDiscountApplied(boolean newValue) {
        discountApplied = newValue;
    }

    public void printCar() {
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric? " + electric);
        System.out.println("Discount applied? " + discountApplied);
    }

    public boolean dropOffPassengers(int numOut) {
        // get the current number of passengers
        int currentPassengers = getPassengers();

        if (numOut < currentPassengers) {
            // update passengers to new value using setter method
            // (which needs to be added to the Vehicle class)
            setPassengers(currentPassengers - numOut);
            return true;  // success!
        } else {
            // do nothing and return false;
            return false;
        }
    }

    public void applyDiscount() {
        // only apply discount if discountApplied is currently false
        if (!discountApplied) {
            // discount only granted for electric vehicles
            if (isElectric()) {
                // get current toll fee and cut in half
                double discountedFee = getTollFee() * 0.5;

                // set the fee to the new fee
                // MUST ADD A SETTER METHOD to Vehicle!
                setTollFee(discountedFee);

                // set discountApplied to true to "remember"
                // that the discount has been applied
                discountApplied = true;
            }
        }
    }
}