public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;

    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getTollFee() {
        return tollFee;
    }

    public void setTollFee(double newValue) {
        tollFee = newValue;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int newValue) {
        passengers = newValue;
    }

    public double calculateTollPrice() {
        return tollFee * passengers;
    }

    public void printInfo() {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Toll Fee: " + tollFee);
        System.out.println("Passenger Count: " + passengers);
    }

    public void chargeTip() {
        System.out.println("This vehicle is not for commercial transportation, so no tip is charged!");
    }
}