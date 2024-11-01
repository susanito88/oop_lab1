package lab2.Task2;

public class PumpkinSpiceLatte extends Cappuccino {
    private final int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(intensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }

    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Pumpkin Spice (mg): " + mgOfPumpkinSpice);
    }
}
