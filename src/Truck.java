public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public int getAxles() {
        return axles;
    }

    public boolean hasTrailer() {
        return hasTrailer;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Axle Count: " + axles);
        System.out.println("Has Trailer? " + hasTrailer);
    }

    public boolean validateLicensePlate() {
        // check if truck has a trailer
        if (hasTrailer) {
            // get last two characters of license plate
            String lastTwo = getLicensePlate().substring(getLicensePlate().length() - 2);

            // confirm MX if axles > 4 or LX if axles <= 4
            boolean isValid = (lastTwo.equals("MX") && axles > 4) || (lastTwo.equals("LX") && axles <= 4);
            return isValid;
        } else {
            // trucks without trailers automatically return true
            return true;
        }
    }

    @Override
    public double calculateTollPrice() {
        if (!hasTrailer) {
            return getTollFee() * axles;
        } else {
            return 2 * (getTollFee() * axles);
        }
    }
}