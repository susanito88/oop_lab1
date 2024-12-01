package lab3.task2;

public class GasStation implements Refuelable {
    private static int gasCarsServed = 0;
    private static int gasConsumption = 0;

    @Override
    public void refuel(int carId, int consumption) {
        gasCarsServed++;
        gasConsumption += consumption;
        System.out.println("Refueling GAS car: " + carId);
    }

    public static int getGasCarsServed() {
        return gasCarsServed;
    }

    public static int getGasConsumption() {
        return gasConsumption;
    }

    public static void resetGasCarsServed() {
        gasCarsServed = 0;
        gasConsumption = 0;
    }

}